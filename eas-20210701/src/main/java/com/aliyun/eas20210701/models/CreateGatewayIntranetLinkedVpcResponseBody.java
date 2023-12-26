// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateGatewayIntranetLinkedVpcResponseBody extends TeaModel {
    /**
     * <p>The private gateway ID.</p>
     */
    @NameInMap("GatewayId")
    public String gatewayId;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateGatewayIntranetLinkedVpcResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateGatewayIntranetLinkedVpcResponseBody self = new CreateGatewayIntranetLinkedVpcResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateGatewayIntranetLinkedVpcResponseBody setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public CreateGatewayIntranetLinkedVpcResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateGatewayIntranetLinkedVpcResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
