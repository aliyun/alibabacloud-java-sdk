// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeDdosEventRequest extends TeaModel {
    /**
     * <p>The time when the DDoS attack stopped. This value is a UNIX timestamp. Unit: seconds.</p>
     */
    @NameInMap("EndTime")
    public Integer endTime;

    /**
     * <p>The start time of the DDoS attack event to query. This value is a UNIX timestamp. Unit: seconds.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The status of the DDoS attack event. Valid values:</p>
     * <br>
     * <p>*   **hole_begin**: indicates that blackhole filtering is triggered for the attacked IP address.</p>
     * <p>*   **hole_end**: indicates that blackhole filtering is deactivated for the attacked IP address.</p>
     * <p>*   **defense_begin**: indicates that attack traffic is being scrubbed.</p>
     * <p>*   **defense_end**: indicates that attack traffic is scrubbed.</p>
     */
    @NameInMap("Ip")
    public String ip;

    /**
     * <p>The attacked IP address to query.</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The ID of the Anti-DDoS Origin instance to query.</p>
     * <br>
     * <p>>  You can call the [DescribeInstanceList](~~118698~~) operation to query the IDs of all Anti-DDoS Origin instances.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The details about the DDoS attack event.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The operation that you want to perform. Set the value to **DescribeDdosEvent**</p>
     */
    @NameInMap("StartTime")
    public Integer startTime;

    public static DescribeDdosEventRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDdosEventRequest self = new DescribeDdosEventRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDdosEventRequest setEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }
    public Integer getEndTime() {
        return this.endTime;
    }

    public DescribeDdosEventRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeDdosEventRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public DescribeDdosEventRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public DescribeDdosEventRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDdosEventRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDdosEventRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeDdosEventRequest setStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }
    public Integer getStartTime() {
        return this.startTime;
    }

}
