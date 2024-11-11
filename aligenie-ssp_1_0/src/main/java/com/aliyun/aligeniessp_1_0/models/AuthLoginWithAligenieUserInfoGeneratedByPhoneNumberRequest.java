// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class AuthLoginWithAligenieUserInfoGeneratedByPhoneNumberRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dbe2eb4458302b9246c6da17fbc95f4b</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    public static AuthLoginWithAligenieUserInfoGeneratedByPhoneNumberRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthLoginWithAligenieUserInfoGeneratedByPhoneNumberRequest self = new AuthLoginWithAligenieUserInfoGeneratedByPhoneNumberRequest();
        return TeaModel.build(map, self);
    }

    public AuthLoginWithAligenieUserInfoGeneratedByPhoneNumberRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
