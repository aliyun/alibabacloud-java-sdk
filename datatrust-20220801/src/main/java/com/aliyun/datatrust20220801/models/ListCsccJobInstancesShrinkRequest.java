// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ListCsccJobInstancesShrinkRequest extends TeaModel {
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
    public String paramShrink;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("Start")
    public Integer start;

    @NameInMap("StartTime")
    public String startTime;

    public static ListCsccJobInstancesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCsccJobInstancesShrinkRequest self = new ListCsccJobInstancesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListCsccJobInstancesShrinkRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListCsccJobInstancesShrinkRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListCsccJobInstancesShrinkRequest setJobInstanceStatus(Integer jobInstanceStatus) {
        this.jobInstanceStatus = jobInstanceStatus;
        return this;
    }
    public Integer getJobInstanceStatus() {
        return this.jobInstanceStatus;
    }

    public ListCsccJobInstancesShrinkRequest setJobInstanceType(Integer jobInstanceType) {
        this.jobInstanceType = jobInstanceType;
        return this;
    }
    public Integer getJobInstanceType() {
        return this.jobInstanceType;
    }

    public ListCsccJobInstancesShrinkRequest setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public ListCsccJobInstancesShrinkRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListCsccJobInstancesShrinkRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListCsccJobInstancesShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCsccJobInstancesShrinkRequest setParamShrink(String paramShrink) {
        this.paramShrink = paramShrink;
        return this;
    }
    public String getParamShrink() {
        return this.paramShrink;
    }

    public ListCsccJobInstancesShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListCsccJobInstancesShrinkRequest setStart(Integer start) {
        this.start = start;
        return this;
    }
    public Integer getStart() {
        return this.start;
    }

    public ListCsccJobInstancesShrinkRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
