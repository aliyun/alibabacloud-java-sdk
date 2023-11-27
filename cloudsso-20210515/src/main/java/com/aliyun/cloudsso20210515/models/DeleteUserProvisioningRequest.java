// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class DeleteUserProvisioningRequest extends TeaModel {
    @NameInMap("DeletionStrategy")
    public String deletionStrategy;

    @NameInMap("DirectoryId")
    public String directoryId;

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
