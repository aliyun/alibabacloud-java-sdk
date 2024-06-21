// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayIsolationRuleRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("BehaviorType")
    public Integer behaviorType;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("BodyEncoding")
    public Integer bodyEncoding;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Enable")
    public Integer enable;

    /**
     * <strong>example:</strong>
     * <p>14407</p>
     */
    @NameInMap("GatewayId")
    public Long gatewayId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-e2d226bba4b2445c9e29fa7f8216****</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>358</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxConcurrency")
    public Integer maxConcurrency;

    /**
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("ResponseContentBody")
    public String responseContentBody;

    /**
     * <strong>example:</strong>
     * <p>www.******.com</p>
     */
    @NameInMap("ResponseRedirectUrl")
    public String responseRedirectUrl;

    /**
     * <strong>example:</strong>
     * <p>429</p>
     */
    @NameInMap("ResponseStatusCode")
    public Integer responseStatusCode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>52853</p>
     */
    @NameInMap("RouteId")
    public Long routeId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>routeName</p>
     */
    @NameInMap("RouteName")
    public String routeName;

    public static UpdateGatewayIsolationRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayIsolationRuleRequest self = new UpdateGatewayIsolationRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayIsolationRuleRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateGatewayIsolationRuleRequest setBehaviorType(Integer behaviorType) {
        this.behaviorType = behaviorType;
        return this;
    }
    public Integer getBehaviorType() {
        return this.behaviorType;
    }

    public UpdateGatewayIsolationRuleRequest setBodyEncoding(Integer bodyEncoding) {
        this.bodyEncoding = bodyEncoding;
        return this;
    }
    public Integer getBodyEncoding() {
        return this.bodyEncoding;
    }

    public UpdateGatewayIsolationRuleRequest setEnable(Integer enable) {
        this.enable = enable;
        return this;
    }
    public Integer getEnable() {
        return this.enable;
    }

    public UpdateGatewayIsolationRuleRequest setGatewayId(Long gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public Long getGatewayId() {
        return this.gatewayId;
    }

    public UpdateGatewayIsolationRuleRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public UpdateGatewayIsolationRuleRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateGatewayIsolationRuleRequest setMaxConcurrency(Integer maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
        return this;
    }
    public Integer getMaxConcurrency() {
        return this.maxConcurrency;
    }

    public UpdateGatewayIsolationRuleRequest setResponseContentBody(String responseContentBody) {
        this.responseContentBody = responseContentBody;
        return this;
    }
    public String getResponseContentBody() {
        return this.responseContentBody;
    }

    public UpdateGatewayIsolationRuleRequest setResponseRedirectUrl(String responseRedirectUrl) {
        this.responseRedirectUrl = responseRedirectUrl;
        return this;
    }
    public String getResponseRedirectUrl() {
        return this.responseRedirectUrl;
    }

    public UpdateGatewayIsolationRuleRequest setResponseStatusCode(Integer responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Integer getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public UpdateGatewayIsolationRuleRequest setRouteId(Long routeId) {
        this.routeId = routeId;
        return this;
    }
    public Long getRouteId() {
        return this.routeId;
    }

    public UpdateGatewayIsolationRuleRequest setRouteName(String routeName) {
        this.routeName = routeName;
        return this;
    }
    public String getRouteName() {
        return this.routeName;
    }

}
