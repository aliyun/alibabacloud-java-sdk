// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class RefreshPluginOAuthCodeRequest extends TeaModel {
    /**
     * <p>The authorization code returned by the Codeup OAuth authorization callback (the code parameter carried in the callback after authorization at <a href="https://codeup.aliyun.com/oauth/authorize?app_id=xxx&state=apigw">https://codeup.aliyun.com/oauth/authorize?app_id=xxx&amp;state=apigw</a>). If this parameter is empty, the ErrInvalidParameterWithEmpty(&quot;oauth code&quot;) error is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>4/0AX4xxxx</p>
     */
    @NameInMap("code")
    public String code;

    public static RefreshPluginOAuthCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshPluginOAuthCodeRequest self = new RefreshPluginOAuthCodeRequest();
        return TeaModel.build(map, self);
    }

    public RefreshPluginOAuthCodeRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

}
