// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddGatewayRouteShrinkRequest extends TeaModel {
    // The language of the response. Valid values:
    // 
    // *   zh: Chinese
    // *   en: English
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // The destination service type.
    @NameInMap("DestinationType")
    public String destinationType;

    // The mock response configuration.
    @NameInMap("DirectResponseJSON")
    public String directResponseJSONShrink;

    // The domain ID.
    @NameInMap("DomainId")
    public Long domainId;

    // The list of domain names.
    @NameInMap("DomainIdListJSON")
    public String domainIdListJSON;

    // Specifies whether to activate Web Application Firewall (WAF).
    @NameInMap("EnableWaf")
    public Boolean enableWaf;

    // Specifies whether to enable the Fallback service.
    @NameInMap("Fallback")
    public Boolean fallback;

    // The information about the Fallback service.
    @NameInMap("FallbackServices")
    public String fallbackServicesShrink;

    // The ID of the gateway.
    @NameInMap("GatewayId")
    public Long gatewayId;

    // The unique ID of the gateway.
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    // The name of the route.
    @NameInMap("Name")
    public String name;

    // The matching rule.
    @NameInMap("Predicates")
    public String predicatesShrink;

    // The configuration of the redirection.
    @NameInMap("RedirectJSON")
    public String redirectJSONShrink;

    // The sequence number of the route. (A small value indicates a high priority.)
    @NameInMap("RouteOrder")
    public Integer routeOrder;

    // The information about services.
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

    public AddGatewayRouteShrinkRequest setServicesShrink(String servicesShrink) {
        this.servicesShrink = servicesShrink;
        return this;
    }
    public String getServicesShrink() {
        return this.servicesShrink;
    }

}
