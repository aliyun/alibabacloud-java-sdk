// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class QueryOutboundTaskRequest extends TeaModel {
    @NameInMap("Ani")
    public String ani;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("DepartmentId")
    public String departmentId;

    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SkillGroup")
    public Long skillGroup;

    @NameInMap("StartDate")
    public String startDate;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("Status")
    public String status;

    @NameInMap("TaskId")
    public Long taskId;

    @NameInMap("TaskName")
    public String taskName;

    @NameInMap("TaskType")
    public Integer taskType;

    public static QueryOutboundTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOutboundTaskRequest self = new QueryOutboundTaskRequest();
        return TeaModel.build(map, self);
    }

    public QueryOutboundTaskRequest setAni(String ani) {
        this.ani = ani;
        return this;
    }
    public String getAni() {
        return this.ani;
    }

    public QueryOutboundTaskRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QueryOutboundTaskRequest setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
        return this;
    }
    public String getDepartmentId() {
        return this.departmentId;
    }

    public QueryOutboundTaskRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public QueryOutboundTaskRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QueryOutboundTaskRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public QueryOutboundTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryOutboundTaskRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryOutboundTaskRequest setSkillGroup(Long skillGroup) {
        this.skillGroup = skillGroup;
        return this;
    }
    public Long getSkillGroup() {
        return this.skillGroup;
    }

    public QueryOutboundTaskRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public QueryOutboundTaskRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public QueryOutboundTaskRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryOutboundTaskRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public QueryOutboundTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public QueryOutboundTaskRequest setTaskType(Integer taskType) {
        this.taskType = taskType;
        return this;
    }
    public Integer getTaskType() {
        return this.taskType;
    }

}
