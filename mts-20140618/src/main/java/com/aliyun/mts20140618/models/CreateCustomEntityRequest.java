// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class CreateCustomEntityRequest extends TeaModel {
    @NameInMap("Algorithm")
    public String algorithm;

    @NameInMap("CustomEntityInfo")
    public String customEntityInfo;

    @NameInMap("CustomEntityName")
    public String customEntityName;

    @NameInMap("CustomGroupId")
    public String customGroupId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CreateCustomEntityRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomEntityRequest self = new CreateCustomEntityRequest();
        return TeaModel.build(map, self);
    }

    public CreateCustomEntityRequest setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }
    public String getAlgorithm() {
        return this.algorithm;
    }

    public CreateCustomEntityRequest setCustomEntityInfo(String customEntityInfo) {
        this.customEntityInfo = customEntityInfo;
        return this;
    }
    public String getCustomEntityInfo() {
        return this.customEntityInfo;
    }

    public CreateCustomEntityRequest setCustomEntityName(String customEntityName) {
        this.customEntityName = customEntityName;
        return this;
    }
    public String getCustomEntityName() {
        return this.customEntityName;
    }

    public CreateCustomEntityRequest setCustomGroupId(String customGroupId) {
        this.customGroupId = customGroupId;
        return this;
    }
    public String getCustomGroupId() {
        return this.customGroupId;
    }

    public CreateCustomEntityRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateCustomEntityRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateCustomEntityRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateCustomEntityRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
