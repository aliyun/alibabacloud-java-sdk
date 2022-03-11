// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeDtsJobsRequest extends TeaModel {
    @NameInMap("DedicatedClusterId")
    public String dedicatedClusterId;

    @NameInMap("DedicatedClusterNodeId")
    public Long dedicatedClusterNodeId;

    @NameInMap("DtsJobId")
    public String dtsJobId;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("JobType")
    public String jobType;

    @NameInMap("OrderColumn")
    public String orderColumn;

    @NameInMap("OrderDirection")
    public String orderDirection;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Params")
    public String params;

    @NameInMap("Region")
    public String region;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Status")
    public String status;

    @NameInMap("Tags")
    public String tags;

    @NameInMap("Type")
    public String type;

    public static DescribeDtsJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDtsJobsRequest self = new DescribeDtsJobsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDtsJobsRequest setDedicatedClusterId(String dedicatedClusterId) {
        this.dedicatedClusterId = dedicatedClusterId;
        return this;
    }
    public String getDedicatedClusterId() {
        return this.dedicatedClusterId;
    }

    public DescribeDtsJobsRequest setDedicatedClusterNodeId(Long dedicatedClusterNodeId) {
        this.dedicatedClusterNodeId = dedicatedClusterNodeId;
        return this;
    }
    public Long getDedicatedClusterNodeId() {
        return this.dedicatedClusterNodeId;
    }

    public DescribeDtsJobsRequest setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    public DescribeDtsJobsRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeDtsJobsRequest setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public DescribeDtsJobsRequest setOrderColumn(String orderColumn) {
        this.orderColumn = orderColumn;
        return this;
    }
    public String getOrderColumn() {
        return this.orderColumn;
    }

    public DescribeDtsJobsRequest setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
        return this;
    }
    public String getOrderDirection() {
        return this.orderDirection;
    }

    public DescribeDtsJobsRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public DescribeDtsJobsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDtsJobsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDtsJobsRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public DescribeDtsJobsRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeDtsJobsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDtsJobsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeDtsJobsRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public DescribeDtsJobsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
