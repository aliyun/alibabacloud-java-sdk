// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CreateVerifySDKRequest extends TeaModel {
    @NameInMap("AppUrl")
    @Validation(required = true)
    public String appUrl;

    @NameInMap("Platform")
    public String platform;

    public static CreateVerifySDKRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVerifySDKRequest self = new CreateVerifySDKRequest();
        return TeaModel.build(map, self);
    }

    public CreateVerifySDKRequest setAppUrl(String appUrl) {
        this.appUrl = appUrl;
        return this;
    }
    public String getAppUrl() {
        return this.appUrl;
    }

    public CreateVerifySDKRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

}
