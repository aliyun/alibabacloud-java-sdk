// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class CreateOutboundTaskRequest extends TeaModel {
    /**
     * <p>The calling number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>130****1111</p>
     */
    @NameInMap("Ani")
    public String ani;

    /**
     * <p>The call information.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;dnis&quot;:&quot;1&quot;,&quot;memberId&quot;:1133,&quot;memberName&quot;:&quot;Test member&quot;,&quot;priority&quot;:10}]</p>
     */
    @NameInMap("CallInfos")
    public String callInfos;

    /**
     * <p>The department ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("DepartmentId")
    public Long departmentId;

    /**
     * <p>The task description.</p>
     * 
     * <strong>example:</strong>
     * <p>Test task description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The end date of the task execution. The maximum time span between the start time and the end time is 7 days.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-08-09</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The end time of the task execution.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>23:00:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The extended attributes.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;remark&quot;:&quot;Outbound call test&quot;}</p>
     */
    @NameInMap("ExtAttrs")
    public String extAttrs;

    /**
     * <p>The name of the skill group.</p>
     * 
     * <strong>example:</strong>
     * <p>Test skill group</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>Instance ID of the AICCS instance. You can obtain instance ID from the Artificial Intelligence Cloud Call Service console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc_xp_pre***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The model.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Model")
    public Integer model;

    /**
     * <p>The retry interval for unanswered calls. Unit: minutes.</p>
     * <blockquote>
     * <p>The default value is empty. If the number of retries is greater than 0, this parameter is required. The minimum time granularity is minutes, and the maximum value can be set to 48 hours.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("RetryInterval")
    public Integer retryInterval;

    /**
     * <p>The number of retries for unanswered calls. Default value: <strong>0</strong>. Maximum value: <strong>3</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RetryTime")
    public Integer retryTime;

    /**
     * <p>The ID of the skill group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("SkillGroup")
    public Long skillGroup;

    /**
     * <p>The start date of the task execution. The maximum time span between the start time and the end time is 7 days.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-08-08</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <p>The start time of the task execution.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>09:09:09</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The task name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Test task</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>The task type. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: PREVIEW (preview)</li>
     * <li><strong>2</strong>: FORECAST (forecast)</li>
     * <li><strong>3</strong>: ROBOT (robot)</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TaskType")
    public Integer taskType;

    public static CreateOutboundTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOutboundTaskRequest self = new CreateOutboundTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateOutboundTaskRequest setAni(String ani) {
        this.ani = ani;
        return this;
    }
    public String getAni() {
        return this.ani;
    }

    public CreateOutboundTaskRequest setCallInfos(String callInfos) {
        this.callInfos = callInfos;
        return this;
    }
    public String getCallInfos() {
        return this.callInfos;
    }

    public CreateOutboundTaskRequest setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
        return this;
    }
    public Long getDepartmentId() {
        return this.departmentId;
    }

    public CreateOutboundTaskRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateOutboundTaskRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public CreateOutboundTaskRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CreateOutboundTaskRequest setExtAttrs(String extAttrs) {
        this.extAttrs = extAttrs;
        return this;
    }
    public String getExtAttrs() {
        return this.extAttrs;
    }

    public CreateOutboundTaskRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public CreateOutboundTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateOutboundTaskRequest setModel(Integer model) {
        this.model = model;
        return this;
    }
    public Integer getModel() {
        return this.model;
    }

    public CreateOutboundTaskRequest setRetryInterval(Integer retryInterval) {
        this.retryInterval = retryInterval;
        return this;
    }
    public Integer getRetryInterval() {
        return this.retryInterval;
    }

    public CreateOutboundTaskRequest setRetryTime(Integer retryTime) {
        this.retryTime = retryTime;
        return this;
    }
    public Integer getRetryTime() {
        return this.retryTime;
    }

    public CreateOutboundTaskRequest setSkillGroup(Long skillGroup) {
        this.skillGroup = skillGroup;
        return this;
    }
    public Long getSkillGroup() {
        return this.skillGroup;
    }

    public CreateOutboundTaskRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public CreateOutboundTaskRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public CreateOutboundTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public CreateOutboundTaskRequest setTaskType(Integer taskType) {
        this.taskType = taskType;
        return this;
    }
    public Integer getTaskType() {
        return this.taskType;
    }

}
