// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetGatewayRouteDetailResponseBody extends TeaModel {
    /**
     * <p>The status code returned. A value of 200 indicates that the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
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
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>You are not authorized to perform this operation.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>FDF2D16C-5D28-5FAA-A56B-30BDE3559880</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><code>true</code>: The request was successful.</li>
     * <li><code>false</code>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AllowCredentials")
        public Boolean allowCredentials;

        /**
         * <p>The headers allowed.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("AllowHeaders")
        public String allowHeaders;

        /**
         * <p>The methods allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>GET,POST,PUT,DELETE,HEAD,OPTIONS,PATCH</p>
         */
        @NameInMap("AllowMethods")
        public String allowMethods;

        /**
         * <p>The origins allowed.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("AllowOrigins")
        public String allowOrigins;

        /**
         * <p>The response headers.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("ExposeHeaders")
        public String exposeHeaders;

        /**
         * <p>The status.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time unit.</p>
         * 
         * <strong>example:</strong>
         * <p>h</p>
         */
        @NameInMap("TimeUnit")
        public String timeUnit;

        /**
         * <p>The unit number.</p>
         * 
         * <strong>example:</strong>
         * <p>24</p>
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
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Body")
        public String body;

        /**
         * <p>The response code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
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
         * 
         * <strong>example:</strong>
         * <p>DUBBO</p>
         */
        @NameInMap("AgreementType")
        public String agreementType;

        /**
         * <p>The name of the group to which the service belongs.</p>
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
         * <p>The namespace to which the service belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>namespace</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The weight in the form of a percentage value.</p>
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
         * <p>1</p>
         */
        @NameInMap("ServiceId")
        public Long serviceId;

        /**
         * <p>The service name.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        /**
         * <p>The port number of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>8848</p>
         */
        @NameInMap("ServicePort")
        public Integer servicePort;

        /**
         * <p>The source type of the service.</p>
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
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("Percentage")
        public Integer percentage;

        /**
         * <p>目标服务端口。</p>
         * 
         * <strong>example:</strong>
         * <p>8790</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>开启状态，取值：</p>
         * <ul>
         * <li>on：开启</li>
         * <li>off：关闭</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>目标服务ID。</p>
         * 
         * <strong>example:</strong>
         * <p>21</p>
         */
        @NameInMap("TargetServiceId")
        public Long targetServiceId;

        /**
         * <p>目标服务名称。</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
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
         * 
         * <strong>example:</strong>
         * <p>aliyuncs.com</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The path of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>/test/client</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The rewrite type.</p>
         * 
         * <strong>example:</strong>
         * <p>PRE</p>
         */
        @NameInMap("PathType")
        public String pathType;

        /**
         * <p>The matching pattern.</p>
         * 
         * <strong>example:</strong>
         * <p>/test</p>
         */
        @NameInMap("Pattern")
        public String pattern;

        /**
         * <p>The status of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The replacement.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
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
         * 
         * <strong>example:</strong>
         * <p>Response</p>
         */
        @NameInMap("DirectionType")
        public String directionType;

        /**
         * <p>The header key.</p>
         * 
         * <strong>example:</strong>
         * <p>debug</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The type of the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>Add</p>
         */
        @NameInMap("OpType")
        public String opType;

        /**
         * <p>The header value.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
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
         * 
         * <strong>example:</strong>
         * <p>off</p>
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
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Code")
        public Integer code;

        /**
         * <p>The hostname.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The path.</p>
         * 
         * <strong>example:</strong>
         * <p>10111</p>
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
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * 
         * <strong>example:</strong>
         * <p>on</p>
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
         * 
         * <strong>example:</strong>
         * <p>id</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The route type.</p>
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
         * <p>200</p>
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
         * <p>/api</p>
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
         * 
         * <strong>example:</strong>
         * <p>userid</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The route type.</p>
         * 
         * <strong>example:</strong>
         * <p>PRE</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The value of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
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

    public static class GetGatewayRouteDetailResponseBodyDataRouteServicesHttpDubboTranscoderMothedMapListParamMapsList extends TeaModel {
        @NameInMap("ExtractKey")
        public String extractKey;

        @NameInMap("ExtractKeySpec")
        public String extractKeySpec;

        @NameInMap("MappingType")
        public String mappingType;

        public static GetGatewayRouteDetailResponseBodyDataRouteServicesHttpDubboTranscoderMothedMapListParamMapsList build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayRouteDetailResponseBodyDataRouteServicesHttpDubboTranscoderMothedMapListParamMapsList self = new GetGatewayRouteDetailResponseBodyDataRouteServicesHttpDubboTranscoderMothedMapListParamMapsList();
            return TeaModel.build(map, self);
        }

        public GetGatewayRouteDetailResponseBodyDataRouteServicesHttpDubboTranscoderMothedMapListParamMapsList setExtractKey(String extractKey) {
            this.extractKey = extractKey;
            return this;
        }
        public String getExtractKey() {
            return this.extractKey;
        }

        public GetGatewayRouteDetailResponseBodyDataRouteServicesHttpDubboTranscoderMothedMapListParamMapsList setExtractKeySpec(String extractKeySpec) {
            this.extractKeySpec = extractKeySpec;
            return this;
        }
        public String getExtractKeySpec() {
            return this.extractKeySpec;
        }

        public GetGatewayRouteDetailResponseBodyDataRouteServicesHttpDubboTranscoderMothedMapListParamMapsList setMappingType(String mappingType) {
            this.mappingType = mappingType;
            return this;
        }
        public String getMappingType() {
            return this.mappingType;
        }

    }

    public static class GetGatewayRouteDetailResponseBodyDataRouteServicesHttpDubboTranscoderMothedMapList extends TeaModel {
        @NameInMap("DubboMothedName")
        public String dubboMothedName;

        @NameInMap("HttpMothed")
        public String httpMothed;

        @NameInMap("Mothedpath")
        public String mothedpath;

        @NameInMap("ParamMapsList")
        public java.util.List<GetGatewayRouteDetailResponseBodyDataRouteServicesHttpDubboTranscoderMothedMapListParamMapsList> paramMapsList;

        @NameInMap("PassThroughAllHeaders")
        public String passThroughAllHeaders;

        @NameInMap("PassThroughList")
        public java.util.List<String> passThroughList;

        public static GetGatewayRouteDetailResponseBodyDataRouteServicesHttpDubboTranscoderMothedMapList build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayRouteDetailResponseBodyDataRouteServicesHttpDubboTranscoderMothedMapList self = new GetGatewayRouteDetailResponseBodyDataRouteServicesHttpDubboTranscoderMothedMapList();
            return TeaModel.build(map, self);
        }

        public GetGatewayRouteDetailResponseBodyDataRouteServicesHttpDubboTranscoderMothedMapList setDubboMothedName(String dubboMothedName) {
            this.dubboMothedName = dubboMothedName;
            return this;
        }
        public String getDubboMothedName() {
            return this.dubboMothedName;
        }

        public GetGatewayRouteDetailResponseBodyDataRouteServicesHttpDubboTranscoderMothedMapList setHttpMothed(String httpMothed) {
            this.httpMothed = httpMothed;
            return this;
        }
        public String getHttpMothed() {
            return this.httpMothed;
        }

        public GetGatewayRouteDetailResponseBodyDataRouteServicesHttpDubboTranscoderMothedMapList setMothedpath(String mothedpath) {
            this.mothedpath = mothedpath;
            return this;
        }
        public String getMothedpath() {
            return this.mothedpath;
        }

        public GetGatewayRouteDetailResponseBodyDataRouteServicesHttpDubboTranscoderMothedMapList setParamMapsList(java.util.List<GetGatewayRouteDetailResponseBodyDataRouteServicesHttpDubboTranscoderMothedMapListParamMapsList> paramMapsList) {
            this.paramMapsList = paramMapsList;
            return this;
        }
        public java.util.List<GetGatewayRouteDetailResponseBodyDataRouteServicesHttpDubboTranscoderMothedMapListParamMapsList> getParamMapsList() {
            return this.paramMapsList;
        }

        public GetGatewayRouteDetailResponseBodyDataRouteServicesHttpDubboTranscoderMothedMapList setPassThroughAllHeaders(String passThroughAllHeaders) {
            this.passThroughAllHeaders = passThroughAllHeaders;
            return this;
        }
        public String getPassThroughAllHeaders() {
            return this.passThroughAllHeaders;
        }

        public GetGatewayRouteDetailResponseBodyDataRouteServicesHttpDubboTranscoderMothedMapList setPassThroughList(java.util.List<String> passThroughList) {
            this.passThroughList = passThroughList;
            return this;
        }
        public java.util.List<String> getPassThroughList() {
            return this.passThroughList;
        }

    }

    public static class GetGatewayRouteDetailResponseBodyDataRouteServicesHttpDubboTranscoder extends TeaModel {
        @NameInMap("DubboServiceGroup")
        public String dubboServiceGroup;

        @NameInMap("DubboServiceName")
        public String dubboServiceName;

        @NameInMap("DubboServiceVersion")
        public String dubboServiceVersion;

        @NameInMap("MothedMapList")
        public java.util.List<GetGatewayRouteDetailResponseBodyDataRouteServicesHttpDubboTranscoderMothedMapList> mothedMapList;

        public static GetGatewayRouteDetailResponseBodyDataRouteServicesHttpDubboTranscoder build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayRouteDetailResponseBodyDataRouteServicesHttpDubboTranscoder self = new GetGatewayRouteDetailResponseBodyDataRouteServicesHttpDubboTranscoder();
            return TeaModel.build(map, self);
        }

        public GetGatewayRouteDetailResponseBodyDataRouteServicesHttpDubboTranscoder setDubboServiceGroup(String dubboServiceGroup) {
            this.dubboServiceGroup = dubboServiceGroup;
            return this;
        }
        public String getDubboServiceGroup() {
            return this.dubboServiceGroup;
        }

        public GetGatewayRouteDetailResponseBodyDataRouteServicesHttpDubboTranscoder setDubboServiceName(String dubboServiceName) {
            this.dubboServiceName = dubboServiceName;
            return this;
        }
        public String getDubboServiceName() {
            return this.dubboServiceName;
        }

        public GetGatewayRouteDetailResponseBodyDataRouteServicesHttpDubboTranscoder setDubboServiceVersion(String dubboServiceVersion) {
            this.dubboServiceVersion = dubboServiceVersion;
            return this;
        }
        public String getDubboServiceVersion() {
            return this.dubboServiceVersion;
        }

        public GetGatewayRouteDetailResponseBodyDataRouteServicesHttpDubboTranscoder setMothedMapList(java.util.List<GetGatewayRouteDetailResponseBodyDataRouteServicesHttpDubboTranscoderMothedMapList> mothedMapList) {
            this.mothedMapList = mothedMapList;
            return this;
        }
        public java.util.List<GetGatewayRouteDetailResponseBodyDataRouteServicesHttpDubboTranscoderMothedMapList> getMothedMapList() {
            return this.mothedMapList;
        }

    }

    public static class GetGatewayRouteDetailResponseBodyDataRouteServices extends TeaModel {
        /**
         * <p>The protocol type.</p>
         * 
         * <strong>example:</strong>
         * <p>DUBBO</p>
         */
        @NameInMap("AgreementType")
        public String agreementType;

        /**
         * <p>The name of the group to which the service belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>api</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <strong>example:</strong>
         * <p>Health</p>
         */
        @NameInMap("HealthStatus")
        public String healthStatus;

        @NameInMap("HttpDubboTranscoder")
        public GetGatewayRouteDetailResponseBodyDataRouteServicesHttpDubboTranscoder httpDubboTranscoder;

        /**
         * <p>The service name.</p>
         * 
         * <strong>example:</strong>
         * <p>dubbo4</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>acs_ecs_dashboard</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The weight.</p>
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
         * <p>782</p>
         */
        @NameInMap("ServiceId")
        public Long serviceId;

        /**
         * <p>The service name.</p>
         * 
         * <strong>example:</strong>
         * <p>xkc-crm</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        /**
         * <p>The port number of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>20880</p>
         */
        @NameInMap("ServicePort")
        public Integer servicePort;

        /**
         * <p>The source type of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>MSE</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("UnhealthyEndpoints")
        public java.util.List<String> unhealthyEndpoints;

        /**
         * <p>The service version.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
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

        public GetGatewayRouteDetailResponseBodyDataRouteServices setHealthStatus(String healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }
        public String getHealthStatus() {
            return this.healthStatus;
        }

        public GetGatewayRouteDetailResponseBodyDataRouteServices setHttpDubboTranscoder(GetGatewayRouteDetailResponseBodyDataRouteServicesHttpDubboTranscoder httpDubboTranscoder) {
            this.httpDubboTranscoder = httpDubboTranscoder;
            return this;
        }
        public GetGatewayRouteDetailResponseBodyDataRouteServicesHttpDubboTranscoder getHttpDubboTranscoder() {
            return this.httpDubboTranscoder;
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

        public GetGatewayRouteDetailResponseBodyDataRouteServices setUnhealthyEndpoints(java.util.List<String> unhealthyEndpoints) {
            this.unhealthyEndpoints = unhealthyEndpoints;
            return this;
        }
        public java.util.List<String> getUnhealthyEndpoints() {
            return this.unhealthyEndpoints;
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
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time unit.</p>
         * 
         * <strong>example:</strong>
         * <p>s</p>
         */
        @NameInMap("TimeUnit")
        public String timeUnit;

        /**
         * <p>The unit number.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("DefaultServiceId")
        public Long defaultServiceId;

        /**
         * <p>The default service name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DefaultServiceName")
        public String defaultServiceName;

        /**
         * <strong>example:</strong>
         * <p>a route for xxx</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The destination service type.</p>
         * 
         * <strong>example:</strong>
         * <p>Single</p>
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
         * 
         * <strong>example:</strong>
         * <p>235</p>
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
         * 
         * <strong>example:</strong>
         * <p>123.com</p>
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
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableWaf")
        public Boolean enableWaf;

        /**
         * <p>Indicates whether the Fallback service is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("GatewayId")
        public Long gatewayId;

        /**
         * <p>The unique ID of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-7ea3da97b96543e19f6c597c****</p>
         */
        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-07 18:07:57</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The last modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-07T10:07:57.000+0000</p>
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
         * 
         * <strong>example:</strong>
         * <p>1050</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The routing policy in a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;CORS&quot;: &quot;{\&quot;allowMethods\&quot;:\&quot;GET,POST,PUT,DELETE,HEAD,OPTIONS,PATCH\&quot;,\&quot;allowHeaders\&quot;:\&quot;<em>\&quot;,\&quot;exposeHeaders\&quot;:\&quot;</em>\&quot;,\&quot;unitNum\&quot;:12,\&quot;allowCredentials\&quot;:true,\&quot;status\&quot;:\&quot;off\&quot;,\&quot;allowOrigins\&quot;:\&quot;*\&quot;,\&quot;timeUnit\&quot;:\&quot;h\&quot;}&quot;,
         *       &quot;Timeout&quot;: &quot;{\&quot;unitNum\&quot;:10,\&quot;timeUnit\&quot;:\&quot;s\&quot;,\&quot;status\&quot;:\&quot;off\&quot;}&quot;,
         *       &quot;Retry&quot;: &quot;{\&quot;attempts\&quot;:2,\&quot;retryOn\&quot;:[\&quot;5xx\&quot;],\&quot;status\&quot;:\&quot;off\&quot;}&quot;,
         *       &quot;HTTPRewrite&quot;: &quot;{\&quot;pathType\&quot;:\&quot;EQUAL\&quot;,\&quot;path\&quot;:\&quot;/o\&quot;,\&quot;status\&quot;:\&quot;off\&quot;}&quot;,
         *       &quot;Waf&quot;: &quot;{\&quot;enabled\&quot;:false}&quot;,
         *       &quot;HeaderOp&quot;: &quot;{\&quot;status\&quot;:\&quot;off\&quot;,\&quot;headerOpItems\&quot;:[{\&quot;directionType\&quot;:\&quot;Request\&quot;,\&quot;opType\&quot;:\&quot;Add\&quot;,\&quot;key\&quot;:\&quot;kkk\&quot;,\&quot;value\&quot;:\&quot;ll\&quot;}]}&quot;
         * }</p>
         */
        @NameInMap("Policies")
        public String policies;

        /**
         * <p>The matching conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
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
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;Percent\&quot;:100,\&quot;ServiceId\&quot;:126}]</p>
         */
        @NameInMap("Services")
        public String services;

        /**
         * <p>The status of the route. Valid values:</p>
         * <ul>
         * <li>0: unpublished</li>
         * <li>2: publishing</li>
         * <li>3: published</li>
         * <li>4: editing (updated but not published)</li>
         * <li>5: unpublishing</li>
         * <li>6: unavailable</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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

        public GetGatewayRouteDetailResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
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
