// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayRouteWafStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public UpdateGatewayRouteWafStatusResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static UpdateGatewayRouteWafStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayRouteWafStatusResponseBody self = new UpdateGatewayRouteWafStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayRouteWafStatusResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UpdateGatewayRouteWafStatusResponseBody setData(UpdateGatewayRouteWafStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateGatewayRouteWafStatusResponseBodyData getData() {
        return this.data;
    }

    public UpdateGatewayRouteWafStatusResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateGatewayRouteWafStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateGatewayRouteWafStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateGatewayRouteWafStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateGatewayRouteWafStatusResponseBodyDataCors extends TeaModel {
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

        public static UpdateGatewayRouteWafStatusResponseBodyDataCors build(java.util.Map<String, ?> map) throws Exception {
            UpdateGatewayRouteWafStatusResponseBodyDataCors self = new UpdateGatewayRouteWafStatusResponseBodyDataCors();
            return TeaModel.build(map, self);
        }

        public UpdateGatewayRouteWafStatusResponseBodyDataCors setAllowCredentials(Boolean allowCredentials) {
            this.allowCredentials = allowCredentials;
            return this;
        }
        public Boolean getAllowCredentials() {
            return this.allowCredentials;
        }

        public UpdateGatewayRouteWafStatusResponseBodyDataCors setAllowHeaders(String allowHeaders) {
            this.allowHeaders = allowHeaders;
            return this;
        }
        public String getAllowHeaders() {
            return this.allowHeaders;
        }

        public UpdateGatewayRouteWafStatusResponseBodyDataCors setAllowMethods(String allowMethods) {
            this.allowMethods = allowMethods;
            return this;
        }
        public String getAllowMethods() {
            return this.allowMethods;
        }

        public UpdateGatewayRouteWafStatusResponseBodyDataCors setAllowOrigins(String allowOrigins) {
            this.allowOrigins = allowOrigins;
            return this;
        }
        public String getAllowOrigins() {
            return this.allowOrigins;
        }

        public UpdateGatewayRouteWafStatusResponseBodyDataCors setExposeHeaders(String exposeHeaders) {
            this.exposeHeaders = exposeHeaders;
            return this;
        }
        public String getExposeHeaders() {
            return this.exposeHeaders;
        }

        public UpdateGatewayRouteWafStatusResponseBodyDataCors setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateGatewayRouteWafStatusResponseBodyDataCors setTimeUnit(String timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }
        public String getTimeUnit() {
            return this.timeUnit;
        }

        public UpdateGatewayRouteWafStatusResponseBodyDataCors setUnitNum(Long unitNum) {
            this.unitNum = unitNum;
            return this;
        }
        public Long getUnitNum() {
            return this.unitNum;
        }

    }

    public static class UpdateGatewayRouteWafStatusResponseBodyDataDirectResponse extends TeaModel {
        @NameInMap("Body")
        public String body;

        @NameInMap("Code")
        public Integer code;

        public static UpdateGatewayRouteWafStatusResponseBodyDataDirectResponse build(java.util.Map<String, ?> map) throws Exception {
            UpdateGatewayRouteWafStatusResponseBodyDataDirectResponse self = new UpdateGatewayRouteWafStatusResponseBodyDataDirectResponse();
            return TeaModel.build(map, self);
        }

        public UpdateGatewayRouteWafStatusResponseBodyDataDirectResponse setBody(String body) {
            this.body = body;
            return this;
        }
        public String getBody() {
            return this.body;
        }

        public UpdateGatewayRouteWafStatusResponseBodyDataDirectResponse setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

    }

    public static class UpdateGatewayRouteWafStatusResponseBodyDataHTTPRewrite extends TeaModel {
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

        public static UpdateGatewayRouteWafStatusResponseBodyDataHTTPRewrite build(java.util.Map<String, ?> map) throws Exception {
            UpdateGatewayRouteWafStatusResponseBodyDataHTTPRewrite self = new UpdateGatewayRouteWafStatusResponseBodyDataHTTPRewrite();
            return TeaModel.build(map, self);
        }

        public UpdateGatewayRouteWafStatusResponseBodyDataHTTPRewrite setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public UpdateGatewayRouteWafStatusResponseBodyDataHTTPRewrite setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public UpdateGatewayRouteWafStatusResponseBodyDataHTTPRewrite setPathType(String pathType) {
            this.pathType = pathType;
            return this;
        }
        public String getPathType() {
            return this.pathType;
        }

        public UpdateGatewayRouteWafStatusResponseBodyDataHTTPRewrite setPattern(String pattern) {
            this.pattern = pattern;
            return this;
        }
        public String getPattern() {
            return this.pattern;
        }

        public UpdateGatewayRouteWafStatusResponseBodyDataHTTPRewrite setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateGatewayRouteWafStatusResponseBodyDataHTTPRewrite setSubstitution(String substitution) {
            this.substitution = substitution;
            return this;
        }
        public String getSubstitution() {
            return this.substitution;
        }

    }

    public static class UpdateGatewayRouteWafStatusResponseBodyDataHeaderOpHeaderOpItems extends TeaModel {
        @NameInMap("DirectionType")
        public String directionType;

        @NameInMap("Key")
        public String key;

        @NameInMap("OpType")
        public String opType;

        @NameInMap("Value")
        public String value;

        public static UpdateGatewayRouteWafStatusResponseBodyDataHeaderOpHeaderOpItems build(java.util.Map<String, ?> map) throws Exception {
            UpdateGatewayRouteWafStatusResponseBodyDataHeaderOpHeaderOpItems self = new UpdateGatewayRouteWafStatusResponseBodyDataHeaderOpHeaderOpItems();
            return TeaModel.build(map, self);
        }

        public UpdateGatewayRouteWafStatusResponseBodyDataHeaderOpHeaderOpItems setDirectionType(String directionType) {
            this.directionType = directionType;
            return this;
        }
        public String getDirectionType() {
            return this.directionType;
        }

        public UpdateGatewayRouteWafStatusResponseBodyDataHeaderOpHeaderOpItems setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateGatewayRouteWafStatusResponseBodyDataHeaderOpHeaderOpItems setOpType(String opType) {
            this.opType = opType;
            return this;
        }
        public String getOpType() {
            return this.opType;
        }

        public UpdateGatewayRouteWafStatusResponseBodyDataHeaderOpHeaderOpItems setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateGatewayRouteWafStatusResponseBodyDataHeaderOp extends TeaModel {
        @NameInMap("HeaderOpItems")
        public java.util.List<UpdateGatewayRouteWafStatusResponseBodyDataHeaderOpHeaderOpItems> headerOpItems;

        @NameInMap("Status")
        public String status;

        public static UpdateGatewayRouteWafStatusResponseBodyDataHeaderOp build(java.util.Map<String, ?> map) throws Exception {
            UpdateGatewayRouteWafStatusResponseBodyDataHeaderOp self = new UpdateGatewayRouteWafStatusResponseBodyDataHeaderOp();
            return TeaModel.build(map, self);
        }

        public UpdateGatewayRouteWafStatusResponseBodyDataHeaderOp setHeaderOpItems(java.util.List<UpdateGatewayRouteWafStatusResponseBodyDataHeaderOpHeaderOpItems> headerOpItems) {
            this.headerOpItems = headerOpItems;
            return this;
        }
        public java.util.List<UpdateGatewayRouteWafStatusResponseBodyDataHeaderOpHeaderOpItems> getHeaderOpItems() {
            return this.headerOpItems;
        }

        public UpdateGatewayRouteWafStatusResponseBodyDataHeaderOp setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class UpdateGatewayRouteWafStatusResponseBodyDataRedirect extends TeaModel {
        @NameInMap("Code")
        public Integer code;

        @NameInMap("Host")
        public String host;

        @NameInMap("Path")
        public String path;

        public static UpdateGatewayRouteWafStatusResponseBodyDataRedirect build(java.util.Map<String, ?> map) throws Exception {
            UpdateGatewayRouteWafStatusResponseBodyDataRedirect self = new UpdateGatewayRouteWafStatusResponseBodyDataRedirect();
            return TeaModel.build(map, self);
        }

        public UpdateGatewayRouteWafStatusResponseBodyDataRedirect setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public UpdateGatewayRouteWafStatusResponseBodyDataRedirect setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public UpdateGatewayRouteWafStatusResponseBodyDataRedirect setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class UpdateGatewayRouteWafStatusResponseBodyDataRetry extends TeaModel {
        @NameInMap("Attempts")
        public Integer attempts;

        @NameInMap("HttpCodes")
        public java.util.List<String> httpCodes;

        @NameInMap("RetryOn")
        public java.util.List<String> retryOn;

        @NameInMap("Status")
        public String status;

        public static UpdateGatewayRouteWafStatusResponseBodyDataRetry build(java.util.Map<String, ?> map) throws Exception {
            UpdateGatewayRouteWafStatusResponseBodyDataRetry self = new UpdateGatewayRouteWafStatusResponseBodyDataRetry();
            return TeaModel.build(map, self);
        }

        public UpdateGatewayRouteWafStatusResponseBodyDataRetry setAttempts(Integer attempts) {
            this.attempts = attempts;
            return this;
        }
        public Integer getAttempts() {
            return this.attempts;
        }

        public UpdateGatewayRouteWafStatusResponseBodyDataRetry setHttpCodes(java.util.List<String> httpCodes) {
            this.httpCodes = httpCodes;
            return this;
        }
        public java.util.List<String> getHttpCodes() {
            return this.httpCodes;
        }

        public UpdateGatewayRouteWafStatusResponseBodyDataRetry setRetryOn(java.util.List<String> retryOn) {
            this.retryOn = retryOn;
            return this;
        }
        public java.util.List<String> getRetryOn() {
            return this.retryOn;
        }

        public UpdateGatewayRouteWafStatusResponseBodyDataRetry setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class UpdateGatewayRouteWafStatusResponseBodyDataRoutePredicatesHeaderPredicates extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static UpdateGatewayRouteWafStatusResponseBodyDataRoutePredicatesHeaderPredicates build(java.util.Map<String, ?> map) throws Exception {
            UpdateGatewayRouteWafStatusResponseBodyDataRoutePredicatesHeaderPredicates self = new UpdateGatewayRouteWafStatusResponseBodyDataRoutePredicatesHeaderPredicates();
            return TeaModel.build(map, self);
        }

        public UpdateGatewayRouteWafStatusResponseBodyDataRoutePredicatesHeaderPredicates setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateGatewayRouteWafStatusResponseBodyDataRoutePredicatesHeaderPredicates setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateGatewayRouteWafStatusResponseBodyDataRoutePredicatesHeaderPredicates setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateGatewayRouteWafStatusResponseBodyDataRoutePredicatesPathPredicates extends TeaModel {
        @NameInMap("IgnoreCase")
        public Boolean ignoreCase;

        @NameInMap("Path")
        public String path;

        @NameInMap("Type")
        public String type;

        public static UpdateGatewayRouteWafStatusResponseBodyDataRoutePredicatesPathPredicates build(java.util.Map<String, ?> map) throws Exception {
            UpdateGatewayRouteWafStatusResponseBodyDataRoutePredicatesPathPredicates self = new UpdateGatewayRouteWafStatusResponseBodyDataRoutePredicatesPathPredicates();
            return TeaModel.build(map, self);
        }

        public UpdateGatewayRouteWafStatusResponseBodyDataRoutePredicatesPathPredicates setIgnoreCase(Boolean ignoreCase) {
            this.ignoreCase = ignoreCase;
            return this;
        }
        public Boolean getIgnoreCase() {
            return this.ignoreCase;
        }

        public UpdateGatewayRouteWafStatusResponseBodyDataRoutePredicatesPathPredicates setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public UpdateGatewayRouteWafStatusResponseBodyDataRoutePredicatesPathPredicates setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateGatewayRouteWafStatusResponseBodyDataRoutePredicatesQueryPredicates extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static UpdateGatewayRouteWafStatusResponseBodyDataRoutePredicatesQueryPredicates build(java.util.Map<String, ?> map) throws Exception {
            UpdateGatewayRouteWafStatusResponseBodyDataRoutePredicatesQueryPredicates self = new UpdateGatewayRouteWafStatusResponseBodyDataRoutePredicatesQueryPredicates();
            return TeaModel.build(map, self);
        }

        public UpdateGatewayRouteWafStatusResponseBodyDataRoutePredicatesQueryPredicates setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateGatewayRouteWafStatusResponseBodyDataRoutePredicatesQueryPredicates setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateGatewayRouteWafStatusResponseBodyDataRoutePredicatesQueryPredicates setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateGatewayRouteWafStatusResponseBodyDataRoutePredicates extends TeaModel {
        @NameInMap("HeaderPredicates")
        public java.util.List<UpdateGatewayRouteWafStatusResponseBodyDataRoutePredicatesHeaderPredicates> headerPredicates;

        @NameInMap("MethodPredicates")
        public java.util.List<String> methodPredicates;

        @NameInMap("PathPredicates")
        public UpdateGatewayRouteWafStatusResponseBodyDataRoutePredicatesPathPredicates pathPredicates;

        @NameInMap("QueryPredicates")
        public java.util.List<UpdateGatewayRouteWafStatusResponseBodyDataRoutePredicatesQueryPredicates> queryPredicates;

        public static UpdateGatewayRouteWafStatusResponseBodyDataRoutePredicates build(java.util.Map<String, ?> map) throws Exception {
            UpdateGatewayRouteWafStatusResponseBodyDataRoutePredicates self = new UpdateGatewayRouteWafStatusResponseBodyDataRoutePredicates();
            return TeaModel.build(map, self);
        }

        public UpdateGatewayRouteWafStatusResponseBodyDataRoutePredicates setHeaderPredicates(java.util.List<UpdateGatewayRouteWafStatusResponseBodyDataRoutePredicatesHeaderPredicates> headerPredicates) {
            this.headerPredicates = headerPredicates;
            return this;
        }
        public java.util.List<UpdateGatewayRouteWafStatusResponseBodyDataRoutePredicatesHeaderPredicates> getHeaderPredicates() {
            return this.headerPredicates;
        }

        public UpdateGatewayRouteWafStatusResponseBodyDataRoutePredicates setMethodPredicates(java.util.List<String> methodPredicates) {
            this.methodPredicates = methodPredicates;
            return this;
        }
        public java.util.List<String> getMethodPredicates() {
            return this.methodPredicates;
        }

        public UpdateGatewayRouteWafStatusResponseBodyDataRoutePredicates setPathPredicates(UpdateGatewayRouteWafStatusResponseBodyDataRoutePredicatesPathPredicates pathPredicates) {
            this.pathPredicates = pathPredicates;
            return this;
        }
        public UpdateGatewayRouteWafStatusResponseBodyDataRoutePredicatesPathPredicates getPathPredicates() {
            return this.pathPredicates;
        }

        public UpdateGatewayRouteWafStatusResponseBodyDataRoutePredicates setQueryPredicates(java.util.List<UpdateGatewayRouteWafStatusResponseBodyDataRoutePredicatesQueryPredicates> queryPredicates) {
            this.queryPredicates = queryPredicates;
            return this;
        }
        public java.util.List<UpdateGatewayRouteWafStatusResponseBodyDataRoutePredicatesQueryPredicates> getQueryPredicates() {
            return this.queryPredicates;
        }

    }

    public static class UpdateGatewayRouteWafStatusResponseBodyDataRouteServices extends TeaModel {
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

        public static UpdateGatewayRouteWafStatusResponseBodyDataRouteServices build(java.util.Map<String, ?> map) throws Exception {
            UpdateGatewayRouteWafStatusResponseBodyDataRouteServices self = new UpdateGatewayRouteWafStatusResponseBodyDataRouteServices();
            return TeaModel.build(map, self);
        }

        public UpdateGatewayRouteWafStatusResponseBodyDataRouteServices setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public UpdateGatewayRouteWafStatusResponseBodyDataRouteServices setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateGatewayRouteWafStatusResponseBodyDataRouteServices setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public UpdateGatewayRouteWafStatusResponseBodyDataRouteServices setPercent(Integer percent) {
            this.percent = percent;
            return this;
        }
        public Integer getPercent() {
            return this.percent;
        }

        public UpdateGatewayRouteWafStatusResponseBodyDataRouteServices setServiceId(Long serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public Long getServiceId() {
            return this.serviceId;
        }

        public UpdateGatewayRouteWafStatusResponseBodyDataRouteServices setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public UpdateGatewayRouteWafStatusResponseBodyDataRouteServices setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public UpdateGatewayRouteWafStatusResponseBodyDataRouteServices setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class UpdateGatewayRouteWafStatusResponseBodyDataTimeout extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("TimeUnit")
        public String timeUnit;

        @NameInMap("UnitNum")
        public Integer unitNum;

        public static UpdateGatewayRouteWafStatusResponseBodyDataTimeout build(java.util.Map<String, ?> map) throws Exception {
            UpdateGatewayRouteWafStatusResponseBodyDataTimeout self = new UpdateGatewayRouteWafStatusResponseBodyDataTimeout();
            return TeaModel.build(map, self);
        }

        public UpdateGatewayRouteWafStatusResponseBodyDataTimeout setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateGatewayRouteWafStatusResponseBodyDataTimeout setTimeUnit(String timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }
        public String getTimeUnit() {
            return this.timeUnit;
        }

        public UpdateGatewayRouteWafStatusResponseBodyDataTimeout setUnitNum(Integer unitNum) {
            this.unitNum = unitNum;
            return this;
        }
        public Integer getUnitNum() {
            return this.unitNum;
        }

    }

    public static class UpdateGatewayRouteWafStatusResponseBodyData extends TeaModel {
        @NameInMap("Cors")
        public UpdateGatewayRouteWafStatusResponseBodyDataCors cors;

        @NameInMap("DefaultServiceId")
        public Long defaultServiceId;

        @NameInMap("DefaultServiceName")
        public String defaultServiceName;

        @NameInMap("DestinationType")
        public String destinationType;

        @NameInMap("DirectResponse")
        public UpdateGatewayRouteWafStatusResponseBodyDataDirectResponse directResponse;

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
        public UpdateGatewayRouteWafStatusResponseBodyDataHTTPRewrite HTTPRewrite;

        @NameInMap("HeaderOp")
        public UpdateGatewayRouteWafStatusResponseBodyDataHeaderOp headerOp;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Predicates")
        public String predicates;

        @NameInMap("Redirect")
        public UpdateGatewayRouteWafStatusResponseBodyDataRedirect redirect;

        @NameInMap("Retry")
        public UpdateGatewayRouteWafStatusResponseBodyDataRetry retry;

        @NameInMap("RouteOrder")
        public Integer routeOrder;

        @NameInMap("RoutePredicates")
        public UpdateGatewayRouteWafStatusResponseBodyDataRoutePredicates routePredicates;

        @NameInMap("RouteServices")
        public java.util.List<UpdateGatewayRouteWafStatusResponseBodyDataRouteServices> routeServices;

        @NameInMap("Services")
        public String services;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("Timeout")
        public UpdateGatewayRouteWafStatusResponseBodyDataTimeout timeout;

        public static UpdateGatewayRouteWafStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateGatewayRouteWafStatusResponseBodyData self = new UpdateGatewayRouteWafStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateGatewayRouteWafStatusResponseBodyData setCors(UpdateGatewayRouteWafStatusResponseBodyDataCors cors) {
            this.cors = cors;
            return this;
        }
        public UpdateGatewayRouteWafStatusResponseBodyDataCors getCors() {
            return this.cors;
        }

        public UpdateGatewayRouteWafStatusResponseBodyData setDefaultServiceId(Long defaultServiceId) {
            this.defaultServiceId = defaultServiceId;
            return this;
        }
        public Long getDefaultServiceId() {
            return this.defaultServiceId;
        }

        public UpdateGatewayRouteWafStatusResponseBodyData setDefaultServiceName(String defaultServiceName) {
            this.defaultServiceName = defaultServiceName;
            return this;
        }
        public String getDefaultServiceName() {
            return this.defaultServiceName;
        }

        public UpdateGatewayRouteWafStatusResponseBodyData setDestinationType(String destinationType) {
            this.destinationType = destinationType;
            return this;
        }
        public String getDestinationType() {
            return this.destinationType;
        }

        public UpdateGatewayRouteWafStatusResponseBodyData setDirectResponse(UpdateGatewayRouteWafStatusResponseBodyDataDirectResponse directResponse) {
            this.directResponse = directResponse;
            return this;
        }
        public UpdateGatewayRouteWafStatusResponseBodyDataDirectResponse getDirectResponse() {
            return this.directResponse;
        }

        public UpdateGatewayRouteWafStatusResponseBodyData setDomainId(Long domainId) {
            this.domainId = domainId;
            return this;
        }
        public Long getDomainId() {
            return this.domainId;
        }

        public UpdateGatewayRouteWafStatusResponseBodyData setDomainIdList(java.util.List<Long> domainIdList) {
            this.domainIdList = domainIdList;
            return this;
        }
        public java.util.List<Long> getDomainIdList() {
            return this.domainIdList;
        }

        public UpdateGatewayRouteWafStatusResponseBodyData setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public UpdateGatewayRouteWafStatusResponseBodyData setDomainNameList(java.util.List<String> domainNameList) {
            this.domainNameList = domainNameList;
            return this;
        }
        public java.util.List<String> getDomainNameList() {
            return this.domainNameList;
        }

        public UpdateGatewayRouteWafStatusResponseBodyData setEnableWaf(Boolean enableWaf) {
            this.enableWaf = enableWaf;
            return this;
        }
        public Boolean getEnableWaf() {
            return this.enableWaf;
        }

        public UpdateGatewayRouteWafStatusResponseBodyData setGatewayId(Long gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public Long getGatewayId() {
            return this.gatewayId;
        }

        public UpdateGatewayRouteWafStatusResponseBodyData setGatewayUniqueId(String gatewayUniqueId) {
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        public UpdateGatewayRouteWafStatusResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public UpdateGatewayRouteWafStatusResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public UpdateGatewayRouteWafStatusResponseBodyData setHTTPRewrite(UpdateGatewayRouteWafStatusResponseBodyDataHTTPRewrite HTTPRewrite) {
            this.HTTPRewrite = HTTPRewrite;
            return this;
        }
        public UpdateGatewayRouteWafStatusResponseBodyDataHTTPRewrite getHTTPRewrite() {
            return this.HTTPRewrite;
        }

        public UpdateGatewayRouteWafStatusResponseBodyData setHeaderOp(UpdateGatewayRouteWafStatusResponseBodyDataHeaderOp headerOp) {
            this.headerOp = headerOp;
            return this;
        }
        public UpdateGatewayRouteWafStatusResponseBodyDataHeaderOp getHeaderOp() {
            return this.headerOp;
        }

        public UpdateGatewayRouteWafStatusResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateGatewayRouteWafStatusResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateGatewayRouteWafStatusResponseBodyData setPredicates(String predicates) {
            this.predicates = predicates;
            return this;
        }
        public String getPredicates() {
            return this.predicates;
        }

        public UpdateGatewayRouteWafStatusResponseBodyData setRedirect(UpdateGatewayRouteWafStatusResponseBodyDataRedirect redirect) {
            this.redirect = redirect;
            return this;
        }
        public UpdateGatewayRouteWafStatusResponseBodyDataRedirect getRedirect() {
            return this.redirect;
        }

        public UpdateGatewayRouteWafStatusResponseBodyData setRetry(UpdateGatewayRouteWafStatusResponseBodyDataRetry retry) {
            this.retry = retry;
            return this;
        }
        public UpdateGatewayRouteWafStatusResponseBodyDataRetry getRetry() {
            return this.retry;
        }

        public UpdateGatewayRouteWafStatusResponseBodyData setRouteOrder(Integer routeOrder) {
            this.routeOrder = routeOrder;
            return this;
        }
        public Integer getRouteOrder() {
            return this.routeOrder;
        }

        public UpdateGatewayRouteWafStatusResponseBodyData setRoutePredicates(UpdateGatewayRouteWafStatusResponseBodyDataRoutePredicates routePredicates) {
            this.routePredicates = routePredicates;
            return this;
        }
        public UpdateGatewayRouteWafStatusResponseBodyDataRoutePredicates getRoutePredicates() {
            return this.routePredicates;
        }

        public UpdateGatewayRouteWafStatusResponseBodyData setRouteServices(java.util.List<UpdateGatewayRouteWafStatusResponseBodyDataRouteServices> routeServices) {
            this.routeServices = routeServices;
            return this;
        }
        public java.util.List<UpdateGatewayRouteWafStatusResponseBodyDataRouteServices> getRouteServices() {
            return this.routeServices;
        }

        public UpdateGatewayRouteWafStatusResponseBodyData setServices(String services) {
            this.services = services;
            return this;
        }
        public String getServices() {
            return this.services;
        }

        public UpdateGatewayRouteWafStatusResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public UpdateGatewayRouteWafStatusResponseBodyData setTimeout(UpdateGatewayRouteWafStatusResponseBodyDataTimeout timeout) {
            this.timeout = timeout;
            return this;
        }
        public UpdateGatewayRouteWafStatusResponseBodyDataTimeout getTimeout() {
            return this.timeout;
        }

    }

}
