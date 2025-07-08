// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class CreateAuthorizationRequest extends TeaModel {
    @NameInMap("AuthorizeCode")
    public String authorizeCode;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CreateAuthorizationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAuthorizationRequest self = new CreateAuthorizationRequest();
        return TeaModel.build(map, self);
    }

    public CreateAuthorizationRequest setAuthorizeCode(String authorizeCode) {
        this.authorizeCode = authorizeCode;
        return this;
    }
    public String getAuthorizeCode() {
        return this.authorizeCode;
    }

    public CreateAuthorizationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateAuthorizationRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateAuthorizationRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
