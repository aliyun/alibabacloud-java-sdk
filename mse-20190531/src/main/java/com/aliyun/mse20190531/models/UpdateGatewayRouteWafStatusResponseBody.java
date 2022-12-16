// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayRouteWafStatusResponseBody extends TeaModel {
    // The status code returned. A value of 200 indicates that the request is successful.
    @NameInMap("Code")
    public Integer code;

    // The returned data.
    @NameInMap("Data")
    public UpdateGatewayRouteWafStatusResponseBodyData data;

    // The HTTP status code.
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // The response message.
    @NameInMap("Message")
    public String message;

    // ID of the Request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request was successful. Valid values:
    // 
    // *   `true`: The request was successful.
    // *   `false`: The request failed.
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
        // The credentials allowed.
        @NameInMap("AllowCredentials")
        public Boolean allowCredentials;

        // The headers allowed.
        @NameInMap("AllowHeaders")
        public String allowHeaders;

        // The methods allowed.
        @NameInMap("AllowMethods")
        public String allowMethods;

        // The origins allowed.
        @NameInMap("AllowOrigins")
        public String allowOrigins;

        // The response headers.
        @NameInMap("ExposeHeaders")
        public String exposeHeaders;

        // The status.
        @NameInMap("Status")
        public String status;

        // The time unit.
        @NameInMap("TimeUnit")
        public String timeUnit;

        // The unit number.
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
        // The mock return value.
        @NameInMap("Body")
        public String body;

        // The return value.
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
        // The domain name.
        @NameInMap("Host")
        public String host;

        // The HTTP request path.
        @NameInMap("Path")
        public String path;

        // The path type of the HTTP request.
        @NameInMap("PathType")
        public String pathType;

        // The matching pattern.
        @NameInMap("Pattern")
        public String pattern;

        // The HTTP status.
        @NameInMap("Status")
        public String status;

        // The replacement.
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
        // The request or response.
        @NameInMap("DirectionType")
        public String directionType;

        // Header Key.
        @NameInMap("Key")
        public String key;

        // The operation type.
        @NameInMap("OpType")
        public String opType;

        // The header value.
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
        // The policy.
        @NameInMap("HeaderOpItems")
        public java.util.List<UpdateGatewayRouteWafStatusResponseBodyDataHeaderOpHeaderOpItems> headerOpItems;

        // The status.
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
        // The response code returned.
        @NameInMap("Code")
        public Integer code;

        // The hostname.
        @NameInMap("Host")
        public String host;

        // The path.
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
        // The number of retries allowed for a request.
        @NameInMap("Attempts")
        public Integer attempts;

        // The HTTP status code.
        @NameInMap("HttpCodes")
        public java.util.List<String> httpCodes;

        // The retry condition.
        @NameInMap("RetryOn")
        public java.util.List<String> retryOn;

        // The retry status.
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
        // The key of the request header.
        @NameInMap("Key")
        public String key;

        // The matching type.
        @NameInMap("Type")
        public String type;

        // The value of the request header.
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
        // Indicates whether case sensitivity is ignored.
        @NameInMap("IgnoreCase")
        public Boolean ignoreCase;

        // The path.
        @NameInMap("Path")
        public String path;

        // The matching type.
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
        // The name of the parameter.
        @NameInMap("Key")
        public String key;

        // The type.
        @NameInMap("Type")
        public String type;

        // The value of the parameter.
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
        // The rules for matching based on request headers.
        @NameInMap("HeaderPredicates")
        public java.util.List<UpdateGatewayRouteWafStatusResponseBodyDataRoutePredicatesHeaderPredicates> headerPredicates;

        // The information about method matching.
        @NameInMap("MethodPredicates")
        public java.util.List<String> methodPredicates;

        // The information about route matching.
        @NameInMap("PathPredicates")
        public UpdateGatewayRouteWafStatusResponseBodyDataRoutePredicatesPathPredicates pathPredicates;

        // The information about parameter matching.
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
        // The name of the group to which the service belongs.
        @NameInMap("GroupName")
        public String groupName;

        // The name of the service.
        @NameInMap("Name")
        public String name;

        // The namespace.
        @NameInMap("Namespace")
        public String namespace;

        // The weight.
        @NameInMap("Percent")
        public Integer percent;

        // The ID of the service.
        @NameInMap("ServiceId")
        public Long serviceId;

        // The name of the service.
        @NameInMap("ServiceName")
        public String serviceName;

        // The source type of the service.
        @NameInMap("SourceType")
        public String sourceType;

        // The version of the service.
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
        // The status.
        @NameInMap("Status")
        public String status;

        // The time unit.
        @NameInMap("TimeUnit")
        public String timeUnit;

        // The unit number.
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
        // The configuration for cross-origin resource sharing (CORS).
        @NameInMap("Cors")
        public UpdateGatewayRouteWafStatusResponseBodyDataCors cors;

        // The default service ID.
        @NameInMap("DefaultServiceId")
        public Long defaultServiceId;

        // The default service name.
        @NameInMap("DefaultServiceName")
        public String defaultServiceName;

        // The destination service type.
        @NameInMap("DestinationType")
        public String destinationType;

        // The information about service mocking.
        @NameInMap("DirectResponse")
        public UpdateGatewayRouteWafStatusResponseBodyDataDirectResponse directResponse;

        // The ID of the domain name.
        @NameInMap("DomainId")
        public Long domainId;

        // The IDs of the domain names.
        @NameInMap("DomainIdList")
        public java.util.List<Long> domainIdList;

        // The domain name.
        @NameInMap("DomainName")
        public String domainName;

        // The domain names.
        @NameInMap("DomainNameList")
        public java.util.List<String> domainNameList;

        // Indicates whether WAF is enabled.
        @NameInMap("EnableWaf")
        public Boolean enableWaf;

        // The ID of the gateway.
        @NameInMap("GatewayId")
        public Long gatewayId;

        // The unique ID of the gateway.
        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        // The creation time.
        @NameInMap("GmtCreate")
        public String gmtCreate;

        // The modification time.
        @NameInMap("GmtModified")
        public String gmtModified;

        // The information about the rewrite policy.
        @NameInMap("HTTPRewrite")
        public UpdateGatewayRouteWafStatusResponseBodyDataHTTPRewrite HTTPRewrite;

        // The information about the header configuration policy.
        @NameInMap("HeaderOp")
        public UpdateGatewayRouteWafStatusResponseBodyDataHeaderOp headerOp;

        // The ID of the route.
        @NameInMap("Id")
        public Long id;

        // The name of the route.
        @NameInMap("Name")
        public String name;

        // The matching rule.
        @NameInMap("Predicates")
        public String predicates;

        // The configuration of the redirection.
        @NameInMap("Redirect")
        public UpdateGatewayRouteWafStatusResponseBodyDataRedirect redirect;

        // The retry configuration.
        @NameInMap("Retry")
        public UpdateGatewayRouteWafStatusResponseBodyDataRetry retry;

        // The sequence number of the route.
        @NameInMap("RouteOrder")
        public Integer routeOrder;

        // The information about route matching.
        @NameInMap("RoutePredicates")
        public UpdateGatewayRouteWafStatusResponseBodyDataRoutePredicates routePredicates;

        // The information about services.
        @NameInMap("RouteServices")
        public java.util.List<UpdateGatewayRouteWafStatusResponseBodyDataRouteServices> routeServices;

        // The information about services.
        @NameInMap("Services")
        public String services;

        // The status of the route.
        @NameInMap("Status")
        public Integer status;

        // The timeout configuration.
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
