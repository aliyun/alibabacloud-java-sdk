// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListExecutionPlanInstancesRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("OnlyLastInstance")
    public Boolean onlyLastInstance;

    @NameInMap("IsDesc")
    public Boolean isDesc;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ExecutionPlanIdList")
    public java.util.List<String> executionPlanIdList;

    @NameInMap("StatusList")
    public java.util.List<String> statusList;

    public static ListExecutionPlanInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListExecutionPlanInstancesRequest self = new ListExecutionPlanInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListExecutionPlanInstancesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListExecutionPlanInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListExecutionPlanInstancesRequest setOnlyLastInstance(Boolean onlyLastInstance) {
        this.onlyLastInstance = onlyLastInstance;
        return this;
    }
    public Boolean getOnlyLastInstance() {
        return this.onlyLastInstance;
    }

    public ListExecutionPlanInstancesRequest setIsDesc(Boolean isDesc) {
        this.isDesc = isDesc;
        return this;
    }
    public Boolean getIsDesc() {
        return this.isDesc;
    }

    public ListExecutionPlanInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListExecutionPlanInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListExecutionPlanInstancesRequest setExecutionPlanIdList(java.util.List<String> executionPlanIdList) {
        this.executionPlanIdList = executionPlanIdList;
        return this;
    }
    public java.util.List<String> getExecutionPlanIdList() {
        return this.executionPlanIdList;
    }

    public ListExecutionPlanInstancesRequest setStatusList(java.util.List<String> statusList) {
        this.statusList = statusList;
        return this;
    }
    public java.util.List<String> getStatusList() {
        return this.statusList;
    }

}
