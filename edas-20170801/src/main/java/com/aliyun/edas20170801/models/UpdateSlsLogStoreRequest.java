// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateSlsLogStoreRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Configs")
    public String configs;

    public static UpdateSlsLogStoreRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSlsLogStoreRequest self = new UpdateSlsLogStoreRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSlsLogStoreRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateSlsLogStoreRequest setConfigs(String configs) {
        this.configs = configs;
        return this;
    }
    public String getConfigs() {
        return this.configs;
    }

}
