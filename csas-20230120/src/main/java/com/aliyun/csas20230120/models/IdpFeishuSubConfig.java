// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class IdpFeishuSubConfig extends TeaModel {
    @NameInMap("AppId")
    public String appId;

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

    public static IdpFeishuSubConfig build(java.util.Map<String, ?> map) throws Exception {
        IdpFeishuSubConfig self = new IdpFeishuSubConfig();
        return TeaModel.build(map, self);
    }

    public IdpFeishuSubConfig setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public IdpFeishuSubConfig setAppSecret(String appSecret) {
        this.appSecret = appSecret;
        return this;
    }
    public String getAppSecret() {
        return this.appSecret;
    }

    public IdpFeishuSubConfig setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public IdpFeishuSubConfig setEventAesKey(String eventAesKey) {
        this.eventAesKey = eventAesKey;
        return this;
    }
    public String getEventAesKey() {
        return this.eventAesKey;
    }

    public IdpFeishuSubConfig setEventLabel(String eventLabel) {
        this.eventLabel = eventLabel;
        return this;
    }
    public String getEventLabel() {
        return this.eventLabel;
    }

    public IdpFeishuSubConfig setEventVerifyToken(String eventVerifyToken) {
        this.eventVerifyToken = eventVerifyToken;
        return this;
    }
    public String getEventVerifyToken() {
        return this.eventVerifyToken;
    }

    public IdpFeishuSubConfig setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
        return this;
    }
    public String getRedirectUri() {
        return this.redirectUri;
    }

}
