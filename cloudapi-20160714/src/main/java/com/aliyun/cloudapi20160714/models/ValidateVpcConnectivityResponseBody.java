// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ValidateVpcConnectivityResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the API Gateway instance is connected to the port. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("Connected")
    public Boolean connected;

    /**
     * <p>Indicates whether the instance in the authorization is an ECS instance or an SLB instance when the instance ID in the authorization is an IP address. Valid values:</p>
     * <br>
     * <p>*   **ECS**</p>
     * <p>*   **SLB**</p>
     * <p>*   **INVALID**: The instance type corresponding to the IP address is invalid.</p>
     */
    @NameInMap("IpType")
    public String ipType;

    /**
     * <p>The request ID.</p>
     */
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
