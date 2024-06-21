// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddGatewayRouteShrinkRequest extends TeaModel {
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
     * <strong>example:</strong>
     * <p>a route for xxx</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The type of the destination service. Valid values:</p>
     * <ul>
     * <li>Single</li>
     * <li>Multiple</li>
     * <li>VersionOriented</li>
     * <li>Mock</li>
     * <li>Redirect</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Multiple</p>
     */
    @NameInMap("DestinationType")
    public String destinationType;

    /**
     * <p>The mock response configuration.</p>
     */
    @NameInMap("DirectResponseJSON")
    public String directResponseJSONShrink;

    /**
     * <p>The domain ID.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("DomainId")
    public Long domainId;

    /**
     * <p>The domain IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>[0,94]</p>
     */
    @NameInMap("DomainIdListJSON")
    public String domainIdListJSON;

    /**
     * <p>Specifies whether to activate Web Application Firewall (WAF).</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableWaf")
    public Boolean enableWaf;

    /**
     * <p>Specifies whether to enable the Fallback service.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Fallback")
    public Boolean fallback;

    /**
     * <p>The information about the Fallback service.</p>
     */
    @NameInMap("FallbackServices")
    public String fallbackServicesShrink;

    /**
     * <p>The ID of the gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>526</p>
     */
    @NameInMap("GatewayId")
    public Long gatewayId;

    /**
     * <p>The unique ID of the gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-492af9b04bb4474cae9d645be8*****</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>The name of the route.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The routing policy in a JSON string.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;CORS&quot;:&quot;{\&quot;allowMethods\&quot;:\&quot;GET,POST,PUT,DELETE,HEAD,OPTIONS,PATCH\&quot;,\&quot;allowHeaders\&quot;:\&quot;<em>\&quot;,\&quot;exposeHeaders\&quot;:\&quot;</em>\&quot;,\&quot;unitNum\&quot;:12,\&quot;allowCredentials\&quot;:true,\&quot;status\&quot;:\&quot;off\&quot;,\&quot;allowOrigins\&quot;:\&quot;*\&quot;,\&quot;timeUnit\&quot;:\&quot;h\&quot;}&quot;,&quot;Timeout&quot;:&quot;{\&quot;unitNum\&quot;:10,\&quot;timeUnit\&quot;:\&quot;s\&quot;,\&quot;status\&quot;:\&quot;off\&quot;}&quot;,&quot;Retry&quot;:&quot;{\&quot;attempts\&quot;:2,\&quot;retryOn\&quot;:[\&quot;5xx\&quot;],\&quot;status\&quot;:\&quot;off\&quot;}&quot;,&quot;HTTPRewrite&quot;:&quot;{\&quot;pathType\&quot;:\&quot;EQUAL\&quot;,\&quot;path\&quot;:\&quot;/o\&quot;,\&quot;status\&quot;:\&quot;off\&quot;}&quot;,&quot;Waf&quot;:&quot;{\&quot;enabled\&quot;:false}&quot;,&quot;HeaderOp&quot;:&quot;{\&quot;status\&quot;:\&quot;off\&quot;,\&quot;headerOpItems\&quot;:[{\&quot;directionType\&quot;:\&quot;Request\&quot;,\&quot;opType\&quot;:\&quot;Add\&quot;,\&quot;key\&quot;:\&quot;kkk\&quot;,\&quot;value\&quot;:\&quot;ll\&quot;}]}&quot;}</p>
     */
    @NameInMap("Policies")
    public String policies;

    /**
     * <p>The matching rule.</p>
     */
    @NameInMap("Predicates")
    public String predicatesShrink;

    /**
     * <p>The configuration of the redirection.</p>
     */
    @NameInMap("RedirectJSON")
    public String redirectJSONShrink;

    /**
     * <p>The sequence number of the route. (A small value indicates a high priority.)</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RouteOrder")
    public Integer routeOrder;

    /**
     * <p>The route type. Valid values:</p>
     * <p>Op: Manage routes.</p>
     * 
     * <strong>example:</strong>
     * <p>Op</p>
     */
    @NameInMap("RouteType")
    public String routeType;

    /**
     * <p>The list of services.</p>
     */
    @NameInMap("Services")
    public String servicesShrink;

    public static AddGatewayRouteShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddGatewayRouteShrinkRequest self = new AddGatewayRouteShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddGatewayRouteShrinkRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public AddGatewayRouteShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AddGatewayRouteShrinkRequest setDestinationType(String destinationType) {
        this.destinationType = destinationType;
        return this;
    }
    public String getDestinationType() {
        return this.destinationType;
    }

    public AddGatewayRouteShrinkRequest setDirectResponseJSONShrink(String directResponseJSONShrink) {
        this.directResponseJSONShrink = directResponseJSONShrink;
        return this;
    }
    public String getDirectResponseJSONShrink() {
        return this.directResponseJSONShrink;
    }

    public AddGatewayRouteShrinkRequest setDomainId(Long domainId) {
        this.domainId = domainId;
        return this;
    }
    public Long getDomainId() {
        return this.domainId;
    }

    public AddGatewayRouteShrinkRequest setDomainIdListJSON(String domainIdListJSON) {
        this.domainIdListJSON = domainIdListJSON;
        return this;
    }
    public String getDomainIdListJSON() {
        return this.domainIdListJSON;
    }

    public AddGatewayRouteShrinkRequest setEnableWaf(Boolean enableWaf) {
        this.enableWaf = enableWaf;
        return this;
    }
    public Boolean getEnableWaf() {
        return this.enableWaf;
    }

    public AddGatewayRouteShrinkRequest setFallback(Boolean fallback) {
        this.fallback = fallback;
        return this;
    }
    public Boolean getFallback() {
        return this.fallback;
    }

    public AddGatewayRouteShrinkRequest setFallbackServicesShrink(String fallbackServicesShrink) {
        this.fallbackServicesShrink = fallbackServicesShrink;
        return this;
    }
    public String getFallbackServicesShrink() {
        return this.fallbackServicesShrink;
    }

    public AddGatewayRouteShrinkRequest setGatewayId(Long gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public Long getGatewayId() {
        return this.gatewayId;
    }

    public AddGatewayRouteShrinkRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public AddGatewayRouteShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddGatewayRouteShrinkRequest setPolicies(String policies) {
        this.policies = policies;
        return this;
    }
    public String getPolicies() {
        return this.policies;
    }

    public AddGatewayRouteShrinkRequest setPredicatesShrink(String predicatesShrink) {
        this.predicatesShrink = predicatesShrink;
        return this;
    }
    public String getPredicatesShrink() {
        return this.predicatesShrink;
    }

    public AddGatewayRouteShrinkRequest setRedirectJSONShrink(String redirectJSONShrink) {
        this.redirectJSONShrink = redirectJSONShrink;
        return this;
    }
    public String getRedirectJSONShrink() {
        return this.redirectJSONShrink;
    }

    public AddGatewayRouteShrinkRequest setRouteOrder(Integer routeOrder) {
        this.routeOrder = routeOrder;
        return this;
    }
    public Integer getRouteOrder() {
        return this.routeOrder;
    }

    public AddGatewayRouteShrinkRequest setRouteType(String routeType) {
        this.routeType = routeType;
        return this;
    }
    public String getRouteType() {
        return this.routeType;
    }

    public AddGatewayRouteShrinkRequest setServicesShrink(String servicesShrink) {
        this.servicesShrink = servicesShrink;
        return this;
    }
    public String getServicesShrink() {
        return this.servicesShrink;
    }

}
