// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitFpFileDeleteJobRequest extends TeaModel {
    /**
     * <p>The IDs of the media files that you want to delete. Separate multiple file IDs with commas (,). You can delete up to 200 media files at a time. You can obtain media file IDs from the response parameters of the <a href="https://help.aliyun.com/document_detail/209266.html">ListFpShotFiles</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>41e6536e4f2250e2e9bf26cdea19****</p>
     */
    @NameInMap("FileIds")
    public String fileIds;

    /**
     * <p>The ID of the media fingerprint library. You can obtain the library ID from the response parameters of the <a href="https://help.aliyun.com/document_detail/170149.html">CreateFpShotDB</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>88c6ca184c0e432bbf5b665e2a15****</p>
     */
    @NameInMap("FpDBId")
    public String fpDBId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the ApsaraVideo Media Processing (MPS) queue to which the job is submitted. The MPS queue is bound with a notification method. To view the MPS queue ID, log on to the <strong>MPS console</strong> and choose <strong>Global Settings</strong> &gt; <strong>MPS queue and Callback</strong> in the left-side navigation pane.</p>
     * 
     * <strong>example:</strong>
     * <p>ed450ea0bfbd41e29f80a401fb4d****</p>
     */
    @NameInMap("PipelineId")
    public String pipelineId;

    /**
     * <p>The primary keys of the files to be deleted. Separate multiple primary keys with commas (,). You can delete up to 200 primary keys at a time. You can obtain the primary keys of media files from the response parameters of the <a href="https://help.aliyun.com/document_detail/209266.html">ListFpShotFiles</a> operation.</p>
     * <blockquote>
     * <p> This parameter is available only in the China (Beijing), China (Hangzhou), and China (Shanghai) regions.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>24e0fba7188fae707e146esa54****</p>
     */
    @NameInMap("PrimaryKeys")
    public String primaryKeys;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The custom data. The value can contain letters and digits and can be up to 128 bytes in length.</p>
     * 
     * <strong>example:</strong>
     * <p>example data</p>
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
