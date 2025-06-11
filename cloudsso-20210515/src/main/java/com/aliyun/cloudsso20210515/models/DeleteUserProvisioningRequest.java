// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class DeleteUserProvisioningRequest extends TeaModel {
    /**
     * <p>The deletion policy. The policy is used to manage synchronized users when you delete the RAM user provisioning. Valid values:</p>
     * <ul>
     * <li>Delete: When you delete the RAM user provisioning, the system deletes the synchronized users.</li>
     * <li>Keep: When you delete the RAM user provisioning, the system retains the synchronized users.</li>
     * </ul>
     * <blockquote>
     * <p> If you do not specify this parameter, the deletion policy that is configured when you create the RAM user provisioning is used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Delete</p>
     */
    @NameInMap("DeletionStrategy")
    public String deletionStrategy;

    /**
     * <p>The ID of the resource directory.</p>
     * 
     * <strong>example:</strong>
     * <p>d-003qew84****</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The ID of the RAM user provisioning.</p>
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
