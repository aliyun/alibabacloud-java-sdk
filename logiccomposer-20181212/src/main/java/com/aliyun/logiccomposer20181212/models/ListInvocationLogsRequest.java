// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.logiccomposer20181212.models;

import com.aliyun.tea.*;

public class ListInvocationLogsRequest extends TeaModel {
    // 工作流 ID
    @NameInMap("FlowId")
    public String flowId;

    // 页码
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 每页返回数量
    @NameInMap("PageSize")
    public Integer pageSize;

    // 执行状态
    @NameInMap("Status")
    public String status;

    // 工作流版本
    @NameInMap("FlowVersion")
    public String flowVersion;

    // 执行开始时间
    @NameInMap("StartTime")
    public String startTime;

    // 结束执行时间
    @NameInMap("EndTime")
    public String endTime;

    // 标签
    @NameInMap("Tags")
    public String tags;

    public static ListInvocationLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInvocationLogsRequest self = new ListInvocationLogsRequest();
        return TeaModel.build(map, self);
    }

    public ListInvocationLogsRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public ListInvocationLogsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListInvocationLogsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListInvocationLogsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListInvocationLogsRequest setFlowVersion(String flowVersion) {
        this.flowVersion = flowVersion;
        return this;
    }
    public String getFlowVersion() {
        return this.flowVersion;
    }

    public ListInvocationLogsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListInvocationLogsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListInvocationLogsRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

}
