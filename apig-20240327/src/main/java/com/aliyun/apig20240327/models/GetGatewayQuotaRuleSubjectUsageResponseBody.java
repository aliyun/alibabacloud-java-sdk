// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetGatewayQuotaRuleSubjectUsageResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response data.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;usedAmount&quot;:500}</p>
     */
    @NameInMap("data")
    public GetGatewayQuotaRuleSubjectUsageResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetGatewayQuotaRuleSubjectUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGatewayQuotaRuleSubjectUsageResponseBody self = new GetGatewayQuotaRuleSubjectUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGatewayQuotaRuleSubjectUsageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetGatewayQuotaRuleSubjectUsageResponseBody setData(GetGatewayQuotaRuleSubjectUsageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetGatewayQuotaRuleSubjectUsageResponseBodyData getData() {
        return this.data;
    }

    public GetGatewayQuotaRuleSubjectUsageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetGatewayQuotaRuleSubjectUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetGatewayQuotaRuleSubjectUsageResponseBodyDataDetailsItems extends TeaModel {
        /**
         * <p>The cached token consumption.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("cachedAmount")
        public Long cachedAmount;

        /**
         * <p>The exact value of cached consumption. Supports decimals in credit scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>10.5</p>
         */
        @NameInMap("cachedAmountDecimal")
        public Double cachedAmountDecimal;

        /**
         * <p>The consumer name.</p>
         * 
         * <strong>example:</strong>
         * <p>consumer-a</p>
         */
        @NameInMap("consumer")
        public String consumer;

        /**
         * <p>The input token consumption.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("inputAmount")
        public Long inputAmount;

        /**
         * <p>The exact value of input consumption. Supports decimals in credit scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>120.5</p>
         */
        @NameInMap("inputAmountDecimal")
        public Double inputAmountDecimal;

        /**
         * <p>The model name.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-plus</p>
         */
        @NameInMap("model")
        public String model;

        /**
         * <p>The output token consumption.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("outputAmount")
        public Long outputAmount;

        /**
         * <p>The exact value of output consumption. Supports decimals in credit scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>80.5</p>
         */
        @NameInMap("outputAmountDecimal")
        public Double outputAmountDecimal;

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>req-123456</p>
         */
        @NameInMap("requestId")
        public String requestId;

        /**
         * <p>The consumption (request) time in the format of YYYY-MM-DD.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-05</p>
         */
        @NameInMap("startTime")
        public String startTime;

        /**
         * <p>The total consumption.</p>
         * 
         * <strong>example:</strong>
         * <p>210</p>
         */
        @NameInMap("usedAmount")
        public Long usedAmount;

        /**
         * <p>The exact value of total consumption. Supports decimals in credit scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>210.5</p>
         */
        @NameInMap("usedAmountDecimal")
        public Double usedAmountDecimal;

        public static GetGatewayQuotaRuleSubjectUsageResponseBodyDataDetailsItems build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayQuotaRuleSubjectUsageResponseBodyDataDetailsItems self = new GetGatewayQuotaRuleSubjectUsageResponseBodyDataDetailsItems();
            return TeaModel.build(map, self);
        }

        public GetGatewayQuotaRuleSubjectUsageResponseBodyDataDetailsItems setCachedAmount(Long cachedAmount) {
            this.cachedAmount = cachedAmount;
            return this;
        }
        public Long getCachedAmount() {
            return this.cachedAmount;
        }

        public GetGatewayQuotaRuleSubjectUsageResponseBodyDataDetailsItems setCachedAmountDecimal(Double cachedAmountDecimal) {
            this.cachedAmountDecimal = cachedAmountDecimal;
            return this;
        }
        public Double getCachedAmountDecimal() {
            return this.cachedAmountDecimal;
        }

        public GetGatewayQuotaRuleSubjectUsageResponseBodyDataDetailsItems setConsumer(String consumer) {
            this.consumer = consumer;
            return this;
        }
        public String getConsumer() {
            return this.consumer;
        }

        public GetGatewayQuotaRuleSubjectUsageResponseBodyDataDetailsItems setInputAmount(Long inputAmount) {
            this.inputAmount = inputAmount;
            return this;
        }
        public Long getInputAmount() {
            return this.inputAmount;
        }

        public GetGatewayQuotaRuleSubjectUsageResponseBodyDataDetailsItems setInputAmountDecimal(Double inputAmountDecimal) {
            this.inputAmountDecimal = inputAmountDecimal;
            return this;
        }
        public Double getInputAmountDecimal() {
            return this.inputAmountDecimal;
        }

        public GetGatewayQuotaRuleSubjectUsageResponseBodyDataDetailsItems setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public GetGatewayQuotaRuleSubjectUsageResponseBodyDataDetailsItems setOutputAmount(Long outputAmount) {
            this.outputAmount = outputAmount;
            return this;
        }
        public Long getOutputAmount() {
            return this.outputAmount;
        }

        public GetGatewayQuotaRuleSubjectUsageResponseBodyDataDetailsItems setOutputAmountDecimal(Double outputAmountDecimal) {
            this.outputAmountDecimal = outputAmountDecimal;
            return this;
        }
        public Double getOutputAmountDecimal() {
            return this.outputAmountDecimal;
        }

        public GetGatewayQuotaRuleSubjectUsageResponseBodyDataDetailsItems setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public GetGatewayQuotaRuleSubjectUsageResponseBodyDataDetailsItems setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetGatewayQuotaRuleSubjectUsageResponseBodyDataDetailsItems setUsedAmount(Long usedAmount) {
            this.usedAmount = usedAmount;
            return this;
        }
        public Long getUsedAmount() {
            return this.usedAmount;
        }

        public GetGatewayQuotaRuleSubjectUsageResponseBodyDataDetailsItems setUsedAmountDecimal(Double usedAmountDecimal) {
            this.usedAmountDecimal = usedAmountDecimal;
            return this;
        }
        public Double getUsedAmountDecimal() {
            return this.usedAmountDecimal;
        }

    }

    public static class GetGatewayQuotaRuleSubjectUsageResponseBodyDataDetails extends TeaModel {
        /**
         * <p>The list of usage details.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;model&quot;:&quot;qwen-plus&quot;,\&quot;usedAmount\&quot;:210}]</p>
         */
        @NameInMap("items")
        public java.util.List<GetGatewayQuotaRuleSubjectUsageResponseBodyDataDetailsItems> items;

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNumber")
        public Integer pageNumber;

        /**
         * <p>The current page size.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("totalSize")
        public Integer totalSize;

        public static GetGatewayQuotaRuleSubjectUsageResponseBodyDataDetails build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayQuotaRuleSubjectUsageResponseBodyDataDetails self = new GetGatewayQuotaRuleSubjectUsageResponseBodyDataDetails();
            return TeaModel.build(map, self);
        }

        public GetGatewayQuotaRuleSubjectUsageResponseBodyDataDetails setItems(java.util.List<GetGatewayQuotaRuleSubjectUsageResponseBodyDataDetailsItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<GetGatewayQuotaRuleSubjectUsageResponseBodyDataDetailsItems> getItems() {
            return this.items;
        }

        public GetGatewayQuotaRuleSubjectUsageResponseBodyDataDetails setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public GetGatewayQuotaRuleSubjectUsageResponseBodyDataDetails setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetGatewayQuotaRuleSubjectUsageResponseBodyDataDetails setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

    public static class GetGatewayQuotaRuleSubjectUsageResponseBodyData extends TeaModel {
        /**
         * <p>The total cached token consumption.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("cachedAmount")
        public Long cachedAmount;

        /**
         * <p>The exact value of total cached consumption. Supports decimals in credit scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>20.5</p>
         */
        @NameInMap("cachedAmountDecimal")
        public Double cachedAmountDecimal;

        /**
         * <p>The paginated consumption details.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;totalSize&quot;:100}</p>
         */
        @NameInMap("details")
        public GetGatewayQuotaRuleSubjectUsageResponseBodyDataDetails details;

        /**
         * <p>The total input token consumption.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("inputAmount")
        public Long inputAmount;

        /**
         * <p>The exact value of total input consumption. Supports decimals in credit scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>300.5</p>
         */
        @NameInMap("inputAmountDecimal")
        public Double inputAmountDecimal;

        /**
         * <p>The total output token consumption.</p>
         * 
         * <strong>example:</strong>
         * <p>180</p>
         */
        @NameInMap("outputAmount")
        public Long outputAmount;

        /**
         * <p>The exact value of total output consumption. Supports decimals in credit scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>180.5</p>
         */
        @NameInMap("outputAmountDecimal")
        public Double outputAmountDecimal;

        /**
         * <p>Indicates whether the quota limit is exceeded.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("overLimit")
        public Boolean overLimit;

        /**
         * <p>The quota dimension. Valid values: token and credit.</p>
         * 
         * <strong>example:</strong>
         * <p>token</p>
         */
        @NameInMap("quotaDimension")
        public String quotaDimension;

        /**
         * <p>The subject type. Valid values: consumer and consumer_group.</p>
         * 
         * <strong>example:</strong>
         * <p>consumer_group</p>
         */
        @NameInMap("subjectType")
        public String subjectType;

        /**
         * <p>The total quota of the subject.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("totalQuota")
        public Long totalQuota;

        /**
         * <p>The total used amount of the subject.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("usedAmount")
        public Long usedAmount;

        /**
         * <p>The exact value of the total used amount of the subject. Supports decimals in credit scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>500.5</p>
         */
        @NameInMap("usedAmountDecimal")
        public Double usedAmountDecimal;

        public static GetGatewayQuotaRuleSubjectUsageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayQuotaRuleSubjectUsageResponseBodyData self = new GetGatewayQuotaRuleSubjectUsageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetGatewayQuotaRuleSubjectUsageResponseBodyData setCachedAmount(Long cachedAmount) {
            this.cachedAmount = cachedAmount;
            return this;
        }
        public Long getCachedAmount() {
            return this.cachedAmount;
        }

        public GetGatewayQuotaRuleSubjectUsageResponseBodyData setCachedAmountDecimal(Double cachedAmountDecimal) {
            this.cachedAmountDecimal = cachedAmountDecimal;
            return this;
        }
        public Double getCachedAmountDecimal() {
            return this.cachedAmountDecimal;
        }

        public GetGatewayQuotaRuleSubjectUsageResponseBodyData setDetails(GetGatewayQuotaRuleSubjectUsageResponseBodyDataDetails details) {
            this.details = details;
            return this;
        }
        public GetGatewayQuotaRuleSubjectUsageResponseBodyDataDetails getDetails() {
            return this.details;
        }

        public GetGatewayQuotaRuleSubjectUsageResponseBodyData setInputAmount(Long inputAmount) {
            this.inputAmount = inputAmount;
            return this;
        }
        public Long getInputAmount() {
            return this.inputAmount;
        }

        public GetGatewayQuotaRuleSubjectUsageResponseBodyData setInputAmountDecimal(Double inputAmountDecimal) {
            this.inputAmountDecimal = inputAmountDecimal;
            return this;
        }
        public Double getInputAmountDecimal() {
            return this.inputAmountDecimal;
        }

        public GetGatewayQuotaRuleSubjectUsageResponseBodyData setOutputAmount(Long outputAmount) {
            this.outputAmount = outputAmount;
            return this;
        }
        public Long getOutputAmount() {
            return this.outputAmount;
        }

        public GetGatewayQuotaRuleSubjectUsageResponseBodyData setOutputAmountDecimal(Double outputAmountDecimal) {
            this.outputAmountDecimal = outputAmountDecimal;
            return this;
        }
        public Double getOutputAmountDecimal() {
            return this.outputAmountDecimal;
        }

        public GetGatewayQuotaRuleSubjectUsageResponseBodyData setOverLimit(Boolean overLimit) {
            this.overLimit = overLimit;
            return this;
        }
        public Boolean getOverLimit() {
            return this.overLimit;
        }

        public GetGatewayQuotaRuleSubjectUsageResponseBodyData setQuotaDimension(String quotaDimension) {
            this.quotaDimension = quotaDimension;
            return this;
        }
        public String getQuotaDimension() {
            return this.quotaDimension;
        }

        public GetGatewayQuotaRuleSubjectUsageResponseBodyData setSubjectType(String subjectType) {
            this.subjectType = subjectType;
            return this;
        }
        public String getSubjectType() {
            return this.subjectType;
        }

        public GetGatewayQuotaRuleSubjectUsageResponseBodyData setTotalQuota(Long totalQuota) {
            this.totalQuota = totalQuota;
            return this;
        }
        public Long getTotalQuota() {
            return this.totalQuota;
        }

        public GetGatewayQuotaRuleSubjectUsageResponseBodyData setUsedAmount(Long usedAmount) {
            this.usedAmount = usedAmount;
            return this;
        }
        public Long getUsedAmount() {
            return this.usedAmount;
        }

        public GetGatewayQuotaRuleSubjectUsageResponseBodyData setUsedAmountDecimal(Double usedAmountDecimal) {
            this.usedAmountDecimal = usedAmountDecimal;
            return this;
        }
        public Double getUsedAmountDecimal() {
            return this.usedAmountDecimal;
        }

    }

}
