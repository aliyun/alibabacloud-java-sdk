// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class QueryOutboundTaskRequest extends TeaModel {
    /**
     * <p>The caller number.</p>
     * 
     * <strong>example:</strong>
     * <p>130****0000</p>
     */
    @NameInMap("Ani")
    public String ani;

    /**
     * <p>The current page number. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The department ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("DepartmentId")
    public String departmentId;

    /**
     * <p>The end date of task execution. The maximum time span between the start time and the end time is 7 days.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-08-09</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The end time of task execution.</p>
     * 
     * <strong>example:</strong>
     * <p>23:00:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The skill group name.</p>
     * 
     * <strong>example:</strong>
     * <p>Test skill group</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The AICCS instance ID. You can obtain it from the Artificial Intelligence Cloud Call Service console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc_xp_pre***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The number of entries per page. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The skill group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("SkillGroup")
    public Long skillGroup;

    /**
     * <p>The start date of task execution. The maximum time span between the start time and the end time is 7 days.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-08-08</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <p>The start time of task execution.</p>
     * 
     * <strong>example:</strong>
     * <p>09:09:09</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The task status. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: not started</li>
     * <li><strong>2</strong>: running</li>
     * <li><strong>3</strong>: paused</li>
     * <li><strong>4</strong>: expired</li>
     * <li><strong>5</strong>: completed</li>
     * <li><strong>6</strong>: deleted</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>120001</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    /**
     * <p>The task name.</p>
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
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
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
