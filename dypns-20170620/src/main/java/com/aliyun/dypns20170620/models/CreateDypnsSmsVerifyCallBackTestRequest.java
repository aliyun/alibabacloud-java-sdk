// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class CreateDypnsSmsVerifyCallBackTestRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Register</p>
     */
    @NameInMap("BizType")
    public String bizType;

    /**
     * <strong>example:</strong>
     * <p>{&quot;aa&quot;:1,&quot;b&quot;:&quot;test&quot;}</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <strong>example:</strong>
     * <p>POST</p>
     */
    @NameInMap("Method")
    public String method;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Url")
    public String url;

    public static CreateDypnsSmsVerifyCallBackTestRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDypnsSmsVerifyCallBackTestRequest self = new CreateDypnsSmsVerifyCallBackTestRequest();
        return TeaModel.build(map, self);
    }

    public CreateDypnsSmsVerifyCallBackTestRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CreateDypnsSmsVerifyCallBackTestRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateDypnsSmsVerifyCallBackTestRequest setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

    public CreateDypnsSmsVerifyCallBackTestRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateDypnsSmsVerifyCallBackTestRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateDypnsSmsVerifyCallBackTestRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateDypnsSmsVerifyCallBackTestRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
