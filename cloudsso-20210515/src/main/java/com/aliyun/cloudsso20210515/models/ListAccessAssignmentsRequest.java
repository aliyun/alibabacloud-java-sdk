// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ListAccessAssignmentsRequest extends TeaModel {
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
     * <p>The token for the next page of query results. You do not need to specify <code>NextToken</code> when you call this operation for the first time.</p>
     * <p>When you call this operation for the first time, if the total number of returned entries exceeds the value of <code>MaxResults</code>, the returned entries are truncated. Only the number of entries specified by <code>MaxResults</code> is returned, the <code>IsTruncated</code> parameter is set to <code>true</code>, and a <code>NextToken</code> value is returned. You can use the returned <code>NextToken</code> value to call this operation again to query the truncated entries while keeping other request parameters unchanged. You can repeat this process until <code>IsTruncated</code> is set to <code>false</code>, which indicates that all entries are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>K1c3o9K7pFxoTtxH1Nm7MMLb7zrDGvftYBQBPDVv7AD3a8yhRb3Mk8L9ivmN6bFSjfkZNTAg3h4****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the Alibaba Cloud account to which the authorization target belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>114240524784****</p>
     */
    @NameInMap("OriginTargetId")
    public String originTargetId;

    /**
     * <p>The ID of the CloudSSO identity, which is used as a filter condition for the query. Details:</p>
     * <ul>
     * <li>If <code>PrincipalType</code> is set to User, <code>PrincipalId</code> is the ID of the CloudSSO user.</li>
     * <li>If <code>PrincipalType</code> is set to Group, <code>PrincipalId</code> is the ID of the CloudSSO group.</li>
     * </ul>
     * <blockquote>
     * <p>You must specify both <code>PrincipalId</code> and <code>PrincipalType</code> for the filter condition to take effect.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>u-00q8wbq42wiltcrk****</p>
     */
    @NameInMap("PrincipalId")
    public String principalId;

    /**
     * <p>The type of the CloudSSO identity, which is used as a filter condition for the query. Valid values:</p>
     * <ul>
     * <li>User: user.</li>
     * <li>Group: group.</li>
     * </ul>
     * <blockquote>
     * <p>You must specify both <code>PrincipalId</code> and <code>PrincipalType</code> for the filter condition to take effect.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>User</p>
     */
    @NameInMap("PrincipalType")
    public String principalType;

    /**
     * <p>The ID of the task target, which is used as a filter condition for the query.</p>
     * <blockquote>
     * <p>You must specify both <code>TargetId</code> and <code>TargetType</code> for the filter condition to take effect.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>114240524784****</p>
     */
    @NameInMap("TargetId")
    public String targetId;

    /**
     * <p>The type of the task target, which is used as a filter condition for the query.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>RD-Account: The task target is an account in a resource directory.</li>
     * </ul>
     * <blockquote>
     * <p>You must specify both <code>TargetId</code> and <code>TargetType</code> for the filter condition to take effect.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>RD-Account</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    public static ListAccessAssignmentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAccessAssignmentsRequest self = new ListAccessAssignmentsRequest();
        return TeaModel.build(map, self);
    }

    public ListAccessAssignmentsRequest setAccessConfigurationId(String accessConfigurationId) {
        this.accessConfigurationId = accessConfigurationId;
        return this;
    }
    public String getAccessConfigurationId() {
        return this.accessConfigurationId;
    }

    public ListAccessAssignmentsRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public ListAccessAssignmentsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAccessAssignmentsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAccessAssignmentsRequest setOriginTargetId(String originTargetId) {
        this.originTargetId = originTargetId;
        return this;
    }
    public String getOriginTargetId() {
        return this.originTargetId;
    }

    public ListAccessAssignmentsRequest setPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }
    public String getPrincipalId() {
        return this.principalId;
    }

    public ListAccessAssignmentsRequest setPrincipalType(String principalType) {
        this.principalType = principalType;
        return this;
    }
    public String getPrincipalType() {
        return this.principalType;
    }

    public ListAccessAssignmentsRequest setTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }
    public String getTargetId() {
        return this.targetId;
    }

    public ListAccessAssignmentsRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

}
