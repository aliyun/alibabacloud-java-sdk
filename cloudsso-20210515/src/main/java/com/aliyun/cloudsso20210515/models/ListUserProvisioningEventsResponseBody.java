// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ListUserProvisioningEventsResponseBody extends TeaModel {
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
     * <p>The RAM user provisioning events.</p>
     */
    @NameInMap("UserProvisioningEvents")
    public java.util.List<ListUserProvisioningEventsResponseBodyUserProvisioningEvents> userProvisioningEvents;

    public static ListUserProvisioningEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserProvisioningEventsResponseBody self = new ListUserProvisioningEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserProvisioningEventsResponseBody setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    public ListUserProvisioningEventsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListUserProvisioningEventsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListUserProvisioningEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserProvisioningEventsResponseBody setTotalCounts(Integer totalCounts) {
        this.totalCounts = totalCounts;
        return this;
    }
    public Integer getTotalCounts() {
        return this.totalCounts;
    }

    public ListUserProvisioningEventsResponseBody setUserProvisioningEvents(java.util.List<ListUserProvisioningEventsResponseBodyUserProvisioningEvents> userProvisioningEvents) {
        this.userProvisioningEvents = userProvisioningEvents;
        return this;
    }
    public java.util.List<ListUserProvisioningEventsResponseBodyUserProvisioningEvents> getUserProvisioningEvents() {
        return this.userProvisioningEvents;
    }

    public static class ListUserProvisioningEventsResponseBodyUserProvisioningEvents extends TeaModel {
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
         * <p>The number of execution failures.</p>
         */
        @NameInMap("ErrorCount")
        public Long errorCount;

        /**
         * <p>The error message that is displayed when the last execution of the RAM user provisioning event failed.</p>
         */
        @NameInMap("ErrorInfo")
        public String errorInfo;

        /**
         * <p>The ID of the RAM user provisioning event.</p>
         */
        @NameInMap("EventId")
        public String eventId;

        /**
         * <p>The time at which the RAM user provisioning event was last executed.</p>
         */
        @NameInMap("LatestAsyncTime")
        public String latestAsyncTime;

        /**
         * <p>The identity ID of the RAM user provisioning. Valid values:</p>
         * <br>
         * <p>*   If `Group` is returned for the `PrincipalType` parameter, the value of this parameter is the ID of a CloudSSO user group (g-\\*\\*\\*\\*\\*\\*\\*\\*).</p>
         * <p>*   If `User` is returned for the `PrincipalType` parameter, the value of this parameter is the ID of a CloudSSO user (u-\\*\\*\\*\\*\\*\\*\\*\\*).</p>
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
         * <p>The type of the source operation. Valid values:</p>
         * <br>
         * <p>*   StartProvisioning: enables the RAM user provisioning.</p>
         * <p>*   DeleteProvisioning: deletes the RAM user provisioning.</p>
         * <p>*   AddUserToGroup: adds a user to a user group.</p>
         * <p>*   RemoveUserFromGroup: removes a user from a user group.</p>
         * <p>*   UserProvisioningDeletionClearing: deletes the RAM user provisioning and clears resources in the background.</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The ID of the object for which you create the RAM user provisioning.</p>
         * <br>
         * <p>The value is fixed as the ID of the account in the resource directory.````</p>
         */
        @NameInMap("TargetId")
        public String targetId;

        /**
         * <p>The name of the object for which you create the RAM user provisioning.</p>
         * <br>
         * <p>If `RD-Account` is returned, the value of this parameter is the name of the account that is used to access the instance.``</p>
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

        public static ListUserProvisioningEventsResponseBodyUserProvisioningEvents build(java.util.Map<String, ?> map) throws Exception {
            ListUserProvisioningEventsResponseBodyUserProvisioningEvents self = new ListUserProvisioningEventsResponseBodyUserProvisioningEvents();
            return TeaModel.build(map, self);
        }

        public ListUserProvisioningEventsResponseBodyUserProvisioningEvents setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListUserProvisioningEventsResponseBodyUserProvisioningEvents setDeletionStrategy(String deletionStrategy) {
            this.deletionStrategy = deletionStrategy;
            return this;
        }
        public String getDeletionStrategy() {
            return this.deletionStrategy;
        }

        public ListUserProvisioningEventsResponseBodyUserProvisioningEvents setDirectoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public String getDirectoryId() {
            return this.directoryId;
        }

        public ListUserProvisioningEventsResponseBodyUserProvisioningEvents setDuplicationStrategy(String duplicationStrategy) {
            this.duplicationStrategy = duplicationStrategy;
            return this;
        }
        public String getDuplicationStrategy() {
            return this.duplicationStrategy;
        }

        public ListUserProvisioningEventsResponseBodyUserProvisioningEvents setErrorCount(Long errorCount) {
            this.errorCount = errorCount;
            return this;
        }
        public Long getErrorCount() {
            return this.errorCount;
        }

        public ListUserProvisioningEventsResponseBodyUserProvisioningEvents setErrorInfo(String errorInfo) {
            this.errorInfo = errorInfo;
            return this;
        }
        public String getErrorInfo() {
            return this.errorInfo;
        }

        public ListUserProvisioningEventsResponseBodyUserProvisioningEvents setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public ListUserProvisioningEventsResponseBodyUserProvisioningEvents setLatestAsyncTime(String latestAsyncTime) {
            this.latestAsyncTime = latestAsyncTime;
            return this;
        }
        public String getLatestAsyncTime() {
            return this.latestAsyncTime;
        }

        public ListUserProvisioningEventsResponseBodyUserProvisioningEvents setPrincipalId(String principalId) {
            this.principalId = principalId;
            return this;
        }
        public String getPrincipalId() {
            return this.principalId;
        }

        public ListUserProvisioningEventsResponseBodyUserProvisioningEvents setPrincipalName(String principalName) {
            this.principalName = principalName;
            return this;
        }
        public String getPrincipalName() {
            return this.principalName;
        }

        public ListUserProvisioningEventsResponseBodyUserProvisioningEvents setPrincipalType(String principalType) {
            this.principalType = principalType;
            return this;
        }
        public String getPrincipalType() {
            return this.principalType;
        }

        public ListUserProvisioningEventsResponseBodyUserProvisioningEvents setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public ListUserProvisioningEventsResponseBodyUserProvisioningEvents setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

        public ListUserProvisioningEventsResponseBodyUserProvisioningEvents setTargetName(String targetName) {
            this.targetName = targetName;
            return this;
        }
        public String getTargetName() {
            return this.targetName;
        }

        public ListUserProvisioningEventsResponseBodyUserProvisioningEvents setTargetPath(String targetPath) {
            this.targetPath = targetPath;
            return this;
        }
        public String getTargetPath() {
            return this.targetPath;
        }

        public ListUserProvisioningEventsResponseBodyUserProvisioningEvents setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public ListUserProvisioningEventsResponseBodyUserProvisioningEvents setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListUserProvisioningEventsResponseBodyUserProvisioningEvents setUserProvisioningId(String userProvisioningId) {
            this.userProvisioningId = userProvisioningId;
            return this;
        }
        public String getUserProvisioningId() {
            return this.userProvisioningId;
        }

    }

}
