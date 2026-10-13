// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetProductRefResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public GetProductRefResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>393E2630-DBE7-5221-AB35-9E740675491A</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetProductRefResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProductRefResponseBody self = new GetProductRefResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProductRefResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetProductRefResponseBody setData(GetProductRefResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetProductRefResponseBodyData getData() {
        return this.data;
    }

    public GetProductRefResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetProductRefResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetProductRefResponseBodyData extends TeaModel {
        /**
         * <p>The API configurations currently associated with the API product. The structure is derived from the common struct HiMarketProductRefConfig. This struct contains the gatewayId and apigRefConfig members. The inner apigRefConfig struct contains the mcpServerId, mcpRouteId, mcpServerName, agentApiId, agentApiName, modelApiId, and modelApiName members.</p>
         */
        @NameInMap("apigRefConfig")
        public HiMarketProductRefConfig apigRefConfig;

        /**
         * <p>The gateway ID. The ID of the gateway instance where the association configuration of the API product resides.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-123456</p>
         */
        @NameInMap("gatewayId")
        public String gatewayId;

        public static GetProductRefResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetProductRefResponseBodyData self = new GetProductRefResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetProductRefResponseBodyData setApigRefConfig(HiMarketProductRefConfig apigRefConfig) {
            this.apigRefConfig = apigRefConfig;
            return this;
        }
        public HiMarketProductRefConfig getApigRefConfig() {
            return this.apigRefConfig;
        }

        public GetProductRefResponseBodyData setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

    }

}
