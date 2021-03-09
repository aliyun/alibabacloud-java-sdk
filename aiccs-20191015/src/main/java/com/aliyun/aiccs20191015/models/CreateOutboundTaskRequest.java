// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class CreateOutboundTaskRequest extends TeaModel {
    @NameInMap("TaskType")
    public Integer taskType;

    @NameInMap("TaskName")
    public String taskName;

    @NameInMap("Description")
    public String description;

    @NameInMap("StartDate")
    public String startDate;

    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("RetryTime")
    public Integer retryTime;

    @NameInMap("RetryInterval")
    public Integer retryInterval;

    @NameInMap("SkillGroup")
    public Long skillGroup;

    @NameInMap("Ani")
    public String ani;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("Model")
    public Integer model;

    @NameInMap("DepartmentId")
    public Long departmentId;

    @NameInMap("ExtAttrs")
    public String extAttrs;

    @NameInMap("CallInfos")
    public String callInfos;

    @NameInMap("InstanceId")
    public String instanceId;

    public static CreateOutboundTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOutboundTaskRequest self = new CreateOutboundTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateOutboundTaskRequest setTaskType(Integer taskType) {
        this.taskType = taskType;
        return this;
    }
    public Integer getTaskType() {
        return this.taskType;
    }

    public CreateOutboundTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public CreateOutboundTaskRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateOutboundTaskRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public CreateOutboundTaskRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public CreateOutboundTaskRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public CreateOutboundTaskRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CreateOutboundTaskRequest setRetryTime(Integer retryTime) {
        this.retryTime = retryTime;
        return this;
    }
    public Integer getRetryTime() {
        return this.retryTime;
    }

    public CreateOutboundTaskRequest setRetryInterval(Integer retryInterval) {
        this.retryInterval = retryInterval;
        return this;
    }
    public Integer getRetryInterval() {
        return this.retryInterval;
    }

    public CreateOutboundTaskRequest setSkillGroup(Long skillGroup) {
        this.skillGroup = skillGroup;
        return this;
    }
    public Long getSkillGroup() {
        return this.skillGroup;
    }

    public CreateOutboundTaskRequest setAni(String ani) {
        this.ani = ani;
        return this;
    }
    public String getAni() {
        return this.ani;
    }

    public CreateOutboundTaskRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public CreateOutboundTaskRequest setModel(Integer model) {
        this.model = model;
        return this;
    }
    public Integer getModel() {
        return this.model;
    }

    public CreateOutboundTaskRequest setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
        return this;
    }
    public Long getDepartmentId() {
        return this.departmentId;
    }

    public CreateOutboundTaskRequest setExtAttrs(String extAttrs) {
        this.extAttrs = extAttrs;
        return this;
    }
    public String getExtAttrs() {
        return this.extAttrs;
    }

    public CreateOutboundTaskRequest setCallInfos(String callInfos) {
        this.callInfos = callInfos;
        return this;
    }
    public String getCallInfos() {
        return this.callInfos;
    }

    public CreateOutboundTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
