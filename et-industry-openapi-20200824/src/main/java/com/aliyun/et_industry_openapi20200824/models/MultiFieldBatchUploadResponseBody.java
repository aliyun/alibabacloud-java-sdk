// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.et_industry_openapi20200824.models;

import com.aliyun.tea.*;

public class MultiFieldBatchUploadResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public MultiFieldBatchUploadResponseBodyAccessDeniedDetail accessDeniedDetail;

    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public MultiFieldBatchUploadResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static MultiFieldBatchUploadResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MultiFieldBatchUploadResponseBody self = new MultiFieldBatchUploadResponseBody();
        return TeaModel.build(map, self);
    }

    public MultiFieldBatchUploadResponseBody setAccessDeniedDetail(MultiFieldBatchUploadResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public MultiFieldBatchUploadResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public MultiFieldBatchUploadResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public MultiFieldBatchUploadResponseBody setData(MultiFieldBatchUploadResponseBodyData data) {
        this.data = data;
        return this;
    }
    public MultiFieldBatchUploadResponseBodyData getData() {
        return this.data;
    }

    public MultiFieldBatchUploadResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public MultiFieldBatchUploadResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MultiFieldBatchUploadResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MultiFieldBatchUploadResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class MultiFieldBatchUploadResponseBodyAccessDeniedDetail extends TeaModel {
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

        public static MultiFieldBatchUploadResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            MultiFieldBatchUploadResponseBodyAccessDeniedDetail self = new MultiFieldBatchUploadResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public MultiFieldBatchUploadResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public MultiFieldBatchUploadResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public MultiFieldBatchUploadResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public MultiFieldBatchUploadResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public MultiFieldBatchUploadResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public MultiFieldBatchUploadResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public MultiFieldBatchUploadResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class MultiFieldBatchUploadResponseBodyDataMessage extends TeaModel {
        @NameInMap("ErrorMsg")
        public String errorMsg;

        @NameInMap("MeasurePoint")
        public String measurePoint;

        @NameInMap("Node")
        public String node;

        public static MultiFieldBatchUploadResponseBodyDataMessage build(java.util.Map<String, ?> map) throws Exception {
            MultiFieldBatchUploadResponseBodyDataMessage self = new MultiFieldBatchUploadResponseBodyDataMessage();
            return TeaModel.build(map, self);
        }

        public MultiFieldBatchUploadResponseBodyDataMessage setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public MultiFieldBatchUploadResponseBodyDataMessage setMeasurePoint(String measurePoint) {
            this.measurePoint = measurePoint;
            return this;
        }
        public String getMeasurePoint() {
            return this.measurePoint;
        }

        public MultiFieldBatchUploadResponseBodyDataMessage setNode(String node) {
            this.node = node;
            return this;
        }
        public String getNode() {
            return this.node;
        }

    }

    public static class MultiFieldBatchUploadResponseBodyData extends TeaModel {
        @NameInMap("Count")
        public Long count;

        @NameInMap("Message")
        public java.util.List<MultiFieldBatchUploadResponseBodyDataMessage> message;

        public static MultiFieldBatchUploadResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            MultiFieldBatchUploadResponseBodyData self = new MultiFieldBatchUploadResponseBodyData();
            return TeaModel.build(map, self);
        }

        public MultiFieldBatchUploadResponseBodyData setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public MultiFieldBatchUploadResponseBodyData setMessage(java.util.List<MultiFieldBatchUploadResponseBodyDataMessage> message) {
            this.message = message;
            return this;
        }
        public java.util.List<MultiFieldBatchUploadResponseBodyDataMessage> getMessage() {
            return this.message;
        }

    }

}
