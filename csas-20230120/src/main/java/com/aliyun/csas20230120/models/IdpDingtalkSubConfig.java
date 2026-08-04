// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class IdpDingtalkSubConfig extends TeaModel {
    /**
     * <p>Your application\&quot;s unique identifier. You can get this identifier from the DingTalk Open Platform.</p>
     */
    @NameInMap("AppKey")
    public String appKey;

    /**
     * <p>Your application\&quot;s secret key. You can get this key from the DingTalk Open Platform.</p>
     */
    @NameInMap("AppSecret")
    public String appSecret;

    /**
     * <p>Your enterprise\&quot;s unique ID in DingTalk.</p>
     */
    @NameInMap("CorpId")
    public String corpId;

    /**
     * <p>The AES key used to decrypt the content of event callbacks. This ensures the confidentiality of the event data.</p>
     */
    @NameInMap("EventAesKey")
    public String eventAesKey;

    /**
     * <p>A custom label for event subscriptions. This field is reserved for future use.</p>
     */
    @NameInMap("EventLabel")
    public String eventLabel;

    /**
     * <p>The token used to verify the authenticity of event callback requests from DingTalk.</p>
     */
    @NameInMap("EventVerifyToken")
    public String eventVerifyToken;

    /**
     * <p>Specifies whether this identity provider is the exclusive login method. If set to <code>true</code>, other login methods are disabled.</p>
     */
    @NameInMap("Exclusive")
    public Boolean exclusive;

    /**
     * <p>Specifies whether to enable the OAuth authentication flow.</p>
     */
    @NameInMap("Oauth")
    public Boolean oauth;

    /**
     * <p>The URL where the user is redirected after successful authorization. You must register this URL on the DingTalk Open Platform.</p>
     */
    @NameInMap("RedirectUri")
    public String redirectUri;

    public static IdpDingtalkSubConfig build(java.util.Map<String, ?> map) throws Exception {
        IdpDingtalkSubConfig self = new IdpDingtalkSubConfig();
        return TeaModel.build(map, self);
    }

    public IdpDingtalkSubConfig setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public IdpDingtalkSubConfig setAppSecret(String appSecret) {
        this.appSecret = appSecret;
        return this;
    }
    public String getAppSecret() {
        return this.appSecret;
    }

    public IdpDingtalkSubConfig setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public IdpDingtalkSubConfig setEventAesKey(String eventAesKey) {
        this.eventAesKey = eventAesKey;
        return this;
    }
    public String getEventAesKey() {
        return this.eventAesKey;
    }

    public IdpDingtalkSubConfig setEventLabel(String eventLabel) {
        this.eventLabel = eventLabel;
        return this;
    }
    public String getEventLabel() {
        return this.eventLabel;
    }

    public IdpDingtalkSubConfig setEventVerifyToken(String eventVerifyToken) {
        this.eventVerifyToken = eventVerifyToken;
        return this;
    }
    public String getEventVerifyToken() {
        return this.eventVerifyToken;
    }

    public IdpDingtalkSubConfig setExclusive(Boolean exclusive) {
        this.exclusive = exclusive;
        return this;
    }
    public Boolean getExclusive() {
        return this.exclusive;
    }

    public IdpDingtalkSubConfig setOauth(Boolean oauth) {
        this.oauth = oauth;
        return this;
    }
    public Boolean getOauth() {
        return this.oauth;
    }

    public IdpDingtalkSubConfig setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
        return this;
    }
    public String getRedirectUri() {
        return this.redirectUri;
    }

}
