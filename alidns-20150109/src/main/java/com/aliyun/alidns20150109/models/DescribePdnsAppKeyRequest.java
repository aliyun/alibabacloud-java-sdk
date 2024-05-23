// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribePdnsAppKeyRequest extends TeaModel {
    @NameInMap("AppKeyId")
    public String appKeyId;

    @NameInMap("AuthCode")
    public String authCode;

    @NameInMap("Lang")
    public String lang;

    public static DescribePdnsAppKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePdnsAppKeyRequest self = new DescribePdnsAppKeyRequest();
        return TeaModel.build(map, self);
    }

    public DescribePdnsAppKeyRequest setAppKeyId(String appKeyId) {
        this.appKeyId = appKeyId;
        return this;
    }
    public String getAppKeyId() {
        return this.appKeyId;
    }

    public DescribePdnsAppKeyRequest setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

    public DescribePdnsAppKeyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
