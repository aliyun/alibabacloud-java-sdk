// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ValidateVpcConnectivityResponseBody extends TeaModel {
    @NameInMap("Connected")
    public Boolean connected;

    @NameInMap("IpType")
    public String ipType;

    @NameInMap("RequestId")
    public String requestId;

    public static ValidateVpcConnectivityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ValidateVpcConnectivityResponseBody self = new ValidateVpcConnectivityResponseBody();
        return TeaModel.build(map, self);
    }

    public ValidateVpcConnectivityResponseBody setConnected(Boolean connected) {
        this.connected = connected;
        return this;
    }
    public Boolean getConnected() {
        return this.connected;
    }

    public ValidateVpcConnectivityResponseBody setIpType(String ipType) {
        this.ipType = ipType;
        return this;
    }
    public String getIpType() {
        return this.ipType;
    }

    public ValidateVpcConnectivityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
