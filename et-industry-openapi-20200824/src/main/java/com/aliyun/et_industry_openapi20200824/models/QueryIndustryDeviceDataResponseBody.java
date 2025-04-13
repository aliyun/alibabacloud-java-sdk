// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.et_industry_openapi20200824.models;

import com.aliyun.tea.*;

public class QueryIndustryDeviceDataResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public QueryIndustryDeviceDataResponseBodyAccessDeniedDetail accessDeniedDetail;

    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<QueryIndustryDeviceDataResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryIndustryDeviceDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryIndustryDeviceDataResponseBody self = new QueryIndustryDeviceDataResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryIndustryDeviceDataResponseBody setAccessDeniedDetail(QueryIndustryDeviceDataResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public QueryIndustryDeviceDataResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QueryIndustryDeviceDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryIndustryDeviceDataResponseBody setData(java.util.List<QueryIndustryDeviceDataResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryIndustryDeviceDataResponseBodyData> getData() {
        return this.data;
    }

    public QueryIndustryDeviceDataResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryIndustryDeviceDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryIndustryDeviceDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryIndustryDeviceDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryIndustryDeviceDataResponseBodyAccessDeniedDetail extends TeaModel {
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

        public static QueryIndustryDeviceDataResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            QueryIndustryDeviceDataResponseBodyAccessDeniedDetail self = new QueryIndustryDeviceDataResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public QueryIndustryDeviceDataResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public QueryIndustryDeviceDataResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public QueryIndustryDeviceDataResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public QueryIndustryDeviceDataResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public QueryIndustryDeviceDataResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public QueryIndustryDeviceDataResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public QueryIndustryDeviceDataResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class QueryIndustryDeviceDataResponseBodyDataValues extends TeaModel {
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

        public static QueryIndustryDeviceDataResponseBodyDataValues build(java.util.Map<String, ?> map) throws Exception {
            QueryIndustryDeviceDataResponseBodyDataValues self = new QueryIndustryDeviceDataResponseBodyDataValues();
            return TeaModel.build(map, self);
        }

        public QueryIndustryDeviceDataResponseBodyDataValues setEventTime(String eventTime) {
            this.eventTime = eventTime;
            return this;
        }
        public String getEventTime() {
            return this.eventTime;
        }

        public QueryIndustryDeviceDataResponseBodyDataValues setProcessTime(String processTime) {
            this.processTime = processTime;
            return this;
        }
        public String getProcessTime() {
            return this.processTime;
        }

        public QueryIndustryDeviceDataResponseBodyDataValues setQuality(Integer quality) {
            this.quality = quality;
            return this;
        }
        public Integer getQuality() {
            return this.quality;
        }

        public QueryIndustryDeviceDataResponseBodyDataValues setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public QueryIndustryDeviceDataResponseBodyDataValues setTimeStamp(Long timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public Long getTimeStamp() {
            return this.timeStamp;
        }

        public QueryIndustryDeviceDataResponseBodyDataValues setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryIndustryDeviceDataResponseBodyData extends TeaModel {
        @NameInMap("MeasurePoint")
        public String measurePoint;

        @NameInMap("Node")
        public String node;

        @NameInMap("ValueType")
        public String valueType;

        @NameInMap("Values")
        public java.util.List<QueryIndustryDeviceDataResponseBodyDataValues> values;

        public static QueryIndustryDeviceDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryIndustryDeviceDataResponseBodyData self = new QueryIndustryDeviceDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryIndustryDeviceDataResponseBodyData setMeasurePoint(String measurePoint) {
            this.measurePoint = measurePoint;
            return this;
        }
        public String getMeasurePoint() {
            return this.measurePoint;
        }

        public QueryIndustryDeviceDataResponseBodyData setNode(String node) {
            this.node = node;
            return this;
        }
        public String getNode() {
            return this.node;
        }

        public QueryIndustryDeviceDataResponseBodyData setValueType(String valueType) {
            this.valueType = valueType;
            return this;
        }
        public String getValueType() {
            return this.valueType;
        }

        public QueryIndustryDeviceDataResponseBodyData setValues(java.util.List<QueryIndustryDeviceDataResponseBodyDataValues> values) {
            this.values = values;
            return this;
        }
        public java.util.List<QueryIndustryDeviceDataResponseBodyDataValues> getValues() {
            return this.values;
        }

    }

}
