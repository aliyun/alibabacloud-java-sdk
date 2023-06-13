// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayRouteRetryRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

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

    /**
     * <p>The information about the retry policy.</p>
     */
    @NameInMap("RetryJSON")
    public UpdateGatewayRouteRetryRequestRetryJSON retryJSON;

    public static UpdateGatewayRouteRetryRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayRouteRetryRequest self = new UpdateGatewayRouteRetryRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayRouteRetryRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateGatewayRouteRetryRequest setGatewayId(Long gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public Long getGatewayId() {
        return this.gatewayId;
    }

    public UpdateGatewayRouteRetryRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public UpdateGatewayRouteRetryRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateGatewayRouteRetryRequest setRetryJSON(UpdateGatewayRouteRetryRequestRetryJSON retryJSON) {
        this.retryJSON = retryJSON;
        return this;
    }
    public UpdateGatewayRouteRetryRequestRetryJSON getRetryJSON() {
        return this.retryJSON;
    }

    public static class UpdateGatewayRouteRetryRequestRetryJSON extends TeaModel {
        /**
         * <p>The number of retries.</p>
         */
        @NameInMap("Attempts")
        public Integer attempts;

        /**
         * <p>The HTTP status codes.</p>
         */
        @NameInMap("HttpCodes")
        public java.util.List<String> httpCodes;

        /**
         * <p>The retry conditions.</p>
         */
        @NameInMap("RetryOn")
        public java.util.List<String> retryOn;

        /**
         * <p>The status of the policy.</p>
         */
        @NameInMap("Status")
        public String status;

        public static UpdateGatewayRouteRetryRequestRetryJSON build(java.util.Map<String, ?> map) throws Exception {
            UpdateGatewayRouteRetryRequestRetryJSON self = new UpdateGatewayRouteRetryRequestRetryJSON();
            return TeaModel.build(map, self);
        }

        public UpdateGatewayRouteRetryRequestRetryJSON setAttempts(Integer attempts) {
            this.attempts = attempts;
            return this;
        }
        public Integer getAttempts() {
            return this.attempts;
        }

        public UpdateGatewayRouteRetryRequestRetryJSON setHttpCodes(java.util.List<String> httpCodes) {
            this.httpCodes = httpCodes;
            return this;
        }
        public java.util.List<String> getHttpCodes() {
            return this.httpCodes;
        }

        public UpdateGatewayRouteRetryRequestRetryJSON setRetryOn(java.util.List<String> retryOn) {
            this.retryOn = retryOn;
            return this;
        }
        public java.util.List<String> getRetryOn() {
            return this.retryOn;
        }

        public UpdateGatewayRouteRetryRequestRetryJSON setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
