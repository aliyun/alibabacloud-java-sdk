// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class DeleteCustomViewRequest extends TeaModel {
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
     * <p>1</p>
     */
    @NameInMap("CustomEntityId")
    public String customEntityId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CustomGroupId")
    public String customGroupId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CustomViewId")
    public String customViewId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DeleteCustomViewRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomViewRequest self = new DeleteCustomViewRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCustomViewRequest setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }
    public String getAlgorithm() {
        return this.algorithm;
    }

    public DeleteCustomViewRequest setCustomEntityId(String customEntityId) {
        this.customEntityId = customEntityId;
        return this;
    }
    public String getCustomEntityId() {
        return this.customEntityId;
    }

    public DeleteCustomViewRequest setCustomGroupId(String customGroupId) {
        this.customGroupId = customGroupId;
        return this;
    }
    public String getCustomGroupId() {
        return this.customGroupId;
    }

    public DeleteCustomViewRequest setCustomViewId(String customViewId) {
        this.customViewId = customViewId;
        return this;
    }
    public String getCustomViewId() {
        return this.customViewId;
    }

    public DeleteCustomViewRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DeleteCustomViewRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteCustomViewRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteCustomViewRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
