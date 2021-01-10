// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitFpCompareJobRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("MasterMedia")
    public String masterMedia;

    @NameInMap("QueryMedia")
    public String queryMedia;

    @NameInMap("PipelineId")
    public String pipelineId;

    @NameInMap("FpDBId")
    public String fpDBId;

    @NameInMap("MatchedFrameStorage")
    public String matchedFrameStorage;

    @NameInMap("UserData")
    public String userData;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static SubmitFpCompareJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitFpCompareJobRequest self = new SubmitFpCompareJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitFpCompareJobRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SubmitFpCompareJobRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SubmitFpCompareJobRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SubmitFpCompareJobRequest setMasterMedia(String masterMedia) {
        this.masterMedia = masterMedia;
        return this;
    }
    public String getMasterMedia() {
        return this.masterMedia;
    }

    public SubmitFpCompareJobRequest setQueryMedia(String queryMedia) {
        this.queryMedia = queryMedia;
        return this;
    }
    public String getQueryMedia() {
        return this.queryMedia;
    }

    public SubmitFpCompareJobRequest setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

    public SubmitFpCompareJobRequest setFpDBId(String fpDBId) {
        this.fpDBId = fpDBId;
        return this;
    }
    public String getFpDBId() {
        return this.fpDBId;
    }

    public SubmitFpCompareJobRequest setMatchedFrameStorage(String matchedFrameStorage) {
        this.matchedFrameStorage = matchedFrameStorage;
        return this;
    }
    public String getMatchedFrameStorage() {
        return this.matchedFrameStorage;
    }

    public SubmitFpCompareJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public SubmitFpCompareJobRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

}
