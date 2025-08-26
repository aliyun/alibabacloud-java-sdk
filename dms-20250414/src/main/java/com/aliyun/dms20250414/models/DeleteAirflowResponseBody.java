// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DeleteAirflowResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>NOT_FOUND</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>Instance not found.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>E0D21075-CD3E-4D98-8264-****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Root")
    public DeleteAirflowResponseBodyRoot root;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteAirflowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAirflowResponseBody self = new DeleteAirflowResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAirflowResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DeleteAirflowResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DeleteAirflowResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DeleteAirflowResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteAirflowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteAirflowResponseBody setRoot(DeleteAirflowResponseBodyRoot root) {
        this.root = root;
        return this;
    }
    public DeleteAirflowResponseBodyRoot getRoot() {
        return this.root;
    }

    public DeleteAirflowResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteAirflowResponseBodyRootResponses extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        /**
         * <strong>example:</strong>
         * <p>af-test****</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static DeleteAirflowResponseBodyRootResponses build(java.util.Map<String, ?> map) throws Exception {
            DeleteAirflowResponseBodyRootResponses self = new DeleteAirflowResponseBodyRootResponses();
            return TeaModel.build(map, self);
        }

        public DeleteAirflowResponseBodyRootResponses setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public DeleteAirflowResponseBodyRootResponses setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class DeleteAirflowResponseBodyRoot extends TeaModel {
        @NameInMap("Responses")
        public java.util.List<DeleteAirflowResponseBodyRootResponses> responses;

        public static DeleteAirflowResponseBodyRoot build(java.util.Map<String, ?> map) throws Exception {
            DeleteAirflowResponseBodyRoot self = new DeleteAirflowResponseBodyRoot();
            return TeaModel.build(map, self);
        }

        public DeleteAirflowResponseBodyRoot setResponses(java.util.List<DeleteAirflowResponseBodyRootResponses> responses) {
            this.responses = responses;
            return this;
        }
        public java.util.List<DeleteAirflowResponseBodyRootResponses> getResponses() {
            return this.responses;
        }

    }

}
