// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class QueryRequestLogsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("ApiId")
        public String apiId;

        @NameInMap("ApiName")
        public String apiName;

        @NameInMap("ClientIp")
        public Integer clientIp;

        @NameInMap("ClientNonce")
        public String clientNonce;

        @NameInMap("ConsumerAppId")
        public String consumerAppId;

        @NameInMap("ConsumerAppKey")
        public String consumerAppKey;

        @NameInMap("CustomTraceId")
        public String customTraceId;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Exception")
        public String exception;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("HttpMethod")
        public String httpMethod;

        @NameInMap("HttpPath")
        public String httpPath;

        @NameInMap("InitialRequestId")
        public String initialRequestId;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("JwtClaims")
        public String jwtClaims;

        @NameInMap("Region")
        public String region;

        @NameInMap("RequestBody")
        public String requestBody;

        @NameInMap("RequestHeaders")
        public String requestHeaders;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("RequestProtocol")
        public String requestProtocol;

        @NameInMap("RequestQueryString")
        public String requestQueryString;

        @NameInMap("RequestSize")
        public String requestSize;

        @NameInMap("RequestTime")
        public String requestTime;

        @NameInMap("ResponseBody")
        public String responseBody;

        @NameInMap("ResponseHeaders")
        public String responseHeaders;

        @NameInMap("ResponseSize")
        public String responseSize;

        @NameInMap("ServiceLatency")
        public String serviceLatency;

        @NameInMap("StageId")
        public String stageId;

        @NameInMap("StageName")
        public String stageName;

        @NameInMap("StatusCode")
        public String statusCode;

        @NameInMap("TotalLatency")
        public String totalLatency;

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

        public QueryRequestLogsResponseBodyRequestLogsRequestLog setClientIp(Integer clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public Integer getClientIp() {
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
