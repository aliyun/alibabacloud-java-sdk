// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class QueryQRCodeInfoRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecretNumber")
    public String secretNumber;

    public static QueryQRCodeInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryQRCodeInfoRequest self = new QueryQRCodeInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryQRCodeInfoRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryQRCodeInfoRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryQRCodeInfoRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QueryQRCodeInfoRequest setSecretNumber(String secretNumber) {
        this.secretNumber = secretNumber;
        return this;
    }
    public String getSecretNumber() {
        return this.secretNumber;
    }

}
