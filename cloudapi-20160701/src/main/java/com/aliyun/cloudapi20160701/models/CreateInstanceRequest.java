// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class CreateInstanceRequest extends TeaModel {
    @NameInMap("AccountQuantity")
    public Integer accountQuantity;

    @NameInMap("ExpiredOn")
    public String expiredOn;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("SkuId")
    public String skuId;

    @NameInMap("Token")
    public String token;

    public static CreateInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceRequest self = new CreateInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstanceRequest setAccountQuantity(Integer accountQuantity) {
        this.accountQuantity = accountQuantity;
        return this;
    }
    public Integer getAccountQuantity() {
        return this.accountQuantity;
    }

    public CreateInstanceRequest setExpiredOn(String expiredOn) {
        this.expiredOn = expiredOn;
        return this;
    }
    public String getExpiredOn() {
        return this.expiredOn;
    }

    public CreateInstanceRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public CreateInstanceRequest setSkuId(String skuId) {
        this.skuId = skuId;
        return this;
    }
    public String getSkuId() {
        return this.skuId;
    }

    public CreateInstanceRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
