// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class DescribeRulesResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeRulesResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>86DEBAC9-AB6A-59AB-9E5C-A540E579ECC9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRulesResponseBody self = new DescribeRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRulesResponseBody setData(DescribeRulesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeRulesResponseBodyData getData() {
        return this.data;
    }

    public DescribeRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeRulesResponseBodyDataContent extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CheckFailedResourceCount")
        public Long checkFailedResourceCount;

        /**
         * <strong>example:</strong>
         * <p>PASSED</p>
         */
        @NameInMap("CheckStatus")
        public String checkStatus;

        /**
         * <strong>example:</strong>
         * <p>1704157635</p>
         */
        @NameInMap("CheckTime")
        public Long checkTime;

        /**
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("ProductType")
        public String productType;

        /**
         * <strong>example:</strong>
         * <p>ACS::ECS::Instance</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RiskyResourceCount")
        public Long riskyResourceCount;

        /**
         * <strong>example:</strong>
         * <p>rule-bp11ggd8wr762</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <strong>example:</strong>
         * <p>ecs-backup</p>
         */
        @NameInMap("RuleTemplate")
        public String ruleTemplate;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalResourceCount")
        public Long totalResourceCount;

        public static DescribeRulesResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            DescribeRulesResponseBodyDataContent self = new DescribeRulesResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public DescribeRulesResponseBodyDataContent setCheckFailedResourceCount(Long checkFailedResourceCount) {
            this.checkFailedResourceCount = checkFailedResourceCount;
            return this;
        }
        public Long getCheckFailedResourceCount() {
            return this.checkFailedResourceCount;
        }

        public DescribeRulesResponseBodyDataContent setCheckStatus(String checkStatus) {
            this.checkStatus = checkStatus;
            return this;
        }
        public String getCheckStatus() {
            return this.checkStatus;
        }

        public DescribeRulesResponseBodyDataContent setCheckTime(Long checkTime) {
            this.checkTime = checkTime;
            return this;
        }
        public Long getCheckTime() {
            return this.checkTime;
        }

        public DescribeRulesResponseBodyDataContent setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public DescribeRulesResponseBodyDataContent setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeRulesResponseBodyDataContent setRiskyResourceCount(Long riskyResourceCount) {
            this.riskyResourceCount = riskyResourceCount;
            return this;
        }
        public Long getRiskyResourceCount() {
            return this.riskyResourceCount;
        }

        public DescribeRulesResponseBodyDataContent setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribeRulesResponseBodyDataContent setRuleTemplate(String ruleTemplate) {
            this.ruleTemplate = ruleTemplate;
            return this;
        }
        public String getRuleTemplate() {
            return this.ruleTemplate;
        }

        public DescribeRulesResponseBodyDataContent setTotalResourceCount(Long totalResourceCount) {
            this.totalResourceCount = totalResourceCount;
            return this;
        }
        public Long getTotalResourceCount() {
            return this.totalResourceCount;
        }

    }

    public static class DescribeRulesResponseBodyData extends TeaModel {
        @NameInMap("Content")
        public java.util.List<DescribeRulesResponseBodyDataContent> content;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <strong>example:</strong>
         * <p>0975951c75d7b41464c8d08ae17043ca</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <strong>example:</strong>
         * <p>42</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static DescribeRulesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeRulesResponseBodyData self = new DescribeRulesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeRulesResponseBodyData setContent(java.util.List<DescribeRulesResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<DescribeRulesResponseBodyDataContent> getContent() {
            return this.content;
        }

        public DescribeRulesResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public DescribeRulesResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public DescribeRulesResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
