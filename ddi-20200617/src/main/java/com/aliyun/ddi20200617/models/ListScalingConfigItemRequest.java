// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ListScalingConfigItemRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("limit")
    public Long limit;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("CurrentSize")
    public Long currentSize;

    @NameInMap("PageCount")
    public Long pageCount;

    @NameInMap("OrderField")
    public String orderField;

    @NameInMap("OrderMode")
    public String orderMode;

    @NameInMap("ScalingGroupBizId")
    public String scalingGroupBizId;

    @NameInMap("ConfigItemType")
    public String configItemType;

    public static ListScalingConfigItemRequest build(java.util.Map<String, ?> map) throws Exception {
        ListScalingConfigItemRequest self = new ListScalingConfigItemRequest();
        return TeaModel.build(map, self);
    }

    public ListScalingConfigItemRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListScalingConfigItemRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListScalingConfigItemRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public ListScalingConfigItemRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListScalingConfigItemRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListScalingConfigItemRequest setCurrentSize(Long currentSize) {
        this.currentSize = currentSize;
        return this;
    }
    public Long getCurrentSize() {
        return this.currentSize;
    }

    public ListScalingConfigItemRequest setPageCount(Long pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Long getPageCount() {
        return this.pageCount;
    }

    public ListScalingConfigItemRequest setOrderField(String orderField) {
        this.orderField = orderField;
        return this;
    }
    public String getOrderField() {
        return this.orderField;
    }

    public ListScalingConfigItemRequest setOrderMode(String orderMode) {
        this.orderMode = orderMode;
        return this;
    }
    public String getOrderMode() {
        return this.orderMode;
    }

    public ListScalingConfigItemRequest setScalingGroupBizId(String scalingGroupBizId) {
        this.scalingGroupBizId = scalingGroupBizId;
        return this;
    }
    public String getScalingGroupBizId() {
        return this.scalingGroupBizId;
    }

    public ListScalingConfigItemRequest setConfigItemType(String configItemType) {
        this.configItemType = configItemType;
        return this;
    }
    public String getConfigItemType() {
        return this.configItemType;
    }

}
