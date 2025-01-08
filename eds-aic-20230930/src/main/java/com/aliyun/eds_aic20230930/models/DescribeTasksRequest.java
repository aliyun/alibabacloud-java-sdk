// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeTasksRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <strong>example:</strong>
     * <p>B8ED2BA9-0C6A-5643-818F-B5D60A64****</p>
     */
    @NameInMap("InvokeId")
    public String invokeId;

    @NameInMap("Level")
    public Integer level;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>FFbc8N4E1iOlcSxC+8boa0HHH2LKWbggYUinyrZWvtS1oTrMYCg1HuMLGuftj0****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Param")
    public String param;

    @NameInMap("ParentTaskId")
    public String parentTaskId;

    @NameInMap("ResourceIds")
    public java.util.List<String> resourceIds;

    @NameInMap("TaskIds")
    public java.util.List<String> taskIds;

    /**
     * <strong>example:</strong>
     * <p>Processing</p>
     */
    @NameInMap("TaskStatus")
    public String taskStatus;

    @NameInMap("TaskStatuses")
    public java.util.List<String> taskStatuses;

    /**
     * <strong>example:</strong>
     * <p>StartInstance</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    @NameInMap("TaskTypes")
    public java.util.List<String> taskTypes;

    public static DescribeTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTasksRequest self = new DescribeTasksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTasksRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeTasksRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeTasksRequest setInvokeId(String invokeId) {
        this.invokeId = invokeId;
        return this;
    }
    public String getInvokeId() {
        return this.invokeId;
    }

    public DescribeTasksRequest setLevel(Integer level) {
        this.level = level;
        return this;
    }
    public Integer getLevel() {
        return this.level;
    }

    public DescribeTasksRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeTasksRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeTasksRequest setParam(String param) {
        this.param = param;
        return this;
    }
    public String getParam() {
        return this.param;
    }

    public DescribeTasksRequest setParentTaskId(String parentTaskId) {
        this.parentTaskId = parentTaskId;
        return this;
    }
    public String getParentTaskId() {
        return this.parentTaskId;
    }

    public DescribeTasksRequest setResourceIds(java.util.List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public java.util.List<String> getResourceIds() {
        return this.resourceIds;
    }

    public DescribeTasksRequest setTaskIds(java.util.List<String> taskIds) {
        this.taskIds = taskIds;
        return this;
    }
    public java.util.List<String> getTaskIds() {
        return this.taskIds;
    }

    public DescribeTasksRequest setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

    public DescribeTasksRequest setTaskStatuses(java.util.List<String> taskStatuses) {
        this.taskStatuses = taskStatuses;
        return this;
    }
    public java.util.List<String> getTaskStatuses() {
        return this.taskStatuses;
    }

    public DescribeTasksRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public DescribeTasksRequest setTaskTypes(java.util.List<String> taskTypes) {
        this.taskTypes = taskTypes;
        return this;
    }
    public java.util.List<String> getTaskTypes() {
        return this.taskTypes;
    }

}
