// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayRouteTimeoutRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("GatewayId")
    public Long gatewayId;

    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    @NameInMap("Id")
    public Long id;

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
        @NameInMap("Status")
        public String status;

        @NameInMap("TimeUnit")
        public String timeUnit;

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
