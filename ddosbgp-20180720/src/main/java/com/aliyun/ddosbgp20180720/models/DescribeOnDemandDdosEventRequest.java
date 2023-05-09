// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeOnDemandDdosEventRequest extends TeaModel {
    /**
     * <p>The timestamp that indicates the end time of the attack. Unit: seconds. The timestamp follows the UNIX time format. It is the number of seconds that have elapsed since 00:00:00 Thursday, 1 January 1970.</p>
     */
    @NameInMap("EndTime")
    public Integer endTime;

    /**
     * <p>The timestamp that specifies the beginning of the time range to query. Unit: seconds. The timestamp follows the UNIX time format. It is the number of seconds that have elapsed since 00:00:00 Thursday, 1 January 1970.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The status of the event. Valid values:</p>
     * <br>
     * <p>*   **hole_begin **: indicates that the event is in the blackhole state.</p>
     * <p>*   **hole_end **: indicates that blackhole ends.</p>
     * <p>*   **defense_begin **: indicates that the event is in the cleaning state.</p>
     * <p>*   **defense_end **: indicates that cleaning ends.</p>
     */
    @NameInMap("Ip")
    public String ip;

    /**
     * <p>The IP address of the protection target.</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The ID of the on-demand instance to query.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The number of the page to return. Default value: **1**.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The operation that you want to perform. Set the value to **DescribeOnDemandDdosEvent**.</p>
     */
    @NameInMap("StartTime")
    public Integer startTime;

    public static DescribeOnDemandDdosEventRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOnDemandDdosEventRequest self = new DescribeOnDemandDdosEventRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOnDemandDdosEventRequest setEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }
    public Integer getEndTime() {
        return this.endTime;
    }

    public DescribeOnDemandDdosEventRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeOnDemandDdosEventRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public DescribeOnDemandDdosEventRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public DescribeOnDemandDdosEventRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeOnDemandDdosEventRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeOnDemandDdosEventRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeOnDemandDdosEventRequest setStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }
    public Integer getStartTime() {
        return this.startTime;
    }

}
