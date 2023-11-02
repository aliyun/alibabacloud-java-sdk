// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListDisposeStrategyRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("EffectiveStatus")
    public Integer effectiveStatus;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("EntityIdentity")
    public String entityIdentity;

    @NameInMap("EntityType")
    public String entityType;

    @NameInMap("Order")
    public String order;

    @NameInMap("OrderField")
    public String orderField;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PlaybookName")
    public String playbookName;

    @NameInMap("PlaybookTypes")
    public String playbookTypes;

    @NameInMap("PlaybookUuid")
    public String playbookUuid;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SophonTaskId")
    public String sophonTaskId;

    @NameInMap("StartTime")
    public Long startTime;

    public static ListDisposeStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDisposeStrategyRequest self = new ListDisposeStrategyRequest();
        return TeaModel.build(map, self);
    }

    public ListDisposeStrategyRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListDisposeStrategyRequest setEffectiveStatus(Integer effectiveStatus) {
        this.effectiveStatus = effectiveStatus;
        return this;
    }
    public Integer getEffectiveStatus() {
        return this.effectiveStatus;
    }

    public ListDisposeStrategyRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListDisposeStrategyRequest setEntityIdentity(String entityIdentity) {
        this.entityIdentity = entityIdentity;
        return this;
    }
    public String getEntityIdentity() {
        return this.entityIdentity;
    }

    public ListDisposeStrategyRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public ListDisposeStrategyRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListDisposeStrategyRequest setOrderField(String orderField) {
        this.orderField = orderField;
        return this;
    }
    public String getOrderField() {
        return this.orderField;
    }

    public ListDisposeStrategyRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDisposeStrategyRequest setPlaybookName(String playbookName) {
        this.playbookName = playbookName;
        return this;
    }
    public String getPlaybookName() {
        return this.playbookName;
    }

    public ListDisposeStrategyRequest setPlaybookTypes(String playbookTypes) {
        this.playbookTypes = playbookTypes;
        return this;
    }
    public String getPlaybookTypes() {
        return this.playbookTypes;
    }

    public ListDisposeStrategyRequest setPlaybookUuid(String playbookUuid) {
        this.playbookUuid = playbookUuid;
        return this;
    }
    public String getPlaybookUuid() {
        return this.playbookUuid;
    }

    public ListDisposeStrategyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListDisposeStrategyRequest setSophonTaskId(String sophonTaskId) {
        this.sophonTaskId = sophonTaskId;
        return this;
    }
    public String getSophonTaskId() {
        return this.sophonTaskId;
    }

    public ListDisposeStrategyRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
