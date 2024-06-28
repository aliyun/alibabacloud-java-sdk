// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryCostUnitResourceResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public QueryCostUnitResourceResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Successful！</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>04332CB7-9A57-4461-97E0-02821D044414</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryCostUnitResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCostUnitResourceResponseBody self = new QueryCostUnitResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCostUnitResourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryCostUnitResourceResponseBody setData(QueryCostUnitResourceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryCostUnitResourceResponseBodyData getData() {
        return this.data;
    }

    public QueryCostUnitResourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryCostUnitResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCostUnitResourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryCostUnitResourceResponseBodyDataCostUnit extends TeaModel {
        /**
         * <p>The user ID of the cost center owner.</p>
         * 
         * <strong>example:</strong>
         * <p>321432</p>
         */
        @NameInMap("OwnerUid")
        public Long ownerUid;

        /**
         * <p>The ID of the parent cost center. A value of -1 indicates the root cost center.</p>
         * 
         * <strong>example:</strong>
         * <p>23421</p>
         */
        @NameInMap("ParentUnitId")
        public Long parentUnitId;

        /**
         * <p>The ID of the cost center.</p>
         * 
         * <strong>example:</strong>
         * <p>123412</p>
         */
        @NameInMap("UnitId")
        public Long unitId;

        /**
         * <p>The name of the cost center.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("UnitName")
        public String unitName;

        public static QueryCostUnitResourceResponseBodyDataCostUnit build(java.util.Map<String, ?> map) throws Exception {
            QueryCostUnitResourceResponseBodyDataCostUnit self = new QueryCostUnitResourceResponseBodyDataCostUnit();
            return TeaModel.build(map, self);
        }

        public QueryCostUnitResourceResponseBodyDataCostUnit setOwnerUid(Long ownerUid) {
            this.ownerUid = ownerUid;
            return this;
        }
        public Long getOwnerUid() {
            return this.ownerUid;
        }

        public QueryCostUnitResourceResponseBodyDataCostUnit setParentUnitId(Long parentUnitId) {
            this.parentUnitId = parentUnitId;
            return this;
        }
        public Long getParentUnitId() {
            return this.parentUnitId;
        }

        public QueryCostUnitResourceResponseBodyDataCostUnit setUnitId(Long unitId) {
            this.unitId = unitId;
            return this;
        }
        public Long getUnitId() {
            return this.unitId;
        }

        public QueryCostUnitResourceResponseBodyDataCostUnit setUnitName(String unitName) {
            this.unitName = unitName;
            return this;
        }
        public String getUnitName() {
            return this.unitName;
        }

    }

    public static class QueryCostUnitResourceResponseBodyDataCostUnitStatisInfo extends TeaModel {
        /**
         * <p>The number of resource instances in the cost center.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ResourceCount")
        public Long resourceCount;

        /**
         * <p>The number of resource groups in the cost center.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ResourceGroupCount")
        public Long resourceGroupCount;

        /**
         * <p>The number of sub-cost centers in the cost center.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("SubUnitCount")
        public Long subUnitCount;

        /**
         * <p>The total number of resource instances, including resource instances of sub-cost centers, in the cost center.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TotalResourceCount")
        public Long totalResourceCount;

        /**
         * <p>The total number of resource groups, including resource groups of sub-cost centers, in the cost center.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TotalResourceGroupCount")
        public Long totalResourceGroupCount;

        /**
         * <p>The total number of the associated accounts, including associated accounts of sub-cost centers, in the cost center.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TotalUserCount")
        public Long totalUserCount;

        /**
         * <p>The number of sub-cost centers in the cost center.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("UserCount")
        public Long userCount;

        public static QueryCostUnitResourceResponseBodyDataCostUnitStatisInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryCostUnitResourceResponseBodyDataCostUnitStatisInfo self = new QueryCostUnitResourceResponseBodyDataCostUnitStatisInfo();
            return TeaModel.build(map, self);
        }

        public QueryCostUnitResourceResponseBodyDataCostUnitStatisInfo setResourceCount(Long resourceCount) {
            this.resourceCount = resourceCount;
            return this;
        }
        public Long getResourceCount() {
            return this.resourceCount;
        }

        public QueryCostUnitResourceResponseBodyDataCostUnitStatisInfo setResourceGroupCount(Long resourceGroupCount) {
            this.resourceGroupCount = resourceGroupCount;
            return this;
        }
        public Long getResourceGroupCount() {
            return this.resourceGroupCount;
        }

        public QueryCostUnitResourceResponseBodyDataCostUnitStatisInfo setSubUnitCount(Long subUnitCount) {
            this.subUnitCount = subUnitCount;
            return this;
        }
        public Long getSubUnitCount() {
            return this.subUnitCount;
        }

        public QueryCostUnitResourceResponseBodyDataCostUnitStatisInfo setTotalResourceCount(Long totalResourceCount) {
            this.totalResourceCount = totalResourceCount;
            return this;
        }
        public Long getTotalResourceCount() {
            return this.totalResourceCount;
        }

        public QueryCostUnitResourceResponseBodyDataCostUnitStatisInfo setTotalResourceGroupCount(Long totalResourceGroupCount) {
            this.totalResourceGroupCount = totalResourceGroupCount;
            return this;
        }
        public Long getTotalResourceGroupCount() {
            return this.totalResourceGroupCount;
        }

        public QueryCostUnitResourceResponseBodyDataCostUnitStatisInfo setTotalUserCount(Long totalUserCount) {
            this.totalUserCount = totalUserCount;
            return this;
        }
        public Long getTotalUserCount() {
            return this.totalUserCount;
        }

        public QueryCostUnitResourceResponseBodyDataCostUnitStatisInfo setUserCount(Long userCount) {
            this.userCount = userCount;
            return this;
        }
        public Long getUserCount() {
            return this.userCount;
        }

    }

    public static class QueryCostUnitResourceResponseBodyDataResourceInstanceDtoList extends TeaModel {
        /**
         * <p>The split code of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ApportionCode")
        public String apportionCode;

        /**
         * <p>The split name of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ApportionName")
        public String apportionName;

        /**
         * <p>The product code of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>rds</p>
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

        @NameInMap("PipCode")
        public String pipCode;

        /**
         * <p>The resources related to the resource instance.</p>
         * 
         * <strong>example:</strong>
         * <p>oss</p>
         */
        @NameInMap("RelatedResources")
        public String relatedResources;

        /**
         * <p>The resource group to which the resource belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>Default Resource Group</p>
         */
        @NameInMap("ResourceGroup")
        public String resourceGroup;

        /**
         * <p>The instance ID of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>OSSBAG-cn-v0h1s4hma018</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The custom name of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>testResource</p>
         */
        @NameInMap("ResourceNick")
        public String resourceNick;

        @NameInMap("ResourceSource")
        public String resourceSource;

        /**
         * <p>The status of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("ResourceStatus")
        public String resourceStatus;

        /**
         * <p>The tags of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>testResource</p>
         */
        @NameInMap("ResourceTag")
        public String resourceTag;

        /**
         * <p>The type of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>FPT_ossbag_absolute_Storage_bj</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The user ID of the resource owner.</p>
         * 
         * <strong>example:</strong>
         * <p>2424242134</p>
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

        public static QueryCostUnitResourceResponseBodyDataResourceInstanceDtoList build(java.util.Map<String, ?> map) throws Exception {
            QueryCostUnitResourceResponseBodyDataResourceInstanceDtoList self = new QueryCostUnitResourceResponseBodyDataResourceInstanceDtoList();
            return TeaModel.build(map, self);
        }

        public QueryCostUnitResourceResponseBodyDataResourceInstanceDtoList setApportionCode(String apportionCode) {
            this.apportionCode = apportionCode;
            return this;
        }
        public String getApportionCode() {
            return this.apportionCode;
        }

        public QueryCostUnitResourceResponseBodyDataResourceInstanceDtoList setApportionName(String apportionName) {
            this.apportionName = apportionName;
            return this;
        }
        public String getApportionName() {
            return this.apportionName;
        }

        public QueryCostUnitResourceResponseBodyDataResourceInstanceDtoList setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public QueryCostUnitResourceResponseBodyDataResourceInstanceDtoList setCommodityName(String commodityName) {
            this.commodityName = commodityName;
            return this;
        }
        public String getCommodityName() {
            return this.commodityName;
        }

        public QueryCostUnitResourceResponseBodyDataResourceInstanceDtoList setPipCode(String pipCode) {
            this.pipCode = pipCode;
            return this;
        }
        public String getPipCode() {
            return this.pipCode;
        }

        public QueryCostUnitResourceResponseBodyDataResourceInstanceDtoList setRelatedResources(String relatedResources) {
            this.relatedResources = relatedResources;
            return this;
        }
        public String getRelatedResources() {
            return this.relatedResources;
        }

        public QueryCostUnitResourceResponseBodyDataResourceInstanceDtoList setResourceGroup(String resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }
        public String getResourceGroup() {
            return this.resourceGroup;
        }

        public QueryCostUnitResourceResponseBodyDataResourceInstanceDtoList setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public QueryCostUnitResourceResponseBodyDataResourceInstanceDtoList setResourceNick(String resourceNick) {
            this.resourceNick = resourceNick;
            return this;
        }
        public String getResourceNick() {
            return this.resourceNick;
        }

        public QueryCostUnitResourceResponseBodyDataResourceInstanceDtoList setResourceSource(String resourceSource) {
            this.resourceSource = resourceSource;
            return this;
        }
        public String getResourceSource() {
            return this.resourceSource;
        }

        public QueryCostUnitResourceResponseBodyDataResourceInstanceDtoList setResourceStatus(String resourceStatus) {
            this.resourceStatus = resourceStatus;
            return this;
        }
        public String getResourceStatus() {
            return this.resourceStatus;
        }

        public QueryCostUnitResourceResponseBodyDataResourceInstanceDtoList setResourceTag(String resourceTag) {
            this.resourceTag = resourceTag;
            return this;
        }
        public String getResourceTag() {
            return this.resourceTag;
        }

        public QueryCostUnitResourceResponseBodyDataResourceInstanceDtoList setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public QueryCostUnitResourceResponseBodyDataResourceInstanceDtoList setResourceUserId(Long resourceUserId) {
            this.resourceUserId = resourceUserId;
            return this;
        }
        public Long getResourceUserId() {
            return this.resourceUserId;
        }

        public QueryCostUnitResourceResponseBodyDataResourceInstanceDtoList setResourceUserName(String resourceUserName) {
            this.resourceUserName = resourceUserName;
            return this;
        }
        public String getResourceUserName() {
            return this.resourceUserName;
        }

    }

    public static class QueryCostUnitResourceResponseBodyData extends TeaModel {
        /**
         * <p>The information about the cost center.</p>
         */
        @NameInMap("CostUnit")
        public QueryCostUnitResourceResponseBodyDataCostUnit costUnit;

        /**
         * <p>The statistical information about the cost center.</p>
         */
        @NameInMap("CostUnitStatisInfo")
        public QueryCostUnitResourceResponseBodyDataCostUnitStatisInfo costUnitStatisInfo;

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The resource instances.</p>
         */
        @NameInMap("ResourceInstanceDtoList")
        public java.util.List<QueryCostUnitResourceResponseBodyDataResourceInstanceDtoList> resourceInstanceDtoList;

        /**
         * <p>The total number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static QueryCostUnitResourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryCostUnitResourceResponseBodyData self = new QueryCostUnitResourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryCostUnitResourceResponseBodyData setCostUnit(QueryCostUnitResourceResponseBodyDataCostUnit costUnit) {
            this.costUnit = costUnit;
            return this;
        }
        public QueryCostUnitResourceResponseBodyDataCostUnit getCostUnit() {
            return this.costUnit;
        }

        public QueryCostUnitResourceResponseBodyData setCostUnitStatisInfo(QueryCostUnitResourceResponseBodyDataCostUnitStatisInfo costUnitStatisInfo) {
            this.costUnitStatisInfo = costUnitStatisInfo;
            return this;
        }
        public QueryCostUnitResourceResponseBodyDataCostUnitStatisInfo getCostUnitStatisInfo() {
            return this.costUnitStatisInfo;
        }

        public QueryCostUnitResourceResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public QueryCostUnitResourceResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryCostUnitResourceResponseBodyData setResourceInstanceDtoList(java.util.List<QueryCostUnitResourceResponseBodyDataResourceInstanceDtoList> resourceInstanceDtoList) {
            this.resourceInstanceDtoList = resourceInstanceDtoList;
            return this;
        }
        public java.util.List<QueryCostUnitResourceResponseBodyDataResourceInstanceDtoList> getResourceInstanceDtoList() {
            return this.resourceInstanceDtoList;
        }

        public QueryCostUnitResourceResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
