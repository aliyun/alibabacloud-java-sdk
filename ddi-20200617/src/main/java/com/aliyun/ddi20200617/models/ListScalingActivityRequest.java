// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ListScalingActivityRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Limit")
    public Integer limit;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("CurrentSize")
    public Integer currentSize;

    @NameInMap("PageCount")
    public Integer pageCount;

    @NameInMap("OrderField")
    public String orderField;

    @NameInMap("OrderMode")
    public String orderMode;

    @NameInMap("ClusterBizId")
    public String clusterBizId;

    @NameInMap("HostGroupId")
    public String hostGroupId;

    @NameInMap("ScalingGroupBizId")
    public String scalingGroupBizId;

    @NameInMap("ScalingRuleName")
    public String scalingRuleName;

    @NameInMap("HostGroupName")
    public String hostGroupName;

    @NameInMap("Status")
    public String status;

    public static ListScalingActivityRequest build(java.util.Map<String, ?> map) throws Exception {
        ListScalingActivityRequest self = new ListScalingActivityRequest();
        return TeaModel.build(map, self);
    }

    public ListScalingActivityRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListScalingActivityRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListScalingActivityRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListScalingActivityRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListScalingActivityRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListScalingActivityRequest setCurrentSize(Integer currentSize) {
        this.currentSize = currentSize;
        return this;
    }
    public Integer getCurrentSize() {
        return this.currentSize;
    }

    public ListScalingActivityRequest setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Integer getPageCount() {
        return this.pageCount;
    }

    public ListScalingActivityRequest setOrderField(String orderField) {
        this.orderField = orderField;
        return this;
    }
    public String getOrderField() {
        return this.orderField;
    }

    public ListScalingActivityRequest setOrderMode(String orderMode) {
        this.orderMode = orderMode;
        return this;
    }
    public String getOrderMode() {
        return this.orderMode;
    }

    public ListScalingActivityRequest setClusterBizId(String clusterBizId) {
        this.clusterBizId = clusterBizId;
        return this;
    }
    public String getClusterBizId() {
        return this.clusterBizId;
    }

    public ListScalingActivityRequest setHostGroupId(String hostGroupId) {
        this.hostGroupId = hostGroupId;
        return this;
    }
    public String getHostGroupId() {
        return this.hostGroupId;
    }

    public ListScalingActivityRequest setScalingGroupBizId(String scalingGroupBizId) {
        this.scalingGroupBizId = scalingGroupBizId;
        return this;
    }
    public String getScalingGroupBizId() {
        return this.scalingGroupBizId;
    }

    public ListScalingActivityRequest setScalingRuleName(String scalingRuleName) {
        this.scalingRuleName = scalingRuleName;
        return this;
    }
    public String getScalingRuleName() {
        return this.scalingRuleName;
    }

    public ListScalingActivityRequest setHostGroupName(String hostGroupName) {
        this.hostGroupName = hostGroupName;
        return this;
    }
    public String getHostGroupName() {
        return this.hostGroupName;
    }

    public ListScalingActivityRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
