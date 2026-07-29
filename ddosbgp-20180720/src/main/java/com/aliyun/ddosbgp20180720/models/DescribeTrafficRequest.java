// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeTrafficRequest extends TeaModel {
    /**
     * <p>The end time of the query. Specify a UNIX timestamp. Unit: seconds.</p>
     * <p>If you do not set this parameter, the current time is used as the end time.</p>
     * 
     * <strong>example:</strong>
     * <p>1563445054</p>
     */
    @NameInMap("EndTime")
    public Integer endTime;

    /**
     * <p>The type of traffic statistics to query. Valid values:</p>
     * <ul>
     * <li><strong>max</strong>: the peak traffic within the statistical interval.</li>
     * <li><strong>avg</strong>: the average traffic within the statistical interval.</li>
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
     * <p>You can call <a href="https://help.aliyun.com/document_detail/118698.html">DescribeInstanceList</a> to query the IDs of all Anti-DDoS Origin instances.</p>
     * </blockquote>
     * <p>If the instance specified here is used for traffic diversion, you must set the <strong>Interval</strong> request parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>ddosbgp-cn-n6w203qg****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The time interval for traffic statistics. Unit: seconds. This parameter specifies the length of each interval for which traffic data is aggregated. Default value: <strong>5</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Interval")
    public Integer interval;

    /**
     * <p>The assets that are assigned public IP addresses to query. If you do not specify this parameter in Settings, the traffic statistics of all assets that are assigned public IP addresses protected by the Anti-DDoS Origin instance are queried.</p>
     * <blockquote>
     * <p>The assets that are assigned public IP addresses must have been added as protected objects of the Anti-DDoS Origin instance. You can invoke <a href="https://help.aliyun.com/document_detail/118701.html">DescribePackIpList</a> to query all protected objects of the Anti-DDoS Origin instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>39.XX.XX.96</p>
     */
    @NameInMap("Ip")
    public String ip;

    /**
     * <p>The CIDR block used for traffic diversion to query.</p>
     * 
     * <strong>example:</strong>
     * <p>111.XX.XX.0/24</p>
     */
    @NameInMap("Ipnet")
    public String ipnet;

    /**
     * <p>The region ID of the Anti-DDoS Origin instance.</p>
     * <blockquote>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/118703.html">DescribeRegions</a> to query all region IDs supported by Anti-DDoS Origin.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the Anti-DDoS Origin instance belongs in Resource Management.</p>
     * <p>If you do not set this parameter, the default resource group is used.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm2pz25js****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The start time of the query. Specify a UNIX timestamp. Unit: seconds.</p>
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
