// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class SetExtensionByKeysRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RequestParams")
    public java.util.Map<String, ?> requestParams;

    public static SetExtensionByKeysRequest build(java.util.Map<String, ?> map) throws Exception {
        SetExtensionByKeysRequest self = new SetExtensionByKeysRequest();
        return TeaModel.build(map, self);
    }

    public SetExtensionByKeysRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SetExtensionByKeysRequest setRequestParams(java.util.Map<String, ?> requestParams) {
        this.requestParams = requestParams;
        return this;
    }
    public java.util.Map<String, ?> getRequestParams() {
        return this.requestParams;
    }

}
