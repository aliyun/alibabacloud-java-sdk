// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class AddDingtalkOpenPlatformConfigRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("AppSecret")
    public String appSecret;

    @NameInMap("SpaceId")
    public String spaceId;

    public static AddDingtalkOpenPlatformConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDingtalkOpenPlatformConfigRequest self = new AddDingtalkOpenPlatformConfigRequest();
        return TeaModel.build(map, self);
    }

    public AddDingtalkOpenPlatformConfigRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public AddDingtalkOpenPlatformConfigRequest setAppSecret(String appSecret) {
        this.appSecret = appSecret;
        return this;
    }
    public String getAppSecret() {
        return this.appSecret;
    }

    public AddDingtalkOpenPlatformConfigRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

}
