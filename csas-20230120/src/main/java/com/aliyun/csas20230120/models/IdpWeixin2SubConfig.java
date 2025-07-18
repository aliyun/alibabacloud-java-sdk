// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class IdpWeixin2SubConfig extends TeaModel {
    @NameInMap("AgentId")
    public String agentId;

    @NameInMap("AppSchema")
    public String appSchema;

    @NameInMap("AppSecret")
    public String appSecret;

    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("EventAesKey")
    public String eventAesKey;

    @NameInMap("EventLabel")
    public String eventLabel;

    @NameInMap("EventVerifyToken")
    public String eventVerifyToken;

    @NameInMap("RedirectUri")
    public String redirectUri;

    public static IdpWeixin2SubConfig build(java.util.Map<String, ?> map) throws Exception {
        IdpWeixin2SubConfig self = new IdpWeixin2SubConfig();
        return TeaModel.build(map, self);
    }

    public IdpWeixin2SubConfig setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public IdpWeixin2SubConfig setAppSchema(String appSchema) {
        this.appSchema = appSchema;
        return this;
    }
    public String getAppSchema() {
        return this.appSchema;
    }

    public IdpWeixin2SubConfig setAppSecret(String appSecret) {
        this.appSecret = appSecret;
        return this;
    }
    public String getAppSecret() {
        return this.appSecret;
    }

    public IdpWeixin2SubConfig setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public IdpWeixin2SubConfig setEventAesKey(String eventAesKey) {
        this.eventAesKey = eventAesKey;
        return this;
    }
    public String getEventAesKey() {
        return this.eventAesKey;
    }

    public IdpWeixin2SubConfig setEventLabel(String eventLabel) {
        this.eventLabel = eventLabel;
        return this;
    }
    public String getEventLabel() {
        return this.eventLabel;
    }

    public IdpWeixin2SubConfig setEventVerifyToken(String eventVerifyToken) {
        this.eventVerifyToken = eventVerifyToken;
        return this;
    }
    public String getEventVerifyToken() {
        return this.eventVerifyToken;
    }

    public IdpWeixin2SubConfig setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
        return this;
    }
    public String getRedirectUri() {
        return this.redirectUri;
    }

}
