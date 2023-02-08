// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitFpFileDeleteJobRequest extends TeaModel {
    /**
     * <p>The IDs of the media files that you want to delete. Separate multiple file IDs with commas (,). You can delete up to 200 media files at a time. You can obtain the file IDs from the response parameters of the [ListFpShotFiles](~~209266~~) operation.</p>
     */
    @NameInMap("FileIds")
    public String fileIds;

    /**
     * <p>The ID of the media fingerprint library. You can obtain the library ID from the response parameters of the [CreateFpShotDB](~~170149~~) operation.</p>
     */
    @NameInMap("FpDBId")
    public String fpDBId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the ApsaraVideo Media Processing (MPS) queue. This ID can be used to associate the job with a notification method. To view the MPS queue ID, log on to the **MPS console** and choose **Global Settings** > **Pipelines** in the left-side navigation pane.</p>
     */
    @NameInMap("PipelineId")
    public String pipelineId;

    @NameInMap("PrimaryKeys")
    public String primaryKeys;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The custom data. The value can contain letters and digits and can be up to 128 bytes in length.</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitFpFileDeleteJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitFpFileDeleteJobRequest self = new SubmitFpFileDeleteJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitFpFileDeleteJobRequest setFileIds(String fileIds) {
        this.fileIds = fileIds;
        return this;
    }
    public String getFileIds() {
        return this.fileIds;
    }

    public SubmitFpFileDeleteJobRequest setFpDBId(String fpDBId) {
        this.fpDBId = fpDBId;
        return this;
    }
    public String getFpDBId() {
        return this.fpDBId;
    }

    public SubmitFpFileDeleteJobRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public SubmitFpFileDeleteJobRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SubmitFpFileDeleteJobRequest setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

    public SubmitFpFileDeleteJobRequest setPrimaryKeys(String primaryKeys) {
        this.primaryKeys = primaryKeys;
        return this;
    }
    public String getPrimaryKeys() {
        return this.primaryKeys;
    }

    public SubmitFpFileDeleteJobRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SubmitFpFileDeleteJobRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SubmitFpFileDeleteJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
