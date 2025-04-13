// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.et_industry_openapi20200824.models;

import com.aliyun.tea.*;

public class MultiSourcePointBatchUploadResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public MultiSourcePointBatchUploadResponseBodyAccessDeniedDetail accessDeniedDetail;

    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public MultiSourcePointBatchUploadResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static MultiSourcePointBatchUploadResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MultiSourcePointBatchUploadResponseBody self = new MultiSourcePointBatchUploadResponseBody();
        return TeaModel.build(map, self);
    }

    public MultiSourcePointBatchUploadResponseBody setAccessDeniedDetail(MultiSourcePointBatchUploadResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public MultiSourcePointBatchUploadResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public MultiSourcePointBatchUploadResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public MultiSourcePointBatchUploadResponseBody setData(MultiSourcePointBatchUploadResponseBodyData data) {
        this.data = data;
        return this;
    }
    public MultiSourcePointBatchUploadResponseBodyData getData() {
        return this.data;
    }

    public MultiSourcePointBatchUploadResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public MultiSourcePointBatchUploadResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MultiSourcePointBatchUploadResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MultiSourcePointBatchUploadResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class MultiSourcePointBatchUploadResponseBodyAccessDeniedDetail extends TeaModel {
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

        public static MultiSourcePointBatchUploadResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            MultiSourcePointBatchUploadResponseBodyAccessDeniedDetail self = new MultiSourcePointBatchUploadResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public MultiSourcePointBatchUploadResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public MultiSourcePointBatchUploadResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public MultiSourcePointBatchUploadResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public MultiSourcePointBatchUploadResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public MultiSourcePointBatchUploadResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public MultiSourcePointBatchUploadResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public MultiSourcePointBatchUploadResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class MultiSourcePointBatchUploadResponseBodyDataMessage extends TeaModel {
        @NameInMap("ErrorMsg")
        public String errorMsg;

        @NameInMap("Node")
        public String node;

        @NameInMap("SourcePoint")
        public String sourcePoint;

        public static MultiSourcePointBatchUploadResponseBodyDataMessage build(java.util.Map<String, ?> map) throws Exception {
            MultiSourcePointBatchUploadResponseBodyDataMessage self = new MultiSourcePointBatchUploadResponseBodyDataMessage();
            return TeaModel.build(map, self);
        }

        public MultiSourcePointBatchUploadResponseBodyDataMessage setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public MultiSourcePointBatchUploadResponseBodyDataMessage setNode(String node) {
            this.node = node;
            return this;
        }
        public String getNode() {
            return this.node;
        }

        public MultiSourcePointBatchUploadResponseBodyDataMessage setSourcePoint(String sourcePoint) {
            this.sourcePoint = sourcePoint;
            return this;
        }
        public String getSourcePoint() {
            return this.sourcePoint;
        }

    }

    public static class MultiSourcePointBatchUploadResponseBodyData extends TeaModel {
        @NameInMap("Count")
        public Long count;

        @NameInMap("Message")
        public java.util.List<MultiSourcePointBatchUploadResponseBodyDataMessage> message;

        public static MultiSourcePointBatchUploadResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            MultiSourcePointBatchUploadResponseBodyData self = new MultiSourcePointBatchUploadResponseBodyData();
            return TeaModel.build(map, self);
        }

        public MultiSourcePointBatchUploadResponseBodyData setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public MultiSourcePointBatchUploadResponseBodyData setMessage(java.util.List<MultiSourcePointBatchUploadResponseBodyDataMessage> message) {
            this.message = message;
            return this;
        }
        public java.util.List<MultiSourcePointBatchUploadResponseBodyDataMessage> getMessage() {
            return this.message;
        }

    }

}
