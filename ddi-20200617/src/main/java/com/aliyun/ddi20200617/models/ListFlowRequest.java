// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ListFlowRequest extends TeaModel {
    // 集群ID。您可以调用ListClusters查看集群的ID。
    @NameInMap("ClusterId")
    public String clusterId;

    // 工作流ID。您可以调用ListFlowInstance查看工作流ID。
    @NameInMap("Id")
    public String id;

    // 作业ID。您可以调用ListFlowJob查看。
    @NameInMap("JobId")
    public String jobId;

    // 工作流名称。您可以调用ListFlowInstance查看。
    @NameInMap("Name")
    public String name;

    // 页码。
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 每页查询数量。
    @NameInMap("PageSize")
    public Integer pageSize;

    // 是否调度。
    @NameInMap("Periodic")
    public Boolean periodic;

    // 项目ID。您可以调用ListFlowProject查看项目的ID。
    @NameInMap("ProjectId")
    public String projectId;

    // 地域ID。您可以调用DescribeRegions查看最新的阿里云地域列表。
    @NameInMap("RegionId")
    public String regionId;

    // 状态：  STOP_SCHEDULE（停止调度） UNDER_SCHEDULE（调度中）
    @NameInMap("Status")
    public String status;

    public static ListFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFlowRequest self = new ListFlowRequest();
        return TeaModel.build(map, self);
    }

    public ListFlowRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListFlowRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ListFlowRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public ListFlowRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListFlowRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListFlowRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListFlowRequest setPeriodic(Boolean periodic) {
        this.periodic = periodic;
        return this;
    }
    public Boolean getPeriodic() {
        return this.periodic;
    }

    public ListFlowRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ListFlowRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListFlowRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
