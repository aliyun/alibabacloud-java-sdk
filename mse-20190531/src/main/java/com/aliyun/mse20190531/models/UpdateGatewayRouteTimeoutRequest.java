// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayRouteTimeoutRequest extends TeaModel {
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

    // The timeout period.
    @NameInMap("TimeoutJSON")
    public UpdateGatewayRouteTimeoutRequestTimeoutJSON timeoutJSON;

    public static UpdateGatewayRouteTimeoutRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayRouteTimeoutRequest self = new UpdateGatewayRouteTimeoutRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayRouteTimeoutRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateGatewayRouteTimeoutRequest setGatewayId(Long gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public Long getGatewayId() {
        return this.gatewayId;
    }

    public UpdateGatewayRouteTimeoutRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public UpdateGatewayRouteTimeoutRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateGatewayRouteTimeoutRequest setTimeoutJSON(UpdateGatewayRouteTimeoutRequestTimeoutJSON timeoutJSON) {
        this.timeoutJSON = timeoutJSON;
        return this;
    }
    public UpdateGatewayRouteTimeoutRequestTimeoutJSON getTimeoutJSON() {
        return this.timeoutJSON;
    }

    public static class UpdateGatewayRouteTimeoutRequestTimeoutJSON extends TeaModel {
        // The status of the policy.
        @NameInMap("Status")
        public String status;

        // The unit of time. A value of s indicates seconds.
        @NameInMap("TimeUnit")
        public String timeUnit;

        // The value of the timeout period.
        @NameInMap("UnitNum")
        public Integer unitNum;

        public static UpdateGatewayRouteTimeoutRequestTimeoutJSON build(java.util.Map<String, ?> map) throws Exception {
            UpdateGatewayRouteTimeoutRequestTimeoutJSON self = new UpdateGatewayRouteTimeoutRequestTimeoutJSON();
            return TeaModel.build(map, self);
        }

        public UpdateGatewayRouteTimeoutRequestTimeoutJSON setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateGatewayRouteTimeoutRequestTimeoutJSON setTimeUnit(String timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }
        public String getTimeUnit() {
            return this.timeUnit;
        }

        public UpdateGatewayRouteTimeoutRequestTimeoutJSON setUnitNum(Integer unitNum) {
            this.unitNum = unitNum;
            return this;
        }
        public Integer getUnitNum() {
            return this.unitNum;
        }

    }

}
