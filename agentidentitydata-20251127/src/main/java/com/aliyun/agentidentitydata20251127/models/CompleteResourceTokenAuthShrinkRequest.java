// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentitydata20251127.models;

import com.aliyun.tea.*;

public class CompleteResourceTokenAuthShrinkRequest extends TeaModel {
    @NameInMap("SessionURI")
    public String sessionURI;

    @NameInMap("UserIdentifier")
    public String userIdentifierShrink;

    public static CompleteResourceTokenAuthShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CompleteResourceTokenAuthShrinkRequest self = new CompleteResourceTokenAuthShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CompleteResourceTokenAuthShrinkRequest setSessionURI(String sessionURI) {
        this.sessionURI = sessionURI;
        return this;
    }
    public String getSessionURI() {
        return this.sessionURI;
    }

    public CompleteResourceTokenAuthShrinkRequest setUserIdentifierShrink(String userIdentifierShrink) {
        this.userIdentifierShrink = userIdentifierShrink;
        return this;
    }
    public String getUserIdentifierShrink() {
        return this.userIdentifierShrink;
    }

}
