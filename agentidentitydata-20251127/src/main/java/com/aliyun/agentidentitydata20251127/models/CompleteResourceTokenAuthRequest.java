// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentitydata20251127.models;

import com.aliyun.tea.*;

public class CompleteResourceTokenAuthRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>urn:ietf:params:oauth:request_uri:3030cabc-<strong><strong>-</strong></strong>-****-d0054944102a</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>externalUser</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <strong>example:</strong>
         * <p>eyAgImFsZyI6ICJSU****</p>
         */
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
