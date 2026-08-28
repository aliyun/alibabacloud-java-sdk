// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class RefreshPluginOAuthCodeRequest extends TeaModel {
    /**
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
