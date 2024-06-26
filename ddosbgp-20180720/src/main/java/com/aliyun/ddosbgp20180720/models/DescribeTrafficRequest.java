// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeTrafficRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. The value is a UNIX timestamp. Unit: seconds.</p>
     * <p>If you do not specify this parameter, the current system time is used as the end time.</p>
     * 
     * <strong>example:</strong>
     * <p>1563445054</p>
     */
    @NameInMap("EndTime")
    public Integer endTime;

    /**
     * <p>The type of the traffic statistics to query. Valid values:</p>
     * <ul>
     * <li><strong>max</strong>: the peak traffic within the specified interval</li>
     * <li><strong>avg</strong>: the average traffic within the specified interval</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>max</p>
     */
    @NameInMap("FlowType")
    public String flowType;

    /**
     * <p>The ID of the Anti-DDoS Origin instance to query.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/118698.html">DescribeInstanceList</a> operation to query the IDs of all Anti-DDoS Origin instances.</p>
     * </blockquote>
     * <p>If you specify an on-demand instance, you must configure the <strong>Interval</strong> parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>ddosbgp-cn-n6w203qg****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The interval at which the traffic statistics are calculated. Unit: seconds. Default value: <strong>5</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Interval")
    public Integer interval;

    /**
     * <p>The public IP address of the asset to query. If you do not specify this parameter, the traffic statistics of all public IP addresses that are protected by the Anti-DDoS Origin instance are queried.</p>
     * <blockquote>
     * <p> The public IP address must be a protected object of the Anti-DDoS Origin instance. You can call the <a href="https://help.aliyun.com/document_detail/118701.html">DescribePackIpList</a> operation to query all protected objects of the Anti-DDoS Origin instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>39.XX.XX.96</p>
     */
    @NameInMap("Ip")
    public String ip;

    /**
     * <p>The Classless Inter-Domain Routing (CIDR) block of the on-demand instance that you want to query.</p>
     * 
     * <strong>example:</strong>
     * <p>111.XX.XX.0/24</p>
     */
    @NameInMap("Ipnet")
    public String ipnet;

    /**
     * <p>The ID of the region where the Anti-DDoS Origin instance resides.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/118703.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the Anti-DDoS Origin instance belongs in Resource Management.</p>
     * <p>If you do not specify this parameter, the instance belongs to the default resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm2pz25js****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The beginning of the time range to query. The value is a UNIX timestamp. Unit: seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1619798400</p>
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
