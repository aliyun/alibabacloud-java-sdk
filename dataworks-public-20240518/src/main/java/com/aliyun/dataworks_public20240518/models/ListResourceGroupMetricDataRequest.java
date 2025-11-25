// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListResourceGroupMetricDataRequest extends TeaModel {
    /**
     * <p>Start Time</p>
     * <p>Supported format:</p>
     * <ul>
     * <li>Unix timestamp, representing the number of milliseconds that have elapsed since January 1, 1970.</li>
     * </ul>
     * <p>The interval between BeginTime and EndTime must be 31 days or less.</p>
     * <p>Default: The current time minus 2 hours, expressed as a millisecond Unix timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1593950832000</p>
     */
    @NameInMap("BeginTime")
    public Long beginTime;

    /**
     * <p>End Time</p>
     * <p>Supported format:</p>
     * <ul>
     * <li>Unix timestamp, representing the number of milliseconds that have elapsed since January 1, 1970.</li>
     * </ul>
     * <p>The interval between BeginTime and EndTime must be 31 days or less.</p>
     * <p>Default: The current time, expressed as a millisecond Unix timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1750176000000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Length")
    public Integer length;

    /**
     * <p>The metric name. Available metrics include:</p>
     * <ul>
     * <li>CUSpec: Maximum CU capacity of the resource group, in CUs.</li>
     * <li>CUUsage: CU usage of the resource group, in CUs.</li>
     * <li>CUUtilization: CU utilization of the resource group, in %.</li>
     * <li>SlotSpec: Maximum concurrency for resource group scheduling, in slots.</li>
     * <li>SlotUsage: Used concurrency for resource group scheduling, in slots.</li>
     * <li>SchedulerCUMaxSpec: Maximum CU quota for data computing, in CUs.</li>
     * <li>SchedulerCUUsage: CU usage for data computing, in CUs.</li>
     * <li>SchedulerCUMinSpec: Minimum guaranteed CUs for data computing, in CUs.</li>
     * <li>DataIntegrationCUMaxSpec: Maximum CU quota for Data Integration, in CUs.</li>
     * <li>DataIntegrationCUUsage: CU usage for Data Integration, in CUs.</li>
     * <li>DataIntegrationCUMinSpec: Minimum guaranteed CUs for Data Integration, in CUs.</li>
     * <li>DataServiceCUMaxSpec: Maximum CU quota for dataservice, in CUs.</li>
     * <li>DataServiceCUUsage: CU usage for DataService Studio, in CUs.</li>
     * <li>DataServiceCUMinSpec: Minimum guaranteed CUs for DataService Studio, in CUs.</li>
     * <li>ServerIdeCUMaxSpec: Maximum CU quota for personal development environment, in CUs.</li>
     * <li>ServerIdeCUUsage: CU usage for personal development environment, in CUs.</li>
     * <li>ServerIdeCUMinSpec: Minimum guaranteed CUs for personal development environment, in CUs.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CUSpec</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <strong>example:</strong>
     * <p>FFqBJBxE8I0PE0IUO6K69k7m2FfyWNNc2qQ9ReUkazhz9VA7dWZKlxBcjUwOV0imSM</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The statistical period for monitoring data.</p>
     * <p>Value: A multiple of 60.</p>
     * <p>Unit: Seconds.</p>
     * <p>Default: 60</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Serverless_res_group_524257424564736_6831777003XXXXX</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static ListResourceGroupMetricDataRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourceGroupMetricDataRequest self = new ListResourceGroupMetricDataRequest();
        return TeaModel.build(map, self);
    }

    public ListResourceGroupMetricDataRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public ListResourceGroupMetricDataRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListResourceGroupMetricDataRequest setLength(Integer length) {
        this.length = length;
        return this;
    }
    public Integer getLength() {
        return this.length;
    }

    public ListResourceGroupMetricDataRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public ListResourceGroupMetricDataRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListResourceGroupMetricDataRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public ListResourceGroupMetricDataRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
