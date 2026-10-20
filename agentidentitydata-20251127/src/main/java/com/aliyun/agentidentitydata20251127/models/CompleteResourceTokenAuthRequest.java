// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentitydata20251127.models;

import com.aliyun.tea.*;

public class CompleteResourceTokenAuthRequest extends TeaModel {
    @NameInMap("SessionURI")
    public String sessionURI;

    @NameInMap("UserIdentifier")
    public CompleteResourceTokenAuthRequestUserIdentifier userIdentifier;

    public static CompleteResourceTokenAuthRequest build(java.util.Map<String, ?> map) throws Exception {
        CompleteResourceTokenAuthRequest self = new CompleteResourceTokenAuthRequest();
        return TeaModel.build(map, self);
    }

    public CompleteResourceTokenAuthRequest setSessionURI(String sessionURI) {
        this.sessionURI = sessionURI;
        return this;
    }
    public String getSessionURI() {
        return this.sessionURI;
    }

    public CompleteResourceTokenAuthRequest setUserIdentifier(CompleteResourceTokenAuthRequestUserIdentifier userIdentifier) {
        this.userIdentifier = userIdentifier;
        return this;
    }
    public CompleteResourceTokenAuthRequestUserIdentifier getUserIdentifier() {
        return this.userIdentifier;
    }

    public static class CompleteResourceTokenAuthRequestUserIdentifier extends TeaModel {
        @NameInMap("UserId")
        public String userId;

        @NameInMap("UserJWT")
        public String userJWT;

        public static CompleteResourceTokenAuthRequestUserIdentifier build(java.util.Map<String, ?> map) throws Exception {
            CompleteResourceTokenAuthRequestUserIdentifier self = new CompleteResourceTokenAuthRequestUserIdentifier();
            return TeaModel.build(map, self);
        }

        public CompleteResourceTokenAuthRequestUserIdentifier setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public CompleteResourceTokenAuthRequestUserIdentifier setUserJWT(String userJWT) {
            this.userJWT = userJWT;
            return this;
        }
        public String getUserJWT() {
            return this.userJWT;
        }

    }

}
