// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayRouteShrinkRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("Description")
    public String description;

    /**
     * <p>The destination service type.</p>
     */
    @NameInMap("DestinationType")
    public String destinationType;

    /**
     * <p>The information about service mocking.</p>
     */
    @NameInMap("DirectResponseJSON")
    public String directResponseJSONShrink;

    /**
     * <p>The associated domain name.</p>
     */
    @NameInMap("DomainIdListJSON")
    public String domainIdListJSON;

    /**
     * <p>Specifies whether to activate Web Application Firewall (WAF).</p>
     */
    @NameInMap("EnableWaf")
    public Boolean enableWaf;

    /**
     * <p>Specifies whether to enable the Fallback service.</p>
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
     */
    @NameInMap("GatewayId")
    public Long gatewayId;

    /**
     * <p>The unique ID of the gateway.</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>The ID of the route.</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The name of the route.</p>
     */
    @NameInMap("Name")
    @Deprecated
    public String name;

    /**
     * <p>The route matching conditions.</p>
     */
    @NameInMap("Predicates")
    public String predicatesShrink;

    /**
     * <p>The information about redirection.</p>
     */
    @NameInMap("RedirectJSON")
    public String redirectJSONShrink;

    /**
     * <p>The sequence number of the route.</p>
     */
    @NameInMap("RouteOrder")
    public Integer routeOrder;

    /**
     * <p>The information about destination services.</p>
     */
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

    public UpdateGatewayRouteShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
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
