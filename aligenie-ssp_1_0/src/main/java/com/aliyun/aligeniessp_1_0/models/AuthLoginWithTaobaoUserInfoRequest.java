// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class AuthLoginWithTaobaoUserInfoRequest extends TeaModel {
    @NameInMap("EncryptedTaobaoUserIdentifier")
    public String encryptedTaobaoUserIdentifier;

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
