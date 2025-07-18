// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class IdpDingtalkSubConfig extends TeaModel {
    @NameInMap("AppKey")
    public String appKey;

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

    @NameInMap("Exclusive")
    public Boolean exclusive;

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

    public IdpDingtalkSubConfig setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
        return this;
    }
    public String getRedirectUri() {
        return this.redirectUri;
    }

}
