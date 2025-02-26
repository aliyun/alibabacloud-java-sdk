// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeTasksRequest extends TeaModel {
    /**
     * <p>The ID of the cloud phone instance.</p>
     * 
     * <strong>example:</strong>
     * <p>acp-2zecay9ponatdc4m****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the cloud phone instance.</p>
     * 
     * <strong>example:</strong>
     * <p>defaultInstanceName</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The ID of the command execution. You can set the value to the last returned request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B8ED2BA9-0C6A-5643-818F-B5D60A64****</p>
     */
    @NameInMap("InvokeId")
    public String invokeId;

    /**
     * <p>The level of the task. A value of 1 specifies a batch task. A value of 2 specifies an instance-level task.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Level")
    public Integer level;

    /**
     * <p>The maximum number of entries per page. Valid values: 1 to 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. If the parameter is left empty, the data is queried from the first entry.</p>
     * 
     * <strong>example:</strong>
     * <p>FFbc8N4E1iOlcSxC+8boa0HHH2LKWbggYUinyrZWvtS1oTrMYCg1HuMLGuftj0****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The extension field.</p>
     * 
     * <strong>example:</strong>
     * <p>param</p>
     */
    @NameInMap("Param")
    public String param;

    /**
     * <p>The ID of the parent task.</p>
     * 
     * <strong>example:</strong>
     * <p>t-iaej5dkbnmivx****</p>
     */
    @NameInMap("ParentTaskId")
    public String parentTaskId;

    /**
     * <p>The IDs of the resources.</p>
     */
    @NameInMap("ResourceIds")
    public java.util.List<String> resourceIds;

    /**
     * <p>The IDs of the tasks.</p>
     */
    @NameInMap("TaskIds")
    public java.util.List<String> taskIds;

    /**
     * <p>The state of the task.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>PartFinished: The task is partially successful.</li>
     * <li>Finished: The task is completed.</li>
     * <li>Failed: The task failed.</li>
     * <li>Skipped: The task is skipped.</li>
     * <li>Processing: The task is running.</li>
     * <li>Waiting: The task is in queue.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Processing</p>
     */
    @NameInMap("TaskStatus")
    public String taskStatus;

    /**
     * <p>The status of the tasks.</p>
     */
    @NameInMap("TaskStatuses")
    public java.util.List<String> taskStatuses;

    /**
     * <p>The type of the task.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>BackupFile: backs up files.</li>
     * <li>StopInstance: stops cloud phone instances.</li>
     * <li>RebootInstance: restarts cloud phone instances.</li>
     * <li>StartApp: starts apps.</li>
     * <li>SendFile: uploads files.</li>
     * <li>RunCommand: sends remote command.</li>
     * <li>RestartApp: restarts apps.</li>
     * <li>ResetInstance: resets cloud phone instances.</li>
     * <li>RecoverFile: recovers files.</li>
     * <li>UninstallApp: uninstalls apps.</li>
     * <li>StopApp: stops apps.</li>
     * <li>Screenshot: takes screenshots.</li>
     * <li>InstallApp: installs apps.</li>
     * <li>FetchFile: downloads files.</li>
     * <li>UpdateGroupImage: replaces images.</li>
     * <li>StartInstance: starts instances.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>StartInstance</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    /**
     * <p>The types of the tasks.</p>
     */
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
