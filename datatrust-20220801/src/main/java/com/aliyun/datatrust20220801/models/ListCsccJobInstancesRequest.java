// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ListCsccJobInstancesRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("JobInstanceStatus")
    public Integer jobInstanceStatus;

    @NameInMap("JobInstanceType")
    public Integer jobInstanceType;

    @NameInMap("JobName")
    public String jobName;

    @NameInMap("Order")
    public String order;

    @NameInMap("OrderBy")
    public String orderBy;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Param")
    public java.util.Map<String, ?> param;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("Start")
    public Integer start;

    @NameInMap("StartTime")
    public String startTime;

    public static ListCsccJobInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCsccJobInstancesRequest self = new ListCsccJobInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListCsccJobInstancesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListCsccJobInstancesRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListCsccJobInstancesRequest setJobInstanceStatus(Integer jobInstanceStatus) {
        this.jobInstanceStatus = jobInstanceStatus;
        return this;
    }
    public Integer getJobInstanceStatus() {
        return this.jobInstanceStatus;
    }

    public ListCsccJobInstancesRequest setJobInstanceType(Integer jobInstanceType) {
        this.jobInstanceType = jobInstanceType;
        return this;
    }
    public Integer getJobInstanceType() {
        return this.jobInstanceType;
    }

    public ListCsccJobInstancesRequest setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public ListCsccJobInstancesRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListCsccJobInstancesRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListCsccJobInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCsccJobInstancesRequest setParam(java.util.Map<String, ?> param) {
        this.param = param;
        return this;
    }
    public java.util.Map<String, ?> getParam() {
        return this.param;
    }

    public ListCsccJobInstancesRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListCsccJobInstancesRequest setStart(Integer start) {
        this.start = start;
        return this;
    }
    public Integer getStart() {
        return this.start;
    }

    public ListCsccJobInstancesRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
