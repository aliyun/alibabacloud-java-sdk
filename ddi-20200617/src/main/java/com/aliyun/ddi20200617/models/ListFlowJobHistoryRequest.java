// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ListFlowJobHistoryRequest extends TeaModel {
    // 作业ID。您可以调用ListFlowJob查看作业ID。
    @NameInMap("Id")
    public String id;

    // 作业实例ID。您可以调用DescribeFlowJob查看作业实例ID。
    @NameInMap("InstanceId")
    public String instanceId;

    // 作业的类型，可能的取值有：SPARK，SPARK_STREAMING，ZEPPELIN
    @NameInMap("JobType")
    public String jobType;

    // 当前页码。
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 分页查询时每页行数。
    @NameInMap("PageSize")
    public Integer pageSize;

    // 项目ID。您可以调用ListFlowProject查看项目的ID。
    @NameInMap("ProjectId")
    public String projectId;

    // 地域ID。您可以调用DescribeRegions查看最新的阿里云地域列表。
    @NameInMap("RegionId")
    public String regionId;

    // 状态列表。取值如下：SUBMITTED, RUNNING, SUCCESS, FAILED, KILL_FAILED, KILL_SUCCESS
    @NameInMap("StatusList")
    public java.util.List<String> statusList;

    // 查询的时间范围参数，参数列表：type: range，from: 开始时间（long型时间戳），to: 结束时间（long型时间戳）
    @NameInMap("TimeRange")
    public String timeRange;

    public static ListFlowJobHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFlowJobHistoryRequest self = new ListFlowJobHistoryRequest();
        return TeaModel.build(map, self);
    }

    public ListFlowJobHistoryRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ListFlowJobHistoryRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListFlowJobHistoryRequest setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public ListFlowJobHistoryRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListFlowJobHistoryRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListFlowJobHistoryRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ListFlowJobHistoryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListFlowJobHistoryRequest setStatusList(java.util.List<String> statusList) {
        this.statusList = statusList;
        return this;
    }
    public java.util.List<String> getStatusList() {
        return this.statusList;
    }

    public ListFlowJobHistoryRequest setTimeRange(String timeRange) {
        this.timeRange = timeRange;
        return this;
    }
    public String getTimeRange() {
        return this.timeRange;
    }

}
