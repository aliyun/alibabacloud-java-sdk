// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.et_industry_openapi20200824.models;

import com.aliyun.tea.*;

public class QueryIndustryDeviceLimitsDataResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public QueryIndustryDeviceLimitsDataResponseBodyAccessDeniedDetail accessDeniedDetail;

    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<QueryIndustryDeviceLimitsDataResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryIndustryDeviceLimitsDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryIndustryDeviceLimitsDataResponseBody self = new QueryIndustryDeviceLimitsDataResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryIndustryDeviceLimitsDataResponseBody setAccessDeniedDetail(QueryIndustryDeviceLimitsDataResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public QueryIndustryDeviceLimitsDataResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QueryIndustryDeviceLimitsDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryIndustryDeviceLimitsDataResponseBody setData(java.util.List<QueryIndustryDeviceLimitsDataResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryIndustryDeviceLimitsDataResponseBodyData> getData() {
        return this.data;
    }

    public QueryIndustryDeviceLimitsDataResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryIndustryDeviceLimitsDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryIndustryDeviceLimitsDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryIndustryDeviceLimitsDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryIndustryDeviceLimitsDataResponseBodyAccessDeniedDetail extends TeaModel {
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

        public static QueryIndustryDeviceLimitsDataResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            QueryIndustryDeviceLimitsDataResponseBodyAccessDeniedDetail self = new QueryIndustryDeviceLimitsDataResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public QueryIndustryDeviceLimitsDataResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public QueryIndustryDeviceLimitsDataResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public QueryIndustryDeviceLimitsDataResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public QueryIndustryDeviceLimitsDataResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public QueryIndustryDeviceLimitsDataResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public QueryIndustryDeviceLimitsDataResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public QueryIndustryDeviceLimitsDataResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class QueryIndustryDeviceLimitsDataResponseBodyDataValues extends TeaModel {
        @NameInMap("EventTime")
        public String eventTime;

        @NameInMap("ProcessTime")
        public String processTime;

        @NameInMap("Quality")
        public Integer quality;

        @NameInMap("Time")
        public Long time;

        @NameInMap("TimeStamp")
        public Long timeStamp;

        @NameInMap("Value")
        public String value;

        public static QueryIndustryDeviceLimitsDataResponseBodyDataValues build(java.util.Map<String, ?> map) throws Exception {
            QueryIndustryDeviceLimitsDataResponseBodyDataValues self = new QueryIndustryDeviceLimitsDataResponseBodyDataValues();
            return TeaModel.build(map, self);
        }

        public QueryIndustryDeviceLimitsDataResponseBodyDataValues setEventTime(String eventTime) {
            this.eventTime = eventTime;
            return this;
        }
        public String getEventTime() {
            return this.eventTime;
        }

        public QueryIndustryDeviceLimitsDataResponseBodyDataValues setProcessTime(String processTime) {
            this.processTime = processTime;
            return this;
        }
        public String getProcessTime() {
            return this.processTime;
        }

        public QueryIndustryDeviceLimitsDataResponseBodyDataValues setQuality(Integer quality) {
            this.quality = quality;
            return this;
        }
        public Integer getQuality() {
            return this.quality;
        }

        public QueryIndustryDeviceLimitsDataResponseBodyDataValues setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public QueryIndustryDeviceLimitsDataResponseBodyDataValues setTimeStamp(Long timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public Long getTimeStamp() {
            return this.timeStamp;
        }

        public QueryIndustryDeviceLimitsDataResponseBodyDataValues setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryIndustryDeviceLimitsDataResponseBodyData extends TeaModel {
        @NameInMap("MeasurePoint")
        public String measurePoint;

        @NameInMap("Node")
        public String node;

        @NameInMap("ValueType")
        public String valueType;

        @NameInMap("Values")
        public java.util.List<QueryIndustryDeviceLimitsDataResponseBodyDataValues> values;

        public static QueryIndustryDeviceLimitsDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryIndustryDeviceLimitsDataResponseBodyData self = new QueryIndustryDeviceLimitsDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryIndustryDeviceLimitsDataResponseBodyData setMeasurePoint(String measurePoint) {
            this.measurePoint = measurePoint;
            return this;
        }
        public String getMeasurePoint() {
            return this.measurePoint;
        }

        public QueryIndustryDeviceLimitsDataResponseBodyData setNode(String node) {
            this.node = node;
            return this;
        }
        public String getNode() {
            return this.node;
        }

        public QueryIndustryDeviceLimitsDataResponseBodyData setValueType(String valueType) {
            this.valueType = valueType;
            return this;
        }
        public String getValueType() {
            return this.valueType;
        }

        public QueryIndustryDeviceLimitsDataResponseBodyData setValues(java.util.List<QueryIndustryDeviceLimitsDataResponseBodyDataValues> values) {
            this.values = values;
            return this;
        }
        public java.util.List<QueryIndustryDeviceLimitsDataResponseBodyDataValues> getValues() {
            return this.values;
        }

    }

}
