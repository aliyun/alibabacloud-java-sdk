// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ListAccessAssignmentsRequest extends TeaModel {
    /**
     * <p>The ID of the access configuration. The ID can be used to filter access permissions.</p>
     * 
     * <strong>example:</strong>
     * <p>ac-00jhtfl8thteu6uj****</p>
     */
    @NameInMap("AccessConfigurationId")
    public String accessConfigurationId;

    /**
     * <p>The directory ID.</p>
     * 
     * <strong>example:</strong>
     * <p>d-00fc2p61****</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The maximum number of entries per page.</p>
     * <p>Valid values: 1 to 20.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. If this is your first time to call this operation, you do not need to specify the <code>NextToken</code> parameter.</p>
     * <p>When you call this operation for the first time, if the total number of entries to return exceeds the value of <code>MaxResults</code>, the entries are truncated. Only the entries that match the value of <code>MaxResults</code> are returned, and the excess entries are not returned. In this case, the value of the response parameter <code>IsTruncated</code> is <code>true</code>, and <code>NextToken</code> is returned. In the next call, you can use the value of <code>NextToken</code> and maintain the settings of the other request parameters to query the excess entries. You can repeat the call until the value of <code>IsTruncated</code> becomes <code>false</code>. This way, all entries are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>K1c3o9K7pFxoTtxH1Nm7MMLb7zrDGvftYBQBPDVv7AD3a8yhRb3Mk8L9ivmN6bFSjfkZNTAg3h4****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the CloudSSO identity. The ID can be used to filter access permissions.</p>
     * <ul>
     * <li>If you set <code>PrincipalType</code> to User, set <code>PrincipalId</code> to the ID of the CloudSSO user.</li>
     * <li>If you set <code>PrincipalType</code> to Group, set <code>PrincipalId</code> to the ID of the CloudSSO group.</li>
     * </ul>
     * <blockquote>
     * <p> You can use the type to filter access permissions only if you specify both PrincipalId and <code>PrincipalType</code>.``</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>u-00q8wbq42wiltcrk****</p>
     */
    @NameInMap("PrincipalId")
    public String principalId;

    /**
     * <p>The type of the CloudSSO identity. The type can be used to filter access permissions. Valid values:</p>
     * <ul>
     * <li>User</li>
     * <li>Group</li>
     * </ul>
     * <blockquote>
     * <p> You can use the type to filter access permissions only if you specify both PrincipalId and <code>PrincipalType</code>.``</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>User</p>
     */
    @NameInMap("PrincipalType")
    public String principalType;

    /**
     * <p>The ID of the task object. The ID can be used to filter access permissions.</p>
     * <blockquote>
     * <p> You can use the type to filter access permissions only if you specify both <code>TargetId</code> and <code>TargetType</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>114240524784****</p>
     */
    @NameInMap("TargetId")
    public String targetId;

    /**
     * <p>The type of the task object. The type can be used to filter access permissions.</p>
     * <p>Set the value to RD-Account, which specifies the accounts in the resource directory.</p>
     * <blockquote>
     * <p> You can use the type to filter access permissions only if you specify both <code>TargetId</code> and <code>TargetType</code>.</p>
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
