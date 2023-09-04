// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ListAccessAssignmentsRequest extends TeaModel {
    /**
     * <p>The ID of the access configuration. The ID can be used to filter access permissions.</p>
     */
    @NameInMap("AccessConfigurationId")
    public String accessConfigurationId;

    /**
     * <p>The ID of the directory.</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

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
     * <p>The ID of the CloudSSO identity. The ID can be used to filter access permissions.</p>
     * <br>
     * <p>*   If you set `PrincipalType` to User, set `PrincipalId` to the ID of the Cloud SSO user.</p>
     * <p>*   If you set `PrincipalType` to Group, set `PrincipalId` to the ID of the CloudSSO group.</p>
     * <br>
     * <p>>  You can use the ID to filter access permissions only if you specify both `PrincipalId` and `PrincipalType`.</p>
     */
    @NameInMap("PrincipalId")
    public String principalId;

    /**
     * <p>The type of the CloudSSO identity. The type can be used to filter access permissions. Valid values:</p>
     * <br>
     * <p>*   User</p>
     * <p>*   Group</p>
     * <br>
     * <p>>  You can use the type to filter access permissions only if you specify both `PrincipalId` and `PrincipalType`.</p>
     */
    @NameInMap("PrincipalType")
    public String principalType;

    /**
     * <p>The ID of the task object. The ID can be used to filter access permissions.</p>
     * <br>
     * <p>>  You can use the ID to filter access permissions only if you specify both `TargetId` and `TargetType`.</p>
     */
    @NameInMap("TargetId")
    public String targetId;

    /**
     * <p>The type of the task object. The type can be used to filter access permissions.</p>
     * <br>
     * <p>Set the value to RD-Account, which indicates an account in your resource directory.</p>
     * <br>
     * <p>>  You can use the type to filter access permissions only if you specify both `TargetId` and `TargetType`.</p>
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
