// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribePortFlowListRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. The value is a UNIX timestamp. Unit: seconds.</p>
     * <br>
     * <p>**</p>
     * <br>
     * <p>**This UNIX timestamp must indicate a point in time that is accurate to the minute.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>An array that consists of the IDs of instances.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The interval for returning data. Unit: seconds. The interval that you can specify varies based on the time range to query. The time range to query is determined by the values of **StartTime** and **EndTime**.</p>
     * <br>
     * <p>*   If the time range to query is no greater than 1 hour, we recommend that you specify the interval from 60 seconds to the time range to query.</p>
     * <p>*   If the time range to query is greater than 1 hour but no greater than 6 hours, we recommend that you specify the interval from 600 seconds to the time range to query.</p>
     * <p>*   If the time range to query is greater than 6 hours but no greater than 24 hours, we recommend that you specify the interval from 1,800 seconds to the time range to query.</p>
     * <p>*   If the time range to query is greater than 24 hours but no greater than 7 days, we recommend that you specify the interval from 3,600 seconds to the time range to query.</p>
     * <p>*   If the time range to query is greater than 7 days but no greater than 15 days, we recommend that you specify the interval from 14,400 seconds to the time range to query.</p>
     * <p>*   If the time range to query is greater than 15 days, we recommend that you specify the interval from 43,200 seconds to the time range to query.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Interval")
    public Integer interval;

    /**
     * <p>The ID of the resource group to which the instance belongs in Resource Management. This parameter is empty by default, which indicates that the instance belongs to the default resource group.</p>
     * <br>
     * <p>For more information about resource groups, see [Create a resource group](https://help.aliyun.com/document_detail/94485.html).</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The beginning of the time range to query. The value is a UNIX timestamp. Unit: seconds.</p>
     * <br>
     * <p>**</p>
     * <br>
     * <p>**This UNIX timestamp must indicate a point in time that is accurate to the minute.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static DescribePortFlowListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePortFlowListRequest self = new DescribePortFlowListRequest();
        return TeaModel.build(map, self);
    }

    public DescribePortFlowListRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribePortFlowListRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public DescribePortFlowListRequest setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public DescribePortFlowListRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribePortFlowListRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
