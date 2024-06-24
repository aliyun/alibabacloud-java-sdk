// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class GroupCorpTokenRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ZzljczY5dnFjNDAwVlNofiwoWX5ZWCxlcjVTKnVoZS0</p>
     */
    @NameInMap("app_secret")
    public String appSecret;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>open12g9sfbmm5i07v10wDzRSK9w00</p>
     */
    @NameInMap("corp_id")
    public String corpId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>btripuyxmbg3cs286734u_mow6q</p>
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
