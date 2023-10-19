// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetGatewayRouteDetailResponseBody extends TeaModel {
    /**
     * <p>The status code returned. A value of 200 indicates that the request is successful.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public GetGatewayRouteDetailResponseBodyData data;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message returned if the request failed.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   `true`: The request was successful.</p>
     * <p>*   `false`: The request failed.</p>
     */
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
        /**
         * <p>The credentials allowed.</p>
         */
        @NameInMap("AllowCredentials")
        public Boolean allowCredentials;

        /**
         * <p>The headers allowed.</p>
         */
        @NameInMap("AllowHeaders")
        public String allowHeaders;

        /**
         * <p>The methods allowed.</p>
         */
        @NameInMap("AllowMethods")
        public String allowMethods;

        /**
         * <p>The origins allowed.</p>
         */
        @NameInMap("AllowOrigins")
        public String allowOrigins;

        /**
         * <p>The response headers.</p>
         */
        @NameInMap("ExposeHeaders")
        public String exposeHeaders;

        /**
         * <p>The status.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time unit.</p>
         */
        @NameInMap("TimeUnit")
        public String timeUnit;

        /**
         * <p>The unit number.</p>
         */
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
        /**
         * <p>The mock return value.</p>
         */
        @NameInMap("Body")
        public String body;

        /**
         * <p>The response code returned.</p>
         */
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
        /**
         * <p>The protocol type.</p>
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
         * <p>The service ID.</p>
         */
        @NameInMap("ServiceId")
        public Long serviceId;

        /**
         * <p>The service name.</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        /**
         * <p>The port number of the service.</p>
         */
        @NameInMap("ServicePort")
        public Integer servicePort;

        /**
         * <p>The source type of the service.</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The service version.</p>
         */
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

    public static class GetGatewayRouteDetailResponseBodyDataFlowMirror extends TeaModel {
        /**
         * <p>流量复制比例（%），取值0-100。</p>
         */
        @NameInMap("Percentage")
        public Integer percentage;

        /**
         * <p>目标服务端口。</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>开启状态，取值：</p>
         * <br>
         * <p>- on：开启</p>
         * <p>- off：关闭</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>目标服务ID。</p>
         */
        @NameInMap("TargetServiceId")
        public Long targetServiceId;

        /**
         * <p>目标服务名称。</p>
         */
        @NameInMap("TargetServiceName")
        public String targetServiceName;

        public static GetGatewayRouteDetailResponseBodyDataFlowMirror build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayRouteDetailResponseBodyDataFlowMirror self = new GetGatewayRouteDetailResponseBodyDataFlowMirror();
            return TeaModel.build(map, self);
        }

        public GetGatewayRouteDetailResponseBodyDataFlowMirror setPercentage(Integer percentage) {
            this.percentage = percentage;
            return this;
        }
        public Integer getPercentage() {
            return this.percentage;
        }

        public GetGatewayRouteDetailResponseBodyDataFlowMirror setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public GetGatewayRouteDetailResponseBodyDataFlowMirror setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetGatewayRouteDetailResponseBodyDataFlowMirror setTargetServiceId(Long targetServiceId) {
            this.targetServiceId = targetServiceId;
            return this;
        }
        public Long getTargetServiceId() {
            return this.targetServiceId;
        }

        public GetGatewayRouteDetailResponseBodyDataFlowMirror setTargetServiceName(String targetServiceName) {
            this.targetServiceName = targetServiceName;
            return this;
        }
        public String getTargetServiceName() {
            return this.targetServiceName;
        }

    }

    public static class GetGatewayRouteDetailResponseBodyDataHTTPRewrite extends TeaModel {
        /**
         * <p>The hostname of the gateway.</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The path of the node.</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The rewrite type.</p>
         */
        @NameInMap("PathType")
        public String pathType;

        /**
         * <p>The matching pattern.</p>
         */
        @NameInMap("Pattern")
        public String pattern;

        /**
         * <p>The status of the policy.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The replacement.</p>
         */
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
        /**
         * <p>The request or response.</p>
         */
        @NameInMap("DirectionType")
        public String directionType;

        /**
         * <p>The header key.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The type of the operation.</p>
         */
        @NameInMap("OpType")
        public String opType;

        /**
         * <p>The header value.</p>
         */
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
        /**
         * <p>The information about headers.</p>
         */
        @NameInMap("HeaderOpItems")
        public java.util.List<GetGatewayRouteDetailResponseBodyDataHeaderOpHeaderOpItems> headerOpItems;

        /**
         * <p>The status.</p>
         */
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
        /**
         * <p>The response code returned.</p>
         */
        @NameInMap("Code")
        public Integer code;

        /**
         * <p>The hostname.</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The path.</p>
         */
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
        /**
         * <p>The number of retries allowed.</p>
         */
        @NameInMap("Attempts")
        public Integer attempts;

        /**
         * <p>The HTTP status codes.</p>
         */
        @NameInMap("HttpCodes")
        public java.util.List<String> httpCodes;

        /**
         * <p>The retry condition.</p>
         */
        @NameInMap("RetryOn")
        public java.util.List<String> retryOn;

        /**
         * <p>The retry status.</p>
         */
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
        /**
         * <p>The key of the request header.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The route type.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The value of the request header.</p>
         */
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
        /**
         * <p>Indicates whether case sensitivity is ignored.</p>
         */
        @NameInMap("IgnoreCase")
        public Boolean ignoreCase;

        /**
         * <p>The path.</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The matching type.</p>
         */
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
        /**
         * <p>The parameter name.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The route type.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The value of the parameter.</p>
         */
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
        /**
         * <p>The information about header matching.</p>
         */
        @NameInMap("HeaderPredicates")
        public java.util.List<GetGatewayRouteDetailResponseBodyDataRoutePredicatesHeaderPredicates> headerPredicates;

        /**
         * <p>The information about method matching.</p>
         */
        @NameInMap("MethodPredicates")
        public java.util.List<String> methodPredicates;

        /**
         * <p>The information about route matching.</p>
         */
        @NameInMap("PathPredicates")
        public GetGatewayRouteDetailResponseBodyDataRoutePredicatesPathPredicates pathPredicates;

        /**
         * <p>The information about parameter matching.</p>
         */
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
        /**
         * <p>The protocol type.</p>
         */
        @NameInMap("AgreementType")
        public String agreementType;

        /**
         * <p>The name of the group to which the service belongs.</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The service name.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The namespace.</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The weight.</p>
         */
        @NameInMap("Percent")
        public Integer percent;

        /**
         * <p>The service ID.</p>
         */
        @NameInMap("ServiceId")
        public Long serviceId;

        /**
         * <p>The service name.</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        /**
         * <p>The port number of the service.</p>
         */
        @NameInMap("ServicePort")
        public Integer servicePort;

        /**
         * <p>The source type of the service.</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The service version.</p>
         */
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
        /**
         * <p>The status.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time unit.</p>
         */
        @NameInMap("TimeUnit")
        public String timeUnit;

        /**
         * <p>The unit number.</p>
         */
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
        /**
         * <p>The status of Application High Availability Service (AHAS).</p>
         */
        @NameInMap("AhasStatus")
        public Integer ahasStatus;

        /**
         * <p>The configuration for cross-origin resource sharing (CORS).</p>
         */
        @NameInMap("Cors")
        public GetGatewayRouteDetailResponseBodyDataCors cors;

        /**
         * <p>The default service ID.</p>
         */
        @NameInMap("DefaultServiceId")
        public Long defaultServiceId;

        /**
         * <p>The default service name.</p>
         */
        @NameInMap("DefaultServiceName")
        public String defaultServiceName;

        /**
         * <p>The destination service type.</p>
         */
        @NameInMap("DestinationType")
        public String destinationType;

        /**
         * <p>The information about service mocking.</p>
         */
        @NameInMap("DirectResponse")
        public GetGatewayRouteDetailResponseBodyDataDirectResponse directResponse;

        /**
         * <p>The domain ID.</p>
         */
        @NameInMap("DomainId")
        public Long domainId;

        /**
         * <p>The IDs of domains.</p>
         */
        @NameInMap("DomainIdList")
        public java.util.List<Long> domainIdList;

        /**
         * <p>The domain name.</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The list of domain names.</p>
         */
        @NameInMap("DomainNameList")
        public java.util.List<String> domainNameList;

        /**
         * <p>Indicates whether Web Application Firewall (WAF) is activated.</p>
         */
        @NameInMap("EnableWaf")
        public Boolean enableWaf;

        /**
         * <p>Indicates whether the Fallback service is enabled.</p>
         */
        @NameInMap("Fallback")
        public Boolean fallback;

        /**
         * <p>The information of the Fallback service.</p>
         */
        @NameInMap("FallbackServices")
        public java.util.List<GetGatewayRouteDetailResponseBodyDataFallbackServices> fallbackServices;

        /**
         * <p>流量镜像配置。</p>
         */
        @NameInMap("FlowMirror")
        public GetGatewayRouteDetailResponseBodyDataFlowMirror flowMirror;

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
         * <p>The creation time.</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The last modification time.</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The information about the rewrite policy.</p>
         */
        @NameInMap("HTTPRewrite")
        public GetGatewayRouteDetailResponseBodyDataHTTPRewrite HTTPRewrite;

        /**
         * <p>The header settings.</p>
         */
        @NameInMap("HeaderOp")
        public GetGatewayRouteDetailResponseBodyDataHeaderOp headerOp;

        /**
         * <p>The ID.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The routing policy in a JSON string.</p>
         */
        @NameInMap("Policies")
        public String policies;

        /**
         * <p>The matching conditions.</p>
         */
        @NameInMap("Predicates")
        public String predicates;

        /**
         * <p>The configuration of the redirection.</p>
         */
        @NameInMap("Redirect")
        public GetGatewayRouteDetailResponseBodyDataRedirect redirect;

        /**
         * <p>The retry configuration.</p>
         */
        @NameInMap("Retry")
        public GetGatewayRouteDetailResponseBodyDataRetry retry;

        /**
         * <p>The sequence number of the route.</p>
         */
        @NameInMap("RouteOrder")
        public Integer routeOrder;

        /**
         * <p>The information about route matching.</p>
         */
        @NameInMap("RoutePredicates")
        public GetGatewayRouteDetailResponseBodyDataRoutePredicates routePredicates;

        /**
         * <p>The services.</p>
         */
        @NameInMap("RouteServices")
        public java.util.List<GetGatewayRouteDetailResponseBodyDataRouteServices> routeServices;

        /**
         * <p>The configurations of services.</p>
         */
        @NameInMap("Services")
        public String services;

        /**
         * <p>The status of the route. Valid values:</p>
         * <br>
         * <p>*   0: unpublished</p>
         * <p>*   2: publishing</p>
         * <p>*   3: published</p>
         * <p>*   4: editing (updated but not published)</p>
         * <p>*   5: unpublishing</p>
         * <p>*   6: unavailable</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The timeout configuration.</p>
         */
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

        public GetGatewayRouteDetailResponseBodyData setFlowMirror(GetGatewayRouteDetailResponseBodyDataFlowMirror flowMirror) {
            this.flowMirror = flowMirror;
            return this;
        }
        public GetGatewayRouteDetailResponseBodyDataFlowMirror getFlowMirror() {
            return this.flowMirror;
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

        public GetGatewayRouteDetailResponseBodyData setPolicies(String policies) {
            this.policies = policies;
            return this;
        }
        public String getPolicies() {
            return this.policies;
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
