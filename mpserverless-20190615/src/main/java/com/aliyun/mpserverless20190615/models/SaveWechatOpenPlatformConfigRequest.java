// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class SaveWechatOpenPlatformConfigRequest extends TeaModel {
    @NameInMap("SpaceId")
    public String spaceId;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("AppSecret")
    public String appSecret;

    public static SaveWechatOpenPlatformConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveWechatOpenPlatformConfigRequest self = new SaveWechatOpenPlatformConfigRequest();
        return TeaModel.build(map, self);
    }

    public SaveWechatOpenPlatformConfigRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public SaveWechatOpenPlatformConfigRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SaveWechatOpenPlatformConfigRequest setAppSecret(String appSecret) {
        this.appSecret = appSecret;
        return this;
    }
    public String getAppSecret() {
        return this.appSecret;
    }

}
