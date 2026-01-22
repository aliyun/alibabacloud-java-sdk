// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class QueryCostCenterResourceResponseBody extends TeaModel {
    @NameInMap("CostCenterResourceDtoList")
    public java.util.List<QueryCostCenterResourceResponseBodyCostCenterResourceDtoList> costCenterResourceDtoList;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Metadata")
    public Object metadata;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJwYWdlTnVtIjoyLCJwYWdlU2l6ZSI6MTB9</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>79EE7556-0CFD-44EB-9CD6-B3B526E3A85F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
         * <strong>example:</strong>
         * <p>AUTO_ALLOCATE</p>
         */
        @NameInMap("AddStrategy")
        public String addStrategy;

        /**
         * <strong>example:</strong>
         * <p>自动分配</p>
         */
        @NameInMap("AddStrategyName")
        public String addStrategyName;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ApplicablePeriodNum")
        public Long applicablePeriodNum;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ApportionItemCode")
        public String apportionItemCode;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ApportionItemName")
        public String apportionItemName;

        /**
         * <strong>example:</strong>
         * <p>otsbag</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        @NameInMap("CommodityName")
        public String commodityName;

        /**
         * <strong>example:</strong>
         * <p>code</p>
         */
        @NameInMap("CostCenterCode")
        public String costCenterCode;

        /**
         * <strong>example:</strong>
         * <p>2025-05-18 12:12:25</p>
         */
        @NameInMap("CostCenterCreateTime")
        public String costCenterCreateTime;

        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("CostCenterId")
        public Long costCenterId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("CostCenterName")
        public String costCenterName;

        /**
         * <strong>example:</strong>
         * <p>2025-05-18 16:12:25</p>
         */
        @NameInMap("CostCenterUpdateTime")
        public String costCenterUpdateTime;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("FinanceUnitRuleVersion")
        public Long financeUnitRuleVersion;

        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("MasterCommodityCode")
        public String masterCommodityCode;

        /**
         * <strong>example:</strong>
         * <p>i-xxxxx</p>
         */
        @NameInMap("MasterInstanceId")
        public String masterInstanceId;

        /**
         * <strong>example:</strong>
         * <p>1234567812345678</p>
         */
        @NameInMap("OwnerAccountId")
        public Long ownerAccountId;

        /**
         * <strong>example:</strong>
         * <p>XXX公司</p>
         */
        @NameInMap("OwnerAccountName")
        public String ownerAccountName;

        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("ParentCostCenterId")
        public Long parentCostCenterId;

        /**
         * <strong>example:</strong>
         * <p>rds</p>
         */
        @NameInMap("PipCode")
        public String pipCode;

        @NameInMap("PipName")
        public String pipName;

        /**
         * <strong>example:</strong>
         * <p>202509</p>
         */
        @NameInMap("RecentBillingMonth")
        public Long recentBillingMonth;

        /**
         * <strong>example:</strong>
         * <p>上海</p>
         */
        @NameInMap("RegionName")
        public String regionName;

        /**
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionNo")
        public String regionNo;

        @NameInMap("ResourceGroup")
        public String resourceGroup;

        /**
         * <strong>example:</strong>
         * <p>OSSBAG-cn-v0h1s4hma018</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <strong>example:</strong>
         * <p>testResource</p>
         */
        @NameInMap("ResourceNick")
        public String resourceNick;

        /**
         * <strong>example:</strong>
         * <p>MANUAL_ALLOCATE</p>
         */
        @NameInMap("ResourceSource")
        public String resourceSource;

        /**
         * <strong>example:</strong>
         * <p>tag</p>
         */
        @NameInMap("ResourceTag")
        public String resourceTag;

        /**
         * <strong>example:</strong>
         * <p>FPT_ossbag_absolute_Storage_bj</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <strong>example:</strong>
         * <p>2025-05-18 16:12:25</p>
         */
        @NameInMap("ResourceUpdateTime")
        public String resourceUpdateTime;

        /**
         * <strong>example:</strong>
         * <p>1234567812345678</p>
         */
        @NameInMap("ResourceUserId")
        public Long resourceUserId;

        /**
         * <strong>example:</strong>
         * <p><a href="mailto:test@test.aliyun.com">test@test.aliyun.com</a></p>
         */
        @NameInMap("ResourceUserName")
        public String resourceUserName;

        /**
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("RootCostCenterId")
        public Long rootCostCenterId;

        /**
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
