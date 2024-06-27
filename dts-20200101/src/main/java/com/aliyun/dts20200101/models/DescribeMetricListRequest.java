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
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. **The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>0c593ea1-3bea-11e9-b96b-88e9fe63****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the data migration or synchronization task.</p>
     * 
     * <strong>example:</strong>
     * <p>k2gm967v16f****</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

    /**
     * <p>The timestamp that indicates the end of the time range to query. Unit: milliseconds.</p>
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
     * <li><strong>InternetOut</strong>: the outbound traffic over the Internet. Unit: byte.</li>
     * <li><strong>diskusage_utilization</strong>: the disk usage.</li>
     * <li><strong>IntranetInRate</strong>: the inbound traffic over the internal network. Unit: byte.</li>
     * <li><strong>InternetIn</strong>: the inbound traffic from the Internet. Unit: byte.</li>
     * <li><strong>cpu_total</strong>: the CPU utilization.</li>
     * <li><strong>memory_usedutilization</strong>: the memory usage.</li>
     * <li><strong>IntranetOutRate</strong>: the outbound traffic over the internal network. Unit: byte.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cpu_total</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>Specifies whether to query the metrics of the cluster or a node. Valid values:</p>
     * <ul>
     * <li><strong>CLUSTER</strong>: query the metrics of the cluster.</li>
     * <li><strong>NODE</strong>: query the metrics of a node.</li>
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
     * <p>The monitored object. If the <strong>MetricType</strong> parameter is set to <strong>NODE</strong>, set this parameter to the ID of the node that is monitored.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>nodeid</p>
     */
    @NameInMap("Param")
    public String param;

    /**
     * <p>The monitoring interval. Unit: seconds. Minimum value: 15.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("Period")
    public Long period;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The timestamp that indicates the beginning of the time range to query. Unit: milliseconds.</p>
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
