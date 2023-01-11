// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayRouteCORSRequest extends TeaModel {
    /**
     * <p>The language of the response. In compliance with [RFC 7231](https://tools.ietf.org/html/rfc7231), the backend service must return a response based on the language used by the user.</p>
     * <br>
     * <p>*   No default value</p>
     * <p>*   zh-CN: Chinese</p>
     * <p>*   en-US: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The information about the CORS policy.</p>
     */
    @NameInMap("CorsJSON")
    public UpdateGatewayRouteCORSRequestCorsJSON corsJSON;

    /**
     * <p>The ID of the gateway.</p>
     */
    @NameInMap("GatewayId")
    public Long gatewayId;

    /**
     * <p>The unique ID of the gateway.</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>The ID of the associated record.</p>
     */
    @NameInMap("Id")
    public Long id;

    public static UpdateGatewayRouteCORSRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayRouteCORSRequest self = new UpdateGatewayRouteCORSRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayRouteCORSRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateGatewayRouteCORSRequest setCorsJSON(UpdateGatewayRouteCORSRequestCorsJSON corsJSON) {
        this.corsJSON = corsJSON;
        return this;
    }
    public UpdateGatewayRouteCORSRequestCorsJSON getCorsJSON() {
        return this.corsJSON;
    }

    public UpdateGatewayRouteCORSRequest setGatewayId(Long gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public Long getGatewayId() {
        return this.gatewayId;
    }

    public UpdateGatewayRouteCORSRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public UpdateGatewayRouteCORSRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public static class UpdateGatewayRouteCORSRequestCorsJSON extends TeaModel {
        /**
         * <p>The credentials allowed.</p>
         */
        @NameInMap("AllowCredentials")
        public Boolean allowCredentials;

        /**
         * <p>The request headers allowed.</p>
         */
        @NameInMap("AllowHeaders")
        public String allowHeaders;

        /**
         * <p>The HTTP methods allowed.</p>
         */
        @NameInMap("AllowMethods")
        public String allowMethods;

        /**
         * <p>The origins from which access is allowed.</p>
         */
        @NameInMap("AllowOrigins")
        public String allowOrigins;

        /**
         * <p>The response headers allowed.</p>
         */
        @NameInMap("ExposeHeaders")
        public String exposeHeaders;

        /**
         * <p>The status of the policy.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The unit of time.</p>
         */
        @NameInMap("TimeUnit")
        public String timeUnit;

        /**
         * <p>The value of time.</p>
         */
        @NameInMap("UnitNum")
        public Long unitNum;

        public static UpdateGatewayRouteCORSRequestCorsJSON build(java.util.Map<String, ?> map) throws Exception {
            UpdateGatewayRouteCORSRequestCorsJSON self = new UpdateGatewayRouteCORSRequestCorsJSON();
            return TeaModel.build(map, self);
        }

        public UpdateGatewayRouteCORSRequestCorsJSON setAllowCredentials(Boolean allowCredentials) {
            this.allowCredentials = allowCredentials;
            return this;
        }
        public Boolean getAllowCredentials() {
            return this.allowCredentials;
        }

        public UpdateGatewayRouteCORSRequestCorsJSON setAllowHeaders(String allowHeaders) {
            this.allowHeaders = allowHeaders;
            return this;
        }
        public String getAllowHeaders() {
            return this.allowHeaders;
        }

        public UpdateGatewayRouteCORSRequestCorsJSON setAllowMethods(String allowMethods) {
            this.allowMethods = allowMethods;
            return this;
        }
        public String getAllowMethods() {
            return this.allowMethods;
        }

        public UpdateGatewayRouteCORSRequestCorsJSON setAllowOrigins(String allowOrigins) {
            this.allowOrigins = allowOrigins;
            return this;
        }
        public String getAllowOrigins() {
            return this.allowOrigins;
        }

        public UpdateGatewayRouteCORSRequestCorsJSON setExposeHeaders(String exposeHeaders) {
            this.exposeHeaders = exposeHeaders;
            return this;
        }
        public String getExposeHeaders() {
            return this.exposeHeaders;
        }

        public UpdateGatewayRouteCORSRequestCorsJSON setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateGatewayRouteCORSRequestCorsJSON setTimeUnit(String timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }
        public String getTimeUnit() {
            return this.timeUnit;
        }

        public UpdateGatewayRouteCORSRequestCorsJSON setUnitNum(Long unitNum) {
            this.unitNum = unitNum;
            return this;
        }
        public Long getUnitNum() {
            return this.unitNum;
        }

    }

}
