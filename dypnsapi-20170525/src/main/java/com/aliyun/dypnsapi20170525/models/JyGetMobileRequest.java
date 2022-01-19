// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class JyGetMobileRequest extends TeaModel {
    // 认证Token
    @NameInMap("AccessToken")
    public String accessToken;

    @NameInMap("OutId")
    public String outId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static JyGetMobileRequest build(java.util.Map<String, ?> map) throws Exception {
        JyGetMobileRequest self = new JyGetMobileRequest();
        return TeaModel.build(map, self);
    }

    public JyGetMobileRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public JyGetMobileRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public JyGetMobileRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public JyGetMobileRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public JyGetMobileRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
