// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayFlowRuleRequest extends TeaModel {
    /**
     * <p>The language in which you want to display the results. Valid values: zh (default): Chinese. en: English.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The type of the web fallback behavior.</p>
     * <p>0: returns the specified text</p>
     * <p>1: redirects to the specified page</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("BehaviorType")
    public Integer behaviorType;

    /**
     * <p>The encoding type.</p>
     * <p>0: plain text</p>
     * <p>1: JSON</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("BodyEncoding")
    public Integer bodyEncoding;

    /**
     * <p>Specifies whether to enable the rule.</p>
     * <p>0: disables the rule.</p>
     * <p>1: enables the rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Enable")
    public Integer enable;

    /**
     * <p>The gateway ID.</p>
     * 
     * <strong>example:</strong>
     * <p>14407</p>
     */
    @NameInMap("GatewayId")
    public Long gatewayId;

    /**
     * <p>The unique ID of the gateway.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-e2d226bba4b2445c9e29fa7f8216****</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>The ID of the throttling rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>549</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The returned HTTP text.</p>
     * 
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("ResponseContentBody")
    public String responseContentBody;

    /**
     * <p>The redirection URL.</p>
     * 
     * <strong>example:</strong>
     * <p>www.******.com</p>
     */
    @NameInMap("ResponseRedirectUrl")
    public String responseRedirectUrl;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>429</p>
     */
    @NameInMap("ResponseStatusCode")
    public Integer responseStatusCode;

    /**
     * <p>The route ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>48811</p>
     */
    @NameInMap("RouteId")
    public Long routeId;

    /**
     * <p>The route name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>routeA</p>
     */
    @NameInMap("RouteName")
    public String routeName;

    /**
     * <p>The overall queries per second (QPS) threshold.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Threshold")
    public Integer threshold;

    public static UpdateGatewayFlowRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayFlowRuleRequest self = new UpdateGatewayFlowRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayFlowRuleRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateGatewayFlowRuleRequest setBehaviorType(Integer behaviorType) {
        this.behaviorType = behaviorType;
        return this;
    }
    public Integer getBehaviorType() {
        return this.behaviorType;
    }

    public UpdateGatewayFlowRuleRequest setBodyEncoding(Integer bodyEncoding) {
        this.bodyEncoding = bodyEncoding;
        return this;
    }
    public Integer getBodyEncoding() {
        return this.bodyEncoding;
    }

    public UpdateGatewayFlowRuleRequest setEnable(Integer enable) {
        this.enable = enable;
        return this;
    }
    public Integer getEnable() {
        return this.enable;
    }

    public UpdateGatewayFlowRuleRequest setGatewayId(Long gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public Long getGatewayId() {
        return this.gatewayId;
    }

    public UpdateGatewayFlowRuleRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public UpdateGatewayFlowRuleRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateGatewayFlowRuleRequest setResponseContentBody(String responseContentBody) {
        this.responseContentBody = responseContentBody;
        return this;
    }
    public String getResponseContentBody() {
        return this.responseContentBody;
    }

    public UpdateGatewayFlowRuleRequest setResponseRedirectUrl(String responseRedirectUrl) {
        this.responseRedirectUrl = responseRedirectUrl;
        return this;
    }
    public String getResponseRedirectUrl() {
        return this.responseRedirectUrl;
    }

    public UpdateGatewayFlowRuleRequest setResponseStatusCode(Integer responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Integer getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public UpdateGatewayFlowRuleRequest setRouteId(Long routeId) {
        this.routeId = routeId;
        return this;
    }
    public Long getRouteId() {
        return this.routeId;
    }

    public UpdateGatewayFlowRuleRequest setRouteName(String routeName) {
        this.routeName = routeName;
        return this;
    }
    public String getRouteName() {
        return this.routeName;
    }

    public UpdateGatewayFlowRuleRequest setThreshold(Integer threshold) {
        this.threshold = threshold;
        return this;
    }
    public Integer getThreshold() {
        return this.threshold;
    }

}
