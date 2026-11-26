// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class CreateUserProvisioningRequest extends TeaModel {
    /**
     * <p>The deletion policy. This policy specifies how to handle the synchronized Resource Access Management (RAM) users when the Resource Access Management (RAM) user synchronization is deleted. Valid values:</p>
     * <ul>
     * <li>Delete: Delete. When the Resource Access Management (RAM) user synchronization is deleted, the Resource Access Management (RAM) users that have been synchronized from CloudSSO to RAM are deleted.</li>
     * <li>Keep: Keep. When the Resource Access Management (RAM) user synchronization is deleted, the Resource Access Management (RAM) users that have been synchronized from CloudSSO to RAM are retained.</li>
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
     * <p>The ID of the CloudSSO directory.</p>
     * 
     * <strong>example:</strong>
     * <p>d-003qew84****</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The conflict resolution policy. This policy specifies how to handle conflicts when a CloudSSO user is synchronized to Resource Access Management (RAM) user with the same name already exists. Valid values:</p>
     * <ul>
     * <li>KeepBoth: Keep both. When a CloudSSO user is synchronized to Resource Access Management (RAM) user with the same name already exists, the system appends the _sso suffix to the username of the CloudSSO user and attempts to create a RAM user with the new username.</li>
     * <li>TakeOver: Take over. When a CloudSSO user is synchronized to Resource Access Management (RAM) user with the same name already exists, the system directly replaces the existing RAM user with the synchronized CloudSSO user.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>KeepBoth</p>
     */
    @NameInMap("DuplicationStrategy")
    public String duplicationStrategy;

    /**
     * <p>The ID of the identity for the Resource Access Management (RAM) user synchronization. Valid values:</p>
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
     * <p>The ID of the destination for the Resource Access Management (RAM) user synchronization. Currently, the value is the ID of the account in a resource directory.</p>
     * 
     * <strong>example:</strong>
     * <p>1743382******</p>
     */
    @NameInMap("TargetId")
    public String targetId;

    /**
     * <p>The type of the destination for the Resource Access Management (RAM) user synchronization. Currently, the value is <code>RD-Account</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>RD-Account</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    public static CreateUserProvisioningRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUserProvisioningRequest self = new CreateUserProvisioningRequest();
        return TeaModel.build(map, self);
    }

    public CreateUserProvisioningRequest setDeletionStrategy(String deletionStrategy) {
        this.deletionStrategy = deletionStrategy;
        return this;
    }
    public String getDeletionStrategy() {
        return this.deletionStrategy;
    }

    public CreateUserProvisioningRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateUserProvisioningRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public CreateUserProvisioningRequest setDuplicationStrategy(String duplicationStrategy) {
        this.duplicationStrategy = duplicationStrategy;
        return this;
    }
    public String getDuplicationStrategy() {
        return this.duplicationStrategy;
    }

    public CreateUserProvisioningRequest setPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }
    public String getPrincipalId() {
        return this.principalId;
    }

    public CreateUserProvisioningRequest setPrincipalType(String principalType) {
        this.principalType = principalType;
        return this;
    }
    public String getPrincipalType() {
        return this.principalType;
    }

    public CreateUserProvisioningRequest setTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }
    public String getTargetId() {
        return this.targetId;
    }

    public CreateUserProvisioningRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

}
