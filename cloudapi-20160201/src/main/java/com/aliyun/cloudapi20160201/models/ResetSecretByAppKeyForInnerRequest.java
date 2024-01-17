// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class ResetSecretByAppKeyForInnerRequest extends TeaModel {
    @NameInMap("AliUid")
    public Long aliUid;

    @NameInMap("AppKey")
    public String appKey;

    @NameInMap("NewAppKey")
    public String newAppKey;

    @NameInMap("NewAppSecret")
    public String newAppSecret;

    public static ResetSecretByAppKeyForInnerRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetSecretByAppKeyForInnerRequest self = new ResetSecretByAppKeyForInnerRequest();
        return TeaModel.build(map, self);
    }

    public ResetSecretByAppKeyForInnerRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public ResetSecretByAppKeyForInnerRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public ResetSecretByAppKeyForInnerRequest setNewAppKey(String newAppKey) {
        this.newAppKey = newAppKey;
        return this;
    }
    public String getNewAppKey() {
        return this.newAppKey;
    }

    public ResetSecretByAppKeyForInnerRequest setNewAppSecret(String newAppSecret) {
        this.newAppSecret = newAppSecret;
        return this;
    }
    public String getNewAppSecret() {
        return this.newAppSecret;
    }

}
