// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeFlowMetricRequest extends TeaModel {
    /**
     * <p>End Time. Supported formats:</p>
     * <ul>
     * <li><p>UNIX timestamp: the number of milliseconds elapsed since January 1, 1970.</p>
     * </li>
     * <li><p>Format: YYYY-MM-DDThh:mm:ssZ.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1664714703743</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The instance ID, which can be either a cloud computr ID or a premium public bandwidth plan ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Ecd-fwq23f13<strong><strong>ornp-6inxqsvcyv6z8</strong></strong></p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The instance type. You can select either cloud computer type or premium public bandwidth type. If you select cloud computer type, the <code>InstanceId</code> and <code>MetricType</code> must be filled in with a cloud computer ID and its corresponding traffic type. The same applies to premium public bandwidth.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>desktop</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The type of monitoring metric. Supports monitoring data for inbound and outbound bandwidth of cloud computers, as well as inbound and outbound bandwidth for public network access of premium public bandwidth.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>intranetOutRate</p>
     */
    @NameInMap("MetricType")
    public String metricType;

    /**
     * <p>The statistic period of monitoring data. Unit: seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The Region ID. You can call <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> to obtain the list of Regions supported by Elastic Desktop Service (EDS).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Start Time. Supported formats:</p>
     * <ul>
     * <li><p>UNIX timestamp: the number of milliseconds elapsed since January 1, 1970.</p>
     * </li>
     * <li><p>Format: YYYY-MM-DDThh:mm:ssZ.</p>
     * </li>
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
