// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class CorpTokenRequest extends TeaModel {
    @NameInMap("app_secret")
    public String appSecret;

    @NameInMap("corp_id")
    public String corpId;

    @NameInMap("type")
    public Integer type;

    public static CorpTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        CorpTokenRequest self = new CorpTokenRequest();
        return TeaModel.build(map, self);
    }

    public CorpTokenRequest setAppSecret(String appSecret) {
        this.appSecret = appSecret;
        return this;
    }
    public String getAppSecret() {
        return this.appSecret;
    }

    public CorpTokenRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public CorpTokenRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
