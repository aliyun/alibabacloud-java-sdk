// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class UpdateUserProvisioningRequest extends TeaModel {
    @NameInMap("DirectoryId")
    public String directoryId;

    @NameInMap("NewDeletionStrategy")
    public String newDeletionStrategy;

    @NameInMap("NewDescription")
    public String newDescription;

    @NameInMap("NewDuplicationStrategy")
    public String newDuplicationStrategy;

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
