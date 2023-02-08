// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitFpShotJobRequest extends TeaModel {
    /**
     * <p>The configurations of the media fingerprint analysis job. The value is a JSON object. For more information, see the "FpShotConfig" section of the [Parameter details](~~93568~~) topic.</p>
     */
    @NameInMap("FpShotConfig")
    public String fpShotConfig;

    /**
     * <p>The object Storage Service (OSS) URL of the job input. The value is a JSON object. You can query the OSS URL in the OSS or ApsaraVideo Media Processing (MPS) console. For more information, see the "InputFile" section of the [Parameter details](~~93568~~) topic.</p>
     * <br>
     * <p>>  The OSS bucket must reside in the same region as the specified MPS region.</p>
     */
    @NameInMap("Input")
    public String input;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the MPS queue. This ID can be used to associate the job with a notification method. To view the MPS queue ID, log on to the **MPS console** and choose **Global Settings** > **Pipelines** in the left-side navigation pane.</p>
     */
    @NameInMap("PipelineId")
    public String pipelineId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The custom data. The value can be up to 128 bytes in length and cannot start with a special character.</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitFpShotJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitFpShotJobRequest self = new SubmitFpShotJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitFpShotJobRequest setFpShotConfig(String fpShotConfig) {
        this.fpShotConfig = fpShotConfig;
        return this;
    }
    public String getFpShotConfig() {
        return this.fpShotConfig;
    }

    public SubmitFpShotJobRequest setInput(String input) {
        this.input = input;
        return this;
    }
    public String getInput() {
        return this.input;
    }

    public SubmitFpShotJobRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public SubmitFpShotJobRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SubmitFpShotJobRequest setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

    public SubmitFpShotJobRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SubmitFpShotJobRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SubmitFpShotJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
