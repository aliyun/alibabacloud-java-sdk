// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class CreateUserProvisioningResponseBody extends TeaModel {
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
    public CreateUserProvisioningResponseBodyUserProvisioning userProvisioning;

    public static CreateUserProvisioningResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateUserProvisioningResponseBody self = new CreateUserProvisioningResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateUserProvisioningResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateUserProvisioningResponseBody setUserProvisioning(CreateUserProvisioningResponseBodyUserProvisioning userProvisioning) {
        this.userProvisioning = userProvisioning;
        return this;
    }
    public CreateUserProvisioningResponseBodyUserProvisioning getUserProvisioning() {
        return this.userProvisioning;
    }

    public static class CreateUserProvisioningResponseBodyUserProvisioning extends TeaModel {
        /**
         * <p>The creation time. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-11-28T03:55:42Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The deletion policy. Specifies the action to take for synchronized Resource Access Management (RAM) users when a Resource Access Management (RAM) user synchronization is deleted. Valid values:</p>
         * <ul>
         * <li>Delete: Delete. When a Resource Access Management (RAM) user synchronization is deleted, the system deletes the Resource Access Management (RAM) users that have been synchronized from CloudSSO to RAM.</li>
         * <li>Keep: Keep. When a Resource Access Management (RAM) user synchronization is deleted, the system retains the Resource Access Management (RAM) users that have been synchronized from CloudSSO to RAM.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Delete</p>
         */
        @NameInMap("DeletionStrategy")
        public String deletionStrategy;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a user provisioning.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the directory.</p>
         * 
         * <strong>example:</strong>
         * <p>d-003qew84****</p>
         */
        @NameInMap("DirectoryId")
        public String directoryId;

        /**
         * <p>The conflict resolution policy. Specifies the action to take when a CloudSSO user is synchronized to Resource Access Management (RAM) user with the same name already exists. Valid values:</p>
         * <ul>
         * <li>KeepBoth: Keep both. When a CloudSSO user is synchronized to Resource Access Management (RAM) user with the same name already exists, the system adds the <code>_sso</code> suffix to the username of the CloudSSO user and attempts to create a RAM user with the suffixed username.</li>
         * <li>TakeOver: Take over. When a CloudSSO user is synchronized to Resource Access Management (RAM) user with the same name already exists, the system replaces the existing RAM user with the synchronized CloudSSO user.</li>
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
         * <p>1639738******</p>
         */
        @NameInMap("OwnerPk")
        public String ownerPk;

        /**
         * <p>The ID of the identity for the Resource Access Management (RAM) user synchronization. Valid values:</p>
         * <ul>
         * <li>When <code>PrincipalType</code> is set to <code>Group</code>, the value is the ID of the CloudSSO group (g-********).</li>
         * <li>When <code>PrincipalType</code> is set to <code>User</code>, the value is the ID of the CloudSSO user (u-********).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>g-02ha881d*****</p>
         */
        @NameInMap("PrincipalId")
        public String principalId;

        /**
         * <p>The name of the identity for the Resource Access Management (RAM) user synchronization. Valid values:</p>
         * <ul>
         * <li>When <code>PrincipalType</code> is set to <code>Group</code>, the value is the name of the CloudSSO group.</li>
         * <li>When <code>PrincipalType</code> is set to <code>User</code>, the value is the CloudSSO username.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>testGroupName</p>
         */
        @NameInMap("PrincipalName")
        public String principalName;

        /**
         * <p>The type of the Resource Access Management (RAM) user synchronization. Valid values:</p>
         * <ul>
         * <li>User: The Resource Access Management (RAM) user synchronization is a CloudSSO user.</li>
         * <li>Group: The Resource Access Management (RAM) user synchronization is a CloudSSO group.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Group</p>
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
         * <p>The ID of the destination for the Resource Access Management (RAM) user synchronization. Currently, the value is the ID of the account in a resource directory.</p>
         * 
         * <strong>example:</strong>
         * <p>1743382******</p>
         */
        @NameInMap("TargetId")
        public String targetId;

        /**
         * <p>The name of the destination for the Resource Access Management (RAM) user synchronization. Currently, the value is the name of the account in a resource directory.</p>
         * 
         * <strong>example:</strong>
         * <p>testTargetName</p>
         */
        @NameInMap("TargetName")
        public String targetName;

        /**
         * <p>The path of the destination account in a resource directory for the Resource Access Management (RAM) user synchronization.</p>
         */
        @NameInMap("TargetPath")
        public String targetPath;

        /**
         * <p>The type of the destination for the Resource Access Management (RAM) user synchronization. Currently, the only valid value is <code>RD-Account</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>RD-Account</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        /**
         * <p>The update time. The time is displayed in UTC.</p>
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

        public static CreateUserProvisioningResponseBodyUserProvisioning build(java.util.Map<String, ?> map) throws Exception {
            CreateUserProvisioningResponseBodyUserProvisioning self = new CreateUserProvisioningResponseBodyUserProvisioning();
            return TeaModel.build(map, self);
        }

        public CreateUserProvisioningResponseBodyUserProvisioning setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateUserProvisioningResponseBodyUserProvisioning setDeletionStrategy(String deletionStrategy) {
            this.deletionStrategy = deletionStrategy;
            return this;
        }
        public String getDeletionStrategy() {
            return this.deletionStrategy;
        }

        public CreateUserProvisioningResponseBodyUserProvisioning setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateUserProvisioningResponseBodyUserProvisioning setDirectoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public String getDirectoryId() {
            return this.directoryId;
        }

        public CreateUserProvisioningResponseBodyUserProvisioning setDuplicationStrategy(String duplicationStrategy) {
            this.duplicationStrategy = duplicationStrategy;
            return this;
        }
        public String getDuplicationStrategy() {
            return this.duplicationStrategy;
        }

        public CreateUserProvisioningResponseBodyUserProvisioning setOwnerPk(String ownerPk) {
            this.ownerPk = ownerPk;
            return this;
        }
        public String getOwnerPk() {
            return this.ownerPk;
        }

        public CreateUserProvisioningResponseBodyUserProvisioning setPrincipalId(String principalId) {
            this.principalId = principalId;
            return this;
        }
        public String getPrincipalId() {
            return this.principalId;
        }

        public CreateUserProvisioningResponseBodyUserProvisioning setPrincipalName(String principalName) {
            this.principalName = principalName;
            return this;
        }
        public String getPrincipalName() {
            return this.principalName;
        }

        public CreateUserProvisioningResponseBodyUserProvisioning setPrincipalType(String principalType) {
            this.principalType = principalType;
            return this;
        }
        public String getPrincipalType() {
            return this.principalType;
        }

        public CreateUserProvisioningResponseBodyUserProvisioning setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateUserProvisioningResponseBodyUserProvisioning setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

        public CreateUserProvisioningResponseBodyUserProvisioning setTargetName(String targetName) {
            this.targetName = targetName;
            return this;
        }
        public String getTargetName() {
            return this.targetName;
        }

        public CreateUserProvisioningResponseBodyUserProvisioning setTargetPath(String targetPath) {
            this.targetPath = targetPath;
            return this;
        }
        public String getTargetPath() {
            return this.targetPath;
        }

        public CreateUserProvisioningResponseBodyUserProvisioning setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public CreateUserProvisioningResponseBodyUserProvisioning setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public CreateUserProvisioningResponseBodyUserProvisioning setUserProvisioningId(String userProvisioningId) {
            this.userProvisioningId = userProvisioningId;
            return this;
        }
        public String getUserProvisioningId() {
            return this.userProvisioningId;
        }

    }

}
