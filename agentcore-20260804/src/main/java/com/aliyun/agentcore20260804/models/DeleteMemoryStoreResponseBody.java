// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class DeleteMemoryStoreResponseBody extends TeaModel {
    /**
     * <p>The business status code.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The MemoryStore details.</p>
     */
    @NameInMap("data")
    public DeleteMemoryStoreResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>01A00000-0000-0000-0000-000000000001</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static DeleteMemoryStoreResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMemoryStoreResponseBody self = new DeleteMemoryStoreResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMemoryStoreResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteMemoryStoreResponseBody setData(DeleteMemoryStoreResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteMemoryStoreResponseBodyData getData() {
        return this.data;
    }

    public DeleteMemoryStoreResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DeleteMemoryStoreResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteMemoryStoreResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteMemoryStoreResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteMemoryStoreResponseBodyData extends TeaModel {
        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-23T10:00:00Z</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>The MemoryStore description.</p>
         * 
         * <strong>example:</strong>
         * <p>Used to store long-term user preferences</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The custom extraction instructions.</p>
         * 
         * <strong>example:</strong>
         * <p>Extract only long-term preferences explicitly expressed by the user</p>
         */
        @NameInMap("extractInstructions")
        public String extractInstructions;

        /**
         * <p>The MemoryStore ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ms-2f5f9c5a8d0e4c3b</p>
         */
        @NameInMap("memoryStoreId")
        public String memoryStoreId;

        /**
         * <p>The MemoryStore name. It cannot be modified after creation.</p>
         * 
         * <strong>example:</strong>
         * <p>customer-memory</p>
         */
        @NameInMap("memoryStoreName")
        public String memoryStoreName;

        /**
         * <p>The lifecycle state of the MemoryStore.</p>
         * 
         * <strong>example:</strong>
         * <p>Ready</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The last update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-23T10:05:00Z</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        /**
         * <p>The AgentCore workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-2f5f9c5a8d0e4c3b</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static DeleteMemoryStoreResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteMemoryStoreResponseBodyData self = new DeleteMemoryStoreResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteMemoryStoreResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public DeleteMemoryStoreResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DeleteMemoryStoreResponseBodyData setExtractInstructions(String extractInstructions) {
            this.extractInstructions = extractInstructions;
            return this;
        }
        public String getExtractInstructions() {
            return this.extractInstructions;
        }

        public DeleteMemoryStoreResponseBodyData setMemoryStoreId(String memoryStoreId) {
            this.memoryStoreId = memoryStoreId;
            return this;
        }
        public String getMemoryStoreId() {
            return this.memoryStoreId;
        }

        public DeleteMemoryStoreResponseBodyData setMemoryStoreName(String memoryStoreName) {
            this.memoryStoreName = memoryStoreName;
            return this;
        }
        public String getMemoryStoreName() {
            return this.memoryStoreName;
        }

        public DeleteMemoryStoreResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DeleteMemoryStoreResponseBodyData setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public DeleteMemoryStoreResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
