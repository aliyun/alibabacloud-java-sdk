// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class CreateUserProvisioningRequest extends TeaModel {
    /**
     * <p>The deletion policy. The policy is used to manage synchronized users when you delete the RAM user provisioning. Valid values:</p>
     * <ul>
     * <li>Delete: When you delete the RAM user provisioning, the system deletes the synchronized users.</li>
     * <li>Keep: When you delete the RAM user provisioning, the system retains the synchronized users.</li>
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
     * <p>The ID of the resource directory.</p>
     * 
     * <strong>example:</strong>
     * <p>d-003qew84****</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The conflict handling policy. The policy is used when a RAM user has the same username as the CloudSSO user who is synchronized to RAM. Valid values:</p>
     * <ul>
     * <li>KeepBoth: When a CloudSSO user is synchronized to RAM, if a RAM user who has the same username as the CloudSSO user exists, the system creates a RAM user whose username is the username of the CloudSSO user plus the suffix <code>_sso</code>.</li>
     * <li>TakeOver: When a CloudSSO user is synchronized to RAM, if a RAM user who has the same username as the CloudSSO user exists, the system replaces the RAM user with the CloudSSO user.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>KeepBoth</p>
     */
    @NameInMap("DuplicationStrategy")
    public String duplicationStrategy;

    /**
     * <p>The identity ID of the RAM user provisioning. Valid values:</p>
     * <ul>
     * <li>If you set the <code>PrincipalType</code> parameter to <code>Group</code>, the value of this parameter is the ID of a CloudSSO user group (g-\<em>\</em>\<em>\</em>\<em>\</em>\<em>\</em>).</li>
     * <li>If you set the <code>PrincipalType</code> parameter to <code>User</code>, the value of this parameter is the ID of a CloudSSO user (u-\<em>\</em>\<em>\</em>\<em>\</em>\<em>\</em>).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>g-02ha881d*****</p>
     */
    @NameInMap("PrincipalId")
    public String principalId;

    /**
     * <p>The identity type of the RAM user provisioning. Valid values:</p>
     * <ul>
     * <li>User: The identity of the RAM user provisioning is a CloudSSO user.</li>
     * <li>Group: The identity of the RAM user provisioning is a CloudSSO user group.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Group</p>
     */
    @NameInMap("PrincipalType")
    public String principalType;

    /**
     * <p>The ID of the object for which you create the RAM user provisioning. The value is fixed as the ID of the member in the resource directory.</p>
     * 
     * <strong>example:</strong>
     * <p>1743382******</p>
     */
    @NameInMap("TargetId")
    public String targetId;

    /**
     * <p>The object for which you create the RAM user provisioning. The value is fixed as <code>RD-Account</code>.</p>
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
