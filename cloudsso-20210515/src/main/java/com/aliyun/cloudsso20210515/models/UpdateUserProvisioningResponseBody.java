// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class UpdateUserProvisioningResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F6F90F3D-4502-5877-B80B-97476F6AE2CC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The Resource Access Management (RAM) user synchronization information.</p>
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
         * <p>The creation time. The time is displayed in UTC and follows the RFC 3339 standard in the YYYY-MM-DDTHH:mm:ssZ format.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-11-28T03:55:42Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The deletion policy. This policy specifies how to handle synchronized Resource Access Management (RAM) users when the Resource Access Management (RAM) user synchronization is deleted. Valid values:</p>
         * <ul>
         * <li>Delete: Delete the users. When the Resource Access Management (RAM) user synchronization is deleted, the system deletes the Resource Access Management (RAM) users that have been synchronized from CloudSSO to Resource Access Management (RAM).</li>
         * <li>Keep: Keep the users. When the Resource Access Management (RAM) user synchronization is deleted, the system retains the Resource Access Management (RAM) users that have been synchronized from CloudSSO to Resource Access Management (RAM).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Delete</p>
         */
        @NameInMap("DeletionStrategy")
        public String deletionStrategy;

        /**
         * <p>The description of the Resource Access Management (RAM) user synchronization.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a user provisioning.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The directory ID.</p>
         * 
         * <strong>example:</strong>
         * <p>d-003qew84****</p>
         */
        @NameInMap("DirectoryId")
        public String directoryId;

        /**
         * <p>The duplication strategy. This strategy specifies how to handle name conflicts when a CloudSSO user is synchronized to Resource Access Management (RAM) user with the same name already exists. Valid values:</p>
         * <ul>
         * <li>KeepBoth: Keep both users. When a CloudSSO user is synchronized to Resource Access Management (RAM) user with the same name already exists, the system appends the <code>_sso</code> suffix to the CloudSSO username and attempts to create a RAM user with the new username.</li>
         * <li>TakeOver: Replace the existing user. When a CloudSSO user is synchronized to Resource Access Management (RAM) user with the same name already exists, the system directly replaces the existing RAM user with the synchronized CloudSSO user.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>KeepBoth</p>
         */
        @NameInMap("DuplicationStrategy")
        public String duplicationStrategy;

        /**
         * <p>The ID of the Alibaba Cloud account to which the directory belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>164987310*****</p>
         */
        @NameInMap("OwnerPk")
        public String ownerPk;

        /**
         * <p>The ID of the principal for the Resource Access Management (RAM) user synchronization. Valid values:</p>
         * <ul>
         * <li>If <code>PrincipalType</code> is set to <code>Group</code>, the value is the ID of the CloudSSO group (g-********).</li>
         * <li>If <code>PrincipalType</code> is set to <code>User</code>, the value is the ID of the CloudSSO user (u-********).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>g-02ha881d*****</p>
         */
        @NameInMap("PrincipalId")
        public String principalId;

        /**
         * <p>The name of the principal for the Resource Access Management (RAM) user synchronization. Valid values:</p>
         * <ul>
         * <li>If <code>PrincipalType</code> is set to <code>Group</code>, the value is the name of the CloudSSO group.</li>
         * <li>If <code>PrincipalType</code> is set to <code>User</code>, the value is the CloudSSO username.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>testUserName</p>
         */
        @NameInMap("PrincipalName")
        public String principalName;

        /**
         * <p>The type of the principal for the Resource Access Management (RAM) user synchronization. Valid values:</p>
         * <ul>
         * <li>User: The principal is a CloudSSO user.</li>
         * <li>Group: The principal is a CloudSSO group.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>User</p>
         */
        @NameInMap("PrincipalType")
        public String principalType;

        /**
         * <p>The status of the Resource Access Management (RAM) user synchronization. Valid values:</p>
         * <ul>
         * <li>Enabled: The Resource Access Management (RAM) user synchronization is enabled.</li>
         * <li>Disabled: The Resource Access Management (RAM) user synchronization is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the target for the Resource Access Management (RAM) user synchronization. Currently, the value is the ID of the account in a resource directory.</p>
         * 
         * <strong>example:</strong>
         * <p>u-02ha881d*****</p>
         */
        @NameInMap("TargetId")
        public String targetId;

        /**
         * <p>The name of the target for the Resource Access Management (RAM) user synchronization. Currently, the value is the name of the account in a resource directory.</p>
         * 
         * <strong>example:</strong>
         * <p>testMemberName</p>
         */
        @NameInMap("TargetName")
        public String targetName;

        /**
         * <p>The resource directory path of the target for the Resource Access Management (RAM) user synchronization.</p>
         */
        @NameInMap("TargetPath")
        public String targetPath;

        /**
         * <p>The type of the target for the Resource Access Management (RAM) user synchronization. Currently, the value is <code>RD-Account</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>RD-Account</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        /**
         * <p>The update time. The time is displayed in UTC and follows the RFC 3339 standard in the YYYY-MM-DDTHH:mm:ssZ format.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-11-28T03:55:42Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The ID of the Resource Access Management (RAM) user synchronization.</p>
         * 
         * <strong>example:</strong>
         * <p>up-002axzhapcbz6e63****</p>
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
