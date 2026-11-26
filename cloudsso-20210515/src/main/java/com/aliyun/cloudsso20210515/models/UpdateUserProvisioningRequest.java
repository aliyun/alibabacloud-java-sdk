// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class UpdateUserProvisioningRequest extends TeaModel {
    /**
     * <p>The directory ID.</p>
     * 
     * <strong>example:</strong>
     * <p>d-003qew84****</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The new deletion policy. This policy specifies how to handle synchronized Resource Access Management (RAM) users when the Resource Access Management (RAM) user synchronization is deleted. Valid values:</p>
     * <ul>
     * <li>Delete: Delete the users. When the Resource Access Management (RAM) user synchronization is deleted, the system deletes the Resource Access Management (RAM) users that have been synchronized from CloudSSO to Resource Access Management (RAM).</li>
     * <li>Keep: Keep the users. When the Resource Access Management (RAM) user synchronization is deleted, the system retains the Resource Access Management (RAM) users that have been synchronized from CloudSSO to Resource Access Management (RAM).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Delete</p>
     */
    @NameInMap("NewDeletionStrategy")
    public String newDeletionStrategy;

    /**
     * <p>The new description of the Resource Access Management (RAM) user synchronization.</p>
     * 
     * <strong>example:</strong>
     * <p>description*****</p>
     */
    @NameInMap("NewDescription")
    public String newDescription;

    /**
     * <p>The new duplication strategy. This strategy specifies how to handle name conflicts when a CloudSSO user is synchronized to Resource Access Management (RAM) user with the same name already exists. Valid values:</p>
     * <ul>
     * <li>KeepBoth: Keep both users. When a CloudSSO user is synchronized to Resource Access Management (RAM) user with the same name already exists, the system appends the <code>_sso</code> suffix to the CloudSSO username and attempts to create a RAM user with the new username.</li>
     * <li>TakeOver: Replace the existing user. When a CloudSSO user is synchronized to Resource Access Management (RAM) user with the same name already exists, the system directly replaces the existing RAM user with the synchronized CloudSSO user.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>KeepBoth</p>
     */
    @NameInMap("NewDuplicationStrategy")
    public String newDuplicationStrategy;

    /**
     * <p>The ID of the Resource Access Management (RAM) user synchronization.</p>
     * 
     * <strong>example:</strong>
     * <p>up-002axzhapcbz6e63****</p>
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
