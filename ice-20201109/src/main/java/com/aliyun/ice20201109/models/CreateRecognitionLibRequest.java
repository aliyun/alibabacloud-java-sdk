// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateRecognitionLibRequest extends TeaModel {
    /**
     * <p>The type of recognition algorithm. Valid values:</p>
     * <ul>
     * <li><p>landmark</p>
     * </li>
     * <li><p>object</p>
     * </li>
     * <li><p>logo</p>
     * </li>
     * <li><p>face</p>
     * </li>
     * <li><p>label</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>landmark</p>
     */
    @NameInMap("Algorithm")
    public String algorithm;

    /**
     * <p>The description of the recognition library. Max length: 128 bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>For storing product recognition samples</p>
     */
    @NameInMap("LibDescription")
    public String libDescription;

    /**
     * <p>The name of the recognition library. Max length: 64 bytes.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Landmark test library</p>
     */
    @NameInMap("LibName")
    public String libName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CreateRecognitionLibRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRecognitionLibRequest self = new CreateRecognitionLibRequest();
        return TeaModel.build(map, self);
    }

    public CreateRecognitionLibRequest setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }
    public String getAlgorithm() {
        return this.algorithm;
    }

    public CreateRecognitionLibRequest setLibDescription(String libDescription) {
        this.libDescription = libDescription;
        return this;
    }
    public String getLibDescription() {
        return this.libDescription;
    }

    public CreateRecognitionLibRequest setLibName(String libName) {
        this.libName = libName;
        return this;
    }
    public String getLibName() {
        return this.libName;
    }

    public CreateRecognitionLibRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateRecognitionLibRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateRecognitionLibRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateRecognitionLibRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
