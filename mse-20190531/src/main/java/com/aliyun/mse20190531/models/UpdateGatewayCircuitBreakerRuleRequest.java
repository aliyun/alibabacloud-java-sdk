// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayCircuitBreakerRuleRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BehaviorType")
    public Integer behaviorType;

    @NameInMap("BodyEncoding")
    public Integer bodyEncoding;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Enable")
    public Integer enable;

    @NameInMap("GatewayId")
    public Long gatewayId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Id")
    public Long id;

    @NameInMap("MaxAllowedMs")
    public Integer maxAllowedMs;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MinRequestAmount")
    public Integer minRequestAmount;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RecoveryTimeoutSec")
    public Integer recoveryTimeoutSec;

    @NameInMap("ResponseContentBody")
    public String responseContentBody;

    @NameInMap("ResponseRedirectUrl")
    public String responseRedirectUrl;

    @NameInMap("ResponseStatusCode")
    public Integer responseStatusCode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RouteId")
    public Long routeId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RouteName")
    public String routeName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StatDurationSec")
    public Integer statDurationSec;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Strategy")
    public Integer strategy;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TriggerRatio")
    public Integer triggerRatio;

    public static UpdateGatewayCircuitBreakerRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayCircuitBreakerRuleRequest self = new UpdateGatewayCircuitBreakerRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayCircuitBreakerRuleRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateGatewayCircuitBreakerRuleRequest setBehaviorType(Integer behaviorType) {
        this.behaviorType = behaviorType;
        return this;
    }
    public Integer getBehaviorType() {
        return this.behaviorType;
    }

    public UpdateGatewayCircuitBreakerRuleRequest setBodyEncoding(Integer bodyEncoding) {
        this.bodyEncoding = bodyEncoding;
        return this;
    }
    public Integer getBodyEncoding() {
        return this.bodyEncoding;
    }

    public UpdateGatewayCircuitBreakerRuleRequest setEnable(Integer enable) {
        this.enable = enable;
        return this;
    }
    public Integer getEnable() {
        return this.enable;
    }

    public UpdateGatewayCircuitBreakerRuleRequest setGatewayId(Long gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public Long getGatewayId() {
        return this.gatewayId;
    }

    public UpdateGatewayCircuitBreakerRuleRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public UpdateGatewayCircuitBreakerRuleRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateGatewayCircuitBreakerRuleRequest setMaxAllowedMs(Integer maxAllowedMs) {
        this.maxAllowedMs = maxAllowedMs;
        return this;
    }
    public Integer getMaxAllowedMs() {
        return this.maxAllowedMs;
    }

    public UpdateGatewayCircuitBreakerRuleRequest setMinRequestAmount(Integer minRequestAmount) {
        this.minRequestAmount = minRequestAmount;
        return this;
    }
    public Integer getMinRequestAmount() {
        return this.minRequestAmount;
    }

    public UpdateGatewayCircuitBreakerRuleRequest setRecoveryTimeoutSec(Integer recoveryTimeoutSec) {
        this.recoveryTimeoutSec = recoveryTimeoutSec;
        return this;
    }
    public Integer getRecoveryTimeoutSec() {
        return this.recoveryTimeoutSec;
    }

    public UpdateGatewayCircuitBreakerRuleRequest setResponseContentBody(String responseContentBody) {
        this.responseContentBody = responseContentBody;
        return this;
    }
    public String getResponseContentBody() {
        return this.responseContentBody;
    }

    public UpdateGatewayCircuitBreakerRuleRequest setResponseRedirectUrl(String responseRedirectUrl) {
        this.responseRedirectUrl = responseRedirectUrl;
        return this;
    }
    public String getResponseRedirectUrl() {
        return this.responseRedirectUrl;
    }

    public UpdateGatewayCircuitBreakerRuleRequest setResponseStatusCode(Integer responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Integer getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public UpdateGatewayCircuitBreakerRuleRequest setRouteId(Long routeId) {
        this.routeId = routeId;
        return this;
    }
    public Long getRouteId() {
        return this.routeId;
    }

    public UpdateGatewayCircuitBreakerRuleRequest setRouteName(String routeName) {
        this.routeName = routeName;
        return this;
    }
    public String getRouteName() {
        return this.routeName;
    }

    public UpdateGatewayCircuitBreakerRuleRequest setStatDurationSec(Integer statDurationSec) {
        this.statDurationSec = statDurationSec;
        return this;
    }
    public Integer getStatDurationSec() {
        return this.statDurationSec;
    }

    public UpdateGatewayCircuitBreakerRuleRequest setStrategy(Integer strategy) {
        this.strategy = strategy;
        return this;
    }
    public Integer getStrategy() {
        return this.strategy;
    }

    public UpdateGatewayCircuitBreakerRuleRequest setTriggerRatio(Integer triggerRatio) {
        this.triggerRatio = triggerRatio;
        return this;
    }
    public Integer getTriggerRatio() {
        return this.triggerRatio;
    }

}
