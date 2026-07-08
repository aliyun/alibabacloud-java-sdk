// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListAsyncTasksShrinkRequest extends TeaModel {
    /**
     * <p>The unique identifier of the workspace: <a href="https://help.aliyun.com/document_detail/2587494.html">AgentKey</a></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cd327c3d5d5e44159cc716e23bfa530e_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>The end of the time range to query task creation times. Format: YYYY-MM-DD HH:mm:ss.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-03-18 02:00:00</p>
     */
    @NameInMap("CreateTimeEnd")
    public String createTimeEnd;

    /**
     * <p>The start of the time range to query task creation times. Format: YYYY-MM-DD HH:mm:ss.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-02-19 07:28:11</p>
     */
    @NameInMap("CreateTimeStart")
    public String createTimeStart;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Current")
    public Integer current;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Size")
    public Integer size;

    /**
     * <p>A term query for the task code.</p>
     * 
     * <strong>example:</strong>
     * <p>MaterialDocumentUpload</p>
     */
    @NameInMap("TaskCode")
    public String taskCode;

    /**
     * <p>A term query for the task name.</p>
     * 
     * <strong>example:</strong>
     * <p>任务名称</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>A term query for the task status. Valid values: 0 (Pending), 1 (Running), 2 (Succeeded), 3 (Paused), 4 (Failed and retriable), 5 (Failed and not retriable), and 6 (Canceled).</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TaskStatus")
    public Integer taskStatus;

    /**
     * <p>A term query for a list of task statuses. Valid values: 0 (Pending), 1 (Running), 2 (Succeeded), 3 (Paused), 4 (Failed and retriable), 5 (Failed and not retriable), and 6 (Canceled).</p>
     */
    @NameInMap("TaskStatusList")
    public String taskStatusListShrink;

    /**
     * <p>A term query for the task type.</p>
     * 
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    /**
     * <p>A term query for a list of task types.</p>
     */
    @NameInMap("TaskTypeList")
    public String taskTypeListShrink;

    public static ListAsyncTasksShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAsyncTasksShrinkRequest self = new ListAsyncTasksShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListAsyncTasksShrinkRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public ListAsyncTasksShrinkRequest setCreateTimeEnd(String createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
        return this;
    }
    public String getCreateTimeEnd() {
        return this.createTimeEnd;
    }

    public ListAsyncTasksShrinkRequest setCreateTimeStart(String createTimeStart) {
        this.createTimeStart = createTimeStart;
        return this;
    }
    public String getCreateTimeStart() {
        return this.createTimeStart;
    }

    public ListAsyncTasksShrinkRequest setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public ListAsyncTasksShrinkRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListAsyncTasksShrinkRequest setTaskCode(String taskCode) {
        this.taskCode = taskCode;
        return this;
    }
    public String getTaskCode() {
        return this.taskCode;
    }

    public ListAsyncTasksShrinkRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public ListAsyncTasksShrinkRequest setTaskStatus(Integer taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public Integer getTaskStatus() {
        return this.taskStatus;
    }

    public ListAsyncTasksShrinkRequest setTaskStatusListShrink(String taskStatusListShrink) {
        this.taskStatusListShrink = taskStatusListShrink;
        return this;
    }
    public String getTaskStatusListShrink() {
        return this.taskStatusListShrink;
    }

    public ListAsyncTasksShrinkRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public ListAsyncTasksShrinkRequest setTaskTypeListShrink(String taskTypeListShrink) {
        this.taskTypeListShrink = taskTypeListShrink;
        return this;
    }
    public String getTaskTypeListShrink() {
        return this.taskTypeListShrink;
    }

}
