// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class AuthLoginWithAligenieUserInfoRequest extends TeaModel {
    @NameInMap("EncryptedAligenieUserIdentifier")
    public String encryptedAligenieUserIdentifier;

    @NameInMap("SessionId")
    public String sessionId;

    public static AuthLoginWithAligenieUserInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthLoginWithAligenieUserInfoRequest self = new AuthLoginWithAligenieUserInfoRequest();
        return TeaModel.build(map, self);
    }

    public AuthLoginWithAligenieUserInfoRequest setEncryptedAligenieUserIdentifier(String encryptedAligenieUserIdentifier) {
        this.encryptedAligenieUserIdentifier = encryptedAligenieUserIdentifier;
        return this;
    }
    public String getEncryptedAligenieUserIdentifier() {
        return this.encryptedAligenieUserIdentifier;
    }

    public AuthLoginWithAligenieUserInfoRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
