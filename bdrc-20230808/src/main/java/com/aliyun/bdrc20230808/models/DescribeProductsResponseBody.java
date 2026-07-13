// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class DescribeProductsResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public DescribeProductsResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>30FB202A-1D22-5394-AB02-4477CDFCF51F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeProductsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeProductsResponseBody self = new DescribeProductsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeProductsResponseBody setData(DescribeProductsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeProductsResponseBodyData getData() {
        return this.data;
    }

    public DescribeProductsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeProductsResponseBodyDataContentProtectionScoreDistributionRange extends TeaModel {
        /**
         * <p>The lower bound of the score range, inclusive.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("From")
        public Integer from;

        /**
         * <p>The upper bound of the score range, inclusive.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("To")
        public Integer to;

        public static DescribeProductsResponseBodyDataContentProtectionScoreDistributionRange build(java.util.Map<String, ?> map) throws Exception {
            DescribeProductsResponseBodyDataContentProtectionScoreDistributionRange self = new DescribeProductsResponseBodyDataContentProtectionScoreDistributionRange();
            return TeaModel.build(map, self);
        }

        public DescribeProductsResponseBodyDataContentProtectionScoreDistributionRange setFrom(Integer from) {
            this.from = from;
            return this;
        }
        public Integer getFrom() {
            return this.from;
        }

        public DescribeProductsResponseBodyDataContentProtectionScoreDistributionRange setTo(Integer to) {
            this.to = to;
            return this;
        }
        public Integer getTo() {
            return this.to;
        }

    }

    public static class DescribeProductsResponseBodyDataContentProtectionScoreDistribution extends TeaModel {
        /**
         * <p>The count of resources within this score range.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The score range.</p>
         */
        @NameInMap("Range")
        public DescribeProductsResponseBodyDataContentProtectionScoreDistributionRange range;

        public static DescribeProductsResponseBodyDataContentProtectionScoreDistribution build(java.util.Map<String, ?> map) throws Exception {
            DescribeProductsResponseBodyDataContentProtectionScoreDistribution self = new DescribeProductsResponseBodyDataContentProtectionScoreDistribution();
            return TeaModel.build(map, self);
        }

        public DescribeProductsResponseBodyDataContentProtectionScoreDistribution setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeProductsResponseBodyDataContentProtectionScoreDistribution setRange(DescribeProductsResponseBodyDataContentProtectionScoreDistributionRange range) {
            this.range = range;
            return this;
        }
        public DescribeProductsResponseBodyDataContentProtectionScoreDistributionRange getRange() {
            return this.range;
        }

    }

    public static class DescribeProductsResponseBodyDataContent extends TeaModel {
        /**
         * <p>The count of failed check items.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CheckFailedCount")
        public Long checkFailedCount;

        /**
         * <p>The count of resources that failed the check.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CheckFailedResourceCount")
        public Long checkFailedResourceCount;

        /**
         * <p>The count of resources for which the check is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DisableCheckResourceCount")
        public Long disableCheckResourceCount;

        /**
         * <p>Indicates whether the data protection score is enabled for the cloud product.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableCheck")
        public Boolean enableCheck;

        /**
         * <p>The cloud product type, such as <code>ECS</code> and <code>OSS</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>oss</p>
         */
        @NameInMap("ProductType")
        public String productType;

        /**
         * <p>The data protection score, ranging from 0 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("ProtectionScore")
        public Integer protectionScore;

        /**
         * <p>The distribution of resources across different score ranges.</p>
         */
        @NameInMap("ProtectionScoreDistribution")
        public java.util.List<DescribeProductsResponseBodyDataContentProtectionScoreDistribution> protectionScoreDistribution;

        /**
         * <p>The UNIX timestamp of the last data protection score update.</p>
         * 
         * <strong>example:</strong>
         * <p>1726036498</p>
         */
        @NameInMap("ProtectionScoreUpdatedTime")
        public Long protectionScoreUpdatedTime;

        /**
         * <p>The count of risky check items.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RiskCount")
        public Long riskCount;

        /**
         * <p>The count of risky resources.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RiskyResourceCount")
        public Long riskyResourceCount;

        /**
         * <p>The total count of resources for the cloud product.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalResourceCount")
        public Long totalResourceCount;

        /**
         * <p>The count of resources pending a check.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("WaitForCheckResourceCount")
        public Long waitForCheckResourceCount;

        public static DescribeProductsResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            DescribeProductsResponseBodyDataContent self = new DescribeProductsResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public DescribeProductsResponseBodyDataContent setCheckFailedCount(Long checkFailedCount) {
            this.checkFailedCount = checkFailedCount;
            return this;
        }
        public Long getCheckFailedCount() {
            return this.checkFailedCount;
        }

        public DescribeProductsResponseBodyDataContent setCheckFailedResourceCount(Long checkFailedResourceCount) {
            this.checkFailedResourceCount = checkFailedResourceCount;
            return this;
        }
        public Long getCheckFailedResourceCount() {
            return this.checkFailedResourceCount;
        }

        public DescribeProductsResponseBodyDataContent setDisableCheckResourceCount(Long disableCheckResourceCount) {
            this.disableCheckResourceCount = disableCheckResourceCount;
            return this;
        }
        public Long getDisableCheckResourceCount() {
            return this.disableCheckResourceCount;
        }

        public DescribeProductsResponseBodyDataContent setEnableCheck(Boolean enableCheck) {
            this.enableCheck = enableCheck;
            return this;
        }
        public Boolean getEnableCheck() {
            return this.enableCheck;
        }

        public DescribeProductsResponseBodyDataContent setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public DescribeProductsResponseBodyDataContent setProtectionScore(Integer protectionScore) {
            this.protectionScore = protectionScore;
            return this;
        }
        public Integer getProtectionScore() {
            return this.protectionScore;
        }

        public DescribeProductsResponseBodyDataContent setProtectionScoreDistribution(java.util.List<DescribeProductsResponseBodyDataContentProtectionScoreDistribution> protectionScoreDistribution) {
            this.protectionScoreDistribution = protectionScoreDistribution;
            return this;
        }
        public java.util.List<DescribeProductsResponseBodyDataContentProtectionScoreDistribution> getProtectionScoreDistribution() {
            return this.protectionScoreDistribution;
        }

        public DescribeProductsResponseBodyDataContent setProtectionScoreUpdatedTime(Long protectionScoreUpdatedTime) {
            this.protectionScoreUpdatedTime = protectionScoreUpdatedTime;
            return this;
        }
        public Long getProtectionScoreUpdatedTime() {
            return this.protectionScoreUpdatedTime;
        }

        public DescribeProductsResponseBodyDataContent setRiskCount(Long riskCount) {
            this.riskCount = riskCount;
            return this;
        }
        public Long getRiskCount() {
            return this.riskCount;
        }

        public DescribeProductsResponseBodyDataContent setRiskyResourceCount(Long riskyResourceCount) {
            this.riskyResourceCount = riskyResourceCount;
            return this;
        }
        public Long getRiskyResourceCount() {
            return this.riskyResourceCount;
        }

        public DescribeProductsResponseBodyDataContent setTotalResourceCount(Long totalResourceCount) {
            this.totalResourceCount = totalResourceCount;
            return this;
        }
        public Long getTotalResourceCount() {
            return this.totalResourceCount;
        }

        public DescribeProductsResponseBodyDataContent setWaitForCheckResourceCount(Long waitForCheckResourceCount) {
            this.waitForCheckResourceCount = waitForCheckResourceCount;
            return this;
        }
        public Long getWaitForCheckResourceCount() {
            return this.waitForCheckResourceCount;
        }

    }

    public static class DescribeProductsResponseBodyData extends TeaModel {
        /**
         * <p>A list of cloud products and their data protection status.</p>
         */
        @NameInMap("Content")
        public java.util.List<DescribeProductsResponseBodyDataContent> content;

        /**
         * <p>The maximum number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <p>The token for the next page of results. If this parameter is absent from the response, all results have been retrieved.</p>
         * 
         * <strong>example:</strong>
         * <p>b4fd3cffcacafd65e3818a0b9b2ff9a2</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The total number of entries that match the query. This parameter is not returned by default.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static DescribeProductsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeProductsResponseBodyData self = new DescribeProductsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeProductsResponseBodyData setContent(java.util.List<DescribeProductsResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<DescribeProductsResponseBodyDataContent> getContent() {
            return this.content;
        }

        public DescribeProductsResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public DescribeProductsResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public DescribeProductsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
