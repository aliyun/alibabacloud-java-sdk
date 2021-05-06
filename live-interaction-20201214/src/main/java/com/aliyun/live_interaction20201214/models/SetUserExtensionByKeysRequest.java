// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class SetUserExtensionByKeysRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RequestParams")
    public java.util.Map<String, ?> requestParams;

    public static SetUserExtensionByKeysRequest build(java.util.Map<String, ?> map) throws Exception {
        SetUserExtensionByKeysRequest self = new SetUserExtensionByKeysRequest();
        return TeaModel.build(map, self);
    }

    public SetUserExtensionByKeysRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SetUserExtensionByKeysRequest setRequestParams(java.util.Map<String, ?> requestParams) {
        this.requestParams = requestParams;
        return this;
    }
    public java.util.Map<String, ?> getRequestParams() {
        return this.requestParams;
    }

}
