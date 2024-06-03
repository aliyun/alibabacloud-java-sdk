// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ListUserProvisioningsRequest extends TeaModel {
    /**
     * <p>The ID of the resource directory.</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The maximum number of entries per page.</p>
     * <br>
     * <p>Valid values: 1 to 100.</p>
     * <br>
     * <p>Default value: 10.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to initiate the next request. If this is your first time to call this operation, you do not need to specify the `NextToken` parameter.</p>
     * <br>
     * <p>When you call this operation for the first time, if the total number of entries to return is larger than the value of `MaxResults`, the entries are truncated. The system returns entries based on the value of `MaxResults`, and does not return the excess entries. In this case, the value of the response parameter `IsTruncated` is `true`, and `NextToken` is returned. In the next call, you can use the value of `NextToken` and maintain the settings of the other request parameters to query the excess entries. You can repeat the call until the value of `IsTruncated` becomes `false`. This way, all entries are returned.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The identity ID of the RAM user provisioning. Valid values:</p>
     * <br>
     * <p>*   If `Group` is returned for the `PrincipalType` parameter, the value of this parameter is the ID of a CloudSSO user group (g-\\*\\*\\*\\*\\*\\*\\*\\*).</p>
     * <p>*   If `User` is returned for the `PrincipalType` parameter, the value of this parameter is the ID of a CloudSSO user (u-\\*\\*\\*\\*\\*\\*\\*\\*).</p>
     */
    @NameInMap("PrincipalId")
    public String principalId;

    /**
     * <p>The identity type of the RAM user provisioning. Valid values:</p>
     * <br>
     * <p>*   User: The identity of the RAM user provisioning is a CloudSSO user.</p>
     * <p>*   Group: The identity of the RAM user provisioning is a CloudSSO user group.</p>
     */
    @NameInMap("PrincipalType")
    public String principalType;

    /**
     * <p>The ID of the object for which you create the RAM user provisioning. The value is fixed as the ID of the member in the resource directory.</p>
     */
    @NameInMap("TargetId")
    public String targetId;

    /**
     * <p>The object for which you create the RAM user provisioning. The value is fixed as `RD-Account`.</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    public static ListUserProvisioningsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserProvisioningsRequest self = new ListUserProvisioningsRequest();
        return TeaModel.build(map, self);
    }

    public ListUserProvisioningsRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public ListUserProvisioningsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListUserProvisioningsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListUserProvisioningsRequest setPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }
    public String getPrincipalId() {
        return this.principalId;
    }

    public ListUserProvisioningsRequest setPrincipalType(String principalType) {
        this.principalType = principalType;
        return this;
    }
    public String getPrincipalType() {
        return this.principalType;
    }

    public ListUserProvisioningsRequest setTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }
    public String getTargetId() {
        return this.targetId;
    }

    public ListUserProvisioningsRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

}
