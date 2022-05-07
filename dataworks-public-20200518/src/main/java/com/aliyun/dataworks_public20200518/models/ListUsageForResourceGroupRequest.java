// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListUsageForResourceGroupRequest extends TeaModel {
    // 最晚当前时间
    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("ProjectEnv")
    public String projectEnv;

    @NameInMap("ResourceGroupIdentifier")
    public String resourceGroupIdentifier;

    // 7天内
    @NameInMap("StartTime")
    public Long startTime;

    public static ListUsageForResourceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUsageForResourceGroupRequest self = new ListUsageForResourceGroupRequest();
        return TeaModel.build(map, self);
    }

    public ListUsageForResourceGroupRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListUsageForResourceGroupRequest setProjectEnv(String projectEnv) {
        this.projectEnv = projectEnv;
        return this;
    }
    public String getProjectEnv() {
        return this.projectEnv;
    }

    public ListUsageForResourceGroupRequest setResourceGroupIdentifier(String resourceGroupIdentifier) {
        this.resourceGroupIdentifier = resourceGroupIdentifier;
        return this;
    }
    public String getResourceGroupIdentifier() {
        return this.resourceGroupIdentifier;
    }

    public ListUsageForResourceGroupRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
