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

    }

}
