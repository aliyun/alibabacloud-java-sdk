// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ledgerdb20191122.models;

import com.aliyun.tea.*;

public class GetIpWhiteListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("IpList")
    public String ipList;

    @NameInMap("LedgerId")
    public String ledgerId;

    public static GetIpWhiteListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIpWhiteListResponseBody self = new GetIpWhiteListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIpWhiteListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetIpWhiteListResponseBody setIpList(String ipList) {
        this.ipList = ipList;
        return this;
    }
    public String getIpList() {
        return this.ipList;
    }

    public GetIpWhiteListResponseBody setLedgerId(String ledgerId) {
        this.ledgerId = ledgerId;
        return this;
    }
    public String getLedgerId() {
        return this.ledgerId;
    }

}
