// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class RemovePdnsAppKeyRequest extends TeaModel {
    @NameInMap("AppKeyId")
    public String appKeyId;

    @NameInMap("Lang")
    public String lang;

    public static RemovePdnsAppKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        RemovePdnsAppKeyRequest self = new RemovePdnsAppKeyRequest();
        return TeaModel.build(map, self);
    }

    public RemovePdnsAppKeyRequest setAppKeyId(String appKeyId) {
        this.appKeyId = appKeyId;
        return this;
    }
    public String getAppKeyId() {
        return this.appKeyId;
    }

    public RemovePdnsAppKeyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
