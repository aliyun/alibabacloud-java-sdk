// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class QueryCostCenterResourceResponseBody extends TeaModel {
    /**
     * <p>The data list.</p>
     */
    @NameInMap("CostCenterResourceDtoList")
    public java.util.List<QueryCostCenterResourceResponseBodyCostCenterResourceDtoList> costCenterResourceDtoList;

    /**
     * <p>The maximum number of records to return in a single query.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The response metadata.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Metadata")
    public Object metadata;

    /**
     * <p>The token for the next query. If this parameter is empty, no more results exist.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJwYWdlTnVtIjoyLCJwYWdlU2l6ZSI6MTB9</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>79EE7556-0CFD-44EB-9CD6-B3B526E3A85F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>2000</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static QueryCostCenterResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCostCenterResourceResponseBody self = new QueryCostCenterResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCostCenterResourceResponseBody setCostCenterResourceDtoList(java.util.List<QueryCostCenterResourceResponseBodyCostCenterResourceDtoList> costCenterResourceDtoList) {
        this.costCenterResourceDtoList = costCenterResourceDtoList;
        return this;
    }
    public java.util.List<QueryCostCenterResourceResponseBodyCostCenterResourceDtoList> getCostCenterResourceDtoList() {
        return this.costCenterResourceDtoList;
    }

    public QueryCostCenterResourceResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public QueryCostCenterResourceResponseBody setMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }
    public Object getMetadata() {
        return this.metadata;
    }

    public QueryCostCenterResourceResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public QueryCostCenterResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCostCenterResourceResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class QueryCostCenterResourceResponseBodyCostCenterResourceDtoList extends TeaModel {
        /**
         * <p>The add strategy.</p>
         * 
         * <strong>example:</strong>
         * <p>AUTO_ALLOCATE</p>
         */
        @NameInMap("AddStrategy")
        public String addStrategy;

        /**
         * <p>The Policy Name of the add policy.</p>
         * 
         * <strong>example:</strong>
         * <p>automatic allocation</p>
         */
        @NameInMap("AddStrategyName")
        public String addStrategyName;

        /**
         * <p>The number of refreshed billing cycles.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ApplicablePeriodNum")
        public Long applicablePeriodNum;

        /**
         * <p>The code of the attached resource.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ApportionItemCode")
        public String apportionItemCode;

        /**
         * <p>The name of the attached resource.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ApportionItemName")
        public String apportionItemName;

        /**
         * <p>The commodity code of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>otsbag</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <p>The commodity name of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>ApsaraDB</p>
         */
        @NameInMap("CommodityName")
        public String commodityName;

        /**
         * <p>The code of the cost center.</p>
         * 
         * <strong>example:</strong>
         * <p>code</p>
         */
        @NameInMap("CostCenterCode")
        public String costCenterCode;

        /**
         * <p>The time when the cost center was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-05-18 12:12:25</p>
         */
        @NameInMap("CostCenterCreateTime")
        public String costCenterCreateTime;

        /**
         * <p>The ID of the cost center.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("CostCenterId")
        public Long costCenterId;

        /**
         * <p>The name of the cost center.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("CostCenterName")
        public String costCenterName;

        /**
         * <p>The time when the cost center was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-05-18 16:12:25</p>
         */
        @NameInMap("CostCenterUpdateTime")
        public String costCenterUpdateTime;

        /**
         * <p>The rule version.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("FinanceUnitRuleVersion")
        public Long financeUnitRuleVersion;

        /**
         * <p>The billing granularity ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou;standard</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The associated commodity code.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("MasterCommodityCode")
        public String masterCommodityCode;

        /**
         * <p>The associated instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-xxxxx</p>
         */
        @NameInMap("MasterInstanceId")
        public String masterInstanceId;

        /**
         * <p>The ID of the customer to whom the cost center belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567812345678</p>
         */
        @NameInMap("OwnerAccountId")
        public Long ownerAccountId;

        /**
         * <p>The name of the customer to whom the cost center belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>CustomerA</p>
         */
        @NameInMap("OwnerAccountName")
        public String ownerAccountName;

        /**
         * <p>The ID of the parent cost center.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("ParentCostCenterId")
        public Long parentCostCenterId;

        /**
         * <p>The product code, which is the same as the product code in User Center bills.</p>
         * 
         * <strong>example:</strong>
         * <p>rds</p>
         */
        @NameInMap("PipCode")
        public String pipCode;

        /**
         * <p>The product name.</p>
         * 
         * <strong>example:</strong>
         * <p>ApsaraDB</p>
         */
        @NameInMap("PipName")
        public String pipName;

        /**
         * <p>The most recent billing cycle.</p>
         * 
         * <strong>example:</strong>
         * <p>202509</p>
         */
        @NameInMap("RecentBillingMonth")
        public Long recentBillingMonth;

        /**
         * <p>The region name.</p>
         * 
         * <strong>example:</strong>
         * <p>Shanghai</p>
         */
        @NameInMap("RegionName")
        public String regionName;

        /**
         * <p>The region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionNo")
        public String regionNo;

        /**
         * <p>The resource group to which the resource belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>Default resource group</p>
         */
        @NameInMap("ResourceGroup")
        public String resourceGroup;

        /**
         * <p>The resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>OSSBAG-cn-v0h1s4hma018</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The custom nickname of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>testResource</p>
         */
        @NameInMap("ResourceNick")
        public String resourceNick;

        /**
         * <p>The resource source. Valid values:</p>
         * <ul>
         * <li>AUTO_ALLOCATE: automatic allocation.</li>
         * <li>MANUAL_ALLOCATE: manual allocation.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MANUAL_ALLOCATE</p>
         */
        @NameInMap("ResourceSource")
        public String resourceSource;

        /**
         * <p>The tag of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>tag</p>
         */
        @NameInMap("ResourceTag")
        public String resourceTag;

        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>FPT_ossbag_absolute_Storage_bj</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The time when the cost center was last updated. This is a reserved field and is currently unavailable.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-05-18 16:12:25</p>
         */
        @NameInMap("ResourceUpdateTime")
        public String resourceUpdateTime;

        /**
         * <p>The user ID of the resource owner.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567812345678</p>
         */
        @NameInMap("ResourceUserId")
        public Long resourceUserId;

        /**
         * <p>The username of the resource owner.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:test@test.aliyun.com">test@test.aliyun.com</a></p>
         */
        @NameInMap("ResourceUserName")
        public String resourceUserName;

        /**
         * <p>The ID of the root cost center.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("RootCostCenterId")
        public Long rootCostCenterId;

        /**
         * <p>The billing cycle in which the rule takes effect.</p>
         * 
         * <strong>example:</strong>
         * <p>202509</p>
         */
        @NameInMap("StartBillingMonth")
        public Long startBillingMonth;

        public static QueryCostCenterResourceResponseBodyCostCenterResourceDtoList build(java.util.Map<String, ?> map) throws Exception {
            QueryCostCenterResourceResponseBodyCostCenterResourceDtoList self = new QueryCostCenterResourceResponseBodyCostCenterResourceDtoList();
            return TeaModel.build(map, self);
        }

        public QueryCostCenterResourceResponseBodyCostCenterResourceDtoList setAddStrategy(String addStrategy) {
            this.addStrategy = addStrategy;
            return this;
        }
        public String getAddStrategy() {
            return this.addStrategy;
        }

        public QueryCostCenterResourceResponseBodyCostCenterResourceDtoList setAddStrategyName(String addStrategyName) {
            this.addStrategyName = addStrategyName;
            return this;
        }
        public String getAddStrategyName() {
            return this.addStrategyName;
        }

        public QueryCostCenterResourceResponseBodyCostCenterResourceDtoList setApplicablePeriodNum(Long applicablePeriodNum) {
            this.applicablePeriodNum = applicablePeriodNum;
            return this;
        }
        public Long getApplicablePeriodNum() {
            return this.applicablePeriodNum;
        }

        public QueryCostCenterResourceResponseBodyCostCenterResourceDtoList setApportionItemCode(String apportionItemCode) {
            this.apportionItemCode = apportionItemCode;
            return this;
        }
        public String getApportionItemCode() {
            return this.apportionItemCode;
        }

        public QueryCostCenterResourceResponseBodyCostCenterResourceDtoList setApportionItemName(String apportionItemName) {
            this.apportionItemName = apportionItemName;
            return this;
        }
        public String getApportionItemName() {
            return this.apportionItemName;
        }

        public QueryCostCenterResourceResponseBodyCostCenterResourceDtoList setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public QueryCostCenterResourceResponseBodyCostCenterResourceDtoList setCommodityName(String commodityName) {
            this.commodityName = commodityName;
            return this;
        }
        public String getCommodityName() {
            return this.commodityName;
        }

        public QueryCostCenterResourceResponseBodyCostCenterResourceDtoList setCostCenterCode(String costCenterCode) {
            this.costCenterCode = costCenterCode;
            return this;
        }
        public String getCostCenterCode() {
            return this.costCenterCode;
        }

        public QueryCostCenterResourceResponseBodyCostCenterResourceDtoList setCostCenterCreateTime(String costCenterCreateTime) {
            this.costCenterCreateTime = costCenterCreateTime;
            return this;
        }
        public String getCostCenterCreateTime() {
            return this.costCenterCreateTime;
        }

        public QueryCostCenterResourceResponseBodyCostCenterResourceDtoList setCostCenterId(Long costCenterId) {
            this.costCenterId = costCenterId;
            return this;
        }
        public Long getCostCenterId() {
            return this.costCenterId;
        }

        public QueryCostCenterResourceResponseBodyCostCenterResourceDtoList setCostCenterName(String costCenterName) {
            this.costCenterName = costCenterName;
            return this;
        }
        public String getCostCenterName() {
            return this.costCenterName;
        }

        public QueryCostCenterResourceResponseBodyCostCenterResourceDtoList setCostCenterUpdateTime(String costCenterUpdateTime) {
            this.costCenterUpdateTime = costCenterUpdateTime;
            return this;
        }
        public String getCostCenterUpdateTime() {
            return this.costCenterUpdateTime;
        }

        public QueryCostCenterResourceResponseBodyCostCenterResourceDtoList setFinanceUnitRuleVersion(Long financeUnitRuleVersion) {
            this.financeUnitRuleVersion = financeUnitRuleVersion;
            return this;
        }
        public Long getFinanceUnitRuleVersion() {
            return this.financeUnitRuleVersion;
        }

        public QueryCostCenterResourceResponseBodyCostCenterResourceDtoList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryCostCenterResourceResponseBodyCostCenterResourceDtoList setMasterCommodityCode(String masterCommodityCode) {
            this.masterCommodityCode = masterCommodityCode;
            return this;
        }
        public String getMasterCommodityCode() {
            return this.masterCommodityCode;
        }

        public QueryCostCenterResourceResponseBodyCostCenterResourceDtoList setMasterInstanceId(String masterInstanceId) {
            this.masterInstanceId = masterInstanceId;
            return this;
        }
        public String getMasterInstanceId() {
            return this.masterInstanceId;
        }

        public QueryCostCenterResourceResponseBodyCostCenterResourceDtoList setOwnerAccountId(Long ownerAccountId) {
            this.ownerAccountId = ownerAccountId;
            return this;
        }
        public Long getOwnerAccountId() {
            return this.ownerAccountId;
        }

        public QueryCostCenterResourceResponseBodyCostCenterResourceDtoList setOwnerAccountName(String ownerAccountName) {
            this.ownerAccountName = ownerAccountName;
            return this;
        }
        public String getOwnerAccountName() {
            return this.ownerAccountName;
        }

        public QueryCostCenterResourceResponseBodyCostCenterResourceDtoList setParentCostCenterId(Long parentCostCenterId) {
            this.parentCostCenterId = parentCostCenterId;
            return this;
        }
        public Long getParentCostCenterId() {
            return this.parentCostCenterId;
        }

        public QueryCostCenterResourceResponseBodyCostCenterResourceDtoList setPipCode(String pipCode) {
            this.pipCode = pipCode;
            return this;
        }
        public String getPipCode() {
            return this.pipCode;
        }

        public QueryCostCenterResourceResponseBodyCostCenterResourceDtoList setPipName(String pipName) {
            this.pipName = pipName;
            return this;
        }
        public String getPipName() {
            return this.pipName;
        }

        public QueryCostCenterResourceResponseBodyCostCenterResourceDtoList setRecentBillingMonth(Long recentBillingMonth) {
            this.recentBillingMonth = recentBillingMonth;
            return this;
        }
        public Long getRecentBillingMonth() {
            return this.recentBillingMonth;
        }

        public QueryCostCenterResourceResponseBodyCostCenterResourceDtoList setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public QueryCostCenterResourceResponseBodyCostCenterResourceDtoList setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

        public QueryCostCenterResourceResponseBodyCostCenterResourceDtoList setResourceGroup(String resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }
        public String getResourceGroup() {
            return this.resourceGroup;
        }

        public QueryCostCenterResourceResponseBodyCostCenterResourceDtoList setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public QueryCostCenterResourceResponseBodyCostCenterResourceDtoList setResourceNick(String resourceNick) {
            this.resourceNick = resourceNick;
            return this;
        }
        public String getResourceNick() {
            return this.resourceNick;
        }

        public QueryCostCenterResourceResponseBodyCostCenterResourceDtoList setResourceSource(String resourceSource) {
            this.resourceSource = resourceSource;
            return this;
        }
        public String getResourceSource() {
            return this.resourceSource;
        }

        public QueryCostCenterResourceResponseBodyCostCenterResourceDtoList setResourceTag(String resourceTag) {
            this.resourceTag = resourceTag;
            return this;
        }
        public String getResourceTag() {
            return this.resourceTag;
        }

        public QueryCostCenterResourceResponseBodyCostCenterResourceDtoList setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public QueryCostCenterResourceResponseBodyCostCenterResourceDtoList setResourceUpdateTime(String resourceUpdateTime) {
            this.resourceUpdateTime = resourceUpdateTime;
            return this;
        }
        public String getResourceUpdateTime() {
            return this.resourceUpdateTime;
        }

        public QueryCostCenterResourceResponseBodyCostCenterResourceDtoList setResourceUserId(Long resourceUserId) {
            this.resourceUserId = resourceUserId;
            return this;
        }
        public Long getResourceUserId() {
            return this.resourceUserId;
        }

        public QueryCostCenterResourceResponseBodyCostCenterResourceDtoList setResourceUserName(String resourceUserName) {
            this.resourceUserName = resourceUserName;
            return this;
        }
        public String getResourceUserName() {
            return this.resourceUserName;
        }

        public QueryCostCenterResourceResponseBodyCostCenterResourceDtoList setRootCostCenterId(Long rootCostCenterId) {
            this.rootCostCenterId = rootCostCenterId;
            return this;
        }
        public Long getRootCostCenterId() {
            return this.rootCostCenterId;
        }

        public QueryCostCenterResourceResponseBodyCostCenterResourceDtoList setStartBillingMonth(Long startBillingMonth) {
            this.startBillingMonth = startBillingMonth;
            return this;
        }
        public Long getStartBillingMonth() {
            return this.startBillingMonth;
        }

    }

}
