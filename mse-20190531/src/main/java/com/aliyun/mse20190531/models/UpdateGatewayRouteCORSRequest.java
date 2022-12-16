// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayRouteCORSRequest extends TeaModel {
    // The language of the response. In compliance with [RFC 7231](https://tools.ietf.org/html/rfc7231), the backend service must return a response based on the language used by the user.
    // This parameter is empty by default. Valid values:
    // * zh-CN: Chinese
    // * en-US: English
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // The information about the CORS policy.
    @NameInMap("CorsJSON")
    public UpdateGatewayRouteCORSRequestCorsJSON corsJSON;

    // The ID of the gateway.
    @NameInMap("GatewayId")
    public Long gatewayId;

    // The unique ID of the gateway.
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    // The ID of the route.
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
        // The credentials allowed.
        @NameInMap("AllowCredentials")
        public Boolean allowCredentials;

        // The request headers allowed.
        @NameInMap("AllowHeaders")
        public String allowHeaders;

        // The HTTP methods allowed.
        @NameInMap("AllowMethods")
        public String allowMethods;

        // The origins from which access is allowed.
        @NameInMap("AllowOrigins")
        public String allowOrigins;

        // The response headers allowed.
        @NameInMap("ExposeHeaders")
        public String exposeHeaders;

        // The status of the policy.
        @NameInMap("Status")
        public String status;

        // The unit of time.
        @NameInMap("TimeUnit")
        public String timeUnit;

        // The value of time.
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
