// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteKnowledgeBaseBuildTaskResponseBody extends TeaModel {
    /**
     * <p>The business error code, which is used to determine the error type when the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidParameter</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The business data returned when the request is successful.</p>
     */
    @NameInMap("Data")
    public DeleteKnowledgeBaseBuildTaskResponseBodyData data;

    /**
     * <p>The security error message returned when the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>The request parameters are invalid</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique identifier of the request, which can be used to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>00000000-0000-4000-8000-000000000001</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteKnowledgeBaseBuildTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteKnowledgeBaseBuildTaskResponseBody self = new DeleteKnowledgeBaseBuildTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteKnowledgeBaseBuildTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteKnowledgeBaseBuildTaskResponseBody setData(DeleteKnowledgeBaseBuildTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteKnowledgeBaseBuildTaskResponseBodyData getData() {
        return this.data;
    }

    public DeleteKnowledgeBaseBuildTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteKnowledgeBaseBuildTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteKnowledgeBaseBuildTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteKnowledgeBaseBuildTaskResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the knowledge base.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678-1234-4234-8234-123456789abc</p>
         */
        @NameInMap("KnowledgeBaseId")
        public String knowledgeBaseId;

        /**
         * <p>The ID of the source task.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static DeleteKnowledgeBaseBuildTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteKnowledgeBaseBuildTaskResponseBodyData self = new DeleteKnowledgeBaseBuildTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteKnowledgeBaseBuildTaskResponseBodyData setKnowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }
        public String getKnowledgeBaseId() {
            return this.knowledgeBaseId;
        }

        public DeleteKnowledgeBaseBuildTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
