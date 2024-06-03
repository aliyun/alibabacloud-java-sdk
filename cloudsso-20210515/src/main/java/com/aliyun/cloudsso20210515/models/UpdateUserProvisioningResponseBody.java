// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class UpdateUserProvisioningResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the RAM user provisioning.</p>
     */
    @NameInMap("UserProvisioning")
    public UpdateUserProvisioningResponseBodyUserProvisioning userProvisioning;

    public static UpdateUserProvisioningResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserProvisioningResponseBody self = new UpdateUserProvisioningResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateUserProvisioningResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateUserProvisioningResponseBody setUserProvisioning(UpdateUserProvisioningResponseBodyUserProvisioning userProvisioning) {
        this.userProvisioning = userProvisioning;
        return this;
    }
    public UpdateUserProvisioningResponseBodyUserProvisioning getUserProvisioning() {
        return this.userProvisioning;
    }

    public static class UpdateUserProvisioningResponseBodyUserProvisioning extends TeaModel {
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
         * <p>The description for the RAM user provisioning.</p>
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
         * <p>*   User: indicates that the identity of the RAM user provisioning is a CloudSSO user.</p>
         * <p>*   Group: indicates that the identity of the RAM user provisioning is a CloudSSO user group.</p>
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
         * <p>The ID of the object for which you create the RAM user provisioning. The value is fixed as the ID of the account in the resource directory.</p>
         */
        @NameInMap("TargetId")
        public String targetId;

        /**
         * <p>The name of the object for which you create the RAM user provisioning. The value is fixed as the name of the resource directory.</p>
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

        public static UpdateUserProvisioningResponseBodyUserProvisioning build(java.util.Map<String, ?> map) throws Exception {
            UpdateUserProvisioningResponseBodyUserProvisioning self = new UpdateUserProvisioningResponseBodyUserProvisioning();
            return TeaModel.build(map, self);
        }

        public UpdateUserProvisioningResponseBodyUserProvisioning setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public UpdateUserProvisioningResponseBodyUserProvisioning setDeletionStrategy(String deletionStrategy) {
            this.deletionStrategy = deletionStrategy;
            return this;
        }
        public String getDeletionStrategy() {
            return this.deletionStrategy;
        }

        public UpdateUserProvisioningResponseBodyUserProvisioning setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateUserProvisioningResponseBodyUserProvisioning setDirectoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public String getDirectoryId() {
            return this.directoryId;
        }

        public UpdateUserProvisioningResponseBodyUserProvisioning setDuplicationStrategy(String duplicationStrategy) {
            this.duplicationStrategy = duplicationStrategy;
            return this;
        }
        public String getDuplicationStrategy() {
            return this.duplicationStrategy;
        }

        public UpdateUserProvisioningResponseBodyUserProvisioning setOwnerPk(String ownerPk) {
            this.ownerPk = ownerPk;
            return this;
        }
        public String getOwnerPk() {
            return this.ownerPk;
        }

        public UpdateUserProvisioningResponseBodyUserProvisioning setPrincipalId(String principalId) {
            this.principalId = principalId;
            return this;
        }
        public String getPrincipalId() {
            return this.principalId;
        }

        public UpdateUserProvisioningResponseBodyUserProvisioning setPrincipalName(String principalName) {
            this.principalName = principalName;
            return this;
        }
        public String getPrincipalName() {
            return this.principalName;
        }

        public UpdateUserProvisioningResponseBodyUserProvisioning setPrincipalType(String principalType) {
            this.principalType = principalType;
            return this;
        }
        public String getPrincipalType() {
            return this.principalType;
        }

        public UpdateUserProvisioningResponseBodyUserProvisioning setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateUserProvisioningResponseBodyUserProvisioning setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

        public UpdateUserProvisioningResponseBodyUserProvisioning setTargetName(String targetName) {
            this.targetName = targetName;
            return this;
        }
        public String getTargetName() {
            return this.targetName;
        }

        public UpdateUserProvisioningResponseBodyUserProvisioning setTargetPath(String targetPath) {
            this.targetPath = targetPath;
            return this;
        }
        public String getTargetPath() {
            return this.targetPath;
        }

        public UpdateUserProvisioningResponseBodyUserProvisioning setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public UpdateUserProvisioningResponseBodyUserProvisioning setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public UpdateUserProvisioningResponseBodyUserProvisioning setUserProvisioningId(String userProvisioningId) {
            this.userProvisioningId = userProvisioningId;
            return this;
        }
        public String getUserProvisioningId() {
            return this.userProvisioningId;
        }

    }

}
