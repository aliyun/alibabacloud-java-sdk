// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DissociateIpAddressResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DissociateIpAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DissociateIpAddressResponseBody self = new DissociateIpAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public DissociateIpAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
