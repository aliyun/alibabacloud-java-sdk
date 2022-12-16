// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddGatewayRouteRequest extends TeaModel {
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
    public AddGatewayRouteRequestDirectResponseJSON directResponseJSON;

    // The ID of the domain name.
    @NameInMap("DomainId")
    public Long domainId;

    // The list of domain names.
    @NameInMap("DomainIdListJSON")
    public String domainIdListJSON;

    // Specifies whether to enable Web Application Firewall (WAF).
    @NameInMap("EnableWaf")
    public Boolean enableWaf;

    // Specifies whether to enable the Fallback service.
    @NameInMap("Fallback")
    public Boolean fallback;

    // The information of the Fallback service.
    @NameInMap("FallbackServices")
    public java.util.List<AddGatewayRouteRequestFallbackServices> fallbackServices;

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
    public AddGatewayRouteRequestPredicates predicates;

    // The configuration of the redirection.
    @NameInMap("RedirectJSON")
    public AddGatewayRouteRequestRedirectJSON redirectJSON;

    // The sequence number of the route. (A small value indicates a high priority.)
    @NameInMap("RouteOrder")
    public Integer routeOrder;

    // The information about services.
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

    public AddGatewayRouteRequest setServices(java.util.List<AddGatewayRouteRequestServices> services) {
        this.services = services;
        return this;
    }
    public java.util.List<AddGatewayRouteRequestServices> getServices() {
        return this.services;
    }

    public static class AddGatewayRouteRequestDirectResponseJSON extends TeaModel {
        // The mock return value.
        @NameInMap("Body")
        public String body;

        // The mock return code.
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
        // The type of the protocol.
        @NameInMap("AgreementType")
        public String agreementType;

        // The name of the group to which the service belongs.
        @NameInMap("GroupName")
        public String groupName;

        // The name.
        @NameInMap("Name")
        public String name;

        // The namespace in which the service resides.
        @NameInMap("Namespace")
        public String namespace;

        // The weight in the form of a percentage value.
        @NameInMap("Percent")
        public Integer percent;

        // The ID of the service.
        @NameInMap("ServiceId")
        public Long serviceId;

        // The service port.
        @NameInMap("ServicePort")
        public Integer servicePort;

        // The type of the service source.
        @NameInMap("SourceType")
        public String sourceType;

        // The version of the service.
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
        // The key of the request header.
        @NameInMap("Key")
        public String key;

        // The matching type.
        @NameInMap("Type")
        public String type;

        // The value of the request header.
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
        // Specifies whether to perform case-insensitive matching.
        @NameInMap("IgnoreCase")
        public Boolean ignoreCase;

        // The path.
        @NameInMap("Path")
        public String path;

        // The route matching type. Valid values:
        // 
        // *   PRE: prefix matching
        // *   EQUAL: exact matching
        // *   ERGULAR: regular expression matching
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
        // The name of the parameter.
        @NameInMap("Key")
        public String key;

        // The matching type.
        @NameInMap("Type")
        public String type;

        // The value of the parameter.
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
        // The information about header matching.
        @NameInMap("HeaderPredicates")
        public java.util.List<AddGatewayRouteRequestPredicatesHeaderPredicates> headerPredicates;

        // The information about method matching.
        @NameInMap("MethodPredicates")
        public java.util.List<String> methodPredicates;

        // The information about route matching.
        @NameInMap("PathPredicates")
        public AddGatewayRouteRequestPredicatesPathPredicates pathPredicates;

        // The information about URL parameter matching.
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
        // The return code.
        @NameInMap("Code")
        public Integer code;

        // The hostname to be redirected to.
        @NameInMap("Host")
        public String host;

        // The path to be redirected to.
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
        // The key extracted from the input parameter.
        @NameInMap("ExtractKey")
        public String extractKey;

        // The position of the input parameter.
        // 
        // > Valid values:
        // 
        // *   `ALL_QUERY_PARAMETER`: request parameter
        // 
        // *   `ALL_HEADER`: request header
        // *   `ALL_PATH`: request path
        // *   `ALL_BODY`: request body
        @NameInMap("ExtractKeySpec")
        public String extractKeySpec;

        // The type of the backend service parameter.
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
        // The method name of the Dubbo service.
        @NameInMap("DubboMothedName")
        public String dubboMothedName;

        // The HTTP method.
        // 
        // > Valid values:
        // 
        // *   ALL_GET
        // 
        // *   ALL_POST
        // 
        // *   ALL_PUT
        // 
        // *   ALL_DELETE
        // 
        // *   ALL_PATCH
        @NameInMap("HttpMothed")
        public String httpMothed;

        // The path that is used to match a method.
        @NameInMap("Mothedpath")
        public String mothedpath;

        // The information of parameter mappings.
        @NameInMap("ParamMapsList")
        public java.util.List<AddGatewayRouteRequestServicesHttpDubboTranscoderMothedMapListParamMapsList> paramMapsList;

        // The pass-through type of the header.
        // 
        // > Valid values:
        // 
        // *   PASS_ALL: All headers are passed through.
        // 
        // *   PASS_NOT: All headers are not passed through.
        // 
        // *   PASS_ASSIGN: Specified headers are passed through.
        @NameInMap("PassThroughAllHeaders")
        public String passThroughAllHeaders;

        // The list of headers to be passed through.
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
        // The service group.
        @NameInMap("DubboServiceGroup")
        public String dubboServiceGroup;

        // The name of the Dubbo service.
        @NameInMap("DubboServiceName")
        public String dubboServiceName;

        // The version of the Dubbo service.
        @NameInMap("DubboServiceVersion")
        public String dubboServiceVersion;

        // The forwarding rules of the Dubbo service.
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
        // The type of the protocol.
        @NameInMap("AgreementType")
        public String agreementType;

        // The name of the group to which the service belongs.
        @NameInMap("GroupName")
        public String groupName;

        // The transcoder of the Dubbo protocol.
        @NameInMap("HttpDubboTranscoder")
        public AddGatewayRouteRequestServicesHttpDubboTranscoder httpDubboTranscoder;

        // The name.
        @NameInMap("Name")
        public String name;

        // The namespace in which the service resides.
        @NameInMap("Namespace")
        public String namespace;

        // The weight in the form of a percentage value.
        @NameInMap("Percent")
        public Integer percent;

        // The ID of the service.
        @NameInMap("ServiceId")
        public Long serviceId;

        // The service port.
        @NameInMap("ServicePort")
        public Integer servicePort;

        // The type of the service source.
        @NameInMap("SourceType")
        public String sourceType;

        // The version of the service.
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
