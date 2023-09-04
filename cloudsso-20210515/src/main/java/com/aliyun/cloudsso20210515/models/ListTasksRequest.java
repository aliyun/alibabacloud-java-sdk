// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ListTasksRequest extends TeaModel {
    /**
     * <p>The ID of the access configuration. The ID can be used to filter asynchronous tasks.</p>
     */
    @NameInMap("AccessConfigurationId")
    public String accessConfigurationId;

    /**
     * <p>The ID of the directory.</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The filter condition.</p>
     * <br>
     * <p>Specify the value in the \<Attribute> \<Operator> \<Value> format. The value is not case sensitive. You can set Attribute only to StartTime and Operator only to ge. You must set Value in the YYYY-MM-DDTHH:mm:SSZ format and enter a value that is no more than 7 days from the current time. The value ge indicates Greater Than or Equals.</p>
     * <br>
     * <p>For example, if you set Filter to StartTime ge 2021-03-15T01:12:23Z, the operation queries the tasks from 2021-03-15T01:12:23 GMT.</p>
     * <br>
     * <p>>  If you do not specify this parameter, the operation queries the tasks within the previous 24 hours by default.</p>
     */
    @NameInMap("Filter")
    public String filter;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>Valid values: 1 to 20.</p>
     * <br>
     * <p>Default value: 10.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token to return for the next page. If this is your first time to call this operation, you do not need to specify `NextToken`.</p>
     * <br>
     * <p>When you call this operation for the first time, if the total number of entries to return exceeds the value of `MaxResults`, the entries are truncated. Only the entries that match the value of `MaxResults` are returned, and the excess entries are not returned. In this case, the value of the response parameter `IsTruncated` is `true`, and `NextToken` is returned. In the next call, you can use the value of `NextToken` and maintain the settings of the other request parameters to query the excess entries. You can repeat the call until the value of `IsTruncated` becomes `false`. This way, all entries are returned.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the CloudSSO identity. The ID can be used to filter asynchronous tasks.</p>
     * <br>
     * <p>*   If you set `PrincipalType` to `User`, set `PrincipalId` to the ID of the CloudSSO user.</p>
     * <p>*   If you set `PrincipalType` to `Group`, set `PrincipalId` to the ID of the CloudSSO group.</p>
     * <br>
     * <p>>  You can use the ID to filter asynchronous tasks only if you specify both `PrincipalId` and `PrincipalType`.</p>
     */
    @NameInMap("PrincipalId")
    public String principalId;

    /**
     * <p>The type of the CloudSSO identity. The type can be used to filter asynchronous tasks. Valid values:</p>
     * <br>
     * <p>*   User</p>
     * <p>*   Group</p>
     * <br>
     * <p>>  You can use the type to filter asynchronous tasks only if you specify both `PrincipalId` and `PrincipalType`.</p>
     */
    @NameInMap("PrincipalType")
    public String principalType;

    /**
     * <p>The ID of the task. The ID can be used to filter asynchronous tasks. Valid values:</p>
     * <br>
     * <p>*   InProgress: The task is running.</p>
     * <p>*   Success: The task is successful.</p>
     * <p>*   Failed: The task failed.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The ID of the task object. The ID can be used to filter asynchronous tasks.</p>
     * <br>
     * <p>>  You can use the ID to filter asynchronous tasks only if you specify both `TargetId` and `TargetType`.</p>
     */
    @NameInMap("TargetId")
    public String targetId;

    /**
     * <p>The type of the task object. The type can be used to filter asynchronous tasks.</p>
     * <br>
     * <p>Set the value to RD-Account, which indicates an account in your resource directory.</p>
     * <br>
     * <p>>  You can use the type to filter asynchronous tasks only if you specify both `TargetId` and `TargetType`.</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    /**
     * <p>The type of the task. The type can be used to filter asynchronous tasks. Valid values:</p>
     * <br>
     * <p>*   ProvisionAccessConfiguration: An access configuration is provisioned.</p>
     * <p>*   DeprovisionAccessConfiguration: An access configuration is de-provisioned.</p>
     * <p>*   CreateAccessAssignment: Access permissions on an account in your resource directory are assigned.</p>
     * <p>*   DeleteAccessAssignment: Access permissions on an account in your resource directory are removed.</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static ListTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTasksRequest self = new ListTasksRequest();
        return TeaModel.build(map, self);
    }

    public ListTasksRequest setAccessConfigurationId(String accessConfigurationId) {
        this.accessConfigurationId = accessConfigurationId;
        return this;
    }
    public String getAccessConfigurationId() {
        return this.accessConfigurationId;
    }

    public ListTasksRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public ListTasksRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public ListTasksRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTasksRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTasksRequest setPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }
    public String getPrincipalId() {
        return this.principalId;
    }

    public ListTasksRequest setPrincipalType(String principalType) {
        this.principalType = principalType;
        return this;
    }
    public String getPrincipalType() {
        return this.principalType;
    }

    public ListTasksRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListTasksRequest setTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }
    public String getTargetId() {
        return this.targetId;
    }

    public ListTasksRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public ListTasksRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
