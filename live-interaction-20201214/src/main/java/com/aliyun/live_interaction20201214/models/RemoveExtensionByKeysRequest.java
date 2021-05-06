// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class RemoveExtensionByKeysRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RequestParams")
    public java.util.Map<String, ?> requestParams;

    public static RemoveExtensionByKeysRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveExtensionByKeysRequest self = new RemoveExtensionByKeysRequest();
        return TeaModel.build(map, self);
    }

    public RemoveExtensionByKeysRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RemoveExtensionByKeysRequest setRequestParams(java.util.Map<String, ?> requestParams) {
        this.requestParams = requestParams;
        return this;
    }
    public java.util.Map<String, ?> getRequestParams() {
        return this.requestParams;
    }

}
