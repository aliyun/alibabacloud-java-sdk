// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.et_industry_openapi20200824.models;

import com.aliyun.tea.*;

public class QueryIndustryDeviceStatusDataResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public QueryIndustryDeviceStatusDataResponseBodyAccessDeniedDetail accessDeniedDetail;

    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<QueryIndustryDeviceStatusDataResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryIndustryDeviceStatusDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryIndustryDeviceStatusDataResponseBody self = new QueryIndustryDeviceStatusDataResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryIndustryDeviceStatusDataResponseBody setAccessDeniedDetail(QueryIndustryDeviceStatusDataResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public QueryIndustryDeviceStatusDataResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QueryIndustryDeviceStatusDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryIndustryDeviceStatusDataResponseBody setData(java.util.List<QueryIndustryDeviceStatusDataResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryIndustryDeviceStatusDataResponseBodyData> getData() {
        return this.data;
    }

    public QueryIndustryDeviceStatusDataResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryIndustryDeviceStatusDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryIndustryDeviceStatusDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryIndustryDeviceStatusDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryIndustryDeviceStatusDataResponseBodyAccessDeniedDetail extends TeaModel {
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

        public static QueryIndustryDeviceStatusDataResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            QueryIndustryDeviceStatusDataResponseBodyAccessDeniedDetail self = new QueryIndustryDeviceStatusDataResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public QueryIndustryDeviceStatusDataResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public QueryIndustryDeviceStatusDataResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public QueryIndustryDeviceStatusDataResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public QueryIndustryDeviceStatusDataResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public QueryIndustryDeviceStatusDataResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public QueryIndustryDeviceStatusDataResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public QueryIndustryDeviceStatusDataResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class QueryIndustryDeviceStatusDataResponseBodyData extends TeaModel {
        @NameInMap("MeasurePoint")
        public String measurePoint;

        @NameInMap("Node")
        public String node;

        @NameInMap("ValueType")
        public String valueType;

        @NameInMap("Values")
        public java.util.List<java.util.Map<String, ?>> values;

        public static QueryIndustryDeviceStatusDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryIndustryDeviceStatusDataResponseBodyData self = new QueryIndustryDeviceStatusDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryIndustryDeviceStatusDataResponseBodyData setMeasurePoint(String measurePoint) {
            this.measurePoint = measurePoint;
            return this;
        }
        public String getMeasurePoint() {
            return this.measurePoint;
        }

        public QueryIndustryDeviceStatusDataResponseBodyData setNode(String node) {
            this.node = node;
            return this;
        }
        public String getNode() {
            return this.node;
        }

        public QueryIndustryDeviceStatusDataResponseBodyData setValueType(String valueType) {
            this.valueType = valueType;
            return this;
        }
        public String getValueType() {
            return this.valueType;
        }

        public QueryIndustryDeviceStatusDataResponseBodyData setValues(java.util.List<java.util.Map<String, ?>> values) {
            this.values = values;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getValues() {
            return this.values;
        }

    }

}
