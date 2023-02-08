// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitFpDBDeleteJobRequest extends TeaModel {
    /**
     * <p>The operation type. Valid values:</p>
     * <br>
     * <p>*   **Purge**: clears the media fingerprint library. If you set the DelType parameter to Purge, the content in the library is deleted, but the library is not deleted.</p>
     * <p>*   **Delete**: deletes the media fingerprint library. If you set the DelType parameter to Delete, both the library and the content in the library are deleted.</p>
     * <p>*   Default value: **Purge**.</p>
     */
    @NameInMap("DelType")
    public String delType;

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

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The custom data. The value can contain letters and digits and can be up to 128 bytes in length.</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitFpDBDeleteJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitFpDBDeleteJobRequest self = new SubmitFpDBDeleteJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitFpDBDeleteJobRequest setDelType(String delType) {
        this.delType = delType;
        return this;
    }
    public String getDelType() {
        return this.delType;
    }

    public SubmitFpDBDeleteJobRequest setFpDBId(String fpDBId) {
        this.fpDBId = fpDBId;
        return this;
    }
    public String getFpDBId() {
        return this.fpDBId;
    }

    public SubmitFpDBDeleteJobRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public SubmitFpDBDeleteJobRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SubmitFpDBDeleteJobRequest setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

    public SubmitFpDBDeleteJobRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SubmitFpDBDeleteJobRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SubmitFpDBDeleteJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
