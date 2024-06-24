// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class CorpTokenRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Z2FyYmE1YTZjMDAwTixJU1M5LnZlLXtMO3FKbiYqJSM</p>
     */
    @NameInMap("app_secret")
    public String appSecret;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>open324dfsdafsgcxvxv</p>
     */
    @NameInMap("corp_id")
    public String corpId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
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
