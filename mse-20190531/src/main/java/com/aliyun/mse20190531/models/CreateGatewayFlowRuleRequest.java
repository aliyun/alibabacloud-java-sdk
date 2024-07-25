// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateGatewayFlowRuleRequest extends TeaModel {
    /**
     * <p>The language in which you want to display the results. Valid values: zh and en. zh indicates Chinese, which is the default value. en indicates English.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The type of the web fallback behavior.</p>
     * <p>0: returns the specified content.</p>
     * <p>1: redirects to the specified page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("BehaviorType")
    public Integer behaviorType;

    /**
     * <p>The encoding format.</p>
     * <p>0: normal text</p>
     * <p>1: JSON</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("BodyEncoding")
    public Integer bodyEncoding;

    /**
     * <p>Specifies whether to enable the throttling rule.</p>
     * <p>0: disables the throttling rule.</p>
     * <p>1: enables the throttling rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Enable")
    public Integer enable;

    /**
     * <p>The ID of the gateway.</p>
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
     * <p>The HTTP text to be returned.</p>
     * 
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("ResponseContentBody")
    public String responseContentBody;

    /**
     * <p>The address to be redirected to.</p>
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
     * <p>The ID of the route.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>52853</p>
     */
    @NameInMap("RouteId")
    public Long routeId;

    /**
     * <p>The name of the routing rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>routeName</p>
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

    public static CreateGatewayFlowRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGatewayFlowRuleRequest self = new CreateGatewayFlowRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateGatewayFlowRuleRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public CreateGatewayFlowRuleRequest setBehaviorType(Integer behaviorType) {
        this.behaviorType = behaviorType;
        return this;
    }
    public Integer getBehaviorType() {
        return this.behaviorType;
    }

    public CreateGatewayFlowRuleRequest setBodyEncoding(Integer bodyEncoding) {
        this.bodyEncoding = bodyEncoding;
        return this;
    }
    public Integer getBodyEncoding() {
        return this.bodyEncoding;
    }

    public CreateGatewayFlowRuleRequest setEnable(Integer enable) {
        this.enable = enable;
        return this;
    }
    public Integer getEnable() {
        return this.enable;
    }

    public CreateGatewayFlowRuleRequest setGatewayId(Long gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public Long getGatewayId() {
        return this.gatewayId;
    }

    public CreateGatewayFlowRuleRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public CreateGatewayFlowRuleRequest setResponseContentBody(String responseContentBody) {
        this.responseContentBody = responseContentBody;
        return this;
    }
    public String getResponseContentBody() {
        return this.responseContentBody;
    }

    public CreateGatewayFlowRuleRequest setResponseRedirectUrl(String responseRedirectUrl) {
        this.responseRedirectUrl = responseRedirectUrl;
        return this;
    }
    public String getResponseRedirectUrl() {
        return this.responseRedirectUrl;
    }

    public CreateGatewayFlowRuleRequest setResponseStatusCode(Integer responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Integer getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public CreateGatewayFlowRuleRequest setRouteId(Long routeId) {
        this.routeId = routeId;
        return this;
    }
    public Long getRouteId() {
        return this.routeId;
    }

    public CreateGatewayFlowRuleRequest setRouteName(String routeName) {
        this.routeName = routeName;
        return this;
    }
    public String getRouteName() {
        return this.routeName;
    }

    public CreateGatewayFlowRuleRequest setThreshold(Integer threshold) {
        this.threshold = threshold;
        return this;
    }
    public Integer getThreshold() {
        return this.threshold;
    }

}
