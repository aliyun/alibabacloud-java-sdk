// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ChatappEmbedSignUpRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("InputToken")
    public String inputToken;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ChatappEmbedSignUpRequest build(java.util.Map<String, ?> map) throws Exception {
        ChatappEmbedSignUpRequest self = new ChatappEmbedSignUpRequest();
        return TeaModel.build(map, self);
    }

    public ChatappEmbedSignUpRequest setInputToken(String inputToken) {
        this.inputToken = inputToken;
        return this;
    }
    public String getInputToken() {
        return this.inputToken;
    }

    public ChatappEmbedSignUpRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ChatappEmbedSignUpRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ChatappEmbedSignUpRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
