// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class CreateUserProvisioningRequest extends TeaModel {
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
     * <p>The identity ID of the RAM user provisioning. Valid values:</p>
     * <br>
     * <p>*   If you set the `PrincipalType` parameter to `Group`, the value of this parameter is the ID of a CloudSSO user group (g-\\*\\*\\*\\*\\*\\*\\*\\*).</p>
     * <p>*   If you set the `PrincipalType` parameter to `User`, the value of this parameter is the ID of a CloudSSO user (u-\\*\\*\\*\\*\\*\\*\\*\\*).</p>
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
