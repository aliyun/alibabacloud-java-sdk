// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeFlowMetricRequest extends TeaModel {
    /**
     * <p>The end time. The following formats are supported:</p>
     * <ul>
     * <li>UNIX timestamp: the number of milliseconds that have elapsed since January 1, 1970.</li>
     * <li>Format: YYYY-MM-DDThh:mm:ssZ.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1664714703743</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The instance ID. The value can be a cloud computer ID or a premium public bandwidth plan ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecd-fwq23f13**** or np-6inxqsvcyv6z8****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The instance type. You can select the cloud computer type or the premium public bandwidth plan type. If you select the cloud computer type, set InstanceId and MetricType to the cloud computer ID and the traffic type of the cloud computer. The same rule applies to the premium public bandwidth plan type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>desktop</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The monitoring metric type. This parameter supports the inbound and outbound bandwidth of a cloud computer, and the public inbound and outbound bandwidth of a premium public bandwidth plan.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>intranetOutRate</p>
     */
    @NameInMap("MetricType")
    public String metricType;

    /**
     * <p>The statistical period of the monitoring data. Unit: seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> to query the regions supported by Elastic Desktop Service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The start time. The following formats are supported:</p>
     * <ul>
     * <li>UNIX timestamp: the number of milliseconds that have elapsed since January 1, 1970.</li>
     * <li>Format: YYYY-MM-DDThh:mm:ssZ.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1651817220643</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeFlowMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowMetricRequest self = new DescribeFlowMetricRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFlowMetricRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeFlowMetricRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeFlowMetricRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeFlowMetricRequest setMetricType(String metricType) {
        this.metricType = metricType;
        return this;
    }
    public String getMetricType() {
        return this.metricType;
    }

    public DescribeFlowMetricRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public DescribeFlowMetricRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeFlowMetricRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
