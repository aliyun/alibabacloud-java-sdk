// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListAsyncTasksShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("CreateTimeEnd")
    public String createTimeEnd;

    @NameInMap("CreateTimeStart")
    public String createTimeStart;

    @NameInMap("Current")
    public Integer current;

    @NameInMap("Size")
    public Integer size;

    @NameInMap("TaskCode")
    public String taskCode;

    @NameInMap("TaskName")
    public String taskName;

    @NameInMap("TaskStatus")
    public Integer taskStatus;

    @NameInMap("TaskStatusList")
    public String taskStatusListShrink;

    @NameInMap("TaskType")
    public String taskType;

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
