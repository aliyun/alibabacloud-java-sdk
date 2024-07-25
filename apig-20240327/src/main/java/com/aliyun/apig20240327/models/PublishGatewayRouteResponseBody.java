// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class PublishGatewayRouteResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>043360DA-ED3B-5386-9B7A-D94DECF99A30</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static PublishGatewayRouteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PublishGatewayRouteResponseBody self = new PublishGatewayRouteResponseBody();
        return TeaModel.build(map, self);
    }

    public PublishGatewayRouteResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PublishGatewayRouteResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PublishGatewayRouteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
