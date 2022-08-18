// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateAppKeyStateRequest extends TeaModel {
    @NameInMap("AppKeyId")
    public String appKeyId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("State")
    public String state;

    public static UpdateAppKeyStateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppKeyStateRequest self = new UpdateAppKeyStateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAppKeyStateRequest setAppKeyId(String appKeyId) {
        this.appKeyId = appKeyId;
        return this;
    }
    public String getAppKeyId() {
        return this.appKeyId;
    }

    public UpdateAppKeyStateRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateAppKeyStateRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
