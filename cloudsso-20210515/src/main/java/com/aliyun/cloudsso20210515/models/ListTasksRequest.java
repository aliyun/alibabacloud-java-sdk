// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ListTasksRequest extends TeaModel {
    /**
     * <p>The ID of the access configuration. This parameter is used as a filter condition for the query.</p>
     * 
     * <strong>example:</strong>
     * <p>ac-00jhtfl8thteu6uj****</p>
     */
    @NameInMap("AccessConfigurationId")
    public String accessConfigurationId;

    /**
     * <p>The ID of the directory.</p>
     * 
     * <strong>example:</strong>
     * <p>d-00fc2p61****</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The filter condition.</p>
     * <p>Format: <Attribute> <Operator> <Value>. The format is not case-sensitive. <Attribute> only supports StartTime. <Operator> only supports ge (greater than or equal to). <Value> must be in the YYYY-MM-DDTHH:mm:ssZ format and can only be a time within the last 7 days.</p>
     * <p>Example: Filter = &quot;StartTime ge 2021-03-15T01:12:23Z&quot;. This example queries the list of tasks starting from 2021-03-15T01:12:23Z.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the list of tasks created within the last 24 hours is returned by default.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>StartTime ge 2021-03-15T01:12:23Z</p>
     */
    @NameInMap("Filter")
    public String filter;

    /**
     * <p>The maximum number of entries to return on each page.</p>
     * <p>Valid values: 1 to 20.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token used to return the next page of the query results. You do not need to specify NextToken when you call this operation for the first time.</p>
     * <p>When you call this operation for the first time, if the total number of returned entries exceeds the value of MaxResults, the returned data is truncated. Only the number of entries specified by MaxResults is returned, the IsTruncated response parameter is set to true, and a NextToken value is returned. You can use the returned NextToken value to call this operation again while keeping other request parameters unchanged to query the truncated data. You can repeat this process until IsTruncated is set to false, which indicates that all data is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>K1c3o9K7pFxoTtxH1Nm7MMLb7zrDGvftYBQBPDVv7AD3a8yhRb3Mk8L9ivmN6bFSjfkZNTAg3h4****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the CloudSSO identity. This parameter is used as a filter condition for the query. Details:</p>
     * <ul>
     * <li>If PrincipalType is set to User, PrincipalId is the ID of the CloudSSO user.</li>
     * <li>If PrincipalType is set to Group, PrincipalId is the ID of the CloudSSO group.</li>
     * </ul>
     * <blockquote>
     * <p>PrincipalId and PrincipalType must be specified at the same time to serve as a valid filter condition.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>u-00q8wbq42wiltcrk****</p>
     */
    @NameInMap("PrincipalId")
    public String principalId;

    /**
     * <p>The type of the CloudSSO identity. This parameter is used as a filter condition for the query. Valid values:</p>
     * <ul>
     * <li>User: The CloudSSO user.</li>
     * <li>Group: The CloudSSO group.</li>
     * </ul>
     * <blockquote>
     * <p>PrincipalId and PrincipalType must be specified at the same time to serve as a valid filter condition.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>User</p>
     */
    @NameInMap("PrincipalType")
    public String principalType;

    /**
     * <p>The status of the task. This parameter is used as a filter condition for the query. Valid values:</p>
     * <ul>
     * <li>InProgress: The task is running.</li>
     * <li>Success: The task succeeded.</li>
     * <li>Failed: The task failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The ID of the task target. This parameter is used as a filter condition for the query.</p>
     * <blockquote>
     * <p>TargetId and TargetType must be specified at the same time to serve as a valid filter condition.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>114240524784****</p>
     */
    @NameInMap("TargetId")
    public String targetId;

    /**
     * <p>The type of the task target. This parameter is used as a filter condition for the query. Valid values:</p>
     * <ul>
     * <li>RD-Account: The task target is an account in a resource directory.</li>
     * </ul>
     * <blockquote>
     * <p>TargetId and TargetType must be specified at the same time to serve as a valid filter condition.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>RD-Account</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    /**
     * <p>The type of the node. This parameter is used as a filter condition for the query. Valid values:</p>
     * <ul>
     * <li>ProvisionAccessConfiguration: Access configuration deployment.</li>
     * <li>DeprovisionAccessConfiguration: Removes access configuration provisioning.</li>
     * <li>CreateAccessAssignment: Grants authorization to an account in a resource directory.</li>
     * <li>DeleteAccessAssignment: Removes authorization from an account in a resource directory.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CreateAccessAssignment</p>
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
