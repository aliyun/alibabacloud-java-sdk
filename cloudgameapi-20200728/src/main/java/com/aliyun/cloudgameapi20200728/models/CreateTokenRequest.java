// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class CreateTokenRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("CurrentToken")
    public String currentToken;

    @NameInMap("Session")
    @Validation(required = true)
    public String session;

    public static CreateTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTokenRequest self = new CreateTokenRequest();
        return TeaModel.build(map, self);
    }

    public CreateTokenRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateTokenRequest setCurrentToken(String currentToken) {
        this.currentToken = currentToken;
        return this;
    }
    public String getCurrentToken() {
        return this.currentToken;
    }

    public CreateTokenRequest setSession(String session) {
        this.session = session;
        return this;
    }
    public String getSession() {
        return this.session;
    }

}
