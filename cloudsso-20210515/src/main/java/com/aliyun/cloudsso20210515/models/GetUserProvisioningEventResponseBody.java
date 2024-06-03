// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetUserProvisioningEventResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The RAM user provisioning event.</p>
     */
    @NameInMap("UserProvisioningEvent")
    public GetUserProvisioningEventResponseBodyUserProvisioningEvent userProvisioningEvent;

    public static GetUserProvisioningEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserProvisioningEventResponseBody self = new GetUserProvisioningEventResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserProvisioningEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserProvisioningEventResponseBody setUserProvisioningEvent(GetUserProvisioningEventResponseBodyUserProvisioningEvent userProvisioningEvent) {
        this.userProvisioningEvent = userProvisioningEvent;
        return this;
    }
    public GetUserProvisioningEventResponseBodyUserProvisioningEvent getUserProvisioningEvent() {
        return this.userProvisioningEvent;
    }

    public static class GetUserProvisioningEventResponseBodyUserProvisioningEvent extends TeaModel {
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
         * <p>The value is fixed as the ID of the member in the resource directory.````</p>
         */
        @NameInMap("TargetId")
        public String targetId;

        /**
         * <p>The name of the object for which you create the RAM user provisioning.</p>
         * <br>
         * <p>The value is fixed as the name of the member in the resource directory.````</p>
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
         * <p>The ID of the RAM user provisioning event.</p>
         */
        @NameInMap("UserProvisioningId")
        public String userProvisioningId;

        public static GetUserProvisioningEventResponseBodyUserProvisioningEvent build(java.util.Map<String, ?> map) throws Exception {
            GetUserProvisioningEventResponseBodyUserProvisioningEvent self = new GetUserProvisioningEventResponseBodyUserProvisioningEvent();
            return TeaModel.build(map, self);
        }

        public GetUserProvisioningEventResponseBodyUserProvisioningEvent setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetUserProvisioningEventResponseBodyUserProvisioningEvent setDeletionStrategy(String deletionStrategy) {
            this.deletionStrategy = deletionStrategy;
            return this;
        }
        public String getDeletionStrategy() {
            return this.deletionStrategy;
        }

        public GetUserProvisioningEventResponseBodyUserProvisioningEvent setDirectoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public String getDirectoryId() {
            return this.directoryId;
        }

        public GetUserProvisioningEventResponseBodyUserProvisioningEvent setDuplicationStrategy(String duplicationStrategy) {
            this.duplicationStrategy = duplicationStrategy;
            return this;
        }
        public String getDuplicationStrategy() {
            return this.duplicationStrategy;
        }

        public GetUserProvisioningEventResponseBodyUserProvisioningEvent setErrorCount(Long errorCount) {
            this.errorCount = errorCount;
            return this;
        }
        public Long getErrorCount() {
            return this.errorCount;
        }

        public GetUserProvisioningEventResponseBodyUserProvisioningEvent setErrorInfo(String errorInfo) {
            this.errorInfo = errorInfo;
            return this;
        }
        public String getErrorInfo() {
            return this.errorInfo;
        }

        public GetUserProvisioningEventResponseBodyUserProvisioningEvent setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public GetUserProvisioningEventResponseBodyUserProvisioningEvent setLatestAsyncTime(String latestAsyncTime) {
            this.latestAsyncTime = latestAsyncTime;
            return this;
        }
        public String getLatestAsyncTime() {
            return this.latestAsyncTime;
        }

        public GetUserProvisioningEventResponseBodyUserProvisioningEvent setPrincipalId(String principalId) {
            this.principalId = principalId;
            return this;
        }
        public String getPrincipalId() {
            return this.principalId;
        }

        public GetUserProvisioningEventResponseBodyUserProvisioningEvent setPrincipalName(String principalName) {
            this.principalName = principalName;
            return this;
        }
        public String getPrincipalName() {
            return this.principalName;
        }

        public GetUserProvisioningEventResponseBodyUserProvisioningEvent setPrincipalType(String principalType) {
            this.principalType = principalType;
            return this;
        }
        public String getPrincipalType() {
            return this.principalType;
        }

        public GetUserProvisioningEventResponseBodyUserProvisioningEvent setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public GetUserProvisioningEventResponseBodyUserProvisioningEvent setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

        public GetUserProvisioningEventResponseBodyUserProvisioningEvent setTargetName(String targetName) {
            this.targetName = targetName;
            return this;
        }
        public String getTargetName() {
            return this.targetName;
        }

        public GetUserProvisioningEventResponseBodyUserProvisioningEvent setTargetPath(String targetPath) {
            this.targetPath = targetPath;
            return this;
        }
        public String getTargetPath() {
            return this.targetPath;
        }

        public GetUserProvisioningEventResponseBodyUserProvisioningEvent setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public GetUserProvisioningEventResponseBodyUserProvisioningEvent setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public GetUserProvisioningEventResponseBodyUserProvisioningEvent setUserProvisioningId(String userProvisioningId) {
            this.userProvisioningId = userProvisioningId;
            return this;
        }
        public String getUserProvisioningId() {
            return this.userProvisioningId;
        }

    }

}
