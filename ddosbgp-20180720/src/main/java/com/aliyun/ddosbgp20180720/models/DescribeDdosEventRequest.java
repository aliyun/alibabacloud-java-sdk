// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeDdosEventRequest extends TeaModel {
    @NameInMap("StartTime")
    @Validation(required = true)
    public Integer startTime;

    @NameInMap("EndTime")
    @Validation(required = true)
    public Integer endTime;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("PageNo")
    @Validation(required = true)
    public Integer pageNo;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("Ip")
    public String ip;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeDdosEventRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDdosEventRequest self = new DescribeDdosEventRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDdosEventRequest setStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }
    public Integer getStartTime() {
        return this.startTime;
    }

    public DescribeDdosEventRequest setEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }
    public Integer getEndTime() {
        return this.endTime;
    }

    public DescribeDdosEventRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDdosEventRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
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

    public DescribeDdosEventRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeDdosEventRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
