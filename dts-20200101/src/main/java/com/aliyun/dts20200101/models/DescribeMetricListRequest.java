// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeMetricListRequest extends TeaModel {
    /**
     * <p>The ID of the Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>12323344****</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    /**
     * <p>Ensures the idempotency of the request. Generate a parameter value from your client to make sure that the value is unique among different requests. <strong>ClientToken</strong> supports only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>0c593ea1-3bea-11e9-b96b-88e9fe63****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the data migration or data synchronization task.</p>
     * 
     * <strong>example:</strong>
     * <p>k2gm967v16f****</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

    /**
     * <p>The end timestamp, in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1642476194000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>Default value: <strong>ALIYUN</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>ALIYUN</p>
     */
    @NameInMap("Env")
    public String env;

    /**
     * <ul>
     * <li><strong>InternetOut</strong>: outbound Internet traffic, in bytes.</li>
     * <li><strong>diskusage_utilization</strong>: disk usage.</li>
     * <li><strong>IntranetInRate</strong>: inbound internal network traffic, in bytes.</li>
     * <li><strong>InternetIn</strong>: inbound Internet traffic, in bytes.</li>
     * <li><strong>cpu_total</strong>: CPU utilization.</li>
     * <li><strong>memory_usedutilization</strong>: memory utilization.</li>
     * <li><strong>IntranetOutRate</strong>: outbound internal network traffic, in bytes.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cpu_total</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>Specifies whether to query a cluster or a node. Valid values:</p>
     * <ul>
     * <li><strong>CLUSTER</strong>: cluster.</li>
     * <li><strong>NODE</strong>: node.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NODE</p>
     */
    @NameInMap("MetricType")
    public String metricType;

    @NameInMap("OwnerID")
    public String ownerID;

    /**
     * <p>The observation value. If <strong>MetricType</strong> is set to <strong>NODE</strong>, the value is <strong>nodeid</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>nodeid</p>
     */
    @NameInMap("Param")
    public String param;

    /**
     * <p>The observation interval in seconds. The minimum interval is 15 seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("Period")
    public Long period;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzawhxxc****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The start timestamp, in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1642476144000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeMetricListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricListRequest self = new DescribeMetricListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMetricListRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public DescribeMetricListRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeMetricListRequest setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    public DescribeMetricListRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeMetricListRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public DescribeMetricListRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public DescribeMetricListRequest setMetricType(String metricType) {
        this.metricType = metricType;
        return this;
    }
    public String getMetricType() {
        return this.metricType;
    }

    public DescribeMetricListRequest setOwnerID(String ownerID) {
        this.ownerID = ownerID;
        return this;
    }
    public String getOwnerID() {
        return this.ownerID;
    }

    public DescribeMetricListRequest setParam(String param) {
        this.param = param;
        return this;
    }
    public String getParam() {
        return this.param;
    }

    public DescribeMetricListRequest setPeriod(Long period) {
        this.period = period;
        return this;
    }
    public Long getPeriod() {
        return this.period;
    }

    public DescribeMetricListRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeMetricListRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
