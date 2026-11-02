// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class DeleteUserProvisioningRequest extends TeaModel {
    /**
     * <p>The deletion strategy. The processing strategy for synchronized RAM users when a RAM user synchronization is deleted. Valid values:</p>
     * <ul>
     * <li>Delete: Deletes the RAM users that have been synchronized from CloudSSO to Resource Access Management (RAM) user synchronization is deleted.</li>
     * <li>Keep: Retains the RAM users that have been synchronized from CloudSSO to Resource Access Management (RAM) user synchronization is deleted.</li>
     * </ul>
     * <blockquote>
     * <p>If this parameter is left empty, the deletion strategy specified when the RAM user synchronization was created is used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Delete</p>
     */
    @NameInMap("DeletionStrategy")
    public String deletionStrategy;

    /**
     * <p>The directory ID.</p>
     * 
     * <strong>example:</strong>
     * <p>d-003qew84****</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The ID of the Resource Access Management (RAM) user synchronization.</p>
     * 
     * <strong>example:</strong>
     * <p>up-002axzhapcbz6e63****</p>
     */
    @NameInMap("UserProvisioningId")
    public String userProvisioningId;

    public static DeleteUserProvisioningRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserProvisioningRequest self = new DeleteUserProvisioningRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUserProvisioningRequest setDeletionStrategy(String deletionStrategy) {
        this.deletionStrategy = deletionStrategy;
        return this;
    }
    public String getDeletionStrategy() {
        return this.deletionStrategy;
    }

    public DeleteUserProvisioningRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public DeleteUserProvisioningRequest setUserProvisioningId(String userProvisioningId) {
        this.userProvisioningId = userProvisioningId;
        return this;
    }
    public String getUserProvisioningId() {
        return this.userProvisioningId;
    }

}
