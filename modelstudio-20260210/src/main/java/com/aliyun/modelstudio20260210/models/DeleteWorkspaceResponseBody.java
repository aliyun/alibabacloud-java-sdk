// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class DeleteWorkspaceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("failReasons")
    public java.util.List<DeleteWorkspaceResponseBodyFailReasons> failReasons;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("isDeleted")
    public Boolean isDeleted;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>DFD55E7B-0615-5343-BDA0-FBEE86F29935</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static DeleteWorkspaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkspaceResponseBody self = new DeleteWorkspaceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteWorkspaceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteWorkspaceResponseBody setFailReasons(java.util.List<DeleteWorkspaceResponseBodyFailReasons> failReasons) {
        this.failReasons = failReasons;
        return this;
    }
    public java.util.List<DeleteWorkspaceResponseBodyFailReasons> getFailReasons() {
        return this.failReasons;
    }

    public DeleteWorkspaceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DeleteWorkspaceResponseBody setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
        return this;
    }
    public Boolean getIsDeleted() {
        return this.isDeleted;
    }

    public DeleteWorkspaceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteWorkspaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteWorkspaceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteWorkspaceResponseBodyFailReasons extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>API Key exists. Please clear them first.</p>
         */
        @NameInMap("reason")
        public String reason;

        /**
         * <strong>example:</strong>
         * <p>API Key</p>
         */
        @NameInMap("resourceType")
        public String resourceType;

        public static DeleteWorkspaceResponseBodyFailReasons build(java.util.Map<String, ?> map) throws Exception {
            DeleteWorkspaceResponseBodyFailReasons self = new DeleteWorkspaceResponseBodyFailReasons();
            return TeaModel.build(map, self);
        }

        public DeleteWorkspaceResponseBodyFailReasons setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DeleteWorkspaceResponseBodyFailReasons setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
