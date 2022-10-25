// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayRouteShrinkRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("DestinationType")
    public String destinationType;

    @NameInMap("DirectResponseJSON")
    public String directResponseJSONShrink;

    @NameInMap("DomainIdListJSON")
    public String domainIdListJSON;

    @NameInMap("EnableWaf")
    public Boolean enableWaf;

    @NameInMap("Fallback")
    public Boolean fallback;

    @NameInMap("FallbackServices")
    public String fallbackServicesShrink;

    @NameInMap("GatewayId")
    public Long gatewayId;

    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Name")
    public String name;

    @NameInMap("Predicates")
    public String predicatesShrink;

    @NameInMap("RedirectJSON")
    public String redirectJSONShrink;

    @NameInMap("RouteOrder")
    public Integer routeOrder;

    @NameInMap("Services")
    public String servicesShrink;

    public static UpdateGatewayRouteShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayRouteShrinkRequest self = new UpdateGatewayRouteShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayRouteShrinkRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateGatewayRouteShrinkRequest setDestinationType(String destinationType) {
        this.destinationType = destinationType;
        return this;
    }
    public String getDestinationType() {
        return this.destinationType;
    }

    public UpdateGatewayRouteShrinkRequest setDirectResponseJSONShrink(String directResponseJSONShrink) {
        this.directResponseJSONShrink = directResponseJSONShrink;
        return this;
    }
    public String getDirectResponseJSONShrink() {
        return this.directResponseJSONShrink;
    }

    public UpdateGatewayRouteShrinkRequest setDomainIdListJSON(String domainIdListJSON) {
        this.domainIdListJSON = domainIdListJSON;
        return this;
    }
    public String getDomainIdListJSON() {
        return this.domainIdListJSON;
    }

    public UpdateGatewayRouteShrinkRequest setEnableWaf(Boolean enableWaf) {
        this.enableWaf = enableWaf;
        return this;
    }
    public Boolean getEnableWaf() {
        return this.enableWaf;
    }

    public UpdateGatewayRouteShrinkRequest setFallback(Boolean fallback) {
        this.fallback = fallback;
        return this;
    }
    public Boolean getFallback() {
        return this.fallback;
    }

    public UpdateGatewayRouteShrinkRequest setFallbackServicesShrink(String fallbackServicesShrink) {
        this.fallbackServicesShrink = fallbackServicesShrink;
        return this;
    }
    public String getFallbackServicesShrink() {
        return this.fallbackServicesShrink;
    }

    public UpdateGatewayRouteShrinkRequest setGatewayId(Long gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public Long getGatewayId() {
        return this.gatewayId;
    }

    public UpdateGatewayRouteShrinkRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public UpdateGatewayRouteShrinkRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateGatewayRouteShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateGatewayRouteShrinkRequest setPredicatesShrink(String predicatesShrink) {
        this.predicatesShrink = predicatesShrink;
        return this;
    }
    public String getPredicatesShrink() {
        return this.predicatesShrink;
    }

    public UpdateGatewayRouteShrinkRequest setRedirectJSONShrink(String redirectJSONShrink) {
        this.redirectJSONShrink = redirectJSONShrink;
        return this;
    }
    public String getRedirectJSONShrink() {
        return this.redirectJSONShrink;
    }

    public UpdateGatewayRouteShrinkRequest setRouteOrder(Integer routeOrder) {
        this.routeOrder = routeOrder;
        return this;
    }
    public Integer getRouteOrder() {
        return this.routeOrder;
    }

    public UpdateGatewayRouteShrinkRequest setServicesShrink(String servicesShrink) {
        this.servicesShrink = servicesShrink;
        return this;
    }
    public String getServicesShrink() {
        return this.servicesShrink;
    }

}
