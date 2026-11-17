// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetKnowledgeBaseBuildTaskResultResponseBody extends TeaModel {
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
    public GetKnowledgeBaseBuildTaskResultResponseBodyData data;

    /**
     * <p>The error message returned when the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>The request parameters are invalid</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique identifier of the request, which can be used for troubleshooting.</p>
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

    public static GetKnowledgeBaseBuildTaskResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetKnowledgeBaseBuildTaskResultResponseBody self = new GetKnowledgeBaseBuildTaskResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetKnowledgeBaseBuildTaskResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetKnowledgeBaseBuildTaskResultResponseBody setData(GetKnowledgeBaseBuildTaskResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetKnowledgeBaseBuildTaskResultResponseBodyData getData() {
        return this.data;
    }

    public GetKnowledgeBaseBuildTaskResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetKnowledgeBaseBuildTaskResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetKnowledgeBaseBuildTaskResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetKnowledgeBaseBuildTaskResultResponseBodyData extends TeaModel {
        /**
         * <p>The temporary Object Storage Service (OSS) download URL issued to the current caller when this operation is called. The URL is not stored.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.invalid/short-lived-result-download">https://example.invalid/short-lived-result-download</a></p>
         */
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        /**
         * <p>The validity period of the download URL, in seconds. Request a new URL after it expires.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("ExpiresIn")
        public Integer expiresIn;

        /**
         * <p>The ID of the knowledge base to which the result belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678-1234-4234-8234-123456789abc</p>
         */
        @NameInMap("KnowledgeBaseId")
        public String knowledgeBaseId;

        /**
         * <p>The ID of the task instance that produced the result.</p>
         * 
         * <strong>example:</strong>
         * <p>20001</p>
         */
        @NameInMap("TaskInstanceId")
        public String taskInstanceId;

        public static GetKnowledgeBaseBuildTaskResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeBaseBuildTaskResultResponseBodyData self = new GetKnowledgeBaseBuildTaskResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeBaseBuildTaskResultResponseBodyData setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public GetKnowledgeBaseBuildTaskResultResponseBodyData setExpiresIn(Integer expiresIn) {
            this.expiresIn = expiresIn;
            return this;
        }
        public Integer getExpiresIn() {
            return this.expiresIn;
        }

        public GetKnowledgeBaseBuildTaskResultResponseBodyData setKnowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }
        public String getKnowledgeBaseId() {
            return this.knowledgeBaseId;
        }

        public GetKnowledgeBaseBuildTaskResultResponseBodyData setTaskInstanceId(String taskInstanceId) {
            this.taskInstanceId = taskInstanceId;
            return this;
        }
        public String getTaskInstanceId() {
            return this.taskInstanceId;
        }

    }

}
