// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class AccessTokenRequest extends TeaModel {
    /**
     * <p>The API secret of the application. For information about how to obtain the secret, see <a href="/#/document/server/application-of-basic-information?handbookId=development-support">Application credentials</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ggZADk********eDxdaD</p>
     */
    @NameInMap("app_secret")
    public String appSecret;

    public static AccessTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        AccessTokenRequest self = new AccessTokenRequest();
        return TeaModel.build(map, self);
    }

    public AccessTokenRequest setAppSecret(String appSecret) {
        this.appSecret = appSecret;
        return this;
    }
    public String getAppSecret() {
        return this.appSecret;
    }

}
