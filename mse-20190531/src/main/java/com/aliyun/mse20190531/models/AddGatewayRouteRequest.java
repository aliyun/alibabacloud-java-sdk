// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddGatewayRouteRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The destination service type.</p>
     * <br>
     * <p>Enumeration values:</p>
     * <br>
     * <p>*   VersionOriented</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   Multiple</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   Single</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   Mock\"\"</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   Redirect</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     */
    @NameInMap("DestinationType")
    public String destinationType;

    /**
     * <p>The mock response configuration.</p>
     */
    @NameInMap("DirectResponseJSON")
    public AddGatewayRouteRequestDirectResponseJSON directResponseJSON;

    /**
     * <p>The domain ID.</p>
     */
    @NameInMap("DomainId")
    public Long domainId;

    /**
     * <p>The list of domain IDs.</p>
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
    public java.util.List<AddGatewayRouteRequestFallbackServices> fallbackServices;

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
     * <p>The name of the route.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The routing policy in a JSON string.</p>
     */
    @NameInMap("Policies")
    public String policies;

    /**
     * <p>The matching rule.</p>
     */
    @NameInMap("Predicates")
    public AddGatewayRouteRequestPredicates predicates;

    /**
     * <p>The configuration of the redirection.</p>
     */
    @NameInMap("RedirectJSON")
    public AddGatewayRouteRequestRedirectJSON redirectJSON;

    /**
     * <p>The sequence number of the route. (A small value indicates a high priority.)</p>
     */
    @NameInMap("RouteOrder")
    public Integer routeOrder;

    /**
     * <p>The route type. Valid values:</p>
     * <br>
     * <p>Op: Manage routes.</p>
     */
    @NameInMap("RouteType")
    public String routeType;

    /**
     * <p>The list of services.</p>
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
         * <p>The mock return value.</p>
         */
        @NameInMap("Body")
        public String body;

        /**
         * <p>The mock return code.</p>
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
         * <p>The type of the protocol.</p>
         */
        @NameInMap("AgreementType")
        public String agreementType;

        /**
         * <p>The name of the group to which the service belongs.</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The name.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The namespace to which the service belongs.</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The weight in the form of a percentage value.</p>
         */
        @NameInMap("Percent")
        public Integer percent;

        /**
         * <p>The ID of the service.</p>
         */
        @NameInMap("ServiceId")
        public Long serviceId;

        /**
         * <p>The service port number.</p>
         */
        @NameInMap("ServicePort")
        public Integer servicePort;

        /**
         * <p>The source type.</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The version of the service.</p>
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
         * <p>The key of the request header.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The matching type.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The value of the request header.</p>
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
         * <p>Specifies whether to ignore case sensitivity.</p>
         */
        @NameInMap("IgnoreCase")
        public Boolean ignoreCase;

        /**
         * <p>The path.</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The route matching type. Valid values:</p>
         * <br>
         * <p>*   PRE: prefix matching</p>
         * <p>*   EQUAL: exact matching</p>
         * <p>*   ERGULAR: regular expression matching</p>
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
         * <p>The name of the parameter.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The matching type.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The value of the parameter.</p>
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
         * <p>The information about header matching.</p>
         */
        @NameInMap("HeaderPredicates")
        public java.util.List<AddGatewayRouteRequestPredicatesHeaderPredicates> headerPredicates;

        /**
         * <p>The information about method matching.</p>
         */
        @NameInMap("MethodPredicates")
        public java.util.List<String> methodPredicates;

        /**
         * <p>The information about route matching.</p>
         */
        @NameInMap("PathPredicates")
        public AddGatewayRouteRequestPredicatesPathPredicates pathPredicates;

        /**
         * <p>The information about URL parameter matching.</p>
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
         * <p>The status code returned.</p>
         */
        @NameInMap("Code")
        public Integer code;

        /**
         * <p>The hostname to be redirected to.</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The path to be redirected to.</p>
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
         * <p>The key extracted from the input parameter.</p>
         */
        @NameInMap("ExtractKey")
        public String extractKey;

        /**
         * <p>The position of the input parameter.</p>
         * <br>
         * <p>> Valid values:</p>
         * <br>
         * <p>*   `ALL_QUERY_PARAMETER`: request parameter</p>
         * <br>
         * <p>*   `ALL_HEADER`: request header</p>
         * <p>*   `ALL_PATH`: request path</p>
         * <p>*   `ALL_BODY`: request body</p>
         */
        @NameInMap("ExtractKeySpec")
        public String extractKeySpec;

        /**
         * <p>The type of the backend service parameter.</p>
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
         * <p>The method name of the Dubbo service.</p>
         */
        @NameInMap("DubboMothedName")
        public String dubboMothedName;

        /**
         * <p>The HTTP method.</p>
         * <br>
         * <p>> Valid values:</p>
         * <br>
         * <p>*   ALL_GET</p>
         * <br>
         * <p>*   ALL_POST</p>
         * <br>
         * <p>*   ALL_PUT</p>
         * <br>
         * <p>*   ALL_DELETE</p>
         * <br>
         * <p>*   ALL_PATCH</p>
         */
        @NameInMap("HttpMothed")
        public String httpMothed;

        /**
         * <p>The path used for method matching.</p>
         */
        @NameInMap("Mothedpath")
        public String mothedpath;

        /**
         * <p>The information about parameter mappings.</p>
         */
        @NameInMap("ParamMapsList")
        public java.util.List<AddGatewayRouteRequestServicesHttpDubboTranscoderMothedMapListParamMapsList> paramMapsList;

        /**
         * <p>The pass-through type of the header.</p>
         * <br>
         * <p>> Valid values:</p>
         * <br>
         * <p>*   PASS_ALL: All headers are passed through.</p>
         * <br>
         * <p>*   PASS_NOT: All headers are not passed through.</p>
         * <br>
         * <p>*   PASS_ASSIGN: Specified headers are passed through.</p>
         */
        @NameInMap("PassThroughAllHeaders")
        public String passThroughAllHeaders;

        /**
         * <p>The list of headers to be passed through.</p>
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
         * <p>The name of the service group.</p>
         */
        @NameInMap("DubboServiceGroup")
        public String dubboServiceGroup;

        /**
         * <p>The name of the Dubbo service.</p>
         */
        @NameInMap("DubboServiceName")
        public String dubboServiceName;

        /**
         * <p>The version of the Dubbo service.</p>
         */
        @NameInMap("DubboServiceVersion")
        public String dubboServiceVersion;

        /**
         * <p>The forwarding rules of the Dubbo service.</p>
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
         * <p>The type of the protocol.</p>
         */
        @NameInMap("AgreementType")
        public String agreementType;

        /**
         * <p>The name of the group to which the service belongs.</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The transcoder of the Dubbo protocol.</p>
         */
        @NameInMap("HttpDubboTranscoder")
        public AddGatewayRouteRequestServicesHttpDubboTranscoder httpDubboTranscoder;

        /**
         * <p>The name.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The namespace to which the service belongs.</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The weight in the form of a percentage value.</p>
         */
        @NameInMap("Percent")
        public Integer percent;

        /**
         * <p>The ID of the service.</p>
         */
        @NameInMap("ServiceId")
        public Long serviceId;

        /**
         * <p>The service port number.</p>
         */
        @NameInMap("ServicePort")
        public Integer servicePort;

        /**
         * <p>The source type.</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The version of the service.</p>
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
