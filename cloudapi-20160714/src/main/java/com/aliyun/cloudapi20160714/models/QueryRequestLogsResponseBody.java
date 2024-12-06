// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class QueryRequestLogsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CE5722A6-AE78-4741-A9B0-6C81********</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The request logs.</p>
     */
    @NameInMap("RequestLogs")
    public QueryRequestLogsResponseBodyRequestLogs requestLogs;

    public static QueryRequestLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRequestLogsResponseBody self = new QueryRequestLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRequestLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRequestLogsResponseBody setRequestLogs(QueryRequestLogsResponseBodyRequestLogs requestLogs) {
        this.requestLogs = requestLogs;
        return this;
    }
    public QueryRequestLogsResponseBodyRequestLogs getRequestLogs() {
        return this.requestLogs;
    }

    public static class QueryRequestLogsResponseBodyRequestLogsRequestLog extends TeaModel {
        /**
         * <p>The API ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4b83229ebcab4ecd88956fb3********</p>
         */
        @NameInMap("ApiId")
        public String apiId;

        /**
         * <p>The API name.</p>
         * 
         * <strong>example:</strong>
         * <p>ApiName</p>
         */
        @NameInMap("ApiName")
        public String apiName;

        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>VIPROOM_VIPROOM</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The time when API Gateway finished forwarding the request to the backend service.</p>
         * 
         * <strong>example:</strong>
         * <p>1731487224969</p>
         */
        @NameInMap("BackendRequestEnd")
        public Long backendRequestEnd;

        /**
         * <p>The time when API Gateway started to forward the request to the backend service.</p>
         * 
         * <strong>example:</strong>
         * <p>1731487224969</p>
         */
        @NameInMap("BackendRequestStart")
        public Long backendRequestStart;

        /**
         * <p>The time when API Gateway finished receiving the response from the backend service.</p>
         * 
         * <strong>example:</strong>
         * <p>1731487224989</p>
         */
        @NameInMap("BackendResponseEnd")
        public Long backendResponseEnd;

        /**
         * <p>The time when API Gateway started to receive the response from the backend service.</p>
         * 
         * <strong>example:</strong>
         * <p>1731487224989</p>
         */
        @NameInMap("BackendResponseStart")
        public Long backendResponseStart;

        /**
         * <p>The IP address of the client that sends the request.</p>
         * 
         * <strong>example:</strong>
         * <p>21.237.XXX.XXX</p>
         */
        @NameInMap("ClientIp")
        public String clientIp;

        /**
         * <p>The X-Ca-Nonce header included in the request from the client.</p>
         * 
         * <strong>example:</strong>
         * <p>d43df9db-3b05-4cd6-888a-1c0b********</p>
         */
        @NameInMap("ClientNonce")
        public String clientNonce;

        /**
         * <p>The application ID that is used by the caller.</p>
         * 
         * <strong>example:</strong>
         * <p>11096****</p>
         */
        @NameInMap("ConsumerAppId")
        public String consumerAppId;

        /**
         * <p>The App Key that is used by the caller.</p>
         * 
         * <strong>example:</strong>
         * <p>20412****</p>
         */
        @NameInMap("ConsumerAppKey")
        public String consumerAppKey;

        /**
         * <p>The custom trace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>95657ED9-2F6F-426F-BD99-79C8********</p>
         */
        @NameInMap("CustomTraceId")
        public String customTraceId;

        /**
         * <p>The requested domain name in the request.</p>
         * 
         * <strong>example:</strong>
         * <p>360bdd88695c48ae8085c7f2********-ap-southeast-1.alicloudapi.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The error code that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>X500ER</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message returned if the call fails.</p>
         * 
         * <strong>example:</strong>
         * <p>Backend service connect failed <code>Timeout connecting to [/1XX.20.0.XX:8080]</code></p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The specific error message returned by the backend service.</p>
         * 
         * <strong>example:</strong>
         * <p>error msg</p>
         */
        @NameInMap("Exception")
        public String exception;

        /**
         * <p>The time when API Gateway finished receiving the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1731487224968</p>
         */
        @NameInMap("FrontRequestEnd")
        public Long frontRequestEnd;

        /**
         * <p>The time when API Gateway started to receive the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1731487224968</p>
         */
        @NameInMap("FrontRequestStart")
        public Long frontRequestStart;

        /**
         * <p>The time when API Gateway finished forwarding the response to the client.</p>
         * 
         * <strong>example:</strong>
         * <p>1731487224989</p>
         */
        @NameInMap("FrontResponseEnd")
        public Long frontResponseEnd;

        /**
         * <p>The time when API Gateway started to forward the response to the client.</p>
         * 
         * <strong>example:</strong>
         * <p>1731487224989</p>
         */
        @NameInMap("FrontResponseStart")
        public Long frontResponseStart;

        /**
         * <p>The ID of the API group to which the API belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>dc024277fe6c4cada79ba0bd6********</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The name of the API group to which the API belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>GroupName</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The HTTP method that is used to send the request.</p>
         * 
         * <strong>example:</strong>
         * <p>POST</p>
         */
        @NameInMap("HttpMethod")
        public String httpMethod;

        /**
         * <p>The path of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>/testPath</p>
         */
        @NameInMap("HttpPath")
        public String httpPath;

        /**
         * <p>The initial request ID when API Gateway calls an API. For example, if API-1 calls API-2, the initialRequestId parameter in the log of API-2 indicates the ID of the request from API-1.</p>
         * 
         * <strong>example:</strong>
         * <p>95657ED9-2F6F-426F-BD99-79C8********</p>
         */
        @NameInMap("InitialRequestId")
        public String initialRequestId;

        /**
         * <p>The ID of the API Gateway instance to which the API belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>apigateway-bj-ab2b********</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The JSON web token (JWT) claims. The claims can be configured at the group level.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("JwtClaims")
        public String jwtClaims;

        /**
         * <p>The region in which the instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The request body. A request body cannot exceed 1,024 bytes in size.</p>
         * 
         * <strong>example:</strong>
         * <p>param=paramName</p>
         */
        @NameInMap("RequestBody")
        public String requestBody;

        /**
         * <p>The request headers.</p>
         * 
         * <strong>example:</strong>
         * <p>content-type: application/x-www-form-urlencoded</p>
         */
        @NameInMap("RequestHeaders")
        public String requestHeaders;

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>95657ED9-2F6F-426F-BD99-79C8********</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        /**
         * <p>The protocol used by the client to send the request. Valid values: HTTP, HTTPS, and WS.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("RequestProtocol")
        public String requestProtocol;

        /**
         * <p>The query string for the request.</p>
         * 
         * <strong>example:</strong>
         * <p>username=name</p>
         */
        @NameInMap("RequestQueryString")
        public String requestQueryString;

        /**
         * <p>The size of the request. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1923</p>
         */
        @NameInMap("RequestSize")
        public String requestSize;

        /**
         * <p>The request time, in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-10-29T03:59:59Z</p>
         */
        @NameInMap("RequestTime")
        public String requestTime;

        /**
         * <p>The response body. A response body cannot exceed 1,024 bytes in size.</p>
         * 
         * <strong>example:</strong>
         * <p>param=paramName</p>
         */
        @NameInMap("ResponseBody")
        public String responseBody;

        /**
         * <p>The headers in the API response.</p>
         * 
         * <strong>example:</strong>
         * <p>content-type: application/x-www-form-urlencoded</p>
         */
        @NameInMap("ResponseHeaders")
        public String responseHeaders;

        /**
         * <p>The size of returned data. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>23441</p>
         */
        @NameInMap("ResponseSize")
        public String responseSize;

        /**
         * <p>The total time consumed to access the backend resources. The total time includes the time consumed to request a connection to the resources, the time consumed to establish the connection, and the time consumed to call the backend service. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>324</p>
         */
        @NameInMap("ServiceLatency")
        public String serviceLatency;

        /**
         * <p>The ID of the API environment.</p>
         * 
         * <strong>example:</strong>
         * <p>8a305b7f10334052a52d9156********</p>
         */
        @NameInMap("StageId")
        public String stageId;

        /**
         * <p>The name of the API environment.</p>
         * 
         * <strong>example:</strong>
         * <p>RELEASE</p>
         */
        @NameInMap("StageName")
        public String stageName;

        /**
         * <p>The status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("StatusCode")
        public String statusCode;

        /**
         * <p>The total time consumed by the request. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1345</p>
         */
        @NameInMap("TotalLatency")
        public String totalLatency;

        /**
         * <p>The plug-in hit by the request and the relevant context.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("plugin")
        public String plugin;

        public static QueryRequestLogsResponseBodyRequestLogsRequestLog build(java.util.Map<String, ?> map) throws Exception {
            QueryRequestLogsResponseBodyRequestLogsRequestLog self = new QueryRequestLogsResponseBodyRequestLogsRequestLog();
            return TeaModel.build(map, self);
        }

        public QueryRequestLogsResponseBodyRequestLogsRequestLog setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public QueryRequestLogsResponseBodyRequestLogsRequestLog setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public QueryRequestLogsResponseBodyRequestLogsRequestLog setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryRequestLogsResponseBodyRequestLogsRequestLog setBackendRequestEnd(Long backendRequestEnd) {
            this.backendRequestEnd = backendRequestEnd;
            return this;
        }
        public Long getBackendRequestEnd() {
            return this.backendRequestEnd;
        }

        public QueryRequestLogsResponseBodyRequestLogsRequestLog setBackendRequestStart(Long backendRequestStart) {
            this.backendRequestStart = backendRequestStart;
            return this;
        }
        public Long getBackendRequestStart() {
            return this.backendRequestStart;
        }

        public QueryRequestLogsResponseBodyRequestLogsRequestLog setBackendResponseEnd(Long backendResponseEnd) {
            this.backendResponseEnd = backendResponseEnd;
            return this;
        }
        public Long getBackendResponseEnd() {
            return this.backendResponseEnd;
        }

        public QueryRequestLogsResponseBodyRequestLogsRequestLog setBackendResponseStart(Long backendResponseStart) {
            this.backendResponseStart = backendResponseStart;
            return this;
        }
        public Long getBackendResponseStart() {
            return this.backendResponseStart;
        }

        public QueryRequestLogsResponseBodyRequestLogsRequestLog setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
        }

        public QueryRequestLogsResponseBodyRequestLogsRequestLog setClientNonce(String clientNonce) {
            this.clientNonce = clientNonce;
            return this;
        }
        public String getClientNonce() {
            return this.clientNonce;
        }

        public QueryRequestLogsResponseBodyRequestLogsRequestLog setConsumerAppId(String consumerAppId) {
            this.consumerAppId = consumerAppId;
            return this;
        }
        public String getConsumerAppId() {
            return this.consumerAppId;
        }

        public QueryRequestLogsResponseBodyRequestLogsRequestLog setConsumerAppKey(String consumerAppKey) {
            this.consumerAppKey = consumerAppKey;
            return this;
        }
        public String getConsumerAppKey() {
            return this.consumerAppKey;
        }

        public QueryRequestLogsResponseBodyRequestLogsRequestLog setCustomTraceId(String customTraceId) {
            this.customTraceId = customTraceId;
            return this;
        }
        public String getCustomTraceId() {
            return this.customTraceId;
        }

        public QueryRequestLogsResponseBodyRequestLogsRequestLog setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public QueryRequestLogsResponseBodyRequestLogsRequestLog setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public QueryRequestLogsResponseBodyRequestLogsRequestLog setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public QueryRequestLogsResponseBodyRequestLogsRequestLog setException(String exception) {
            this.exception = exception;
            return this;
        }
        public String getException() {
            return this.exception;
        }

        public QueryRequestLogsResponseBodyRequestLogsRequestLog setFrontRequestEnd(Long frontRequestEnd) {
            this.frontRequestEnd = frontRequestEnd;
            return this;
        }
        public Long getFrontRequestEnd() {
            return this.frontRequestEnd;
        }

        public QueryRequestLogsResponseBodyRequestLogsRequestLog setFrontRequestStart(Long frontRequestStart) {
            this.frontRequestStart = frontRequestStart;
            return this;
        }
        public Long getFrontRequestStart() {
            return this.frontRequestStart;
        }

        public QueryRequestLogsResponseBodyRequestLogsRequestLog setFrontResponseEnd(Long frontResponseEnd) {
            this.frontResponseEnd = frontResponseEnd;
            return this;
        }
        public Long getFrontResponseEnd() {
            return this.frontResponseEnd;
        }

        public QueryRequestLogsResponseBodyRequestLogsRequestLog setFrontResponseStart(Long frontResponseStart) {
            this.frontResponseStart = frontResponseStart;
            return this;
        }
        public Long getFrontResponseStart() {
            return this.frontResponseStart;
        }

        public QueryRequestLogsResponseBodyRequestLogsRequestLog setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public QueryRequestLogsResponseBodyRequestLogsRequestLog setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public QueryRequestLogsResponseBodyRequestLogsRequestLog setHttpMethod(String httpMethod) {
            this.httpMethod = httpMethod;
            return this;
        }
        public String getHttpMethod() {
            return this.httpMethod;
        }

        public QueryRequestLogsResponseBodyRequestLogsRequestLog setHttpPath(String httpPath) {
            this.httpPath = httpPath;
            return this;
        }
        public String getHttpPath() {
            return this.httpPath;
        }

        public QueryRequestLogsResponseBodyRequestLogsRequestLog setInitialRequestId(String initialRequestId) {
            this.initialRequestId = initialRequestId;
            return this;
        }
        public String getInitialRequestId() {
            return this.initialRequestId;
        }

        public QueryRequestLogsResponseBodyRequestLogsRequestLog setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryRequestLogsResponseBodyRequestLogsRequestLog setJwtClaims(String jwtClaims) {
            this.jwtClaims = jwtClaims;
            return this;
        }
        public String getJwtClaims() {
            return this.jwtClaims;
        }

        public QueryRequestLogsResponseBodyRequestLogsRequestLog setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public QueryRequestLogsResponseBodyRequestLogsRequestLog setRequestBody(String requestBody) {
            this.requestBody = requestBody;
            return this;
        }
        public String getRequestBody() {
            return this.requestBody;
        }

        public QueryRequestLogsResponseBodyRequestLogsRequestLog setRequestHeaders(String requestHeaders) {
            this.requestHeaders = requestHeaders;
            return this;
        }
        public String getRequestHeaders() {
            return this.requestHeaders;
        }

        public QueryRequestLogsResponseBodyRequestLogsRequestLog setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public QueryRequestLogsResponseBodyRequestLogsRequestLog setRequestProtocol(String requestProtocol) {
            this.requestProtocol = requestProtocol;
            return this;
        }
        public String getRequestProtocol() {
            return this.requestProtocol;
        }

        public QueryRequestLogsResponseBodyRequestLogsRequestLog setRequestQueryString(String requestQueryString) {
            this.requestQueryString = requestQueryString;
            return this;
        }
        public String getRequestQueryString() {
            return this.requestQueryString;
        }

        public QueryRequestLogsResponseBodyRequestLogsRequestLog setRequestSize(String requestSize) {
            this.requestSize = requestSize;
            return this;
        }
        public String getRequestSize() {
            return this.requestSize;
        }

        public QueryRequestLogsResponseBodyRequestLogsRequestLog setRequestTime(String requestTime) {
            this.requestTime = requestTime;
            return this;
        }
        public String getRequestTime() {
            return this.requestTime;
        }

        public QueryRequestLogsResponseBodyRequestLogsRequestLog setResponseBody(String responseBody) {
            this.responseBody = responseBody;
            return this;
        }
        public String getResponseBody() {
            return this.responseBody;
        }

        public QueryRequestLogsResponseBodyRequestLogsRequestLog setResponseHeaders(String responseHeaders) {
            this.responseHeaders = responseHeaders;
            return this;
        }
        public String getResponseHeaders() {
            return this.responseHeaders;
        }

        public QueryRequestLogsResponseBodyRequestLogsRequestLog setResponseSize(String responseSize) {
            this.responseSize = responseSize;
            return this;
        }
        public String getResponseSize() {
            return this.responseSize;
        }

        public QueryRequestLogsResponseBodyRequestLogsRequestLog setServiceLatency(String serviceLatency) {
            this.serviceLatency = serviceLatency;
            return this;
        }
        public String getServiceLatency() {
            return this.serviceLatency;
        }

        public QueryRequestLogsResponseBodyRequestLogsRequestLog setStageId(String stageId) {
            this.stageId = stageId;
            return this;
        }
        public String getStageId() {
            return this.stageId;
        }

        public QueryRequestLogsResponseBodyRequestLogsRequestLog setStageName(String stageName) {
            this.stageName = stageName;
            return this;
        }
        public String getStageName() {
            return this.stageName;
        }

        public QueryRequestLogsResponseBodyRequestLogsRequestLog setStatusCode(String statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public String getStatusCode() {
            return this.statusCode;
        }

        public QueryRequestLogsResponseBodyRequestLogsRequestLog setTotalLatency(String totalLatency) {
            this.totalLatency = totalLatency;
            return this;
        }
        public String getTotalLatency() {
            return this.totalLatency;
        }

        public QueryRequestLogsResponseBodyRequestLogsRequestLog setPlugin(String plugin) {
            this.plugin = plugin;
            return this;
        }
        public String getPlugin() {
            return this.plugin;
        }

    }

    public static class QueryRequestLogsResponseBodyRequestLogs extends TeaModel {
        @NameInMap("RequestLog")
        public java.util.List<QueryRequestLogsResponseBodyRequestLogsRequestLog> requestLog;

        public static QueryRequestLogsResponseBodyRequestLogs build(java.util.Map<String, ?> map) throws Exception {
            QueryRequestLogsResponseBodyRequestLogs self = new QueryRequestLogsResponseBodyRequestLogs();
            return TeaModel.build(map, self);
        }

        public QueryRequestLogsResponseBodyRequestLogs setRequestLog(java.util.List<QueryRequestLogsResponseBodyRequestLogsRequestLog> requestLog) {
            this.requestLog = requestLog;
            return this;
        }
        public java.util.List<QueryRequestLogsResponseBodyRequestLogsRequestLog> getRequestLog() {
            return this.requestLog;
        }

    }

}
