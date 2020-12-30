// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeOnDemandDdosEventRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("StartTime")
    public Integer startTime;

    @NameInMap("EndTime")
    public Integer endTime;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Ip")
    public String ip;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeOnDemandDdosEventRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOnDemandDdosEventRequest self = new DescribeOnDemandDdosEventRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOnDemandDdosEventRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeOnDemandDdosEventRequest setStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }
    public Integer getStartTime() {
        return this.startTime;
    }

    public DescribeOnDemandDdosEventRequest setEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }
    public Integer getEndTime() {
        return this.endTime;
    }

    public DescribeOnDemandDdosEventRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeOnDemandDdosEventRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
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

    public DescribeOnDemandDdosEventRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeOnDemandDdosEventRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
