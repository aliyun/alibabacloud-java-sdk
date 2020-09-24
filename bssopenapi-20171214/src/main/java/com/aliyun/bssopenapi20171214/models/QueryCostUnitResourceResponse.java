// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryCostUnitResourceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Data")
    @Validation(required = true)
    public QueryCostUnitResourceResponseData data;

    public static QueryCostUnitResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCostUnitResourceResponse self = new QueryCostUnitResourceResponse();
        return TeaModel.build(map, self);
    }

    public QueryCostUnitResourceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCostUnitResourceResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryCostUnitResourceResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryCostUnitResourceResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryCostUnitResourceResponse setData(QueryCostUnitResourceResponseData data) {
        this.data = data;
        return this;
    }
    public QueryCostUnitResourceResponseData getData() {
        return this.data;
    }

    public static class QueryCostUnitResourceResponseDataResourceInstanceDtoList extends TeaModel {
        @NameInMap("ResourceUserId")
        @Validation(required = true)
        public Long resourceUserId;

        @NameInMap("ResourceId")
        @Validation(required = true)
        public String resourceId;

        @NameInMap("CommodityCode")
        @Validation(required = true)
        public String commodityCode;

        @NameInMap("ResourceUserName")
        @Validation(required = true)
        public String resourceUserName;

        @NameInMap("CommodityName")
        @Validation(required = true)
        public String commodityName;

        @NameInMap("ResourceGroup")
        @Validation(required = true)
        public String resourceGroup;

        @NameInMap("ResourceTag")
        @Validation(required = true)
        public String resourceTag;

        @NameInMap("ResourceNick")
        @Validation(required = true)
        public String resourceNick;

        @NameInMap("ResourceType")
        @Validation(required = true)
        public String resourceType;

        @NameInMap("ResourceStatus")
        @Validation(required = true)
        public String resourceStatus;

        @NameInMap("RelatedResources")
        @Validation(required = true)
        public String relatedResources;

        @NameInMap("ApportionCode")
        @Validation(required = true)
        public String apportionCode;

        @NameInMap("ApportionName")
        @Validation(required = true)
        public String apportionName;

        public static QueryCostUnitResourceResponseDataResourceInstanceDtoList build(java.util.Map<String, ?> map) throws Exception {
            QueryCostUnitResourceResponseDataResourceInstanceDtoList self = new QueryCostUnitResourceResponseDataResourceInstanceDtoList();
            return TeaModel.build(map, self);
        }

        public QueryCostUnitResourceResponseDataResourceInstanceDtoList setResourceUserId(Long resourceUserId) {
            this.resourceUserId = resourceUserId;
            return this;
        }
        public Long getResourceUserId() {
            return this.resourceUserId;
        }

        public QueryCostUnitResourceResponseDataResourceInstanceDtoList setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public QueryCostUnitResourceResponseDataResourceInstanceDtoList setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public QueryCostUnitResourceResponseDataResourceInstanceDtoList setResourceUserName(String resourceUserName) {
            this.resourceUserName = resourceUserName;
            return this;
        }
        public String getResourceUserName() {
            return this.resourceUserName;
        }

        public QueryCostUnitResourceResponseDataResourceInstanceDtoList setCommodityName(String commodityName) {
            this.commodityName = commodityName;
            return this;
        }
        public String getCommodityName() {
            return this.commodityName;
        }

        public QueryCostUnitResourceResponseDataResourceInstanceDtoList setResourceGroup(String resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }
        public String getResourceGroup() {
            return this.resourceGroup;
        }

        public QueryCostUnitResourceResponseDataResourceInstanceDtoList setResourceTag(String resourceTag) {
            this.resourceTag = resourceTag;
            return this;
        }
        public String getResourceTag() {
            return this.resourceTag;
        }

        public QueryCostUnitResourceResponseDataResourceInstanceDtoList setResourceNick(String resourceNick) {
            this.resourceNick = resourceNick;
            return this;
        }
        public String getResourceNick() {
            return this.resourceNick;
        }

        public QueryCostUnitResourceResponseDataResourceInstanceDtoList setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public QueryCostUnitResourceResponseDataResourceInstanceDtoList setResourceStatus(String resourceStatus) {
            this.resourceStatus = resourceStatus;
            return this;
        }
        public String getResourceStatus() {
            return this.resourceStatus;
        }

        public QueryCostUnitResourceResponseDataResourceInstanceDtoList setRelatedResources(String relatedResources) {
            this.relatedResources = relatedResources;
            return this;
        }
        public String getRelatedResources() {
            return this.relatedResources;
        }

        public QueryCostUnitResourceResponseDataResourceInstanceDtoList setApportionCode(String apportionCode) {
            this.apportionCode = apportionCode;
            return this;
        }
        public String getApportionCode() {
            return this.apportionCode;
        }

        public QueryCostUnitResourceResponseDataResourceInstanceDtoList setApportionName(String apportionName) {
            this.apportionName = apportionName;
            return this;
        }
        public String getApportionName() {
            return this.apportionName;
        }

    }

    public static class QueryCostUnitResourceResponseDataCostUnit extends TeaModel {
        @NameInMap("OwnerUid")
        @Validation(required = true)
        public Long ownerUid;

        @NameInMap("ParentUnitId")
        @Validation(required = true)
        public Long parentUnitId;

        @NameInMap("UnitId")
        @Validation(required = true)
        public Long unitId;

        @NameInMap("UnitName")
        @Validation(required = true)
        public String unitName;

        public static QueryCostUnitResourceResponseDataCostUnit build(java.util.Map<String, ?> map) throws Exception {
            QueryCostUnitResourceResponseDataCostUnit self = new QueryCostUnitResourceResponseDataCostUnit();
            return TeaModel.build(map, self);
        }

        public QueryCostUnitResourceResponseDataCostUnit setOwnerUid(Long ownerUid) {
            this.ownerUid = ownerUid;
            return this;
        }
        public Long getOwnerUid() {
            return this.ownerUid;
        }

        public QueryCostUnitResourceResponseDataCostUnit setParentUnitId(Long parentUnitId) {
            this.parentUnitId = parentUnitId;
            return this;
        }
        public Long getParentUnitId() {
            return this.parentUnitId;
        }

        public QueryCostUnitResourceResponseDataCostUnit setUnitId(Long unitId) {
            this.unitId = unitId;
            return this;
        }
        public Long getUnitId() {
            return this.unitId;
        }

        public QueryCostUnitResourceResponseDataCostUnit setUnitName(String unitName) {
            this.unitName = unitName;
            return this;
        }
        public String getUnitName() {
            return this.unitName;
        }

    }

    public static class QueryCostUnitResourceResponseDataCostUnitStatisInfo extends TeaModel {
        @NameInMap("ResourceCount")
        @Validation(required = true)
        public Long resourceCount;

        @NameInMap("ResourceGroupCount")
        @Validation(required = true)
        public Long resourceGroupCount;

        @NameInMap("SubUnitCount")
        @Validation(required = true)
        public Long subUnitCount;

        @NameInMap("UserCount")
        @Validation(required = true)
        public Long userCount;

        @NameInMap("TotalResourceCount")
        @Validation(required = true)
        public Long totalResourceCount;

        @NameInMap("TotalUserCount")
        @Validation(required = true)
        public Long totalUserCount;

        @NameInMap("TotalResourceGroupCount")
        @Validation(required = true)
        public Long totalResourceGroupCount;

        public static QueryCostUnitResourceResponseDataCostUnitStatisInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryCostUnitResourceResponseDataCostUnitStatisInfo self = new QueryCostUnitResourceResponseDataCostUnitStatisInfo();
            return TeaModel.build(map, self);
        }

        public QueryCostUnitResourceResponseDataCostUnitStatisInfo setResourceCount(Long resourceCount) {
            this.resourceCount = resourceCount;
            return this;
        }
        public Long getResourceCount() {
            return this.resourceCount;
        }

        public QueryCostUnitResourceResponseDataCostUnitStatisInfo setResourceGroupCount(Long resourceGroupCount) {
            this.resourceGroupCount = resourceGroupCount;
            return this;
        }
        public Long getResourceGroupCount() {
            return this.resourceGroupCount;
        }

        public QueryCostUnitResourceResponseDataCostUnitStatisInfo setSubUnitCount(Long subUnitCount) {
            this.subUnitCount = subUnitCount;
            return this;
        }
        public Long getSubUnitCount() {
            return this.subUnitCount;
        }

        public QueryCostUnitResourceResponseDataCostUnitStatisInfo setUserCount(Long userCount) {
            this.userCount = userCount;
            return this;
        }
        public Long getUserCount() {
            return this.userCount;
        }

        public QueryCostUnitResourceResponseDataCostUnitStatisInfo setTotalResourceCount(Long totalResourceCount) {
            this.totalResourceCount = totalResourceCount;
            return this;
        }
        public Long getTotalResourceCount() {
            return this.totalResourceCount;
        }

        public QueryCostUnitResourceResponseDataCostUnitStatisInfo setTotalUserCount(Long totalUserCount) {
            this.totalUserCount = totalUserCount;
            return this;
        }
        public Long getTotalUserCount() {
            return this.totalUserCount;
        }

        public QueryCostUnitResourceResponseDataCostUnitStatisInfo setTotalResourceGroupCount(Long totalResourceGroupCount) {
            this.totalResourceGroupCount = totalResourceGroupCount;
            return this;
        }
        public Long getTotalResourceGroupCount() {
            return this.totalResourceGroupCount;
        }

    }

    public static class QueryCostUnitResourceResponseData extends TeaModel {
        @NameInMap("PageNum")
        @Validation(required = true)
        public Integer pageNum;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("ResourceInstanceDtoList")
        @Validation(required = true)
        public java.util.List<QueryCostUnitResourceResponseDataResourceInstanceDtoList> resourceInstanceDtoList;

        @NameInMap("CostUnit")
        @Validation(required = true)
        public QueryCostUnitResourceResponseDataCostUnit costUnit;

        @NameInMap("CostUnitStatisInfo")
        @Validation(required = true)
        public QueryCostUnitResourceResponseDataCostUnitStatisInfo costUnitStatisInfo;

        public static QueryCostUnitResourceResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryCostUnitResourceResponseData self = new QueryCostUnitResourceResponseData();
            return TeaModel.build(map, self);
        }

        public QueryCostUnitResourceResponseData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public QueryCostUnitResourceResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryCostUnitResourceResponseData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public QueryCostUnitResourceResponseData setResourceInstanceDtoList(java.util.List<QueryCostUnitResourceResponseDataResourceInstanceDtoList> resourceInstanceDtoList) {
            this.resourceInstanceDtoList = resourceInstanceDtoList;
            return this;
        }
        public java.util.List<QueryCostUnitResourceResponseDataResourceInstanceDtoList> getResourceInstanceDtoList() {
            return this.resourceInstanceDtoList;
        }

        public QueryCostUnitResourceResponseData setCostUnit(QueryCostUnitResourceResponseDataCostUnit costUnit) {
            this.costUnit = costUnit;
            return this;
        }
        public QueryCostUnitResourceResponseDataCostUnit getCostUnit() {
            return this.costUnit;
        }

        public QueryCostUnitResourceResponseData setCostUnitStatisInfo(QueryCostUnitResourceResponseDataCostUnitStatisInfo costUnitStatisInfo) {
            this.costUnitStatisInfo = costUnitStatisInfo;
            return this;
        }
        public QueryCostUnitResourceResponseDataCostUnitStatisInfo getCostUnitStatisInfo() {
            return this.costUnitStatisInfo;
        }

    }

}
