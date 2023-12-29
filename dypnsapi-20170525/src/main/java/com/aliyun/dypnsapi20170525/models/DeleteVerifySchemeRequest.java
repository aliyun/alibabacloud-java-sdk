// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class DeleteVerifySchemeRequest extends TeaModel {
    /**
     * <p>The user ID.</p>
     */
    @NameInMap("CustomerId")
    public Long customerId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The service code.</p>
     */
    @NameInMap("SchemeCode")
    public String schemeCode;

    public static DeleteVerifySchemeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVerifySchemeRequest self = new DeleteVerifySchemeRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVerifySchemeRequest setCustomerId(Long customerId) {
        this.customerId = customerId;
        return this;
    }
    public Long getCustomerId() {
        return this.customerId;
    }

    public DeleteVerifySchemeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteVerifySchemeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteVerifySchemeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DeleteVerifySchemeRequest setSchemeCode(String schemeCode) {
        this.schemeCode = schemeCode;
        return this;
    }
    public String getSchemeCode() {
        return this.schemeCode;
    }

}
