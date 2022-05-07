// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListHistoryTasksForResourceGroupRequest extends TeaModel {
    // 最晚当前时间
    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProjectEnv")
    public String projectEnv;

    @NameInMap("ResourceGroupIdentifier")
    public String resourceGroupIdentifier;

    // 7天内
    @NameInMap("StartTime")
    public Long startTime;

    public static ListHistoryTasksForResourceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHistoryTasksForResourceGroupRequest self = new ListHistoryTasksForResourceGroupRequest();
        return TeaModel.build(map, self);
    }

    public ListHistoryTasksForResourceGroupRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListHistoryTasksForResourceGroupRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListHistoryTasksForResourceGroupRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListHistoryTasksForResourceGroupRequest setProjectEnv(String projectEnv) {
        this.projectEnv = projectEnv;
        return this;
    }
    public String getProjectEnv() {
        return this.projectEnv;
    }

    public ListHistoryTasksForResourceGroupRequest setResourceGroupIdentifier(String resourceGroupIdentifier) {
        this.resourceGroupIdentifier = resourceGroupIdentifier;
        return this;
    }
    public String getResourceGroupIdentifier() {
        return this.resourceGroupIdentifier;
    }

    public ListHistoryTasksForResourceGroupRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
