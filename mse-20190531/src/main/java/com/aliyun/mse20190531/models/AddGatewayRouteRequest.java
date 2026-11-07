// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddGatewayRouteRequest extends TeaModel {
    /**
     * <p>The language of the returned information. Valid values:</p>
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
     * <p>The route description.</p>
     * 
     * <strong>example:</strong>
     * <p>a route for xxx</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The destination service type. Valid values:</p>
     * <ul>
     * <li>Single: single service</li>
     * <li>Multiple: multiple services</li>
     * <li>VersionOriented: tag-based routing</li>
     * <li>Mock: mock</li>
     * <li>Redirect: redirect</li>
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
    public AddGatewayRouteRequestDirectResponseJSON directResponseJSON;

    /**
     * <p>The domain name ID.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("DomainId")
    public Long domainId;

    /**
     * <p>The domain name list.</p>
     * 
     * <strong>example:</strong>
     * <p>[0,94]</p>
     */
    @NameInMap("DomainIdListJSON")
    public String domainIdListJSON;

    /**
     * <p><strong>[Deprecated]</strong> Use UpdateGatewayRouteWafStatus to update the WAF status of the route.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableWaf")
    @Deprecated
    public Boolean enableWaf;

    /**
     * <p>Specifies whether to enable the fallback service.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Fallback")
    public Boolean fallback;

    /**
     * <p>The fallback service.</p>
     */
    @NameInMap("FallbackServices")
    public java.util.List<AddGatewayRouteRequestFallbackServices> fallbackServices;

    /**
     * <p>The gateway ID.</p>
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
     * <p>The route name.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The JSON string of the route policy.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;CORS&quot;:&quot;{\&quot;allowMethods\&quot;:\&quot;GET,POST,PUT,DELETE,HEAD,OPTIONS,PATCH\&quot;,\&quot;allowHeaders\&quot;:\&quot;<em>\&quot;,\&quot;exposeHeaders\&quot;:\&quot;</em>\&quot;,\&quot;unitNum\&quot;:12,\&quot;allowCredentials\&quot;:true,\&quot;status\&quot;:\&quot;off\&quot;,\&quot;allowOrigins\&quot;:\&quot;*\&quot;,\&quot;timeUnit\&quot;:\&quot;h\&quot;}&quot;,&quot;Timeout&quot;:&quot;{\&quot;unitNum\&quot;:10,\&quot;timeUnit\&quot;:\&quot;s\&quot;,\&quot;status\&quot;:\&quot;off\&quot;}&quot;,&quot;Retry&quot;:&quot;{\&quot;attempts\&quot;:2,\&quot;retryOn\&quot;:[\&quot;5xx\&quot;],\&quot;status\&quot;:\&quot;off\&quot;}&quot;,&quot;HTTPRewrite&quot;:&quot;{\&quot;pathType\&quot;:\&quot;EQUAL\&quot;,\&quot;path\&quot;:\&quot;/o\&quot;,\&quot;status\&quot;:\&quot;off\&quot;}&quot;,&quot;Waf&quot;:&quot;{\&quot;enabled\&quot;:false}&quot;,&quot;HeaderOp&quot;:&quot;{\&quot;status\&quot;:\&quot;off\&quot;,\&quot;headerOpItems\&quot;:[{\&quot;directionType\&quot;:\&quot;Request\&quot;,\&quot;opType\&quot;:\&quot;Add\&quot;,\&quot;key\&quot;:\&quot;kkk\&quot;,\&quot;value\&quot;:\&quot;ll\&quot;}]}&quot;}</p>
     */
    @NameInMap("Policies")
    public String policies;

    /**
     * <p>The matching rules.</p>
     */
    @NameInMap("Predicates")
    public AddGatewayRouteRequestPredicates predicates;

    /**
     * <p>The redirect configuration.</p>
     */
    @NameInMap("RedirectJSON")
    public AddGatewayRouteRequestRedirectJSON redirectJSON;

    /**
     * <p>The route order. A smaller value indicates a higher priority.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RouteOrder")
    public Integer routeOrder;

    /**
     * <p>The route type. Valid values:</p>
     * <ul>
     * <li>Op: management and control route</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Op</p>
     */
    @NameInMap("RouteType")
    public String routeType;

    /**
     * <p>The service list. This parameter is required when the route points to a single service, multiple services, or tag-based routing.</p>
     */
    @NameInMap("Services")
    public java.util.List<AddGatewayRouteRequestServices> services;

    public static AddGatewayRouteRequest build(java.util.Map<String, ?> map) throws Exception {
        AddGatewayRouteRequest self = new AddGatewayRouteRequest();
        return TeaModel.build(map, self);
    }

    public AddGatewayRouteRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public AddGatewayRouteRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AddGatewayRouteRequest setDestinationType(String destinationType) {
        this.destinationType = destinationType;
        return this;
    }
    public String getDestinationType() {
        return this.destinationType;
    }

    public AddGatewayRouteRequest setDirectResponseJSON(AddGatewayRouteRequestDirectResponseJSON directResponseJSON) {
        this.directResponseJSON = directResponseJSON;
        return this;
    }
    public AddGatewayRouteRequestDirectResponseJSON getDirectResponseJSON() {
        return this.directResponseJSON;
    }

    public AddGatewayRouteRequest setDomainId(Long domainId) {
        this.domainId = domainId;
        return this;
    }
    public Long getDomainId() {
        return this.domainId;
    }

    public AddGatewayRouteRequest setDomainIdListJSON(String domainIdListJSON) {
        this.domainIdListJSON = domainIdListJSON;
        return this;
    }
    public String getDomainIdListJSON() {
        return this.domainIdListJSON;
    }

    @Deprecated
    public AddGatewayRouteRequest setEnableWaf(Boolean enableWaf) {
        this.enableWaf = enableWaf;
        return this;
    }
    public Boolean getEnableWaf() {
        return this.enableWaf;
    }

    public AddGatewayRouteRequest setFallback(Boolean fallback) {
        this.fallback = fallback;
        return this;
    }
    public Boolean getFallback() {
        return this.fallback;
    }

    public AddGatewayRouteRequest setFallbackServices(java.util.List<AddGatewayRouteRequestFallbackServices> fallbackServices) {
        this.fallbackServices = fallbackServices;
        return this;
    }
    public java.util.List<AddGatewayRouteRequestFallbackServices> getFallbackServices() {
        return this.fallbackServices;
    }

    public AddGatewayRouteRequest setGatewayId(Long gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public Long getGatewayId() {
        return this.gatewayId;
    }

    public AddGatewayRouteRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public AddGatewayRouteRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddGatewayRouteRequest setPolicies(String policies) {
        this.policies = policies;
        return this;
    }
    public String getPolicies() {
        return this.policies;
    }

    public AddGatewayRouteRequest setPredicates(AddGatewayRouteRequestPredicates predicates) {
        this.predicates = predicates;
        return this;
    }
    public AddGatewayRouteRequestPredicates getPredicates() {
        return this.predicates;
    }

    public AddGatewayRouteRequest setRedirectJSON(AddGatewayRouteRequestRedirectJSON redirectJSON) {
        this.redirectJSON = redirectJSON;
        return this;
    }
    public AddGatewayRouteRequestRedirectJSON getRedirectJSON() {
        return this.redirectJSON;
    }

    public AddGatewayRouteRequest setRouteOrder(Integer routeOrder) {
        this.routeOrder = routeOrder;
        return this;
    }
    public Integer getRouteOrder() {
        return this.routeOrder;
    }

    public AddGatewayRouteRequest setRouteType(String routeType) {
        this.routeType = routeType;
        return this;
    }
    public String getRouteType() {
        return this.routeType;
    }

    public AddGatewayRouteRequest setServices(java.util.List<AddGatewayRouteRequestServices> services) {
        this.services = services;
        return this;
    }
    public java.util.List<AddGatewayRouteRequestServices> getServices() {
        return this.services;
    }

    public static class AddGatewayRouteRequestDirectResponseJSON extends TeaModel {
        /**
         * <p>The mock response body.</p>
         * 
         * <strong>example:</strong>
         * <p>hello</p>
         */
        @NameInMap("Body")
        public String body;

        /**
         * <p>The mock response code.</p>
         * 
         * <strong>example:</strong>
         * <p>403</p>
         */
        @NameInMap("Code")
        public Long code;

        public static AddGatewayRouteRequestDirectResponseJSON build(java.util.Map<String, ?> map) throws Exception {
            AddGatewayRouteRequestDirectResponseJSON self = new AddGatewayRouteRequestDirectResponseJSON();
            return TeaModel.build(map, self);
        }

        public AddGatewayRouteRequestDirectResponseJSON setBody(String body) {
            this.body = body;
            return this;
        }
        public String getBody() {
            return this.body;
        }

        public AddGatewayRouteRequestDirectResponseJSON setCode(Long code) {
            this.code = code;
            return this;
        }
        public Long getCode() {
            return this.code;
        }

    }

    public static class AddGatewayRouteRequestFallbackServices extends TeaModel {
        /**
         * <p>The protocol type.</p>
         * 
         * <strong>example:</strong>
         * <p>DUBBO</p>
         */
        @NameInMap("AgreementType")
        public String agreementType;

        /**
         * <p>The service group name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The namespace where the service resides.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The weight percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Percent")
        public Integer percent;

        /**
         * <p>The service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>353</p>
         */
        @NameInMap("ServiceId")
        public Long serviceId;

        /**
         * <p>The service port.</p>
         * 
         * <strong>example:</strong>
         * <p>443</p>
         */
        @NameInMap("ServicePort")
        public Integer servicePort;

        /**
         * <p>The source type.</p>
         * 
         * <strong>example:</strong>
         * <p>MSE</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The service version.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("Version")
        public String version;

        public static AddGatewayRouteRequestFallbackServices build(java.util.Map<String, ?> map) throws Exception {
            AddGatewayRouteRequestFallbackServices self = new AddGatewayRouteRequestFallbackServices();
            return TeaModel.build(map, self);
        }

        public AddGatewayRouteRequestFallbackServices setAgreementType(String agreementType) {
            this.agreementType = agreementType;
            return this;
        }
        public String getAgreementType() {
            return this.agreementType;
        }

        public AddGatewayRouteRequestFallbackServices setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public AddGatewayRouteRequestFallbackServices setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AddGatewayRouteRequestFallbackServices setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public AddGatewayRouteRequestFallbackServices setPercent(Integer percent) {
            this.percent = percent;
            return this;
        }
        public Integer getPercent() {
            return this.percent;
        }

        public AddGatewayRouteRequestFallbackServices setServiceId(Long serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public Long getServiceId() {
            return this.serviceId;
        }

        public AddGatewayRouteRequestFallbackServices setServicePort(Integer servicePort) {
            this.servicePort = servicePort;
            return this;
        }
        public Integer getServicePort() {
            return this.servicePort;
        }

        public AddGatewayRouteRequestFallbackServices setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public AddGatewayRouteRequestFallbackServices setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class AddGatewayRouteRequestPredicatesHeaderPredicates extends TeaModel {
        /**
         * <p>The request header key.</p>
         * 
         * <strong>example:</strong>
         * <p>debug</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The matching type.</p>
         * 
         * <strong>example:</strong>
         * <p>PRE</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The corresponding value.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Value")
        public String value;

        public static AddGatewayRouteRequestPredicatesHeaderPredicates build(java.util.Map<String, ?> map) throws Exception {
            AddGatewayRouteRequestPredicatesHeaderPredicates self = new AddGatewayRouteRequestPredicatesHeaderPredicates();
            return TeaModel.build(map, self);
        }

        public AddGatewayRouteRequestPredicatesHeaderPredicates setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public AddGatewayRouteRequestPredicatesHeaderPredicates setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public AddGatewayRouteRequestPredicatesHeaderPredicates setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class AddGatewayRouteRequestPredicatesPathPredicates extends TeaModel {
        /**
         * <p>Specifies whether to ignore case.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IgnoreCase")
        public Boolean ignoreCase;

        /**
         * <p>The path.</p>
         * 
         * <strong>example:</strong>
         * <p>/test</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The route matching type. Valid values:</p>
         * <ul>
         * <li>PRE: prefix match</li>
         * <li>EQUAL: exact match</li>
         * <li>ERGULAR: regular expression match</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PRE</p>
         */
        @NameInMap("Type")
        public String type;

        public static AddGatewayRouteRequestPredicatesPathPredicates build(java.util.Map<String, ?> map) throws Exception {
            AddGatewayRouteRequestPredicatesPathPredicates self = new AddGatewayRouteRequestPredicatesPathPredicates();
            return TeaModel.build(map, self);
        }

        public AddGatewayRouteRequestPredicatesPathPredicates setIgnoreCase(Boolean ignoreCase) {
            this.ignoreCase = ignoreCase;
            return this;
        }
        public Boolean getIgnoreCase() {
            return this.ignoreCase;
        }

        public AddGatewayRouteRequestPredicatesPathPredicates setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public AddGatewayRouteRequestPredicatesPathPredicates setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class AddGatewayRouteRequestPredicatesQueryPredicates extends TeaModel {
        /**
         * <p>The parameter name.</p>
         * 
         * <strong>example:</strong>
         * <p>userid</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The matching type.</p>
         * 
         * <strong>example:</strong>
         * <p>PRE</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The matching value.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Value")
        public String value;

        public static AddGatewayRouteRequestPredicatesQueryPredicates build(java.util.Map<String, ?> map) throws Exception {
            AddGatewayRouteRequestPredicatesQueryPredicates self = new AddGatewayRouteRequestPredicatesQueryPredicates();
            return TeaModel.build(map, self);
        }

        public AddGatewayRouteRequestPredicatesQueryPredicates setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public AddGatewayRouteRequestPredicatesQueryPredicates setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public AddGatewayRouteRequestPredicatesQueryPredicates setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class AddGatewayRouteRequestPredicates extends TeaModel {
        /**
         * <p>The request header matching rules.</p>
         */
        @NameInMap("HeaderPredicates")
        public java.util.List<AddGatewayRouteRequestPredicatesHeaderPredicates> headerPredicates;

        /**
         * <p>The method matching rules.</p>
         */
        @NameInMap("MethodPredicates")
        public java.util.List<String> methodPredicates;

        /**
         * <p>The path matching rules.</p>
         */
        @NameInMap("PathPredicates")
        public AddGatewayRouteRequestPredicatesPathPredicates pathPredicates;

        /**
         * <p>The URL parameter matching rules.</p>
         */
        @NameInMap("QueryPredicates")
        public java.util.List<AddGatewayRouteRequestPredicatesQueryPredicates> queryPredicates;

        public static AddGatewayRouteRequestPredicates build(java.util.Map<String, ?> map) throws Exception {
            AddGatewayRouteRequestPredicates self = new AddGatewayRouteRequestPredicates();
            return TeaModel.build(map, self);
        }

        public AddGatewayRouteRequestPredicates setHeaderPredicates(java.util.List<AddGatewayRouteRequestPredicatesHeaderPredicates> headerPredicates) {
            this.headerPredicates = headerPredicates;
            return this;
        }
        public java.util.List<AddGatewayRouteRequestPredicatesHeaderPredicates> getHeaderPredicates() {
            return this.headerPredicates;
        }

        public AddGatewayRouteRequestPredicates setMethodPredicates(java.util.List<String> methodPredicates) {
            this.methodPredicates = methodPredicates;
            return this;
        }
        public java.util.List<String> getMethodPredicates() {
            return this.methodPredicates;
        }

        public AddGatewayRouteRequestPredicates setPathPredicates(AddGatewayRouteRequestPredicatesPathPredicates pathPredicates) {
            this.pathPredicates = pathPredicates;
            return this;
        }
        public AddGatewayRouteRequestPredicatesPathPredicates getPathPredicates() {
            return this.pathPredicates;
        }

        public AddGatewayRouteRequestPredicates setQueryPredicates(java.util.List<AddGatewayRouteRequestPredicatesQueryPredicates> queryPredicates) {
            this.queryPredicates = queryPredicates;
            return this;
        }
        public java.util.List<AddGatewayRouteRequestPredicatesQueryPredicates> getQueryPredicates() {
            return this.queryPredicates;
        }

    }

    public static class AddGatewayRouteRequestRedirectJSON extends TeaModel {
        /**
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>302</p>
         */
        @NameInMap("Code")
        public Integer code;

        /**
         * <p>The redirect hostname.</p>
         * 
         * <strong>example:</strong>
         * <p>test.com</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The redirect path.</p>
         * 
         * <strong>example:</strong>
         * <p>/test</p>
         */
        @NameInMap("Path")
        public String path;

        public static AddGatewayRouteRequestRedirectJSON build(java.util.Map<String, ?> map) throws Exception {
            AddGatewayRouteRequestRedirectJSON self = new AddGatewayRouteRequestRedirectJSON();
            return TeaModel.build(map, self);
        }

        public AddGatewayRouteRequestRedirectJSON setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public AddGatewayRouteRequestRedirectJSON setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public AddGatewayRouteRequestRedirectJSON setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class AddGatewayRouteRequestServicesHttpDubboTranscoderMothedMapListParamMapsList extends TeaModel {
        /**
         * <p>The key extracted from the input parameter location.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("ExtractKey")
        public String extractKey;

        /**
         * <p>The input parameter location. Valid values:</p>
         * <ul>
         * <li>ALL_QUERY_PARAMETER: request parameters</li>
         * <li>ALL_HEADER: request headers</li>
         * <li>ALL_PATH: URI of the request</li>
         * <li>ALL_BODY: request body</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALL_QUERY_PARAMETER</p>
         */
        @NameInMap("ExtractKeySpec")
        public String extractKeySpec;

        /**
         * <p>The backend parameter type.</p>
         * 
         * <strong>example:</strong>
         * <p>java.lang.String</p>
         */
        @NameInMap("MappingType")
        public String mappingType;

        public static AddGatewayRouteRequestServicesHttpDubboTranscoderMothedMapListParamMapsList build(java.util.Map<String, ?> map) throws Exception {
            AddGatewayRouteRequestServicesHttpDubboTranscoderMothedMapListParamMapsList self = new AddGatewayRouteRequestServicesHttpDubboTranscoderMothedMapListParamMapsList();
            return TeaModel.build(map, self);
        }

        public AddGatewayRouteRequestServicesHttpDubboTranscoderMothedMapListParamMapsList setExtractKey(String extractKey) {
            this.extractKey = extractKey;
            return this;
        }
        public String getExtractKey() {
            return this.extractKey;
        }

        public AddGatewayRouteRequestServicesHttpDubboTranscoderMothedMapListParamMapsList setExtractKeySpec(String extractKeySpec) {
            this.extractKeySpec = extractKeySpec;
            return this;
        }
        public String getExtractKeySpec() {
            return this.extractKeySpec;
        }

        public AddGatewayRouteRequestServicesHttpDubboTranscoderMothedMapListParamMapsList setMappingType(String mappingType) {
            this.mappingType = mappingType;
            return this;
        }
        public String getMappingType() {
            return this.mappingType;
        }

    }

    public static class AddGatewayRouteRequestServicesHttpDubboTranscoderMothedMapList extends TeaModel {
        /**
         * <p>The Dubbo method name.</p>
         * 
         * <strong>example:</strong>
         * <p>sayHello</p>
         */
        @NameInMap("DubboMothedName")
        public String dubboMothedName;

        /**
         * <p>The HTTP method. Valid values:</p>
         * <ul>
         * <li>ALL_GET: all GET methods</li>
         * <li>ALL_POST: all POST methods</li>
         * <li>ALL_PUT: all PUT methods</li>
         * <li>ALL_DELETE: all DELETE methods</li>
         * <li>ALL_PATCH: all PATCH methods</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALL_GET</p>
         */
        @NameInMap("HttpMothed")
        public String httpMothed;

        /**
         * <p>The method matching path.</p>
         * 
         * <strong>example:</strong>
         * <p>/mytestzbk/sayhello</p>
         */
        @NameInMap("Mothedpath")
        public String mothedpath;

        /**
         * <p>The parameter mapping list.</p>
         */
        @NameInMap("ParamMapsList")
        public java.util.List<AddGatewayRouteRequestServicesHttpDubboTranscoderMothedMapListParamMapsList> paramMapsList;

        /**
         * <p>The header pass-through type. Valid values:</p>
         * <ul>
         * <li>PASS_ALL: pass through all headers</li>
         * <li>PASS_NOT: do not pass through headers</li>
         * <li>PASS_ASSIGN: pass through specified headers</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PASS_NOT</p>
         */
        @NameInMap("PassThroughAllHeaders")
        public String passThroughAllHeaders;

        /**
         * <p>The list of specified headers to pass through.</p>
         */
        @NameInMap("PassThroughList")
        public java.util.List<String> passThroughList;

        public static AddGatewayRouteRequestServicesHttpDubboTranscoderMothedMapList build(java.util.Map<String, ?> map) throws Exception {
            AddGatewayRouteRequestServicesHttpDubboTranscoderMothedMapList self = new AddGatewayRouteRequestServicesHttpDubboTranscoderMothedMapList();
            return TeaModel.build(map, self);
        }

        public AddGatewayRouteRequestServicesHttpDubboTranscoderMothedMapList setDubboMothedName(String dubboMothedName) {
            this.dubboMothedName = dubboMothedName;
            return this;
        }
        public String getDubboMothedName() {
            return this.dubboMothedName;
        }

        public AddGatewayRouteRequestServicesHttpDubboTranscoderMothedMapList setHttpMothed(String httpMothed) {
            this.httpMothed = httpMothed;
            return this;
        }
        public String getHttpMothed() {
            return this.httpMothed;
        }

        public AddGatewayRouteRequestServicesHttpDubboTranscoderMothedMapList setMothedpath(String mothedpath) {
            this.mothedpath = mothedpath;
            return this;
        }
        public String getMothedpath() {
            return this.mothedpath;
        }

        public AddGatewayRouteRequestServicesHttpDubboTranscoderMothedMapList setParamMapsList(java.util.List<AddGatewayRouteRequestServicesHttpDubboTranscoderMothedMapListParamMapsList> paramMapsList) {
            this.paramMapsList = paramMapsList;
            return this;
        }
        public java.util.List<AddGatewayRouteRequestServicesHttpDubboTranscoderMothedMapListParamMapsList> getParamMapsList() {
            return this.paramMapsList;
        }

        public AddGatewayRouteRequestServicesHttpDubboTranscoderMothedMapList setPassThroughAllHeaders(String passThroughAllHeaders) {
            this.passThroughAllHeaders = passThroughAllHeaders;
            return this;
        }
        public String getPassThroughAllHeaders() {
            return this.passThroughAllHeaders;
        }

        public AddGatewayRouteRequestServicesHttpDubboTranscoderMothedMapList setPassThroughList(java.util.List<String> passThroughList) {
            this.passThroughList = passThroughList;
            return this;
        }
        public java.util.List<String> getPassThroughList() {
            return this.passThroughList;
        }

    }

    public static class AddGatewayRouteRequestServicesHttpDubboTranscoder extends TeaModel {
        /**
         * <p>The service group.</p>
         * 
         * <strong>example:</strong>
         * <p>group</p>
         */
        @NameInMap("DubboServiceGroup")
        public String dubboServiceGroup;

        /**
         * <p>The Dubbo service name.</p>
         * 
         * <strong>example:</strong>
         * <p>org.apache.dubbo.samples.basic.api.DemoService</p>
         */
        @NameInMap("DubboServiceName")
        public String dubboServiceName;

        /**
         * <p>The Dubbo service version.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.0</p>
         */
        @NameInMap("DubboServiceVersion")
        public String dubboServiceVersion;

        /**
         * <p>The list of Dubbo forwarding rules.</p>
         */
        @NameInMap("MothedMapList")
        public java.util.List<AddGatewayRouteRequestServicesHttpDubboTranscoderMothedMapList> mothedMapList;

        public static AddGatewayRouteRequestServicesHttpDubboTranscoder build(java.util.Map<String, ?> map) throws Exception {
            AddGatewayRouteRequestServicesHttpDubboTranscoder self = new AddGatewayRouteRequestServicesHttpDubboTranscoder();
            return TeaModel.build(map, self);
        }

        public AddGatewayRouteRequestServicesHttpDubboTranscoder setDubboServiceGroup(String dubboServiceGroup) {
            this.dubboServiceGroup = dubboServiceGroup;
            return this;
        }
        public String getDubboServiceGroup() {
            return this.dubboServiceGroup;
        }

        public AddGatewayRouteRequestServicesHttpDubboTranscoder setDubboServiceName(String dubboServiceName) {
            this.dubboServiceName = dubboServiceName;
            return this;
        }
        public String getDubboServiceName() {
            return this.dubboServiceName;
        }

        public AddGatewayRouteRequestServicesHttpDubboTranscoder setDubboServiceVersion(String dubboServiceVersion) {
            this.dubboServiceVersion = dubboServiceVersion;
            return this;
        }
        public String getDubboServiceVersion() {
            return this.dubboServiceVersion;
        }

        public AddGatewayRouteRequestServicesHttpDubboTranscoder setMothedMapList(java.util.List<AddGatewayRouteRequestServicesHttpDubboTranscoderMothedMapList> mothedMapList) {
            this.mothedMapList = mothedMapList;
            return this;
        }
        public java.util.List<AddGatewayRouteRequestServicesHttpDubboTranscoderMothedMapList> getMothedMapList() {
            return this.mothedMapList;
        }

    }

    public static class AddGatewayRouteRequestServices extends TeaModel {
        /**
         * <p>The protocol type.</p>
         * 
         * <strong>example:</strong>
         * <p>DUBBO</p>
         */
        @NameInMap("AgreementType")
        public String agreementType;

        /**
         * <p>The service group name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The Dubbo protocol transcoding configuration.</p>
         */
        @NameInMap("HttpDubboTranscoder")
        public AddGatewayRouteRequestServicesHttpDubboTranscoder httpDubboTranscoder;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The namespace where the service resides.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The traffic distribution percentage for the current service or service version. This parameter is required only when multiple services or tag-based routing is used.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Percent")
        public Integer percent;

        /**
         * <p>The service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>353</p>
         */
        @NameInMap("ServiceId")
        public Long serviceId;

        /**
         * <p>The service port.</p>
         * 
         * <strong>example:</strong>
         * <p>443</p>
         */
        @NameInMap("ServicePort")
        public Integer servicePort;

        /**
         * <p>The source type.</p>
         * 
         * <strong>example:</strong>
         * <p>MSE</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The service version. This parameter is required only when tag-based routing is used.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("Version")
        public String version;

        public static AddGatewayRouteRequestServices build(java.util.Map<String, ?> map) throws Exception {
            AddGatewayRouteRequestServices self = new AddGatewayRouteRequestServices();
            return TeaModel.build(map, self);
        }

        public AddGatewayRouteRequestServices setAgreementType(String agreementType) {
            this.agreementType = agreementType;
            return this;
        }
        public String getAgreementType() {
            return this.agreementType;
        }

        public AddGatewayRouteRequestServices setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public AddGatewayRouteRequestServices setHttpDubboTranscoder(AddGatewayRouteRequestServicesHttpDubboTranscoder httpDubboTranscoder) {
            this.httpDubboTranscoder = httpDubboTranscoder;
            return this;
        }
        public AddGatewayRouteRequestServicesHttpDubboTranscoder getHttpDubboTranscoder() {
            return this.httpDubboTranscoder;
        }

        public AddGatewayRouteRequestServices setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AddGatewayRouteRequestServices setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public AddGatewayRouteRequestServices setPercent(Integer percent) {
            this.percent = percent;
            return this;
        }
        public Integer getPercent() {
            return this.percent;
        }

        public AddGatewayRouteRequestServices setServiceId(Long serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public Long getServiceId() {
            return this.serviceId;
        }

        public AddGatewayRouteRequestServices setServicePort(Integer servicePort) {
            this.servicePort = servicePort;
            return this;
        }
        public Integer getServicePort() {
            return this.servicePort;
        }

        public AddGatewayRouteRequestServices setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public AddGatewayRouteRequestServices setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
