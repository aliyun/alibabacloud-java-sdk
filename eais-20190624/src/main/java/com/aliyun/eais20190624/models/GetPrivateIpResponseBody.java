// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eais20190624.models;

import com.aliyun.tea.*;

public class GetPrivateIpResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PrivateIp")
    public String privateIp;

    public static GetPrivateIpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPrivateIpResponseBody self = new GetPrivateIpResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPrivateIpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPrivateIpResponseBody setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }
    public String getPrivateIp() {
        return this.privateIp;
    }

}
