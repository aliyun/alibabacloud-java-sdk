// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateRecognitionSampleRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>landmark</p>
     */
    @NameInMap("Algorithm")
    public String algorithm;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>**<strong><strong><strong><strong><strong><strong>544cb84754</strong></strong></strong></strong></strong></strong></p>
     */
    @NameInMap("EntityId")
    public String entityId;

    /**
     * <strong>example:</strong>
     * <p><a href="https://example.com/sample.png">https://example.com/sample.png</a></p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    @NameInMap("LabelPrompt")
    public String labelPrompt;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><em><strong><strong><strong><strong><strong><strong>24b47865c6</strong></strong></strong></strong></strong></strong></em>*</p>
     */
    @NameInMap("LibId")
    public String libId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CreateRecognitionSampleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRecognitionSampleRequest self = new CreateRecognitionSampleRequest();
        return TeaModel.build(map, self);
    }

    public CreateRecognitionSampleRequest setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }
    public String getAlgorithm() {
        return this.algorithm;
    }

    public CreateRecognitionSampleRequest setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    public String getEntityId() {
        return this.entityId;
    }

    public CreateRecognitionSampleRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public CreateRecognitionSampleRequest setLabelPrompt(String labelPrompt) {
        this.labelPrompt = labelPrompt;
        return this;
    }
    public String getLabelPrompt() {
        return this.labelPrompt;
    }

    public CreateRecognitionSampleRequest setLibId(String libId) {
        this.libId = libId;
        return this;
    }
    public String getLibId() {
        return this.libId;
    }

    public CreateRecognitionSampleRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateRecognitionSampleRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateRecognitionSampleRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateRecognitionSampleRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
