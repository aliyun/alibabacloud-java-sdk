// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DeleteWechatOpenPlatformConfigRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("SpaceId")
    public String spaceId;

    public static DeleteWechatOpenPlatformConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWechatOpenPlatformConfigRequest self = new DeleteWechatOpenPlatformConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteWechatOpenPlatformConfigRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteWechatOpenPlatformConfigRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

}
