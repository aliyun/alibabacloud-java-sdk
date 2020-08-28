// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class GetAIAppRequest extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    public static GetAIAppRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAIAppRequest self = new GetAIAppRequest();
        return TeaModel.build(map, self);
    }

    public GetAIAppRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
