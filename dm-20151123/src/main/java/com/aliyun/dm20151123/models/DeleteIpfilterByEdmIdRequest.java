// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class DeleteIpfilterByEdmIdRequest extends TeaModel {
    @NameInMap("FromType")
    public Integer fromType;

    /**
     * <strong>example:</strong>
     * <p>10120</p>
     */
    @NameInMap("Id")
    public String id;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DeleteIpfilterByEdmIdRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteIpfilterByEdmIdRequest self = new DeleteIpfilterByEdmIdRequest();
        return TeaModel.build(map, self);
    }

    public DeleteIpfilterByEdmIdRequest setFromType(Integer fromType) {
        this.fromType = fromType;
        return this;
    }
    public Integer getFromType() {
        return this.fromType;
    }

    public DeleteIpfilterByEdmIdRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeleteIpfilterByEdmIdRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteIpfilterByEdmIdRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteIpfilterByEdmIdRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
