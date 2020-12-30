// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListJobExecutionInstancesRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ExecutionPlanInstanceId")
    public String executionPlanInstanceId;

    @NameInMap("IsDesc")
    public Boolean isDesc;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListJobExecutionInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListJobExecutionInstancesRequest self = new ListJobExecutionInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListJobExecutionInstancesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListJobExecutionInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListJobExecutionInstancesRequest setExecutionPlanInstanceId(String executionPlanInstanceId) {
        this.executionPlanInstanceId = executionPlanInstanceId;
        return this;
    }
    public String getExecutionPlanInstanceId() {
        return this.executionPlanInstanceId;
    }

    public ListJobExecutionInstancesRequest setIsDesc(Boolean isDesc) {
        this.isDesc = isDesc;
        return this;
    }
    public Boolean getIsDesc() {
        return this.isDesc;
    }

    public ListJobExecutionInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListJobExecutionInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
