// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayRouteTimeoutRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh: Chinese</li>
     * <li>en: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

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
     * <p>gw-533290d279c1405f9628c64f7c8272ee</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>The ID of the associated record.</p>
     * 
     * <strong>example:</strong>
     * <p>567</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The timeout period.</p>
     */
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
        /**
         * <p>The status of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The unit of time. A value of s indicates seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>s</p>
         */
        @NameInMap("TimeUnit")
        public String timeUnit;

        /**
         * <p>The value of the timeout period.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
