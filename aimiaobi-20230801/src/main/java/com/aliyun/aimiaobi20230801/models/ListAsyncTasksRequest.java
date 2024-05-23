// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListAsyncTasksRequest extends TeaModel {
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
    public java.util.List<Integer> taskStatusList;

    @NameInMap("TaskType")
    public String taskType;

    @NameInMap("TaskTypeList")
    public java.util.List<String> taskTypeList;

    public static ListAsyncTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAsyncTasksRequest self = new ListAsyncTasksRequest();
        return TeaModel.build(map, self);
    }

    public ListAsyncTasksRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public ListAsyncTasksRequest setCreateTimeEnd(String createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
        return this;
    }
    public String getCreateTimeEnd() {
        return this.createTimeEnd;
    }

    public ListAsyncTasksRequest setCreateTimeStart(String createTimeStart) {
        this.createTimeStart = createTimeStart;
        return this;
    }
    public String getCreateTimeStart() {
        return this.createTimeStart;
    }

    public ListAsyncTasksRequest setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public ListAsyncTasksRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListAsyncTasksRequest setTaskCode(String taskCode) {
        this.taskCode = taskCode;
        return this;
    }
    public String getTaskCode() {
        return this.taskCode;
    }

    public ListAsyncTasksRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public ListAsyncTasksRequest setTaskStatus(Integer taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public Integer getTaskStatus() {
        return this.taskStatus;
    }

    public ListAsyncTasksRequest setTaskStatusList(java.util.List<Integer> taskStatusList) {
        this.taskStatusList = taskStatusList;
        return this;
    }
    public java.util.List<Integer> getTaskStatusList() {
        return this.taskStatusList;
    }

    public ListAsyncTasksRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public ListAsyncTasksRequest setTaskTypeList(java.util.List<String> taskTypeList) {
        this.taskTypeList = taskTypeList;
        return this;
    }
    public java.util.List<String> getTaskTypeList() {
        return this.taskTypeList;
    }

}
