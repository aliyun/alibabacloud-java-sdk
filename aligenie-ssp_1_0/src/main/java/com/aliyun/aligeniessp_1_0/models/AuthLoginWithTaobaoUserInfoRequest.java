// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class AuthLoginWithTaobaoUserInfoRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>KsVgypxAipf+xNECMZV2ONMcheqiIoEGFvgx+T8s1oV6/euTK9+ImYvLVPsSqFDh</p>
     */
    @NameInMap("EncryptedTaobaoUserIdentifier")
    public String encryptedTaobaoUserIdentifier;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dbe2eb4458302b9246c6da17fbc95f4b</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    public static AuthLoginWithTaobaoUserInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthLoginWithTaobaoUserInfoRequest self = new AuthLoginWithTaobaoUserInfoRequest();
        return TeaModel.build(map, self);
    }

    public AuthLoginWithTaobaoUserInfoRequest setEncryptedTaobaoUserIdentifier(String encryptedTaobaoUserIdentifier) {
        this.encryptedTaobaoUserIdentifier = encryptedTaobaoUserIdentifier;
        return this;
    }
    public String getEncryptedTaobaoUserIdentifier() {
        return this.encryptedTaobaoUserIdentifier;
    }

    public AuthLoginWithTaobaoUserInfoRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
