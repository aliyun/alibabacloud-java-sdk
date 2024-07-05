// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class CreateCustomGroupRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>landmark</p>
     */
    @NameInMap("Algorithm")
    public String algorithm;

    @NameInMap("CustomGroupDescription")
    public String customGroupDescription;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CustomGroupName")
    public String customGroupName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CreateCustomGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomGroupRequest self = new CreateCustomGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateCustomGroupRequest setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }
    public String getAlgorithm() {
        return this.algorithm;
    }

    public CreateCustomGroupRequest setCustomGroupDescription(String customGroupDescription) {
        this.customGroupDescription = customGroupDescription;
        return this;
    }
    public String getCustomGroupDescription() {
        return this.customGroupDescription;
    }

    public CreateCustomGroupRequest setCustomGroupName(String customGroupName) {
        this.customGroupName = customGroupName;
        return this;
    }
    public String getCustomGroupName() {
        return this.customGroupName;
    }

    public CreateCustomGroupRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateCustomGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateCustomGroupRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateCustomGroupRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
