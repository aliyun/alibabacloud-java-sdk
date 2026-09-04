// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeCreditDetailResponseBody extends TeaModel {
    /**
     * <p>The response object.</p>
     */
    @NameInMap("Data")
    public DescribeCreditDetailResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCreditDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCreditDetailResponseBody self = new DescribeCreditDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCreditDetailResponseBody setData(DescribeCreditDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeCreditDetailResponseBodyData getData() {
        return this.data;
    }

    public DescribeCreditDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCreditDetailResponseBodyDataDetails extends TeaModel {
        /**
         * <p>The agent type. This field is populated only when querying by a single agent type.</p>
         * 
         * <strong>example:</strong>
         * <p>cloudphone_enterprise</p>
         */
        @NameInMap("AgentType")
        public String agentType;

        /**
         * <p>The API key name.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("ApiKeyName")
        public String apiKeyName;

        /**
         * <p>The number of cached tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("CachedTokens")
        public Long cachedTokens;

        /**
         * <p>The time when the change occurred.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-30T08:14:02Z</p>
         */
        @NameInMap("ChangeTime")
        public String changeTime;

        /**
         * <p>The credit change amount.</p>
         * 
         * <strong>example:</strong>
         * <p>0.7637</p>
         */
        @NameInMap("CreditChange")
        public String creditChange;

        /**
         * <p>The task description.</p>
         * 
         * <strong>example:</strong>
         * <p>Open Xiaohongshu</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The model inference duration, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3000</p>
         */
        @NameInMap("DurationMs")
        public Long durationMs;

        /**
         * <p>The number of input tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("InputTokens")
        public Long inputTokens;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>acp-12oe0l75vl7o5****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>my-instance</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The model ID.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-max</p>
         */
        @NameInMap("ModelId")
        public String modelId;

        /**
         * <p>The number of output tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("OutputTokens")
        public Long outputTokens;

        /**
         * <p>The credit or package ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cmag-0c1g77wjljl9h****</p>
         */
        @NameInMap("PackageId")
        public String packageId;

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1A923337-44D9-5CAD-B2A5-4B9E6628B1C8</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        /**
         * <p>The globally unique task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>t-1fr0k51pozyr5****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The total number of tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>350</p>
         */
        @NameInMap("TotalTokens")
        public Long totalTokens;

        /**
         * <p>The response time of the first token, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("TtftMs")
        public Long ttftMs;

        public static DescribeCreditDetailResponseBodyDataDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeCreditDetailResponseBodyDataDetails self = new DescribeCreditDetailResponseBodyDataDetails();
            return TeaModel.build(map, self);
        }

        public DescribeCreditDetailResponseBodyDataDetails setAgentType(String agentType) {
            this.agentType = agentType;
            return this;
        }
        public String getAgentType() {
            return this.agentType;
        }

        public DescribeCreditDetailResponseBodyDataDetails setApiKeyName(String apiKeyName) {
            this.apiKeyName = apiKeyName;
            return this;
        }
        public String getApiKeyName() {
            return this.apiKeyName;
        }

        public DescribeCreditDetailResponseBodyDataDetails setCachedTokens(Long cachedTokens) {
            this.cachedTokens = cachedTokens;
            return this;
        }
        public Long getCachedTokens() {
            return this.cachedTokens;
        }

        public DescribeCreditDetailResponseBodyDataDetails setChangeTime(String changeTime) {
            this.changeTime = changeTime;
            return this;
        }
        public String getChangeTime() {
            return this.changeTime;
        }

        public DescribeCreditDetailResponseBodyDataDetails setCreditChange(String creditChange) {
            this.creditChange = creditChange;
            return this;
        }
        public String getCreditChange() {
            return this.creditChange;
        }

        public DescribeCreditDetailResponseBodyDataDetails setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeCreditDetailResponseBodyDataDetails setDurationMs(Long durationMs) {
            this.durationMs = durationMs;
            return this;
        }
        public Long getDurationMs() {
            return this.durationMs;
        }

        public DescribeCreditDetailResponseBodyDataDetails setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public DescribeCreditDetailResponseBodyDataDetails setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeCreditDetailResponseBodyDataDetails setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeCreditDetailResponseBodyDataDetails setModelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        public String getModelId() {
            return this.modelId;
        }

        public DescribeCreditDetailResponseBodyDataDetails setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public DescribeCreditDetailResponseBodyDataDetails setPackageId(String packageId) {
            this.packageId = packageId;
            return this;
        }
        public String getPackageId() {
            return this.packageId;
        }

        public DescribeCreditDetailResponseBodyDataDetails setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public DescribeCreditDetailResponseBodyDataDetails setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeCreditDetailResponseBodyDataDetails setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

        public DescribeCreditDetailResponseBodyDataDetails setTtftMs(Long ttftMs) {
            this.ttftMs = ttftMs;
            return this;
        }
        public Long getTtftMs() {
            return this.ttftMs;
        }

    }

    public static class DescribeCreditDetailResponseBodyData extends TeaModel {
        /**
         * <p>The credit change details.</p>
         */
        @NameInMap("Details")
        public java.util.List<DescribeCreditDetailResponseBodyDataDetails> details;

        /**
         * <p>The token for the next query.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAV3MpHK1AP0pfERHZN5pu6kU+SQXzm0H9mu/FiSc****</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The page number for pagination. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <p>The number of entries per page. Default value: 10. Maximum value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of detail records.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        /**
         * <p>The total credit change.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCreditChange")
        public String totalCreditChange;

        public static DescribeCreditDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCreditDetailResponseBodyData self = new DescribeCreditDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeCreditDetailResponseBodyData setDetails(java.util.List<DescribeCreditDetailResponseBodyDataDetails> details) {
            this.details = details;
            return this;
        }
        public java.util.List<DescribeCreditDetailResponseBodyDataDetails> getDetails() {
            return this.details;
        }

        public DescribeCreditDetailResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public DescribeCreditDetailResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public DescribeCreditDetailResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeCreditDetailResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public DescribeCreditDetailResponseBodyData setTotalCreditChange(String totalCreditChange) {
            this.totalCreditChange = totalCreditChange;
            return this;
        }
        public String getTotalCreditChange() {
            return this.totalCreditChange;
        }

    }

}
