// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribePortViewSourceIspsRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. This value is a UNIX timestamp. Unit: seconds.</p>
     * <br>
     * <p>> This UNIX timestamp must indicate a point in time that is accurate to the minute.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>An array that consists of the IDs of instances to query.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The ID of the resource group to which the instance belongs in Resource Management.</p>
     * <br>
     * <p>If you do not configure this parameter, the instance belongs to the default resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The beginning of the time range to query. This value is a UNIX timestamp. Unit: seconds.</p>
     * <br>
     * <p>> This UNIX timestamp must indicate a point in time that is accurate to the minute.</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static DescribePortViewSourceIspsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePortViewSourceIspsRequest self = new DescribePortViewSourceIspsRequest();
        return TeaModel.build(map, self);
    }

    public DescribePortViewSourceIspsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribePortViewSourceIspsRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public DescribePortViewSourceIspsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribePortViewSourceIspsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
