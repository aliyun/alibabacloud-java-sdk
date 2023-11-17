// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630.models;

import com.aliyun.tea.*;

public class GetAccountByIdRequest extends TeaModel {
    @NameInMap("IdentityId")
    public String identityId;

    @NameInMap("OpenId")
    public String openId;

    @NameInMap("OpenIdAppKey")
    public String openIdAppKey;

    public static GetAccountByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAccountByIdRequest self = new GetAccountByIdRequest();
        return TeaModel.build(map, self);
    }

    public GetAccountByIdRequest setIdentityId(String identityId) {
        this.identityId = identityId;
        return this;
    }
    public String getIdentityId() {
        return this.identityId;
    }

    public GetAccountByIdRequest setOpenId(String openId) {
        this.openId = openId;
        return this;
    }
    public String getOpenId() {
        return this.openId;
    }

    public GetAccountByIdRequest setOpenIdAppKey(String openIdAppKey) {
        this.openIdAppKey = openIdAppKey;
        return this;
    }
    public String getOpenIdAppKey() {
        return this.openIdAppKey;
    }

}
