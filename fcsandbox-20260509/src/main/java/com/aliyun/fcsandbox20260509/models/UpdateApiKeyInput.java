// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class UpdateApiKeyInput extends TeaModel {
    @NameInMap("apiKeyName")
    public String apiKeyName;

    @NameInMap("expireTime")
    public String expireTime;

    @NameInMap("status")
    public String status;

    public static UpdateApiKeyInput build(java.util.Map<String, ?> map) throws Exception {
        UpdateApiKeyInput self = new UpdateApiKeyInput();
        return TeaModel.build(map, self);
    }

    public UpdateApiKeyInput setApiKeyName(String apiKeyName) {
        this.apiKeyName = apiKeyName;
        return this;
    }
    public String getApiKeyName() {
        return this.apiKeyName;
    }

    public UpdateApiKeyInput setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public UpdateApiKeyInput setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
