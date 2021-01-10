// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitSnapshotJobRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Input")
    public String input;

    @NameInMap("SnapshotConfig")
    public String snapshotConfig;

    @NameInMap("UserData")
    public String userData;

    @NameInMap("PipelineId")
    public String pipelineId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static SubmitSnapshotJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitSnapshotJobRequest self = new SubmitSnapshotJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitSnapshotJobRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SubmitSnapshotJobRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SubmitSnapshotJobRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SubmitSnapshotJobRequest setInput(String input) {
        this.input = input;
        return this;
    }
    public String getInput() {
        return this.input;
    }

    public SubmitSnapshotJobRequest setSnapshotConfig(String snapshotConfig) {
        this.snapshotConfig = snapshotConfig;
        return this;
    }
    public String getSnapshotConfig() {
        return this.snapshotConfig;
    }

    public SubmitSnapshotJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public SubmitSnapshotJobRequest setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

    public SubmitSnapshotJobRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

}
