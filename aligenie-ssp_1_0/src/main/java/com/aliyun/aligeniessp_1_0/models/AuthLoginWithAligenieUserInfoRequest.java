// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class AuthLoginWithAligenieUserInfoRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>UYugfm/3Nb9q24AyES2rYmC5tIglSoDX3Mbna/vrldcjGPtC8VzFwo+CU5c4CHLjrK7ekskG2WVaevM5Zi9f0w==</p>
     */
    @NameInMap("EncryptedAligenieUserIdentifier")
    public String encryptedAligenieUserIdentifier;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dbe2eb4458302b9246c6da17fbc95f4b</p>
     */
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
