// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayRouteRequest extends TeaModel {
    // The language of the response. Valid values:
    // 
    // *   zh: Chinese
    // *   en: English
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // The destination service type.
    @NameInMap("DestinationType")
    public String destinationType;

    // The information about service mocking.
    @NameInMap("DirectResponseJSON")
    public UpdateGatewayRouteRequestDirectResponseJSON directResponseJSON;

    // The associated domain name.
    @NameInMap("DomainIdListJSON")
    public String domainIdListJSON;

    // Specifies whether to enable Web Application Firewall (WAF).
    @NameInMap("EnableWaf")
    public Boolean enableWaf;

    // Specifies whether to enable the Fallback service.
    @NameInMap("Fallback")
    public Boolean fallback;

    // The information about the Fallback service.
    @NameInMap("FallbackServices")
    public java.util.List<UpdateGatewayRouteRequestFallbackServices> fallbackServices;

    // The ID of the gateway.
    @NameInMap("GatewayId")
    public Long gatewayId;

    // The unique ID of the gateway.
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    // The ID of the route.
    @NameInMap("Id")
    public Long id;

    // The name of the route.
    @NameInMap("Name")
    public String name;

    // The route matching conditions.
    @NameInMap("Predicates")
    public UpdateGatewayRouteRequestPredicates predicates;

    // The information about redirection.
    @NameInMap("RedirectJSON")
    public UpdateGatewayRouteRequestRedirectJSON redirectJSON;

    // The sequence number of the route.
    @NameInMap("RouteOrder")
    public Integer routeOrder;

    // The information about destination services.
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
        // The mock return value.
        @NameInMap("Body")
        public String body;

        // The mock return code.
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
        // The type of the protocol. Valid values:
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

        // The service port number.
        @NameInMap("ServicePort")
        public Integer servicePort;

        // The type of the service source.
        @NameInMap("SourceType")
        public String sourceType;

        // The version of the service.
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
        // The key of the request header.
        @NameInMap("Key")
        public String key;

        // The matching type.
        @NameInMap("Type")
        public String type;

        // The value of the request header.
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
        // Specifies whether to perform case-insensitive matching.
        @NameInMap("IgnoreCase")
        public Boolean ignoreCase;

        // The path used for route matching.
        @NameInMap("Path")
        public String path;

        // The matching type.
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
        // The name of the parameter.
        @NameInMap("Key")
        public String key;

        // The matching type.
        @NameInMap("Type")
        public String type;

        // The value of the parameter.
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
        // The information about header matching.
        @NameInMap("HeaderPredicates")
        public java.util.List<UpdateGatewayRouteRequestPredicatesHeaderPredicates> headerPredicates;

        // The information about method matching.
        @NameInMap("MethodPredicates")
        public java.util.List<String> methodPredicates;

        // The information about path matching.
        @NameInMap("PathPredicates")
        public UpdateGatewayRouteRequestPredicatesPathPredicates pathPredicates;

        // The information about parameter matching.
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
        // The status code.
        @NameInMap("Code")
        public Integer code;

        // The hostname to be redirected to.
        @NameInMap("Host")
        public String host;

        // The path to be redirected to.
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
        // 
        // *   `ALL_PATH`: request path
        // 
        // *   `ALL_BODY`: request body
        @NameInMap("ExtractKeySpec")
        public String extractKeySpec;

        // The type of the backend service parameter.
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
        public java.util.List<UpdateGatewayRouteRequestServicesHttpDubboTranscoderMothedMapListParamMapsList> paramMapsList;

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
        // The Dubbo service group.
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
        // The type of the protocol. Valid values:
        @NameInMap("AgreementType")
        public String agreementType;

        // The name of the group to which the service belongs.
        @NameInMap("GroupName")
        public String groupName;

        // The transcoder of the Dubbo protocol.
        @NameInMap("HttpDubboTranscoder")
        public UpdateGatewayRouteRequestServicesHttpDubboTranscoder httpDubboTranscoder;

        // The name.
        @NameInMap("Name")
        public String name;

        // The namespace in which the service resides.
        @NameInMap("Namespace")
        public String namespace;

        // The percentage.
        @NameInMap("Percent")
        public Integer percent;

        // The ID of the service.
        @NameInMap("ServiceId")
        public Long serviceId;

        // The Dubbo port number.
        @NameInMap("ServicePort")
        public Integer servicePort;

        // The type of the service source.
        @NameInMap("SourceType")
        public String sourceType;

        // The version of the service.
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
