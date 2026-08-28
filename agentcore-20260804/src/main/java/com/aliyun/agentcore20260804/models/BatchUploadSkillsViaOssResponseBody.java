// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class BatchUploadSkillsViaOssResponseBody extends TeaModel {
    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public BatchUploadSkillsViaOssResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A1B2C3D4-E5F6-47A8-90AB-CDEF12345678</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static BatchUploadSkillsViaOssResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchUploadSkillsViaOssResponseBody self = new BatchUploadSkillsViaOssResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchUploadSkillsViaOssResponseBody setData(BatchUploadSkillsViaOssResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BatchUploadSkillsViaOssResponseBodyData getData() {
        return this.data;
    }

    public BatchUploadSkillsViaOssResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class BatchUploadSkillsViaOssResponseBodyDataResults extends TeaModel {
        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>VALIDATION_FAILED</p>
         */
        @NameInMap("errorCode")
        public String errorCode;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Parameter validation failed</p>
         */
        @NameInMap("errorMessage")
        public String errorMessage;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>skill-example</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The resource owner.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        @NameInMap("owner")
        public String owner;

        /**
         * <p>Indicates whether the request is successful.</p>
         */
        @NameInMap("success")
        public Boolean success;

        public static BatchUploadSkillsViaOssResponseBodyDataResults build(java.util.Map<String, ?> map) throws Exception {
            BatchUploadSkillsViaOssResponseBodyDataResults self = new BatchUploadSkillsViaOssResponseBodyDataResults();
            return TeaModel.build(map, self);
        }

        public BatchUploadSkillsViaOssResponseBodyDataResults setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public BatchUploadSkillsViaOssResponseBodyDataResults setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public BatchUploadSkillsViaOssResponseBodyDataResults setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public BatchUploadSkillsViaOssResponseBodyDataResults setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public BatchUploadSkillsViaOssResponseBodyDataResults setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class BatchUploadSkillsViaOssResponseBodyData extends TeaModel {
        /**
         * <p>The batch upload results.</p>
         */
        @NameInMap("results")
        public java.util.List<BatchUploadSkillsViaOssResponseBodyDataResults> results;

        public static BatchUploadSkillsViaOssResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchUploadSkillsViaOssResponseBodyData self = new BatchUploadSkillsViaOssResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchUploadSkillsViaOssResponseBodyData setResults(java.util.List<BatchUploadSkillsViaOssResponseBodyDataResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<BatchUploadSkillsViaOssResponseBodyDataResults> getResults() {
            return this.results;
        }

    }

}
