// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.et_industry_openapi20200824.models;

import com.aliyun.tea.*;

public class UploadIndustryDeviceDataResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public UploadIndustryDeviceDataResponseBodyAccessDeniedDetail accessDeniedDetail;

    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UploadIndustryDeviceDataResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static UploadIndustryDeviceDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadIndustryDeviceDataResponseBody self = new UploadIndustryDeviceDataResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadIndustryDeviceDataResponseBody setAccessDeniedDetail(UploadIndustryDeviceDataResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public UploadIndustryDeviceDataResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public UploadIndustryDeviceDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UploadIndustryDeviceDataResponseBody setData(UploadIndustryDeviceDataResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UploadIndustryDeviceDataResponseBodyData getData() {
        return this.data;
    }

    public UploadIndustryDeviceDataResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UploadIndustryDeviceDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UploadIndustryDeviceDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UploadIndustryDeviceDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UploadIndustryDeviceDataResponseBodyAccessDeniedDetail extends TeaModel {
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

        public static UploadIndustryDeviceDataResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            UploadIndustryDeviceDataResponseBodyAccessDeniedDetail self = new UploadIndustryDeviceDataResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public UploadIndustryDeviceDataResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public UploadIndustryDeviceDataResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public UploadIndustryDeviceDataResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public UploadIndustryDeviceDataResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public UploadIndustryDeviceDataResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public UploadIndustryDeviceDataResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public UploadIndustryDeviceDataResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class UploadIndustryDeviceDataResponseBodyDataMessage extends TeaModel {
        @NameInMap("ErrorMsg")
        public String errorMsg;

        @NameInMap("MeasurePoint")
        public String measurePoint;

        @NameInMap("Node")
        public String node;

        public static UploadIndustryDeviceDataResponseBodyDataMessage build(java.util.Map<String, ?> map) throws Exception {
            UploadIndustryDeviceDataResponseBodyDataMessage self = new UploadIndustryDeviceDataResponseBodyDataMessage();
            return TeaModel.build(map, self);
        }

        public UploadIndustryDeviceDataResponseBodyDataMessage setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public UploadIndustryDeviceDataResponseBodyDataMessage setMeasurePoint(String measurePoint) {
            this.measurePoint = measurePoint;
            return this;
        }
        public String getMeasurePoint() {
            return this.measurePoint;
        }

        public UploadIndustryDeviceDataResponseBodyDataMessage setNode(String node) {
            this.node = node;
            return this;
        }
        public String getNode() {
            return this.node;
        }

    }

    public static class UploadIndustryDeviceDataResponseBodyData extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("Message")
        public java.util.List<UploadIndustryDeviceDataResponseBodyDataMessage> message;

        public static UploadIndustryDeviceDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UploadIndustryDeviceDataResponseBodyData self = new UploadIndustryDeviceDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UploadIndustryDeviceDataResponseBodyData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public UploadIndustryDeviceDataResponseBodyData setMessage(java.util.List<UploadIndustryDeviceDataResponseBodyDataMessage> message) {
            this.message = message;
            return this;
        }
        public java.util.List<UploadIndustryDeviceDataResponseBodyDataMessage> getMessage() {
            return this.message;
        }

    }

}
