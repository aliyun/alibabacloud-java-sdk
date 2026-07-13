// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class DescribeCheckDetailsResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public DescribeCheckDetailsResponseBodyData data;

    /**
     * <p>The unique ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>92793A50-0B97-59F1-BAEA-EAED83BA1998</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCheckDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCheckDetailsResponseBody self = new DescribeCheckDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCheckDetailsResponseBody setData(DescribeCheckDetailsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeCheckDetailsResponseBodyData getData() {
        return this.data;
    }

    public DescribeCheckDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCheckDetailsResponseBodyDataContent extends TeaModel {
        /**
         * <p>The check status. Valid values: NOT_CHECKED, PASSED, FAILED, CHECKING, and CHECK_FAILED.</p>
         * 
         * <strong>example:</strong>
         * <p>PASSED</p>
         */
        @NameInMap("CheckStatus")
        public String checkStatus;

        /**
         * <p>The time when the check was performed.</p>
         * 
         * <strong>example:</strong>
         * <p>1701725715</p>
         */
        @NameInMap("CheckTime")
        public Long checkTime;

        /**
         * <p>The check details.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ecsAutoSnapshotPolicyIds&quot;:[],&quot;hbrBackupPlans&quot;:[{&quot;planId&quot;:&quot;po-xxxxxxxx&quot;,&quot;sourceType&quot;:&quot;UDM_ECS&quot;}]}</p>
         */
        @NameInMap("Detail")
        public String detail;

        /**
         * <p>The type of the cloud service.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("ProductType")
        public String productType;

        /**
         * <p>The globally unique Alibaba Cloud Resource Name (ARN) of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ecs:123<em><strong>890:cn-shanghai:instance/i-001</strong></em>90</p>
         */
        @NameInMap("ResourceArn")
        public String resourceArn;

        /**
         * <p>The unique ID of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>i-xxxxxxxx</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The name of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>test server</p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

        /**
         * <p>The ID of the resource owner.</p>
         * 
         * <strong>example:</strong>
         * <p>123***7890</p>
         */
        @NameInMap("ResourceOwnerId")
        public Long resourceOwnerId;

        /**
         * <p>The type of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS::ECS::Instance</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The unique ID of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>rule-xxxxxxxx</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The rule template.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs-backup</p>
         */
        @NameInMap("RuleTemplate")
        public String ruleTemplate;

        public static DescribeCheckDetailsResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            DescribeCheckDetailsResponseBodyDataContent self = new DescribeCheckDetailsResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public DescribeCheckDetailsResponseBodyDataContent setCheckStatus(String checkStatus) {
            this.checkStatus = checkStatus;
            return this;
        }
        public String getCheckStatus() {
            return this.checkStatus;
        }

        public DescribeCheckDetailsResponseBodyDataContent setCheckTime(Long checkTime) {
            this.checkTime = checkTime;
            return this;
        }
        public Long getCheckTime() {
            return this.checkTime;
        }

        public DescribeCheckDetailsResponseBodyDataContent setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public DescribeCheckDetailsResponseBodyDataContent setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public DescribeCheckDetailsResponseBodyDataContent setResourceArn(String resourceArn) {
            this.resourceArn = resourceArn;
            return this;
        }
        public String getResourceArn() {
            return this.resourceArn;
        }

        public DescribeCheckDetailsResponseBodyDataContent setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeCheckDetailsResponseBodyDataContent setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public DescribeCheckDetailsResponseBodyDataContent setResourceOwnerId(Long resourceOwnerId) {
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }
        public Long getResourceOwnerId() {
            return this.resourceOwnerId;
        }

        public DescribeCheckDetailsResponseBodyDataContent setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeCheckDetailsResponseBodyDataContent setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribeCheckDetailsResponseBodyDataContent setRuleTemplate(String ruleTemplate) {
            this.ruleTemplate = ruleTemplate;
            return this;
        }
        public String getRuleTemplate() {
            return this.ruleTemplate;
        }

    }

    public static class DescribeCheckDetailsResponseBodyData extends TeaModel {
        /**
         * <p>The collection of records returned by this request.</p>
         */
        @NameInMap("Content")
        public java.util.List<DescribeCheckDetailsResponseBodyDataContent> content;

        /**
         * <p>The maximum number of entries returned in this response.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <p>The token that is used to retrieve the next page of results. If this parameter is empty, it indicates that all data has been retrieved.</p>
         * 
         * <strong>example:</strong>
         * <p>CAESGgoSChAKDGNvbXBsZXRlVGltZRABCgQiAggAGAAiQAoJAOTzWWYAAAAACjMDLgAAADFTNzMyZDMwMzAzMDM4NzA3NTcwMzY2MjMwNzY2ODcyMzAzMTY2Nzg3ODY5MzY=</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The total number of entries that meet the query conditions. This parameter is optional and is not returned by default.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static DescribeCheckDetailsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCheckDetailsResponseBodyData self = new DescribeCheckDetailsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeCheckDetailsResponseBodyData setContent(java.util.List<DescribeCheckDetailsResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<DescribeCheckDetailsResponseBodyDataContent> getContent() {
            return this.content;
        }

        public DescribeCheckDetailsResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public DescribeCheckDetailsResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public DescribeCheckDetailsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
