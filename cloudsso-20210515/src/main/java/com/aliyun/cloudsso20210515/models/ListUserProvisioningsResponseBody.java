// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ListUserProvisioningsResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the queried entries are truncated. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("IsTruncated")
    public Boolean isTruncated;

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
     * <p>The token that is used to initiate the next request.</p>
     * <br>
     * <p>>  This parameter is returned only when the `IsTruncated` parameter is set to `true`.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCounts")
    public Integer totalCounts;

    /**
     * <p>The RAM user provisionings.</p>
     */
    @NameInMap("UserProvisionings")
    public java.util.List<ListUserProvisioningsResponseBodyUserProvisionings> userProvisionings;

    public static ListUserProvisioningsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserProvisioningsResponseBody self = new ListUserProvisioningsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserProvisioningsResponseBody setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    public ListUserProvisioningsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListUserProvisioningsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListUserProvisioningsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserProvisioningsResponseBody setTotalCounts(Integer totalCounts) {
        this.totalCounts = totalCounts;
        return this;
    }
    public Integer getTotalCounts() {
        return this.totalCounts;
    }

    public ListUserProvisioningsResponseBody setUserProvisionings(java.util.List<ListUserProvisioningsResponseBodyUserProvisionings> userProvisionings) {
        this.userProvisionings = userProvisionings;
        return this;
    }
    public java.util.List<ListUserProvisioningsResponseBodyUserProvisionings> getUserProvisionings() {
        return this.userProvisionings;
    }

    public static class ListUserProvisioningsResponseBodyUserProvisionings extends TeaModel {
        /**
         * <p>The creation time.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The deletion policy. The policy is used to manage synchronized users when you delete the RAM user provisioning. Valid values:</p>
         * <br>
         * <p>*   Delete: When you delete the RAM user provisioning, the system deletes the synchronized users.</p>
         * <p>*   Keep: When you delete the RAM user provisioning, the system retains the synchronized users.</p>
         */
        @NameInMap("DeletionStrategy")
        public String deletionStrategy;

        /**
         * <p>The description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the resource directory.</p>
         */
        @NameInMap("DirectoryId")
        public String directoryId;

        /**
         * <p>The conflict handling policy. The policy is used when a RAM user has the same username as the CloudSSO user who is synchronized to RAM. Valid values:</p>
         * <br>
         * <p>*   KeepBoth: When a CloudSSO user is synchronized to RAM, if a RAM user who has the same username as the CloudSSO user exists, the system creates a RAM user whose username is the username of the CloudSSO user plus the suffix `_sso`.</p>
         * <p>*   TakeOver: When a CloudSSO user is synchronized to RAM, if a RAM user who has the same username as the CloudSSO user exists, the system replaces the RAM user with the CloudSSO user.</p>
         */
        @NameInMap("DuplicationStrategy")
        public String duplicationStrategy;

        /**
         * <p>The ID of the Alibaba Cloud account to which the resource directory belongs.</p>
         */
        @NameInMap("OwnerPk")
        public String ownerPk;

        /**
         * <p>The identity ID of the RAM user provisioning. Valid values:</p>
         * <br>
         * <p>*   If `Group` is returned for the `PrincipalType` parameter, the value of this parameter is the ID of a CloudSSO user group (g-\*\*\*\*\*\*\*\*).</p>
         * <p>*   If `User` is returned for the `PrincipalType` parameter, the value of this parameter is the ID of a CloudSSO user (u-\*\*\*\*\*\*\*\*).</p>
         */
        @NameInMap("PrincipalId")
        public String principalId;

        /**
         * <p>The identity name of the RAM user provisioning. Valid values:</p>
         * <br>
         * <p>*   If `Group` is returned for the `PrincipalType` parameter, the value of this parameter is the name of a CloudSSO user group.</p>
         * <p>*   If `User` is returned for the `PrincipalType` parameter, the value of this parameter is the name of a CloudSSO user.</p>
         */
        @NameInMap("PrincipalName")
        public String principalName;

        /**
         * <p>The identity type of the RAM user provisioning. Valid values:</p>
         * <br>
         * <p>*   User: The identity of the RAM user provisioning is a CloudSSO user.</p>
         * <p>*   Group: The identity of the RAM user provisioning is a CloudSSO user group.</p>
         */
        @NameInMap("PrincipalType")
        public String principalType;

        /**
         * <p>The status of the RAM user provisioning. Valid values:</p>
         * <br>
         * <p>*   Enabled</p>
         * <p>*   Disabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the object for which you create the RAM user provisioning. The value is fixed as the ID of the member in the resource directory.</p>
         */
        @NameInMap("TargetId")
        public String targetId;

        /**
         * <p>The object for which you create the RAM user provisioning. The value is fixed as `RD-Account`.</p>
         */
        @NameInMap("TargetName")
        public String targetName;

        /**
         * <p>The path of the resource directory in which you create the RAM user provisioning for the object.</p>
         */
        @NameInMap("TargetPath")
        public String targetPath;

        /**
         * <p>The object for which you create the RAM user provisioning. The value is fixed as `RD-Account`.</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        /**
         * <p>The modification time.</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The ID of the RAM user provisioning.</p>
         */
        @NameInMap("UserProvisioningId")
        public String userProvisioningId;

        public static ListUserProvisioningsResponseBodyUserProvisionings build(java.util.Map<String, ?> map) throws Exception {
            ListUserProvisioningsResponseBodyUserProvisionings self = new ListUserProvisioningsResponseBodyUserProvisionings();
            return TeaModel.build(map, self);
        }

        public ListUserProvisioningsResponseBodyUserProvisionings setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListUserProvisioningsResponseBodyUserProvisionings setDeletionStrategy(String deletionStrategy) {
            this.deletionStrategy = deletionStrategy;
            return this;
        }
        public String getDeletionStrategy() {
            return this.deletionStrategy;
        }

        public ListUserProvisioningsResponseBodyUserProvisionings setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListUserProvisioningsResponseBodyUserProvisionings setDirectoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public String getDirectoryId() {
            return this.directoryId;
        }

        public ListUserProvisioningsResponseBodyUserProvisionings setDuplicationStrategy(String duplicationStrategy) {
            this.duplicationStrategy = duplicationStrategy;
            return this;
        }
        public String getDuplicationStrategy() {
            return this.duplicationStrategy;
        }

        public ListUserProvisioningsResponseBodyUserProvisionings setOwnerPk(String ownerPk) {
            this.ownerPk = ownerPk;
            return this;
        }
        public String getOwnerPk() {
            return this.ownerPk;
        }

        public ListUserProvisioningsResponseBodyUserProvisionings setPrincipalId(String principalId) {
            this.principalId = principalId;
            return this;
        }
        public String getPrincipalId() {
            return this.principalId;
        }

        public ListUserProvisioningsResponseBodyUserProvisionings setPrincipalName(String principalName) {
            this.principalName = principalName;
            return this;
        }
        public String getPrincipalName() {
            return this.principalName;
        }

        public ListUserProvisioningsResponseBodyUserProvisionings setPrincipalType(String principalType) {
            this.principalType = principalType;
            return this;
        }
        public String getPrincipalType() {
            return this.principalType;
        }

        public ListUserProvisioningsResponseBodyUserProvisionings setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListUserProvisioningsResponseBodyUserProvisionings setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

        public ListUserProvisioningsResponseBodyUserProvisionings setTargetName(String targetName) {
            this.targetName = targetName;
            return this;
        }
        public String getTargetName() {
            return this.targetName;
        }

        public ListUserProvisioningsResponseBodyUserProvisionings setTargetPath(String targetPath) {
            this.targetPath = targetPath;
            return this;
        }
        public String getTargetPath() {
            return this.targetPath;
        }

        public ListUserProvisioningsResponseBodyUserProvisionings setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public ListUserProvisioningsResponseBodyUserProvisionings setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListUserProvisioningsResponseBodyUserProvisionings setUserProvisioningId(String userProvisioningId) {
            this.userProvisioningId = userProvisioningId;
            return this;
        }
        public String getUserProvisioningId() {
            return this.userProvisioningId;
        }

    }

}
