// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class UpdateUserProvisioningRequest extends TeaModel {
    /**
     * <p>The ID of the resource directory.</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The new deletion policy. The policy is used to manage synchronized users when you delete the RAM user provisioning. Valid values:</p>
     * <br>
     * <p>*   Delete: When you delete the RAM user provisioning, the system deletes the synchronized users.</p>
     * <p>*   Keep: When you delete the RAM user provisioning, the system retains the synchronized users.</p>
     */
    @NameInMap("NewDeletionStrategy")
    public String newDeletionStrategy;

    /**
     * <p>The new description of the RAM user provisioning.</p>
     */
    @NameInMap("NewDescription")
    public String newDescription;

    /**
     * <p>The new conflict handling policy. The policy is used when a RAM user has the same username as the CloudSSO user who is synchronized to RAM. Valid values:</p>
     * <br>
     * <p>*   KeepBoth: When a CloudSSO user is synchronized to RAM, if a RAM user who has the same username as the CloudSSO user exists, the system creates a RAM user whose username is the username of the CloudSSO user plus the suffix `_sso`.</p>
     * <p>*   TakeOver: When a CloudSSO user is synchronized to RAM, if a RAM user who has the same username as the CloudSSO user exists, the system replaces the RAM user with the CloudSSO user.</p>
     */
    @NameInMap("NewDuplicationStrategy")
    public String newDuplicationStrategy;

    /**
     * <p>The ID of the RAM user provisioning.</p>
     */
    @NameInMap("UserProvisioningId")
    public String userProvisioningId;

    public static UpdateUserProvisioningRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserProvisioningRequest self = new UpdateUserProvisioningRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUserProvisioningRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public UpdateUserProvisioningRequest setNewDeletionStrategy(String newDeletionStrategy) {
        this.newDeletionStrategy = newDeletionStrategy;
        return this;
    }
    public String getNewDeletionStrategy() {
        return this.newDeletionStrategy;
    }

    public UpdateUserProvisioningRequest setNewDescription(String newDescription) {
        this.newDescription = newDescription;
        return this;
    }
    public String getNewDescription() {
        return this.newDescription;
    }

    public UpdateUserProvisioningRequest setNewDuplicationStrategy(String newDuplicationStrategy) {
        this.newDuplicationStrategy = newDuplicationStrategy;
        return this;
    }
    public String getNewDuplicationStrategy() {
        return this.newDuplicationStrategy;
    }

    public UpdateUserProvisioningRequest setUserProvisioningId(String userProvisioningId) {
        this.userProvisioningId = userProvisioningId;
        return this;
    }
    public String getUserProvisioningId() {
        return this.userProvisioningId;
    }

}
