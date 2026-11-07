// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayRouteRequest extends TeaModel {
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
     * <p>The description of the route.</p>
     * 
     * <strong>example:</strong>
     * <p>a route for xxx</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The type of the destination service.</p>
     * 
     * <strong>example:</strong>
     * <p>Mock</p>
     */
    @NameInMap("DestinationType")
    public String destinationType;

    /**
     * <p>The mock content.</p>
     */
    @NameInMap("DirectResponseJSON")
    public UpdateGatewayRouteRequestDirectResponseJSON directResponseJSON;

    /**
     * <p>The associated domain names.</p>
     * 
     * <strong>example:</strong>
     * <p>[90]</p>
     */
    @NameInMap("DomainIdListJSON")
    public String domainIdListJSON;

    /**
     * <p><strong>[Deprecated]</strong> Use UpdateGatewayRouteWafStatus to update the WAF status of the route.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
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
     * <p>The fallback services.</p>
     */
    @NameInMap("FallbackServices")
    public java.util.List<UpdateGatewayRouteRequestFallbackServices> fallbackServices;

    /**
     * <p>The ID of the gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>501</p>
     */
    @NameInMap("GatewayId")
    public Long gatewayId;

    /**
     * <p>The unique ID of the gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-86575c0bc9f04ecfbacb92b8e392a2c4</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>The ID of the route.</p>
     * 
     * <strong>example:</strong>
     * <p>139</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The name of the route.</p>
     * 
     * <strong>example:</strong>
     * <p>route-web</p>
     */
    @NameInMap("Name")
    @Deprecated
    public String name;

    /**
     * <p>The matching conditions of the route.</p>
     */
    @NameInMap("Predicates")
    public UpdateGatewayRouteRequestPredicates predicates;

    /**
     * <p>The redirect configuration.</p>
     */
    @NameInMap("RedirectJSON")
    public UpdateGatewayRouteRequestRedirectJSON redirectJSON;

    /**
     * <p>The order of the route.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RouteOrder")
    public Integer routeOrder;

    /**
     * <p>The destination services. Specify this parameter when the route points to a single service, multiple services, or tag-based routing.</p>
     */
    @NameInMap("Services")
    public java.util.List<UpdateGatewayRouteRequestServices> services;

    public static UpdateGatewayRouteRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayRouteRequest self = new UpdateGatewayRouteRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayRouteRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateGatewayRouteRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateGatewayRouteRequest setDestinationType(String destinationType) {
        this.destinationType = destinationType;
        return this;
    }
    public String getDestinationType() {
        return this.destinationType;
    }

    public UpdateGatewayRouteRequest setDirectResponseJSON(UpdateGatewayRouteRequestDirectResponseJSON directResponseJSON) {
        this.directResponseJSON = directResponseJSON;
        return this;
    }
    public UpdateGatewayRouteRequestDirectResponseJSON getDirectResponseJSON() {
        return this.directResponseJSON;
    }

    public UpdateGatewayRouteRequest setDomainIdListJSON(String domainIdListJSON) {
        this.domainIdListJSON = domainIdListJSON;
        return this;
    }
    public String getDomainIdListJSON() {
        return this.domainIdListJSON;
    }

    @Deprecated
    public UpdateGatewayRouteRequest setEnableWaf(Boolean enableWaf) {
        this.enableWaf = enableWaf;
        return this;
    }
    public Boolean getEnableWaf() {
        return this.enableWaf;
    }

    public UpdateGatewayRouteRequest setFallback(Boolean fallback) {
        this.fallback = fallback;
        return this;
    }
    public Boolean getFallback() {
        return this.fallback;
    }

    public UpdateGatewayRouteRequest setFallbackServices(java.util.List<UpdateGatewayRouteRequestFallbackServices> fallbackServices) {
        this.fallbackServices = fallbackServices;
        return this;
    }
    public java.util.List<UpdateGatewayRouteRequestFallbackServices> getFallbackServices() {
        return this.fallbackServices;
    }

    public UpdateGatewayRouteRequest setGatewayId(Long gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public Long getGatewayId() {
        return this.gatewayId;
    }

    public UpdateGatewayRouteRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public UpdateGatewayRouteRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    @Deprecated
    public UpdateGatewayRouteRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateGatewayRouteRequest setPredicates(UpdateGatewayRouteRequestPredicates predicates) {
        this.predicates = predicates;
        return this;
    }
    public UpdateGatewayRouteRequestPredicates getPredicates() {
        return this.predicates;
    }

    public UpdateGatewayRouteRequest setRedirectJSON(UpdateGatewayRouteRequestRedirectJSON redirectJSON) {
        this.redirectJSON = redirectJSON;
        return this;
    }
    public UpdateGatewayRouteRequestRedirectJSON getRedirectJSON() {
        return this.redirectJSON;
    }

    public UpdateGatewayRouteRequest setRouteOrder(Integer routeOrder) {
        this.routeOrder = routeOrder;
        return this;
    }
    public Integer getRouteOrder() {
        return this.routeOrder;
    }

    public UpdateGatewayRouteRequest setServices(java.util.List<UpdateGatewayRouteRequestServices> services) {
        this.services = services;
        return this;
    }
    public java.util.List<UpdateGatewayRouteRequestServices> getServices() {
        return this.services;
    }

    public static class UpdateGatewayRouteRequestDirectResponseJSON extends TeaModel {
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
         * <p>200</p>
         */
        @NameInMap("Code")
        public Long code;

        public static UpdateGatewayRouteRequestDirectResponseJSON build(java.util.Map<String, ?> map) throws Exception {
            UpdateGatewayRouteRequestDirectResponseJSON self = new UpdateGatewayRouteRequestDirectResponseJSON();
            return TeaModel.build(map, self);
        }

        public UpdateGatewayRouteRequestDirectResponseJSON setBody(String body) {
            this.body = body;
            return this;
        }
        public String getBody() {
            return this.body;
        }

        public UpdateGatewayRouteRequestDirectResponseJSON setCode(Long code) {
            this.code = code;
            return this;
        }
        public Long getCode() {
            return this.code;
        }

    }

    public static class UpdateGatewayRouteRequestFallbackServices extends TeaModel {
        /**
         * <p>The protocol type.</p>
         * 
         * <strong>example:</strong>
         * <p>DUBBO</p>
         */
        @NameInMap("AgreementType")
        public String agreementType;

        /**
         * <p>The name of the service group.</p>
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
         * <p>name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The namespace where the service resides.</p>
         * 
         * <strong>example:</strong>
         * <p>Namespace</p>
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
         * <p>The ID of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ServiceId")
        public Long serviceId;

        /**
         * <p>The service port.</p>
         * 
         * <strong>example:</strong>
         * <p>8848</p>
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

        public static UpdateGatewayRouteRequestFallbackServices build(java.util.Map<String, ?> map) throws Exception {
            UpdateGatewayRouteRequestFallbackServices self = new UpdateGatewayRouteRequestFallbackServices();
            return TeaModel.build(map, self);
        }

        public UpdateGatewayRouteRequestFallbackServices setAgreementType(String agreementType) {
            this.agreementType = agreementType;
            return this;
        }
        public String getAgreementType() {
            return this.agreementType;
        }

        public UpdateGatewayRouteRequestFallbackServices setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public UpdateGatewayRouteRequestFallbackServices setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateGatewayRouteRequestFallbackServices setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public UpdateGatewayRouteRequestFallbackServices setPercent(Integer percent) {
            this.percent = percent;
            return this;
        }
        public Integer getPercent() {
            return this.percent;
        }

        public UpdateGatewayRouteRequestFallbackServices setServiceId(Long serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public Long getServiceId() {
            return this.serviceId;
        }

        public UpdateGatewayRouteRequestFallbackServices setServicePort(Integer servicePort) {
            this.servicePort = servicePort;
            return this;
        }
        public Integer getServicePort() {
            return this.servicePort;
        }

        public UpdateGatewayRouteRequestFallbackServices setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public UpdateGatewayRouteRequestFallbackServices setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class UpdateGatewayRouteRequestPredicatesHeaderPredicates extends TeaModel {
        /**
         * <p>The key of the request header.</p>
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
         * <p>The value of the request header.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateGatewayRouteRequestPredicatesHeaderPredicates build(java.util.Map<String, ?> map) throws Exception {
            UpdateGatewayRouteRequestPredicatesHeaderPredicates self = new UpdateGatewayRouteRequestPredicatesHeaderPredicates();
            return TeaModel.build(map, self);
        }

        public UpdateGatewayRouteRequestPredicatesHeaderPredicates setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateGatewayRouteRequestPredicatesHeaderPredicates setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateGatewayRouteRequestPredicatesHeaderPredicates setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateGatewayRouteRequestPredicatesPathPredicates extends TeaModel {
        /**
         * <p>Specifies whether to ignore case.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IgnoreCase")
        public Boolean ignoreCase;

        /**
         * <p>The path of the route.</p>
         * 
         * <strong>example:</strong>
         * <p>/test</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The matching type.</p>
         * 
         * <strong>example:</strong>
         * <p>PRE</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpdateGatewayRouteRequestPredicatesPathPredicates build(java.util.Map<String, ?> map) throws Exception {
            UpdateGatewayRouteRequestPredicatesPathPredicates self = new UpdateGatewayRouteRequestPredicatesPathPredicates();
            return TeaModel.build(map, self);
        }

        public UpdateGatewayRouteRequestPredicatesPathPredicates setIgnoreCase(Boolean ignoreCase) {
            this.ignoreCase = ignoreCase;
            return this;
        }
        public Boolean getIgnoreCase() {
            return this.ignoreCase;
        }

        public UpdateGatewayRouteRequestPredicatesPathPredicates setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public UpdateGatewayRouteRequestPredicatesPathPredicates setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateGatewayRouteRequestPredicatesQueryPredicates extends TeaModel {
        /**
         * <p>The name of the parameter.</p>
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

        public static UpdateGatewayRouteRequestPredicatesQueryPredicates build(java.util.Map<String, ?> map) throws Exception {
            UpdateGatewayRouteRequestPredicatesQueryPredicates self = new UpdateGatewayRouteRequestPredicatesQueryPredicates();
            return TeaModel.build(map, self);
        }

        public UpdateGatewayRouteRequestPredicatesQueryPredicates setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateGatewayRouteRequestPredicatesQueryPredicates setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateGatewayRouteRequestPredicatesQueryPredicates setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateGatewayRouteRequestPredicates extends TeaModel {
        /**
         * <p>The request header matching conditions.</p>
         */
        @NameInMap("HeaderPredicates")
        public java.util.List<UpdateGatewayRouteRequestPredicatesHeaderPredicates> headerPredicates;

        /**
         * <p>The method matching conditions.</p>
         */
        @NameInMap("MethodPredicates")
        public java.util.List<String> methodPredicates;

        /**
         * <p>The path matching conditions.</p>
         */
        @NameInMap("PathPredicates")
        public UpdateGatewayRouteRequestPredicatesPathPredicates pathPredicates;

        /**
         * <p>The query parameter matching conditions.</p>
         */
        @NameInMap("QueryPredicates")
        public java.util.List<UpdateGatewayRouteRequestPredicatesQueryPredicates> queryPredicates;

        public static UpdateGatewayRouteRequestPredicates build(java.util.Map<String, ?> map) throws Exception {
            UpdateGatewayRouteRequestPredicates self = new UpdateGatewayRouteRequestPredicates();
            return TeaModel.build(map, self);
        }

        public UpdateGatewayRouteRequestPredicates setHeaderPredicates(java.util.List<UpdateGatewayRouteRequestPredicatesHeaderPredicates> headerPredicates) {
            this.headerPredicates = headerPredicates;
            return this;
        }
        public java.util.List<UpdateGatewayRouteRequestPredicatesHeaderPredicates> getHeaderPredicates() {
            return this.headerPredicates;
        }

        public UpdateGatewayRouteRequestPredicates setMethodPredicates(java.util.List<String> methodPredicates) {
            this.methodPredicates = methodPredicates;
            return this;
        }
        public java.util.List<String> getMethodPredicates() {
            return this.methodPredicates;
        }

        public UpdateGatewayRouteRequestPredicates setPathPredicates(UpdateGatewayRouteRequestPredicatesPathPredicates pathPredicates) {
            this.pathPredicates = pathPredicates;
            return this;
        }
        public UpdateGatewayRouteRequestPredicatesPathPredicates getPathPredicates() {
            return this.pathPredicates;
        }

        public UpdateGatewayRouteRequestPredicates setQueryPredicates(java.util.List<UpdateGatewayRouteRequestPredicatesQueryPredicates> queryPredicates) {
            this.queryPredicates = queryPredicates;
            return this;
        }
        public java.util.List<UpdateGatewayRouteRequestPredicatesQueryPredicates> getQueryPredicates() {
            return this.queryPredicates;
        }

    }

    public static class UpdateGatewayRouteRequestRedirectJSON extends TeaModel {
        /**
         * <p>The status code.</p>
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

        public static UpdateGatewayRouteRequestRedirectJSON build(java.util.Map<String, ?> map) throws Exception {
            UpdateGatewayRouteRequestRedirectJSON self = new UpdateGatewayRouteRequestRedirectJSON();
            return TeaModel.build(map, self);
        }

        public UpdateGatewayRouteRequestRedirectJSON setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public UpdateGatewayRouteRequestRedirectJSON setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public UpdateGatewayRouteRequestRedirectJSON setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class UpdateGatewayRouteRequestServicesHttpDubboTranscoderMothedMapListParamMapsList extends TeaModel {
        /**
         * <p>The key extracted from the input parameter position.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("ExtractKey")
        public String extractKey;

        /**
         * <p>The position of the input parameter.</p>
         * <blockquote>
         * <p>Valid values for the position of the input parameter:</p>
         * <ul>
         * <li>Request parameter: <code>ALL_QUERY_PARAMETER</code></li>
         * <li>Request header: <code>ALL_HEADER</code></li>
         * <li>Request path: <code>ALL_PATH</code></li>
         * <li>Request body: <code>ALL_BODY</code></li>
         * </ul>
         * </blockquote>
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

        public static UpdateGatewayRouteRequestServicesHttpDubboTranscoderMothedMapListParamMapsList build(java.util.Map<String, ?> map) throws Exception {
            UpdateGatewayRouteRequestServicesHttpDubboTranscoderMothedMapListParamMapsList self = new UpdateGatewayRouteRequestServicesHttpDubboTranscoderMothedMapListParamMapsList();
            return TeaModel.build(map, self);
        }

        public UpdateGatewayRouteRequestServicesHttpDubboTranscoderMothedMapListParamMapsList setExtractKey(String extractKey) {
            this.extractKey = extractKey;
            return this;
        }
        public String getExtractKey() {
            return this.extractKey;
        }

        public UpdateGatewayRouteRequestServicesHttpDubboTranscoderMothedMapListParamMapsList setExtractKeySpec(String extractKeySpec) {
            this.extractKeySpec = extractKeySpec;
            return this;
        }
        public String getExtractKeySpec() {
            return this.extractKeySpec;
        }

        public UpdateGatewayRouteRequestServicesHttpDubboTranscoderMothedMapListParamMapsList setMappingType(String mappingType) {
            this.mappingType = mappingType;
            return this;
        }
        public String getMappingType() {
            return this.mappingType;
        }

    }

    public static class UpdateGatewayRouteRequestServicesHttpDubboTranscoderMothedMapList extends TeaModel {
        /**
         * <p>The name of the Dubbo method.</p>
         * 
         * <strong>example:</strong>
         * <p>sayHello</p>
         */
        @NameInMap("DubboMothedName")
        public String dubboMothedName;

        /**
         * <p>The HTTP method.</p>
         * <blockquote>
         * <p>Supported HTTP method parameter values:</p>
         * <ul>
         * <li>ALL_GET</li>
         * <li>ALL_POST</li>
         * <li>ALL_PUT</li>
         * <li>ALL_DELETE</li>
         * <li>ALL_PATCH</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ALL_GET</p>
         */
        @NameInMap("HttpMothed")
        public String httpMothed;

        /**
         * <p>The matching path of the method.</p>
         * 
         * <strong>example:</strong>
         * <p>/mytestzbk/sayhello</p>
         */
        @NameInMap("Mothedpath")
        public String mothedpath;

        /**
         * <p>The list of parameter mappings.</p>
         */
        @NameInMap("ParamMapsList")
        public java.util.List<UpdateGatewayRouteRequestServicesHttpDubboTranscoderMothedMapListParamMapsList> paramMapsList;

        /**
         * <p>The header pass-through type.</p>
         * <blockquote>
         * <p>Valid values for the pass-through type:</p>
         * <ul>
         * <li>PASS_ALL: Passes through all headers.</li>
         * <li>PASS_NOT: Does not pass through any headers.</li>
         * <li>PASS_ASSIGN: Passes through specified headers.</li>
         * </ul>
         * </blockquote>
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

        public static UpdateGatewayRouteRequestServicesHttpDubboTranscoderMothedMapList build(java.util.Map<String, ?> map) throws Exception {
            UpdateGatewayRouteRequestServicesHttpDubboTranscoderMothedMapList self = new UpdateGatewayRouteRequestServicesHttpDubboTranscoderMothedMapList();
            return TeaModel.build(map, self);
        }

        public UpdateGatewayRouteRequestServicesHttpDubboTranscoderMothedMapList setDubboMothedName(String dubboMothedName) {
            this.dubboMothedName = dubboMothedName;
            return this;
        }
        public String getDubboMothedName() {
            return this.dubboMothedName;
        }

        public UpdateGatewayRouteRequestServicesHttpDubboTranscoderMothedMapList setHttpMothed(String httpMothed) {
            this.httpMothed = httpMothed;
            return this;
        }
        public String getHttpMothed() {
            return this.httpMothed;
        }

        public UpdateGatewayRouteRequestServicesHttpDubboTranscoderMothedMapList setMothedpath(String mothedpath) {
            this.mothedpath = mothedpath;
            return this;
        }
        public String getMothedpath() {
            return this.mothedpath;
        }

        public UpdateGatewayRouteRequestServicesHttpDubboTranscoderMothedMapList setParamMapsList(java.util.List<UpdateGatewayRouteRequestServicesHttpDubboTranscoderMothedMapListParamMapsList> paramMapsList) {
            this.paramMapsList = paramMapsList;
            return this;
        }
        public java.util.List<UpdateGatewayRouteRequestServicesHttpDubboTranscoderMothedMapListParamMapsList> getParamMapsList() {
            return this.paramMapsList;
        }

        public UpdateGatewayRouteRequestServicesHttpDubboTranscoderMothedMapList setPassThroughAllHeaders(String passThroughAllHeaders) {
            this.passThroughAllHeaders = passThroughAllHeaders;
            return this;
        }
        public String getPassThroughAllHeaders() {
            return this.passThroughAllHeaders;
        }

        public UpdateGatewayRouteRequestServicesHttpDubboTranscoderMothedMapList setPassThroughList(java.util.List<String> passThroughList) {
            this.passThroughList = passThroughList;
            return this;
        }
        public java.util.List<String> getPassThroughList() {
            return this.passThroughList;
        }

    }

    public static class UpdateGatewayRouteRequestServicesHttpDubboTranscoder extends TeaModel {
        /**
         * <p>The Dubbo service group.</p>
         * 
         * <strong>example:</strong>
         * <p>service name</p>
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
         * <p>The version of the Dubbo service.</p>
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
        public java.util.List<UpdateGatewayRouteRequestServicesHttpDubboTranscoderMothedMapList> mothedMapList;

        public static UpdateGatewayRouteRequestServicesHttpDubboTranscoder build(java.util.Map<String, ?> map) throws Exception {
            UpdateGatewayRouteRequestServicesHttpDubboTranscoder self = new UpdateGatewayRouteRequestServicesHttpDubboTranscoder();
            return TeaModel.build(map, self);
        }

        public UpdateGatewayRouteRequestServicesHttpDubboTranscoder setDubboServiceGroup(String dubboServiceGroup) {
            this.dubboServiceGroup = dubboServiceGroup;
            return this;
        }
        public String getDubboServiceGroup() {
            return this.dubboServiceGroup;
        }

        public UpdateGatewayRouteRequestServicesHttpDubboTranscoder setDubboServiceName(String dubboServiceName) {
            this.dubboServiceName = dubboServiceName;
            return this;
        }
        public String getDubboServiceName() {
            return this.dubboServiceName;
        }

        public UpdateGatewayRouteRequestServicesHttpDubboTranscoder setDubboServiceVersion(String dubboServiceVersion) {
            this.dubboServiceVersion = dubboServiceVersion;
            return this;
        }
        public String getDubboServiceVersion() {
            return this.dubboServiceVersion;
        }

        public UpdateGatewayRouteRequestServicesHttpDubboTranscoder setMothedMapList(java.util.List<UpdateGatewayRouteRequestServicesHttpDubboTranscoderMothedMapList> mothedMapList) {
            this.mothedMapList = mothedMapList;
            return this;
        }
        public java.util.List<UpdateGatewayRouteRequestServicesHttpDubboTranscoderMothedMapList> getMothedMapList() {
            return this.mothedMapList;
        }

    }

    public static class UpdateGatewayRouteRequestServices extends TeaModel {
        /**
         * <p>The protocol type.</p>
         * 
         * <strong>example:</strong>
         * <p>DUBBO</p>
         */
        @NameInMap("AgreementType")
        public String agreementType;

        /**
         * <p>The name of the service group.</p>
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
        public UpdateGatewayRouteRequestServicesHttpDubboTranscoder httpDubboTranscoder;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>web</p>
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
         * <p>The traffic distribution percentage of the current service or service version. Specify this parameter only when multiple services or tag-based routing is used.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Percent")
        public Integer percent;

        /**
         * <p>The ID of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ServiceId")
        public Long serviceId;

        /**
         * <p>The Dubbo port.</p>
         * 
         * <strong>example:</strong>
         * <p>20880</p>
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
         * <p>The service version. Specify this parameter only when tag-based routing is used.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("Version")
        public String version;

        public static UpdateGatewayRouteRequestServices build(java.util.Map<String, ?> map) throws Exception {
            UpdateGatewayRouteRequestServices self = new UpdateGatewayRouteRequestServices();
            return TeaModel.build(map, self);
        }

        public UpdateGatewayRouteRequestServices setAgreementType(String agreementType) {
            this.agreementType = agreementType;
            return this;
        }
        public String getAgreementType() {
            return this.agreementType;
        }

        public UpdateGatewayRouteRequestServices setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public UpdateGatewayRouteRequestServices setHttpDubboTranscoder(UpdateGatewayRouteRequestServicesHttpDubboTranscoder httpDubboTranscoder) {
            this.httpDubboTranscoder = httpDubboTranscoder;
            return this;
        }
        public UpdateGatewayRouteRequestServicesHttpDubboTranscoder getHttpDubboTranscoder() {
            return this.httpDubboTranscoder;
        }

        public UpdateGatewayRouteRequestServices setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateGatewayRouteRequestServices setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public UpdateGatewayRouteRequestServices setPercent(Integer percent) {
            this.percent = percent;
            return this;
        }
        public Integer getPercent() {
            return this.percent;
        }

        public UpdateGatewayRouteRequestServices setServiceId(Long serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public Long getServiceId() {
            return this.serviceId;
        }

        public UpdateGatewayRouteRequestServices setServicePort(Integer servicePort) {
            this.servicePort = servicePort;
            return this;
        }
        public Integer getServicePort() {
            return this.servicePort;
        }

        public UpdateGatewayRouteRequestServices setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public UpdateGatewayRouteRequestServices setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
