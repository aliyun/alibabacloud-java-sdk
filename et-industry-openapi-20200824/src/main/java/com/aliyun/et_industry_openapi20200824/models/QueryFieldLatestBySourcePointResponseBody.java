// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.et_industry_openapi20200824.models;

import com.aliyun.tea.*;

public class QueryFieldLatestBySourcePointResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public QueryFieldLatestBySourcePointResponseBodyAccessDeniedDetail accessDeniedDetail;

    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<QueryFieldLatestBySourcePointResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryFieldLatestBySourcePointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryFieldLatestBySourcePointResponseBody self = new QueryFieldLatestBySourcePointResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryFieldLatestBySourcePointResponseBody setAccessDeniedDetail(QueryFieldLatestBySourcePointResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public QueryFieldLatestBySourcePointResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QueryFieldLatestBySourcePointResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryFieldLatestBySourcePointResponseBody setData(java.util.List<QueryFieldLatestBySourcePointResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryFieldLatestBySourcePointResponseBodyData> getData() {
        return this.data;
    }

    public QueryFieldLatestBySourcePointResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryFieldLatestBySourcePointResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryFieldLatestBySourcePointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryFieldLatestBySourcePointResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryFieldLatestBySourcePointResponseBodyAccessDeniedDetail extends TeaModel {
        @NameInMap("AuthAction")
        public String authAction;

        @NameInMap("AuthPrincipalDisplayName")
        public String authPrincipalDisplayName;

        @NameInMap("AuthPrincipalOwnerId")
        public String authPrincipalOwnerId;

        @NameInMap("AuthPrincipalType")
        public String authPrincipalType;

        @NameInMap("EncodedDiagnosticMessage")
        public String encodedDiagnosticMessage;

        @NameInMap("NoPermissionType")
        public String noPermissionType;

        @NameInMap("PolicyType")
        public String policyType;

        public static QueryFieldLatestBySourcePointResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            QueryFieldLatestBySourcePointResponseBodyAccessDeniedDetail self = new QueryFieldLatestBySourcePointResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public QueryFieldLatestBySourcePointResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public QueryFieldLatestBySourcePointResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public QueryFieldLatestBySourcePointResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public QueryFieldLatestBySourcePointResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public QueryFieldLatestBySourcePointResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public QueryFieldLatestBySourcePointResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public QueryFieldLatestBySourcePointResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class QueryFieldLatestBySourcePointResponseBodyDataValues extends TeaModel {
        @NameInMap("EventTime")
        public String eventTime;

        @NameInMap("ProcessTime")
        public String processTime;

        @NameInMap("Quality")
        public Integer quality;

        @NameInMap("SampleType")
        public String sampleType;

        @NameInMap("Time")
        public Long time;

        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("Value")
        public String value;

        public static QueryFieldLatestBySourcePointResponseBodyDataValues build(java.util.Map<String, ?> map) throws Exception {
            QueryFieldLatestBySourcePointResponseBodyDataValues self = new QueryFieldLatestBySourcePointResponseBodyDataValues();
            return TeaModel.build(map, self);
        }

        public QueryFieldLatestBySourcePointResponseBodyDataValues setEventTime(String eventTime) {
            this.eventTime = eventTime;
            return this;
        }
        public String getEventTime() {
            return this.eventTime;
        }

        public QueryFieldLatestBySourcePointResponseBodyDataValues setProcessTime(String processTime) {
            this.processTime = processTime;
            return this;
        }
        public String getProcessTime() {
            return this.processTime;
        }

        public QueryFieldLatestBySourcePointResponseBodyDataValues setQuality(Integer quality) {
            this.quality = quality;
            return this;
        }
        public Integer getQuality() {
            return this.quality;
        }

        public QueryFieldLatestBySourcePointResponseBodyDataValues setSampleType(String sampleType) {
            this.sampleType = sampleType;
            return this;
        }
        public String getSampleType() {
            return this.sampleType;
        }

        public QueryFieldLatestBySourcePointResponseBodyDataValues setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public QueryFieldLatestBySourcePointResponseBodyDataValues setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public QueryFieldLatestBySourcePointResponseBodyDataValues setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryFieldLatestBySourcePointResponseBodyData extends TeaModel {
        @NameInMap("MeasurePoint")
        public String measurePoint;

        @NameInMap("Node")
        public String node;

        @NameInMap("SourcePoint")
        public String sourcePoint;

        @NameInMap("ValueType")
        public String valueType;

        @NameInMap("Values")
        public java.util.List<QueryFieldLatestBySourcePointResponseBodyDataValues> values;

        public static QueryFieldLatestBySourcePointResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryFieldLatestBySourcePointResponseBodyData self = new QueryFieldLatestBySourcePointResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryFieldLatestBySourcePointResponseBodyData setMeasurePoint(String measurePoint) {
            this.measurePoint = measurePoint;
            return this;
        }
        public String getMeasurePoint() {
            return this.measurePoint;
        }

        public QueryFieldLatestBySourcePointResponseBodyData setNode(String node) {
            this.node = node;
            return this;
        }
        public String getNode() {
            return this.node;
        }

        public QueryFieldLatestBySourcePointResponseBodyData setSourcePoint(String sourcePoint) {
            this.sourcePoint = sourcePoint;
            return this;
        }
        public String getSourcePoint() {
            return this.sourcePoint;
        }

        public QueryFieldLatestBySourcePointResponseBodyData setValueType(String valueType) {
            this.valueType = valueType;
            return this;
        }
        public String getValueType() {
            return this.valueType;
        }

        public QueryFieldLatestBySourcePointResponseBodyData setValues(java.util.List<QueryFieldLatestBySourcePointResponseBodyDataValues> values) {
            this.values = values;
            return this;
        }
        public java.util.List<QueryFieldLatestBySourcePointResponseBodyDataValues> getValues() {
            return this.values;
        }

    }

}
