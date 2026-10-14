// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribePortFlowListRequest extends TeaModel {
    /**
     * <p>The end time of the query. Specify the value as a UNIX timestamp. Unit: seconds.</p>
     * <blockquote>
     * <p>The value must be on the minute.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1583683200</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The ID of the Anti-DDoS Pro and Anti-DDoS Premium instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ddoscoo-cn-mp91j1ao****</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The interval at which data is returned. Unit: seconds. The supported interval values vary based on the query time range (determined by <strong>StartTime</strong> and <strong>EndTime</strong>). Recommended settings:</p>
     * <ul>
     * <li>Query time range ≤ 1 hour: minimum interval of 60 seconds, maximum not exceeding the query time range.</li>
     * <li>Query time range &gt; 1 hour and ≤ 6 hours: minimum interval of 600 seconds, maximum not exceeding the query time range.</li>
     * <li>Query time range &gt; 6 hours and ≤ 24 hours: minimum interval of 1800 seconds, maximum not exceeding the query time range.</li>
     * <li>Query time range &gt; 24 hours and ≤ 7 days: minimum interval of 3600 seconds, maximum not exceeding the query time range.</li>
     * <li>Query time range &gt; 7 days and ≤ 15 days: minimum interval of 14400 seconds, maximum not exceeding the query time range.</li>
     * <li>Query time range &gt; 15 days: minimum interval of 43200 seconds, maximum not exceeding the query time range.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("Interval")
    public Integer interval;

    /**
     * <p>The ID of the resource group to which the Anti-DDoS Pro and Anti-DDoS Premium instance belongs in Resource Management. By default, this parameter is empty, which indicates that the instance belongs to the default resource group.</p>
     * <p>For more information about resource groups, see <a href="https://help.aliyun.com/document_detail/94485.html">Create a resource group</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm2pz25js****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The start time of the query. Specify the value as a UNIX timestamp. Unit: seconds.</p>
     * <blockquote>
     * <p>The value must be on the minute.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1582992000</p>
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
