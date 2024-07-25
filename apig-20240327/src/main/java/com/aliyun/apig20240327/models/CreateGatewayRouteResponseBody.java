// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateGatewayRouteResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public CreateGatewayRouteResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>0F138FFC-6E2B-56C1-9BAB-A67462E339D1</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateGatewayRouteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateGatewayRouteResponseBody self = new CreateGatewayRouteResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateGatewayRouteResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateGatewayRouteResponseBody setData(CreateGatewayRouteResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateGatewayRouteResponseBodyData getData() {
        return this.data;
    }

    public CreateGatewayRouteResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateGatewayRouteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateGatewayRouteResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>gr-cpumc37d*****</p>
         */
        @NameInMap("gatewayRouteId")
        public String gatewayRouteId;

        public static CreateGatewayRouteResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateGatewayRouteResponseBodyData self = new CreateGatewayRouteResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateGatewayRouteResponseBodyData setGatewayRouteId(String gatewayRouteId) {
            this.gatewayRouteId = gatewayRouteId;
            return this;
        }
        public String getGatewayRouteId() {
            return this.gatewayRouteId;
        }

    }

}
