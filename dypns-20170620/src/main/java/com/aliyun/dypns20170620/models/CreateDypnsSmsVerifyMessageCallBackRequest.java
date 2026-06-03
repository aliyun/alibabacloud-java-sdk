// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class CreateDypnsSmsVerifyMessageCallBackRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Register</p>
     */
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Url")
    public String url;

    public static CreateDypnsSmsVerifyMessageCallBackRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDypnsSmsVerifyMessageCallBackRequest self = new CreateDypnsSmsVerifyMessageCallBackRequest();
        return TeaModel.build(map, self);
    }

    public CreateDypnsSmsVerifyMessageCallBackRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CreateDypnsSmsVerifyMessageCallBackRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateDypnsSmsVerifyMessageCallBackRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateDypnsSmsVerifyMessageCallBackRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateDypnsSmsVerifyMessageCallBackRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
