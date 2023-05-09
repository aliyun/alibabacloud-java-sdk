// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeTrafficRequest extends TeaModel {
    /**
     * <p>The time when the traffic statistics are calculated. This value is a UNIX timestamp. Unit: seconds.</p>
     */
    @NameInMap("EndTime")
    public Integer endTime;

    /**
     * <p>The ID of the region where the Anti-DDoS Origin instance resides.</p>
     * <br>
     * <p>>  You can call the [DescribeRegions](~~118703~~) operation to query the most recent region list.</p>
     */
    @NameInMap("FlowType")
    public String flowType;

    /**
     * <p>The type of the traffic statistics to query. Valid values:</p>
     * <br>
     * <p>*   **max**: the peak traffic within the specified interval</p>
     * <p>*   **avg**: the average traffic within the specified interval</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The interval at which the traffic statistics are calculated. Unit: seconds. Default value: **5**.</p>
     */
    @NameInMap("Interval")
    public Integer interval;

    /**
     * <p>The packet forwarding rate of attack traffic. Unit: packets per second.</p>
     * <br>
     * <p>>  This parameter is returned only if attack traffic exists.</p>
     */
    @NameInMap("Ip")
    public String ip;

    /**
     * <p>The operation that you want to perform. Set the value to **DescribeTraffic**.</p>
     */
    @NameInMap("Ipnet")
    public String ipnet;

    /**
     * <p>The bandwidth of the total traffic. Unit: Kbit/s.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the Anti-DDoS Origin instance to query.</p>
     * <br>
     * <p>>  You can call the [DescribeInstanceList](~~118698~~) operation to query the IDs of all Anti-DDoS Origin instances.</p>
     * <br>
     * <p>If you specify an on-demand instance, you must configure the **Interval** parameter.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The end of the time range to query. The value is a UNIX timestamp. Unit: seconds.</p>
     * <br>
     * <p>If you do not specify this parameter, the current system time is used as the end time.</p>
     */
    @NameInMap("StartTime")
    public Integer startTime;

    public static DescribeTrafficRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTrafficRequest self = new DescribeTrafficRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTrafficRequest setEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }
    public Integer getEndTime() {
        return this.endTime;
    }

    public DescribeTrafficRequest setFlowType(String flowType) {
        this.flowType = flowType;
        return this;
    }
    public String getFlowType() {
        return this.flowType;
    }

    public DescribeTrafficRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeTrafficRequest setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public DescribeTrafficRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public DescribeTrafficRequest setIpnet(String ipnet) {
        this.ipnet = ipnet;
        return this;
    }
    public String getIpnet() {
        return this.ipnet;
    }

    public DescribeTrafficRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeTrafficRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeTrafficRequest setStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }
    public Integer getStartTime() {
        return this.startTime;
    }

}
