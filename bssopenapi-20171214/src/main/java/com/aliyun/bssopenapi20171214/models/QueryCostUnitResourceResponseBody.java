// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryCostUnitResourceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public QueryCostUnitResourceResponseBodyData data;

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

    public QueryCostUnitResourceResponseBody setData(QueryCostUnitResourceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryCostUnitResourceResponseBodyData getData() {
        return this.data;
    }

    public static class QueryCostUnitResourceResponseBodyDataResourceInstanceDtoList extends TeaModel {
        @NameInMap("CommodityCode")
        public String commodityCode;

        @NameInMap("ResourceUserName")
        public String resourceUserName;

        @NameInMap("CommodityName")
        public String commodityName;

        @NameInMap("ResourceUserId")
        public Long resourceUserId;

        @NameInMap("ApportionName")
        public String apportionName;

        @NameInMap("ApportionCode")
        public String apportionCode;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("ResourceNick")
        public String resourceNick;

        @NameInMap("ResourceTag")
        public String resourceTag;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceGroup")
        public String resourceGroup;

        @NameInMap("RelatedResources")
        public String relatedResources;

        @NameInMap("ResourceStatus")
        public String resourceStatus;

        public static QueryCostUnitResourceResponseBodyDataResourceInstanceDtoList build(java.util.Map<String, ?> map) throws Exception {
            QueryCostUnitResourceResponseBodyDataResourceInstanceDtoList self = new QueryCostUnitResourceResponseBodyDataResourceInstanceDtoList();
            return TeaModel.build(map, self);
        }

        public QueryCostUnitResourceResponseBodyDataResourceInstanceDtoList setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public QueryCostUnitResourceResponseBodyDataResourceInstanceDtoList setResourceUserName(String resourceUserName) {
            this.resourceUserName = resourceUserName;
            return this;
        }
        public String getResourceUserName() {
            return this.resourceUserName;
        }

        public QueryCostUnitResourceResponseBodyDataResourceInstanceDtoList setCommodityName(String commodityName) {
            this.commodityName = commodityName;
            return this;
        }
        public String getCommodityName() {
            return this.commodityName;
        }

        public QueryCostUnitResourceResponseBodyDataResourceInstanceDtoList setResourceUserId(Long resourceUserId) {
            this.resourceUserId = resourceUserId;
            return this;
        }
        public Long getResourceUserId() {
            return this.resourceUserId;
        }

        public QueryCostUnitResourceResponseBodyDataResourceInstanceDtoList setApportionName(String apportionName) {
            this.apportionName = apportionName;
            return this;
        }
        public String getApportionName() {
            return this.apportionName;
        }

        public QueryCostUnitResourceResponseBodyDataResourceInstanceDtoList setApportionCode(String apportionCode) {
            this.apportionCode = apportionCode;
            return this;
        }
        public String getApportionCode() {
            return this.apportionCode;
        }

        public QueryCostUnitResourceResponseBodyDataResourceInstanceDtoList setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public QueryCostUnitResourceResponseBodyDataResourceInstanceDtoList setResourceNick(String resourceNick) {
            this.resourceNick = resourceNick;
            return this;
        }
        public String getResourceNick() {
            return this.resourceNick;
        }

        public QueryCostUnitResourceResponseBodyDataResourceInstanceDtoList setResourceTag(String resourceTag) {
            this.resourceTag = resourceTag;
            return this;
        }
        public String getResourceTag() {
            return this.resourceTag;
        }

        public QueryCostUnitResourceResponseBodyDataResourceInstanceDtoList setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public QueryCostUnitResourceResponseBodyDataResourceInstanceDtoList setResourceGroup(String resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }
        public String getResourceGroup() {
            return this.resourceGroup;
        }

        public QueryCostUnitResourceResponseBodyDataResourceInstanceDtoList setRelatedResources(String relatedResources) {
            this.relatedResources = relatedResources;
            return this;
        }
        public String getRelatedResources() {
            return this.relatedResources;
        }

        public QueryCostUnitResourceResponseBodyDataResourceInstanceDtoList setResourceStatus(String resourceStatus) {
            this.resourceStatus = resourceStatus;
            return this;
        }
        public String getResourceStatus() {
            return this.resourceStatus;
        }

    }

    public static class QueryCostUnitResourceResponseBodyDataCostUnit extends TeaModel {
        @NameInMap("ParentUnitId")
        public Long parentUnitId;

        @NameInMap("UnitName")
        public String unitName;

        @NameInMap("UnitId")
        public Long unitId;

        @NameInMap("OwnerUid")
        public Long ownerUid;

        public static QueryCostUnitResourceResponseBodyDataCostUnit build(java.util.Map<String, ?> map) throws Exception {
            QueryCostUnitResourceResponseBodyDataCostUnit self = new QueryCostUnitResourceResponseBodyDataCostUnit();
            return TeaModel.build(map, self);
        }

        public QueryCostUnitResourceResponseBodyDataCostUnit setParentUnitId(Long parentUnitId) {
            this.parentUnitId = parentUnitId;
            return this;
        }
        public Long getParentUnitId() {
            return this.parentUnitId;
        }

        public QueryCostUnitResourceResponseBodyDataCostUnit setUnitName(String unitName) {
            this.unitName = unitName;
            return this;
        }
        public String getUnitName() {
            return this.unitName;
        }

        public QueryCostUnitResourceResponseBodyDataCostUnit setUnitId(Long unitId) {
            this.unitId = unitId;
            return this;
        }
        public Long getUnitId() {
            return this.unitId;
        }

        public QueryCostUnitResourceResponseBodyDataCostUnit setOwnerUid(Long ownerUid) {
            this.ownerUid = ownerUid;
            return this;
        }
        public Long getOwnerUid() {
            return this.ownerUid;
        }

    }

    public static class QueryCostUnitResourceResponseBodyDataCostUnitStatisInfo extends TeaModel {
        @NameInMap("TotalResourceCount")
        public Long totalResourceCount;

        @NameInMap("ResourceCount")
        public Long resourceCount;

        @NameInMap("TotalUserCount")
        public Long totalUserCount;

        @NameInMap("SubUnitCount")
        public Long subUnitCount;

        @NameInMap("ResourceGroupCount")
        public Long resourceGroupCount;

        @NameInMap("TotalResourceGroupCount")
        public Long totalResourceGroupCount;

        @NameInMap("UserCount")
        public Long userCount;

        public static QueryCostUnitResourceResponseBodyDataCostUnitStatisInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryCostUnitResourceResponseBodyDataCostUnitStatisInfo self = new QueryCostUnitResourceResponseBodyDataCostUnitStatisInfo();
            return TeaModel.build(map, self);
        }

        public QueryCostUnitResourceResponseBodyDataCostUnitStatisInfo setTotalResourceCount(Long totalResourceCount) {
            this.totalResourceCount = totalResourceCount;
            return this;
        }
        public Long getTotalResourceCount() {
            return this.totalResourceCount;
        }

        public QueryCostUnitResourceResponseBodyDataCostUnitStatisInfo setResourceCount(Long resourceCount) {
            this.resourceCount = resourceCount;
            return this;
        }
        public Long getResourceCount() {
            return this.resourceCount;
        }

        public QueryCostUnitResourceResponseBodyDataCostUnitStatisInfo setTotalUserCount(Long totalUserCount) {
            this.totalUserCount = totalUserCount;
            return this;
        }
        public Long getTotalUserCount() {
            return this.totalUserCount;
        }

        public QueryCostUnitResourceResponseBodyDataCostUnitStatisInfo setSubUnitCount(Long subUnitCount) {
            this.subUnitCount = subUnitCount;
            return this;
        }
        public Long getSubUnitCount() {
            return this.subUnitCount;
        }

        public QueryCostUnitResourceResponseBodyDataCostUnitStatisInfo setResourceGroupCount(Long resourceGroupCount) {
            this.resourceGroupCount = resourceGroupCount;
            return this;
        }
        public Long getResourceGroupCount() {
            return this.resourceGroupCount;
        }

        public QueryCostUnitResourceResponseBodyDataCostUnitStatisInfo setTotalResourceGroupCount(Long totalResourceGroupCount) {
            this.totalResourceGroupCount = totalResourceGroupCount;
            return this;
        }
        public Long getTotalResourceGroupCount() {
            return this.totalResourceGroupCount;
        }

        public QueryCostUnitResourceResponseBodyDataCostUnitStatisInfo setUserCount(Long userCount) {
            this.userCount = userCount;
            return this;
        }
        public Long getUserCount() {
            return this.userCount;
        }

    }

    public static class QueryCostUnitResourceResponseBodyData extends TeaModel {
        @NameInMap("PageNum")
        public Integer pageNum;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("ResourceInstanceDtoList")
        public java.util.List<QueryCostUnitResourceResponseBodyDataResourceInstanceDtoList> resourceInstanceDtoList;

        @NameInMap("CostUnit")
        public QueryCostUnitResourceResponseBodyDataCostUnit costUnit;

        @NameInMap("CostUnitStatisInfo")
        public QueryCostUnitResourceResponseBodyDataCostUnitStatisInfo costUnitStatisInfo;

        public static QueryCostUnitResourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryCostUnitResourceResponseBodyData self = new QueryCostUnitResourceResponseBodyData();
            return TeaModel.build(map, self);
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

        public QueryCostUnitResourceResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public QueryCostUnitResourceResponseBodyData setResourceInstanceDtoList(java.util.List<QueryCostUnitResourceResponseBodyDataResourceInstanceDtoList> resourceInstanceDtoList) {
            this.resourceInstanceDtoList = resourceInstanceDtoList;
            return this;
        }
        public java.util.List<QueryCostUnitResourceResponseBodyDataResourceInstanceDtoList> getResourceInstanceDtoList() {
            return this.resourceInstanceDtoList;
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

    }

}
