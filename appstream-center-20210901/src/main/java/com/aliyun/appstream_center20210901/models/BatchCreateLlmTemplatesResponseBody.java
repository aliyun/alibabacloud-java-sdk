// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class BatchCreateLlmTemplatesResponseBody extends TeaModel {
    @NameInMap("Data")
    public BatchCreateLlmTemplatesResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static BatchCreateLlmTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateLlmTemplatesResponseBody self = new BatchCreateLlmTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchCreateLlmTemplatesResponseBody setData(BatchCreateLlmTemplatesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BatchCreateLlmTemplatesResponseBodyData getData() {
        return this.data;
    }

    public BatchCreateLlmTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class BatchCreateLlmTemplatesResponseBodyDataSkippedItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>qwen3.5-plus</p>
         */
        @NameInMap("LlmCode")
        public String llmCode;

        /**
         * <strong>example:</strong>
         * <p>LLM template already exists with same providerTemplateId and llmCode.</p>
         */
        @NameInMap("Reason")
        public String reason;

        public static BatchCreateLlmTemplatesResponseBodyDataSkippedItems build(java.util.Map<String, ?> map) throws Exception {
            BatchCreateLlmTemplatesResponseBodyDataSkippedItems self = new BatchCreateLlmTemplatesResponseBodyDataSkippedItems();
            return TeaModel.build(map, self);
        }

        public BatchCreateLlmTemplatesResponseBodyDataSkippedItems setLlmCode(String llmCode) {
            this.llmCode = llmCode;
            return this;
        }
        public String getLlmCode() {
            return this.llmCode;
        }

        public BatchCreateLlmTemplatesResponseBodyDataSkippedItems setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

    }

    public static class BatchCreateLlmTemplatesResponseBodyData extends TeaModel {
        @NameInMap("LlmTemplateIds")
        public java.util.List<String> llmTemplateIds;

        @NameInMap("SkippedItems")
        public java.util.List<BatchCreateLlmTemplatesResponseBodyDataSkippedItems> skippedItems;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("SuccessCount")
        public Integer successCount;

        /**
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static BatchCreateLlmTemplatesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchCreateLlmTemplatesResponseBodyData self = new BatchCreateLlmTemplatesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchCreateLlmTemplatesResponseBodyData setLlmTemplateIds(java.util.List<String> llmTemplateIds) {
            this.llmTemplateIds = llmTemplateIds;
            return this;
        }
        public java.util.List<String> getLlmTemplateIds() {
            return this.llmTemplateIds;
        }

        public BatchCreateLlmTemplatesResponseBodyData setSkippedItems(java.util.List<BatchCreateLlmTemplatesResponseBodyDataSkippedItems> skippedItems) {
            this.skippedItems = skippedItems;
            return this;
        }
        public java.util.List<BatchCreateLlmTemplatesResponseBodyDataSkippedItems> getSkippedItems() {
            return this.skippedItems;
        }

        public BatchCreateLlmTemplatesResponseBodyData setSuccessCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }
        public Integer getSuccessCount() {
            return this.successCount;
        }

        public BatchCreateLlmTemplatesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
