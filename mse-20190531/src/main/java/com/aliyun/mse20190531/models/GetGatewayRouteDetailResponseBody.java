// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetGatewayRouteDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetGatewayRouteDetailResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetGatewayRouteDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGatewayRouteDetailResponseBody self = new GetGatewayRouteDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGatewayRouteDetailResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetGatewayRouteDetailResponseBody setData(GetGatewayRouteDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetGatewayRouteDetailResponseBodyData getData() {
        return this.data;
    }

    public GetGatewayRouteDetailResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetGatewayRouteDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetGatewayRouteDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetGatewayRouteDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetGatewayRouteDetailResponseBodyDataCors extends TeaModel {
        @NameInMap("AllowCredentials")
        public Boolean allowCredentials;

        @NameInMap("AllowHeaders")
        public String allowHeaders;

        @NameInMap("AllowMethods")
        public String allowMethods;

        @NameInMap("AllowOrigins")
        public String allowOrigins;

        @NameInMap("ExposeHeaders")
        public String exposeHeaders;

        @NameInMap("Status")
        public String status;

        @NameInMap("TimeUnit")
        public String timeUnit;

        @NameInMap("UnitNum")
        public Long unitNum;

        public static GetGatewayRouteDetailResponseBodyDataCors build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayRouteDetailResponseBodyDataCors self = new GetGatewayRouteDetailResponseBodyDataCors();
            return TeaModel.build(map, self);
        }

        public GetGatewayRouteDetailResponseBodyDataCors setAllowCredentials(Boolean allowCredentials) {
            this.allowCredentials = allowCredentials;
            return this;
        }
        public Boolean getAllowCredentials() {
            return this.allowCredentials;
        }

        public GetGatewayRouteDetailResponseBodyDataCors setAllowHeaders(String allowHeaders) {
            this.allowHeaders = allowHeaders;
            return this;
        }
        public String getAllowHeaders() {
            return this.allowHeaders;
        }

        public GetGatewayRouteDetailResponseBodyDataCors setAllowMethods(String allowMethods) {
            this.allowMethods = allowMethods;
            return this;
        }
        public String getAllowMethods() {
            return this.allowMethods;
        }

        public GetGatewayRouteDetailResponseBodyDataCors setAllowOrigins(String allowOrigins) {
            this.allowOrigins = allowOrigins;
            return this;
        }
        public String getAllowOrigins() {
            return this.allowOrigins;
        }

        public GetGatewayRouteDetailResponseBodyDataCors setExposeHeaders(String exposeHeaders) {
            this.exposeHeaders = exposeHeaders;
            return this;
        }
        public String getExposeHeaders() {
            return this.exposeHeaders;
        }

        public GetGatewayRouteDetailResponseBodyDataCors setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetGatewayRouteDetailResponseBodyDataCors setTimeUnit(String timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }
        public String getTimeUnit() {
            return this.timeUnit;
        }

        public GetGatewayRouteDetailResponseBodyDataCors setUnitNum(Long unitNum) {
            this.unitNum = unitNum;
            return this;
        }
        public Long getUnitNum() {
            return this.unitNum;
        }

    }

    public static class GetGatewayRouteDetailResponseBodyDataDirectResponse extends TeaModel {
        @NameInMap("Body")
        public String body;

        @NameInMap("Code")
        public Integer code;

        public static GetGatewayRouteDetailResponseBodyDataDirectResponse build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayRouteDetailResponseBodyDataDirectResponse self = new GetGatewayRouteDetailResponseBodyDataDirectResponse();
            return TeaModel.build(map, self);
        }

        public GetGatewayRouteDetailResponseBodyDataDirectResponse setBody(String body) {
            this.body = body;
            return this;
        }
        public String getBody() {
            return this.body;
        }

        public GetGatewayRouteDetailResponseBodyDataDirectResponse setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

    }

    public static class GetGatewayRouteDetailResponseBodyDataHTTPRewrite extends TeaModel {
        @NameInMap("Host")
        public String host;

        @NameInMap("Path")
        public String path;

        @NameInMap("PathType")
        public String pathType;

        @NameInMap("Pattern")
        public String pattern;

        @NameInMap("Status")
        public String status;

        @NameInMap("Substitution")
        public String substitution;

        public static GetGatewayRouteDetailResponseBodyDataHTTPRewrite build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayRouteDetailResponseBodyDataHTTPRewrite self = new GetGatewayRouteDetailResponseBodyDataHTTPRewrite();
            return TeaModel.build(map, self);
        }

        public GetGatewayRouteDetailResponseBodyDataHTTPRewrite setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GetGatewayRouteDetailResponseBodyDataHTTPRewrite setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetGatewayRouteDetailResponseBodyDataHTTPRewrite setPathType(String pathType) {
            this.pathType = pathType;
            return this;
        }
        public String getPathType() {
            return this.pathType;
        }

        public GetGatewayRouteDetailResponseBodyDataHTTPRewrite setPattern(String pattern) {
            this.pattern = pattern;
            return this;
        }
        public String getPattern() {
            return this.pattern;
        }

        public GetGatewayRouteDetailResponseBodyDataHTTPRewrite setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetGatewayRouteDetailResponseBodyDataHTTPRewrite setSubstitution(String substitution) {
            this.substitution = substitution;
            return this;
        }
        public String getSubstitution() {
            return this.substitution;
        }

    }

    public static class GetGatewayRouteDetailResponseBodyDataHeaderOpHeaderOpItems extends TeaModel {
        @NameInMap("DirectionType")
        public String directionType;

        @NameInMap("Key")
        public String key;

        @NameInMap("OpType")
        public String opType;

        @NameInMap("Value")
        public String value;

        public static GetGatewayRouteDetailResponseBodyDataHeaderOpHeaderOpItems build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayRouteDetailResponseBodyDataHeaderOpHeaderOpItems self = new GetGatewayRouteDetailResponseBodyDataHeaderOpHeaderOpItems();
            return TeaModel.build(map, self);
        }

        public GetGatewayRouteDetailResponseBodyDataHeaderOpHeaderOpItems setDirectionType(String directionType) {
            this.directionType = directionType;
            return this;
        }
        public String getDirectionType() {
            return this.directionType;
        }

        public GetGatewayRouteDetailResponseBodyDataHeaderOpHeaderOpItems setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetGatewayRouteDetailResponseBodyDataHeaderOpHeaderOpItems setOpType(String opType) {
            this.opType = opType;
            return this;
        }
        public String getOpType() {
            return this.opType;
        }

        public GetGatewayRouteDetailResponseBodyDataHeaderOpHeaderOpItems setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetGatewayRouteDetailResponseBodyDataHeaderOp extends TeaModel {
        @NameInMap("HeaderOpItems")
        public java.util.List<GetGatewayRouteDetailResponseBodyDataHeaderOpHeaderOpItems> headerOpItems;

        @NameInMap("Status")
        public String status;

        public static GetGatewayRouteDetailResponseBodyDataHeaderOp build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayRouteDetailResponseBodyDataHeaderOp self = new GetGatewayRouteDetailResponseBodyDataHeaderOp();
            return TeaModel.build(map, self);
        }

        public GetGatewayRouteDetailResponseBodyDataHeaderOp setHeaderOpItems(java.util.List<GetGatewayRouteDetailResponseBodyDataHeaderOpHeaderOpItems> headerOpItems) {
            this.headerOpItems = headerOpItems;
            return this;
        }
        public java.util.List<GetGatewayRouteDetailResponseBodyDataHeaderOpHeaderOpItems> getHeaderOpItems() {
            return this.headerOpItems;
        }

        public GetGatewayRouteDetailResponseBodyDataHeaderOp setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetGatewayRouteDetailResponseBodyDataRedirect extends TeaModel {
        @NameInMap("Code")
        public Integer code;

        @NameInMap("Host")
        public String host;

        @NameInMap("Path")
        public String path;

        public static GetGatewayRouteDetailResponseBodyDataRedirect build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayRouteDetailResponseBodyDataRedirect self = new GetGatewayRouteDetailResponseBodyDataRedirect();
            return TeaModel.build(map, self);
        }

        public GetGatewayRouteDetailResponseBodyDataRedirect setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public GetGatewayRouteDetailResponseBodyDataRedirect setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GetGatewayRouteDetailResponseBodyDataRedirect setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class GetGatewayRouteDetailResponseBodyDataRetry extends TeaModel {
        @NameInMap("Attempts")
        public Integer attempts;

        @NameInMap("HttpCodes")
        public java.util.List<String> httpCodes;

        @NameInMap("RetryOn")
        public java.util.List<String> retryOn;

        @NameInMap("Status")
        public String status;

        public static GetGatewayRouteDetailResponseBodyDataRetry build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayRouteDetailResponseBodyDataRetry self = new GetGatewayRouteDetailResponseBodyDataRetry();
            return TeaModel.build(map, self);
        }

        public GetGatewayRouteDetailResponseBodyDataRetry setAttempts(Integer attempts) {
            this.attempts = attempts;
            return this;
        }
        public Integer getAttempts() {
            return this.attempts;
        }

        public GetGatewayRouteDetailResponseBodyDataRetry setHttpCodes(java.util.List<String> httpCodes) {
            this.httpCodes = httpCodes;
            return this;
        }
        public java.util.List<String> getHttpCodes() {
            return this.httpCodes;
        }

        public GetGatewayRouteDetailResponseBodyDataRetry setRetryOn(java.util.List<String> retryOn) {
            this.retryOn = retryOn;
            return this;
        }
        public java.util.List<String> getRetryOn() {
            return this.retryOn;
        }

        public GetGatewayRouteDetailResponseBodyDataRetry setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetGatewayRouteDetailResponseBodyDataRoutePredicatesHeaderPredicates extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static GetGatewayRouteDetailResponseBodyDataRoutePredicatesHeaderPredicates build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayRouteDetailResponseBodyDataRoutePredicatesHeaderPredicates self = new GetGatewayRouteDetailResponseBodyDataRoutePredicatesHeaderPredicates();
            return TeaModel.build(map, self);
        }

        public GetGatewayRouteDetailResponseBodyDataRoutePredicatesHeaderPredicates setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetGatewayRouteDetailResponseBodyDataRoutePredicatesHeaderPredicates setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetGatewayRouteDetailResponseBodyDataRoutePredicatesHeaderPredicates setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetGatewayRouteDetailResponseBodyDataRoutePredicatesPathPredicates extends TeaModel {
        @NameInMap("IgnoreCase")
        public Boolean ignoreCase;

        @NameInMap("Path")
        public String path;

        @NameInMap("Type")
        public String type;

        public static GetGatewayRouteDetailResponseBodyDataRoutePredicatesPathPredicates build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayRouteDetailResponseBodyDataRoutePredicatesPathPredicates self = new GetGatewayRouteDetailResponseBodyDataRoutePredicatesPathPredicates();
            return TeaModel.build(map, self);
        }

        public GetGatewayRouteDetailResponseBodyDataRoutePredicatesPathPredicates setIgnoreCase(Boolean ignoreCase) {
            this.ignoreCase = ignoreCase;
            return this;
        }
        public Boolean getIgnoreCase() {
            return this.ignoreCase;
        }

        public GetGatewayRouteDetailResponseBodyDataRoutePredicatesPathPredicates setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetGatewayRouteDetailResponseBodyDataRoutePredicatesPathPredicates setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetGatewayRouteDetailResponseBodyDataRoutePredicatesQueryPredicates extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static GetGatewayRouteDetailResponseBodyDataRoutePredicatesQueryPredicates build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayRouteDetailResponseBodyDataRoutePredicatesQueryPredicates self = new GetGatewayRouteDetailResponseBodyDataRoutePredicatesQueryPredicates();
            return TeaModel.build(map, self);
        }

        public GetGatewayRouteDetailResponseBodyDataRoutePredicatesQueryPredicates setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetGatewayRouteDetailResponseBodyDataRoutePredicatesQueryPredicates setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetGatewayRouteDetailResponseBodyDataRoutePredicatesQueryPredicates setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetGatewayRouteDetailResponseBodyDataRoutePredicates extends TeaModel {
        @NameInMap("HeaderPredicates")
        public java.util.List<GetGatewayRouteDetailResponseBodyDataRoutePredicatesHeaderPredicates> headerPredicates;

        @NameInMap("MethodPredicates")
        public java.util.List<String> methodPredicates;

        @NameInMap("PathPredicates")
        public GetGatewayRouteDetailResponseBodyDataRoutePredicatesPathPredicates pathPredicates;

        @NameInMap("QueryPredicates")
        public java.util.List<GetGatewayRouteDetailResponseBodyDataRoutePredicatesQueryPredicates> queryPredicates;

        public static GetGatewayRouteDetailResponseBodyDataRoutePredicates build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayRouteDetailResponseBodyDataRoutePredicates self = new GetGatewayRouteDetailResponseBodyDataRoutePredicates();
            return TeaModel.build(map, self);
        }

        public GetGatewayRouteDetailResponseBodyDataRoutePredicates setHeaderPredicates(java.util.List<GetGatewayRouteDetailResponseBodyDataRoutePredicatesHeaderPredicates> headerPredicates) {
            this.headerPredicates = headerPredicates;
            return this;
        }
        public java.util.List<GetGatewayRouteDetailResponseBodyDataRoutePredicatesHeaderPredicates> getHeaderPredicates() {
            return this.headerPredicates;
        }

        public GetGatewayRouteDetailResponseBodyDataRoutePredicates setMethodPredicates(java.util.List<String> methodPredicates) {
            this.methodPredicates = methodPredicates;
            return this;
        }
        public java.util.List<String> getMethodPredicates() {
            return this.methodPredicates;
        }

        public GetGatewayRouteDetailResponseBodyDataRoutePredicates setPathPredicates(GetGatewayRouteDetailResponseBodyDataRoutePredicatesPathPredicates pathPredicates) {
            this.pathPredicates = pathPredicates;
            return this;
        }
        public GetGatewayRouteDetailResponseBodyDataRoutePredicatesPathPredicates getPathPredicates() {
            return this.pathPredicates;
        }

        public GetGatewayRouteDetailResponseBodyDataRoutePredicates setQueryPredicates(java.util.List<GetGatewayRouteDetailResponseBodyDataRoutePredicatesQueryPredicates> queryPredicates) {
            this.queryPredicates = queryPredicates;
            return this;
        }
        public java.util.List<GetGatewayRouteDetailResponseBodyDataRoutePredicatesQueryPredicates> getQueryPredicates() {
            return this.queryPredicates;
        }

    }

    public static class GetGatewayRouteDetailResponseBodyDataRouteServices extends TeaModel {
        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("Name")
        public String name;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("Percent")
        public Integer percent;

        @NameInMap("ServiceId")
        public Long serviceId;

        @NameInMap("ServiceName")
        public String serviceName;

        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("Version")
        public String version;

        public static GetGatewayRouteDetailResponseBodyDataRouteServices build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayRouteDetailResponseBodyDataRouteServices self = new GetGatewayRouteDetailResponseBodyDataRouteServices();
            return TeaModel.build(map, self);
        }

        public GetGatewayRouteDetailResponseBodyDataRouteServices setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public GetGatewayRouteDetailResponseBodyDataRouteServices setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetGatewayRouteDetailResponseBodyDataRouteServices setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public GetGatewayRouteDetailResponseBodyDataRouteServices setPercent(Integer percent) {
            this.percent = percent;
            return this;
        }
        public Integer getPercent() {
            return this.percent;
        }

        public GetGatewayRouteDetailResponseBodyDataRouteServices setServiceId(Long serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public Long getServiceId() {
            return this.serviceId;
        }

        public GetGatewayRouteDetailResponseBodyDataRouteServices setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public GetGatewayRouteDetailResponseBodyDataRouteServices setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public GetGatewayRouteDetailResponseBodyDataRouteServices setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetGatewayRouteDetailResponseBodyDataTimeout extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("TimeUnit")
        public String timeUnit;

        @NameInMap("UnitNum")
        public Integer unitNum;

        public static GetGatewayRouteDetailResponseBodyDataTimeout build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayRouteDetailResponseBodyDataTimeout self = new GetGatewayRouteDetailResponseBodyDataTimeout();
            return TeaModel.build(map, self);
        }

        public GetGatewayRouteDetailResponseBodyDataTimeout setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetGatewayRouteDetailResponseBodyDataTimeout setTimeUnit(String timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }
        public String getTimeUnit() {
            return this.timeUnit;
        }

        public GetGatewayRouteDetailResponseBodyDataTimeout setUnitNum(Integer unitNum) {
            this.unitNum = unitNum;
            return this;
        }
        public Integer getUnitNum() {
            return this.unitNum;
        }

    }

    public static class GetGatewayRouteDetailResponseBodyData extends TeaModel {
        @NameInMap("AhasStatus")
        public Integer ahasStatus;

        @NameInMap("Cors")
        public GetGatewayRouteDetailResponseBodyDataCors cors;

        @NameInMap("DefaultServiceId")
        public Long defaultServiceId;

        @NameInMap("DefaultServiceName")
        public String defaultServiceName;

        @NameInMap("DestinationType")
        public String destinationType;

        @NameInMap("DirectResponse")
        public GetGatewayRouteDetailResponseBodyDataDirectResponse directResponse;

        @NameInMap("DomainId")
        public Long domainId;

        @NameInMap("DomainIdList")
        public java.util.List<Long> domainIdList;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("DomainNameList")
        public java.util.List<String> domainNameList;

        @NameInMap("EnableWaf")
        public Boolean enableWaf;

        @NameInMap("GatewayId")
        public Long gatewayId;

        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("HTTPRewrite")
        public GetGatewayRouteDetailResponseBodyDataHTTPRewrite HTTPRewrite;

        @NameInMap("HeaderOp")
        public GetGatewayRouteDetailResponseBodyDataHeaderOp headerOp;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Predicates")
        public String predicates;

        @NameInMap("Redirect")
        public GetGatewayRouteDetailResponseBodyDataRedirect redirect;

        @NameInMap("Retry")
        public GetGatewayRouteDetailResponseBodyDataRetry retry;

        @NameInMap("RouteOrder")
        public Integer routeOrder;

        @NameInMap("RoutePredicates")
        public GetGatewayRouteDetailResponseBodyDataRoutePredicates routePredicates;

        @NameInMap("RouteServices")
        public java.util.List<GetGatewayRouteDetailResponseBodyDataRouteServices> routeServices;

        @NameInMap("Services")
        public String services;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("Timeout")
        public GetGatewayRouteDetailResponseBodyDataTimeout timeout;

        public static GetGatewayRouteDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayRouteDetailResponseBodyData self = new GetGatewayRouteDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetGatewayRouteDetailResponseBodyData setAhasStatus(Integer ahasStatus) {
            this.ahasStatus = ahasStatus;
            return this;
        }
        public Integer getAhasStatus() {
            return this.ahasStatus;
        }

        public GetGatewayRouteDetailResponseBodyData setCors(GetGatewayRouteDetailResponseBodyDataCors cors) {
            this.cors = cors;
            return this;
        }
        public GetGatewayRouteDetailResponseBodyDataCors getCors() {
            return this.cors;
        }

        public GetGatewayRouteDetailResponseBodyData setDefaultServiceId(Long defaultServiceId) {
            this.defaultServiceId = defaultServiceId;
            return this;
        }
        public Long getDefaultServiceId() {
            return this.defaultServiceId;
        }

        public GetGatewayRouteDetailResponseBodyData setDefaultServiceName(String defaultServiceName) {
            this.defaultServiceName = defaultServiceName;
            return this;
        }
        public String getDefaultServiceName() {
            return this.defaultServiceName;
        }

        public GetGatewayRouteDetailResponseBodyData setDestinationType(String destinationType) {
            this.destinationType = destinationType;
            return this;
        }
        public String getDestinationType() {
            return this.destinationType;
        }

        public GetGatewayRouteDetailResponseBodyData setDirectResponse(GetGatewayRouteDetailResponseBodyDataDirectResponse directResponse) {
            this.directResponse = directResponse;
            return this;
        }
        public GetGatewayRouteDetailResponseBodyDataDirectResponse getDirectResponse() {
            return this.directResponse;
        }

        public GetGatewayRouteDetailResponseBodyData setDomainId(Long domainId) {
            this.domainId = domainId;
            return this;
        }
        public Long getDomainId() {
            return this.domainId;
        }

        public GetGatewayRouteDetailResponseBodyData setDomainIdList(java.util.List<Long> domainIdList) {
            this.domainIdList = domainIdList;
            return this;
        }
        public java.util.List<Long> getDomainIdList() {
            return this.domainIdList;
        }

        public GetGatewayRouteDetailResponseBodyData setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public GetGatewayRouteDetailResponseBodyData setDomainNameList(java.util.List<String> domainNameList) {
            this.domainNameList = domainNameList;
            return this;
        }
        public java.util.List<String> getDomainNameList() {
            return this.domainNameList;
        }

        public GetGatewayRouteDetailResponseBodyData setEnableWaf(Boolean enableWaf) {
            this.enableWaf = enableWaf;
            return this;
        }
        public Boolean getEnableWaf() {
            return this.enableWaf;
        }

        public GetGatewayRouteDetailResponseBodyData setGatewayId(Long gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public Long getGatewayId() {
            return this.gatewayId;
        }

        public GetGatewayRouteDetailResponseBodyData setGatewayUniqueId(String gatewayUniqueId) {
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        public GetGatewayRouteDetailResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetGatewayRouteDetailResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetGatewayRouteDetailResponseBodyData setHTTPRewrite(GetGatewayRouteDetailResponseBodyDataHTTPRewrite HTTPRewrite) {
            this.HTTPRewrite = HTTPRewrite;
            return this;
        }
        public GetGatewayRouteDetailResponseBodyDataHTTPRewrite getHTTPRewrite() {
            return this.HTTPRewrite;
        }

        public GetGatewayRouteDetailResponseBodyData setHeaderOp(GetGatewayRouteDetailResponseBodyDataHeaderOp headerOp) {
            this.headerOp = headerOp;
            return this;
        }
        public GetGatewayRouteDetailResponseBodyDataHeaderOp getHeaderOp() {
            return this.headerOp;
        }

        public GetGatewayRouteDetailResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetGatewayRouteDetailResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetGatewayRouteDetailResponseBodyData setPredicates(String predicates) {
            this.predicates = predicates;
            return this;
        }
        public String getPredicates() {
            return this.predicates;
        }

        public GetGatewayRouteDetailResponseBodyData setRedirect(GetGatewayRouteDetailResponseBodyDataRedirect redirect) {
            this.redirect = redirect;
            return this;
        }
        public GetGatewayRouteDetailResponseBodyDataRedirect getRedirect() {
            return this.redirect;
        }

        public GetGatewayRouteDetailResponseBodyData setRetry(GetGatewayRouteDetailResponseBodyDataRetry retry) {
            this.retry = retry;
            return this;
        }
        public GetGatewayRouteDetailResponseBodyDataRetry getRetry() {
            return this.retry;
        }

        public GetGatewayRouteDetailResponseBodyData setRouteOrder(Integer routeOrder) {
            this.routeOrder = routeOrder;
            return this;
        }
        public Integer getRouteOrder() {
            return this.routeOrder;
        }

        public GetGatewayRouteDetailResponseBodyData setRoutePredicates(GetGatewayRouteDetailResponseBodyDataRoutePredicates routePredicates) {
            this.routePredicates = routePredicates;
            return this;
        }
        public GetGatewayRouteDetailResponseBodyDataRoutePredicates getRoutePredicates() {
            return this.routePredicates;
        }

        public GetGatewayRouteDetailResponseBodyData setRouteServices(java.util.List<GetGatewayRouteDetailResponseBodyDataRouteServices> routeServices) {
            this.routeServices = routeServices;
            return this;
        }
        public java.util.List<GetGatewayRouteDetailResponseBodyDataRouteServices> getRouteServices() {
            return this.routeServices;
        }

        public GetGatewayRouteDetailResponseBodyData setServices(String services) {
            this.services = services;
            return this;
        }
        public String getServices() {
            return this.services;
        }

        public GetGatewayRouteDetailResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetGatewayRouteDetailResponseBodyData setTimeout(GetGatewayRouteDetailResponseBodyDataTimeout timeout) {
            this.timeout = timeout;
            return this;
        }
        public GetGatewayRouteDetailResponseBodyDataTimeout getTimeout() {
            return this.timeout;
        }

    }

}
