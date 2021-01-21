// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class RemoveAIAppRequest extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    public static RemoveAIAppRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveAIAppRequest self = new RemoveAIAppRequest();
        return TeaModel.build(map, self);
    }

    public RemoveAIAppRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
