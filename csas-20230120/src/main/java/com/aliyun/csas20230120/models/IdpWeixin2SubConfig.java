// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class IdpWeixin2SubConfig extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1000002</p>
     */
    @NameInMap("AgentId")
    public String agentId;

    /**
     * <strong>example:</strong>
     * <p>wwautha1b2c3****</p>
     */
    @NameInMap("AppSchema")
    public String appSchema;

    /**
     * <strong>example:</strong>
     * <p>s1e2c3r4e5****</p>
     */
    @NameInMap("AppSecret")
    public String appSecret;

    /**
     * <strong>example:</strong>
     * <p>wwa1b2c3d4****</p>
     */
    @NameInMap("CorpId")
    public String corpId;

    /**
     * <strong>example:</strong>
     * <p>a1e2s3k4e5****</p>
     */
    @NameInMap("EventAesKey")
    public String eventAesKey;

    /**
     * <strong>example:</strong>
     * <p><a href="https://auth.example.com/callback/wework/a1b2">https://auth.example.com/callback/wework/a1b2</a>****</p>
     */
    @NameInMap("EventLabel")
    public String eventLabel;

    /**
     * <strong>example:</strong>
     * <p>v1t2o3k4e5****</p>
     */
    @NameInMap("EventVerifyToken")
    public String eventVerifyToken;

    /**
     * <strong>example:</strong>
     * <p><a href="https://auth.example.com/callback">https://auth.example.com/callback</a></p>
     */
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
