// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListAutoClipsTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2023-03-18 02:00:00</p>
     */
    @NameInMap("CreateTimeEnd")
    public String createTimeEnd;

    /**
     * <strong>example:</strong>
     * <p>2023-02-19 07:28:11</p>
     */
    @NameInMap("CreateTimeStart")
    public String createTimeStart;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Current")
    public Integer current;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Size")
    public Integer size;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("Skip")
    public Integer skip;

    /**
     * <strong>example:</strong>
     * <p>task001</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TaskStatus")
    public Integer taskStatus;

    /**
     * <strong>example:</strong>
     * <p>type001</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    /**
     * <strong>example:</strong>
     * <p>llm-2setzb9x4ewsd</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListAutoClipsTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAutoClipsTaskRequest self = new ListAutoClipsTaskRequest();
        return TeaModel.build(map, self);
    }

    public ListAutoClipsTaskRequest setCreateTimeEnd(String createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
        return this;
    }
    public String getCreateTimeEnd() {
        return this.createTimeEnd;
    }

    public ListAutoClipsTaskRequest setCreateTimeStart(String createTimeStart) {
        this.createTimeStart = createTimeStart;
        return this;
    }
    public String getCreateTimeStart() {
        return this.createTimeStart;
    }

    public ListAutoClipsTaskRequest setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public ListAutoClipsTaskRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAutoClipsTaskRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAutoClipsTaskRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListAutoClipsTaskRequest setSkip(Integer skip) {
        this.skip = skip;
        return this;
    }
    public Integer getSkip() {
        return this.skip;
    }

    public ListAutoClipsTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public ListAutoClipsTaskRequest setTaskStatus(Integer taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public Integer getTaskStatus() {
        return this.taskStatus;
    }

    public ListAutoClipsTaskRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public ListAutoClipsTaskRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
