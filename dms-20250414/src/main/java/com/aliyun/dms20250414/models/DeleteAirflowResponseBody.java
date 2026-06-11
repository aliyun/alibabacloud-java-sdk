// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DeleteAirflowResponseBody extends TeaModel {
    /**
     * <p>The details of the access denied error.</p>
     * 
     * <strong>example:</strong>
     * <p>NOT_FOUND</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Instance not found.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E0D21075-CD3E-4D98-8264-****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the deleted instance.</p>
     */
    @NameInMap("Root")
    public DeleteAirflowResponseBodyRoot root;

    /**
     * <p>Indicates whether the request was successful. The following values are returned:</p>
     * <ul>
     * <li><p><strong>true</strong>: The request was successful.</p>
     * </li>
     * <li><p><strong>false</strong>: The request failed.</p>
     * </li>
     * </ul>
     * 
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
         * <p>Indicates whether the request was successful. The following values are returned:</p>
         * <ul>
         * <li><p><strong>true</strong>: The request was successful.</p>
         * </li>
         * <li><p><strong>false</strong>: The request failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        /**
         * <p>The UUID of the asset instance.</p>
         * <blockquote>
         * <p>This result is not returned if no process exists under the asset.</p>
         * </blockquote>
         * 
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
        /**
         * <p>The details of the return value.</p>
         */
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
