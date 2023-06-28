// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20171120.models;

import com.aliyun.tea.*;

public class DescribeTopTrafficRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. This value is a UNIX timestamp. Unit: seconds.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the on-demand instance.</p>
     * <br>
     * <p>>  You can call the [DescribeOnDemandInstance](~~152120~~) operation to query the IDs of all on-demand instances.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The CIDR block of the on-demand instance that you want to query.</p>
     */
    @NameInMap("Ipnet")
    public String ipnet;

    /**
     * <p>The number of the page to return. Default value: **1**.</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries to return on each page. Default value: **10**. Maximum value: **50**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the on-demand instance.</p>
     * <br>
     * <p>>  You can call the [DescribeRegions](~~118703~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the on-demand instance belongs in Resource Management.</p>
     * <br>
     * <p>If you do not specify this parameter, the instance belongs to the default resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The number of IP addresses from which the most traffic is forwarded. Default value: **1**, which indicates the IP address from which the most traffic is forwarded.</p>
     */
    @NameInMap("Rn")
    public Integer rn;

    /**
     * <p>The beginning of the time range to query. This value is a UNIX timestamp. Unit: seconds.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeTopTrafficRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTopTrafficRequest self = new DescribeTopTrafficRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTopTrafficRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeTopTrafficRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeTopTrafficRequest setIpnet(String ipnet) {
        this.ipnet = ipnet;
        return this;
    }
    public String getIpnet() {
        return this.ipnet;
    }

    public DescribeTopTrafficRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public DescribeTopTrafficRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeTopTrafficRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeTopTrafficRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeTopTrafficRequest setRn(Integer rn) {
        this.rn = rn;
        return this;
    }
    public Integer getRn() {
        return this.rn;
    }

    public DescribeTopTrafficRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
