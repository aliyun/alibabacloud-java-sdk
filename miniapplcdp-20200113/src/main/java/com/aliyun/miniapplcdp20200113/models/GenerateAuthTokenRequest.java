// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GenerateAuthTokenRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    public static GenerateAuthTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateAuthTokenRequest self = new GenerateAuthTokenRequest();
        return TeaModel.build(map, self);
    }

    public GenerateAuthTokenRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
