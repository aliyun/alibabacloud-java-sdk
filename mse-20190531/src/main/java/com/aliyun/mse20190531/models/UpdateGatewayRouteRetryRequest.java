// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayRouteRetryRequest extends TeaModel {
    // The language of the response. Valid values:
    // 
    // *   zh: Chinese
    // *   en: English
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // The ID of the gateway.
    @NameInMap("GatewayId")
    public Long gatewayId;

    // The unique ID of the gateway.
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    // The ID of the associated record.
    @NameInMap("Id")
    public Long id;

    // The information about the retry policy.
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
        // The number of retries.
        @NameInMap("Attempts")
        public Integer attempts;

        // The HTTP status codes.
        @NameInMap("HttpCodes")
        public java.util.List<String> httpCodes;

        // The retry conditions.
        @NameInMap("RetryOn")
        public java.util.List<String> retryOn;

        // The status of the policy.
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
