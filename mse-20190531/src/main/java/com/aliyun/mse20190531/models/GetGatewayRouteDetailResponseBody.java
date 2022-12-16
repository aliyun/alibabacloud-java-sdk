// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetGatewayRouteDetailResponseBody extends TeaModel {
    // The status code returned. A value of 200 indicates that the request is successful.
    @NameInMap("Code")
    public Integer code;

    // The returned data.
    @NameInMap("Data")
    public GetGatewayRouteDetailResponseBodyData data;

    // The HTTP status code.
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // The error message.
    @NameInMap("Message")
    public String message;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request was successful. Valid values:
    // 
    // *   `true`: The request was successful.
    // *   `false`: The request failed.
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
        // The mock return value.
        @NameInMap("Body")
        public String body;

        // The response code returned.
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

    public static class GetGatewayRouteDetailResponseBodyDataFallbackServices extends TeaModel {
        // The type of the protocol.
        @NameInMap("AgreementType")
        public String agreementType;

        // The name of the group to which the service belongs.
        @NameInMap("GroupName")
        public String groupName;

        // The name.
        @NameInMap("Name")
        public String name;

        // The namespace to which the service belongs.
        @NameInMap("Namespace")
        public String namespace;

        // The weight in the form of a percentage value.
        @NameInMap("Percent")
        public Integer percent;

        // The ID of the service.
        @NameInMap("ServiceId")
        public Long serviceId;

        // The name of the service.
        @NameInMap("ServiceName")
        public String serviceName;

        // The service port.
        @NameInMap("ServicePort")
        public Integer servicePort;

        // The type of the service source.
        @NameInMap("SourceType")
        public String sourceType;

        // The version of the service.
        @NameInMap("Version")
        public String version;

        public static GetGatewayRouteDetailResponseBodyDataFallbackServices build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayRouteDetailResponseBodyDataFallbackServices self = new GetGatewayRouteDetailResponseBodyDataFallbackServices();
            return TeaModel.build(map, self);
        }

        public GetGatewayRouteDetailResponseBodyDataFallbackServices setAgreementType(String agreementType) {
            this.agreementType = agreementType;
            return this;
        }
        public String getAgreementType() {
            return this.agreementType;
        }

        public GetGatewayRouteDetailResponseBodyDataFallbackServices setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public GetGatewayRouteDetailResponseBodyDataFallbackServices setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetGatewayRouteDetailResponseBodyDataFallbackServices setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public GetGatewayRouteDetailResponseBodyDataFallbackServices setPercent(Integer percent) {
            this.percent = percent;
            return this;
        }
        public Integer getPercent() {
            return this.percent;
        }

        public GetGatewayRouteDetailResponseBodyDataFallbackServices setServiceId(Long serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public Long getServiceId() {
            return this.serviceId;
        }

        public GetGatewayRouteDetailResponseBodyDataFallbackServices setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public GetGatewayRouteDetailResponseBodyDataFallbackServices setServicePort(Integer servicePort) {
            this.servicePort = servicePort;
            return this;
        }
        public Integer getServicePort() {
            return this.servicePort;
        }

        public GetGatewayRouteDetailResponseBodyDataFallbackServices setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public GetGatewayRouteDetailResponseBodyDataFallbackServices setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetGatewayRouteDetailResponseBodyDataHTTPRewrite extends TeaModel {
        // The hostname of the gateway.
        @NameInMap("Host")
        public String host;

        // The path of the node.
        @NameInMap("Path")
        public String path;

        // The rewrite type.
        @NameInMap("PathType")
        public String pathType;

        // The matching pattern.
        @NameInMap("Pattern")
        public String pattern;

        // The status of the policy.
        @NameInMap("Status")
        public String status;

        // The replacement.
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
        // The information about headers.
        @NameInMap("HeaderOpItems")
        public java.util.List<GetGatewayRouteDetailResponseBodyDataHeaderOpHeaderOpItems> headerOpItems;

        // The status.
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
        // The response code returned.
        @NameInMap("Code")
        public Integer code;

        // The hostname.
        @NameInMap("Host")
        public String host;

        // The path.
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
        // The number of retries allowed.
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
        // The key of the request header.
        @NameInMap("Key")
        public String key;

        // The type.
        @NameInMap("Type")
        public String type;

        // The value of the request header.
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
        // Indicates whether case sensitivity is ignored.
        @NameInMap("IgnoreCase")
        public Boolean ignoreCase;

        // The path.
        @NameInMap("Path")
        public String path;

        // The matching type.
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
        // The name of the parameter.
        @NameInMap("Key")
        public String key;

        // The type.
        @NameInMap("Type")
        public String type;

        // The value of the parameter.
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
        // The information about header matching.
        @NameInMap("HeaderPredicates")
        public java.util.List<GetGatewayRouteDetailResponseBodyDataRoutePredicatesHeaderPredicates> headerPredicates;

        // The information about method matching.
        @NameInMap("MethodPredicates")
        public java.util.List<String> methodPredicates;

        // The information about route matching.
        @NameInMap("PathPredicates")
        public GetGatewayRouteDetailResponseBodyDataRoutePredicatesPathPredicates pathPredicates;

        // The information about parameter matching.
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
        // The type of the protocol.
        @NameInMap("AgreementType")
        public String agreementType;

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

        // The service port.
        @NameInMap("ServicePort")
        public Integer servicePort;

        // The source type of the service.
        @NameInMap("SourceType")
        public String sourceType;

        // The version of the service.
        @NameInMap("Version")
        public String version;

        public static GetGatewayRouteDetailResponseBodyDataRouteServices build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayRouteDetailResponseBodyDataRouteServices self = new GetGatewayRouteDetailResponseBodyDataRouteServices();
            return TeaModel.build(map, self);
        }

        public GetGatewayRouteDetailResponseBodyDataRouteServices setAgreementType(String agreementType) {
            this.agreementType = agreementType;
            return this;
        }
        public String getAgreementType() {
            return this.agreementType;
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

        public GetGatewayRouteDetailResponseBodyDataRouteServices setServicePort(Integer servicePort) {
            this.servicePort = servicePort;
            return this;
        }
        public Integer getServicePort() {
            return this.servicePort;
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
        // The status.
        @NameInMap("Status")
        public String status;

        // The time unit.
        @NameInMap("TimeUnit")
        public String timeUnit;

        // The unit number.
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
        // The status of Application High Availability Service (AHAS).
        @NameInMap("AhasStatus")
        public Integer ahasStatus;

        // The configuration for cross-origin resource sharing (CORS).
        @NameInMap("Cors")
        public GetGatewayRouteDetailResponseBodyDataCors cors;

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
        public GetGatewayRouteDetailResponseBodyDataDirectResponse directResponse;

        // The ID of the domain name.
        @NameInMap("DomainId")
        public Long domainId;

        // The domain names.
        @NameInMap("DomainIdList")
        public java.util.List<Long> domainIdList;

        // The domain name.
        @NameInMap("DomainName")
        public String domainName;

        // The domain names.
        @NameInMap("DomainNameList")
        public java.util.List<String> domainNameList;

        // Indicates whether Web Application Firewall (WAF) is enabled.
        @NameInMap("EnableWaf")
        public Boolean enableWaf;

        // Indicates whether the Fallback service is enabled.
        @NameInMap("Fallback")
        public Boolean fallback;

        // The information of the Fallback service.
        @NameInMap("FallbackServices")
        public java.util.List<GetGatewayRouteDetailResponseBodyDataFallbackServices> fallbackServices;

        // The ID of the gateway.
        @NameInMap("GatewayId")
        public Long gatewayId;

        // The unique ID of the gateway.
        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        // The creation time.
        @NameInMap("GmtCreate")
        public String gmtCreate;

        // The last modification time.
        @NameInMap("GmtModified")
        public String gmtModified;

        // The information about the rewrite policy.
        @NameInMap("HTTPRewrite")
        public GetGatewayRouteDetailResponseBodyDataHTTPRewrite HTTPRewrite;

        // The information about the header configuration policy.
        @NameInMap("HeaderOp")
        public GetGatewayRouteDetailResponseBodyDataHeaderOp headerOp;

        // ID.
        @NameInMap("Id")
        public Long id;

        // The name.
        @NameInMap("Name")
        public String name;

        // The matching conditions.
        @NameInMap("Predicates")
        public String predicates;

        // The configuration of the redirection.
        @NameInMap("Redirect")
        public GetGatewayRouteDetailResponseBodyDataRedirect redirect;

        // The retry configuration.
        @NameInMap("Retry")
        public GetGatewayRouteDetailResponseBodyDataRetry retry;

        // The sequence number of the route.
        @NameInMap("RouteOrder")
        public Integer routeOrder;

        // The information about route matching.
        @NameInMap("RoutePredicates")
        public GetGatewayRouteDetailResponseBodyDataRoutePredicates routePredicates;

        // The information about services.
        @NameInMap("RouteServices")
        public java.util.List<GetGatewayRouteDetailResponseBodyDataRouteServices> routeServices;

        // The configurations of services.
        @NameInMap("Services")
        public String services;

        // The status of the route.
        // 
        // *   0: unpublished
        // *   2: publishing
        // *   3: published
        // *   4: editing (updated but not published)
        // *   5: unpublishing
        // *   6: unavailable
        @NameInMap("Status")
        public Integer status;

        // The timeout configuration.
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

        public GetGatewayRouteDetailResponseBodyData setFallback(Boolean fallback) {
            this.fallback = fallback;
            return this;
        }
        public Boolean getFallback() {
            return this.fallback;
        }

        public GetGatewayRouteDetailResponseBodyData setFallbackServices(java.util.List<GetGatewayRouteDetailResponseBodyDataFallbackServices> fallbackServices) {
            this.fallbackServices = fallbackServices;
            return this;
        }
        public java.util.List<GetGatewayRouteDetailResponseBodyDataFallbackServices> getFallbackServices() {
            return this.fallbackServices;
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
