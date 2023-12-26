// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DeleteGatewayIntranetLinkedVpcResponseBody extends TeaModel {
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

    public static DeleteGatewayIntranetLinkedVpcResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteGatewayIntranetLinkedVpcResponseBody self = new DeleteGatewayIntranetLinkedVpcResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteGatewayIntranetLinkedVpcResponseBody setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public DeleteGatewayIntranetLinkedVpcResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteGatewayIntranetLinkedVpcResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
