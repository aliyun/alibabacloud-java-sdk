// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayRouteCORSRequest extends TeaModel {
    /**
     * <p>The language of the response. In compliance with <a href="https://tools.ietf.org/html/rfc7231">RFC 7231</a>, the backend service must return a response based on the language used by the user.</p>
     * <ul>
     * <li>No default value.</li>
     * <li>zh-CN: Chinese</li>
     * <li>en-US: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
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
     * 
     * <strong>example:</strong>
     * <p>85</p>
     */
    @NameInMap("GatewayId")
    public Long gatewayId;

    /**
     * <p>The unique ID of the gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-f70a6ddf2f0941a2bb997b2d16028f37</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>The ID of the associated record.</p>
     * 
     * <strong>example:</strong>
     * <p>55</p>
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
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AllowCredentials")
        public Boolean allowCredentials;

        /**
         * <p>The request headers allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>content-type</p>
         */
        @NameInMap("AllowHeaders")
        public String allowHeaders;

        /**
         * <p>The HTTP methods allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>GET,POST</p>
         */
        @NameInMap("AllowMethods")
        public String allowMethods;

        /**
         * <p>The origins from which access is allowed.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://api.aliyun-inc.com/">https://api.aliyun-inc.com/</a></p>
         */
        @NameInMap("AllowOrigins")
        public String allowOrigins;

        /**
         * <p>The response headers allowed.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("ExposeHeaders")
        public String exposeHeaders;

        /**
         * <p>The status of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The unit of time.</p>
         * 
         * <strong>example:</strong>
         * <p>h</p>
         */
        @NameInMap("TimeUnit")
        public String timeUnit;

        /**
         * <p>The value of time.</p>
         * 
         * <strong>example:</strong>
         * <p>24</p>
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
