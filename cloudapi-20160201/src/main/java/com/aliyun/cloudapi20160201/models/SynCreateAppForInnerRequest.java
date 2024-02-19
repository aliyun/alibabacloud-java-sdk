// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class SynCreateAppForInnerRequest extends TeaModel {
    @NameInMap("AliUid")
    public Long aliUid;

    @NameInMap("AppKey")
    public Long appKey;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("AppSecret")
    public String appSecret;

    @NameInMap("Description")
    public String description;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("Source")
    public String source;

    public static SynCreateAppForInnerRequest build(java.util.Map<String, ?> map) throws Exception {
        SynCreateAppForInnerRequest self = new SynCreateAppForInnerRequest();
        return TeaModel.build(map, self);
    }

    public SynCreateAppForInnerRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public SynCreateAppForInnerRequest setAppKey(Long appKey) {
        this.appKey = appKey;
        return this;
    }
    public Long getAppKey() {
        return this.appKey;
    }

    public SynCreateAppForInnerRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SynCreateAppForInnerRequest setAppSecret(String appSecret) {
        this.appSecret = appSecret;
        return this;
    }
    public String getAppSecret() {
        return this.appSecret;
    }

    public SynCreateAppForInnerRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SynCreateAppForInnerRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public SynCreateAppForInnerRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
