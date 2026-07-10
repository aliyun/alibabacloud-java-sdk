// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class GroupCorpTokenRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("app_secret")
    public String appSecret;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("corp_id")
    public String corpId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("sub_corp_id")
    public String subCorpId;

    public static GroupCorpTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GroupCorpTokenRequest self = new GroupCorpTokenRequest();
        return TeaModel.build(map, self);
    }

    public GroupCorpTokenRequest setAppSecret(String appSecret) {
        this.appSecret = appSecret;
        return this;
    }
    public String getAppSecret() {
        return this.appSecret;
    }

    public GroupCorpTokenRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public GroupCorpTokenRequest setSubCorpId(String subCorpId) {
        this.subCorpId = subCorpId;
        return this;
    }
    public String getSubCorpId() {
        return this.subCorpId;
    }

}
