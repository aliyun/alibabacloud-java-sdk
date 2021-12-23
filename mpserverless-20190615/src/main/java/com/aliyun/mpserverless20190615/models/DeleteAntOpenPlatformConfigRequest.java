// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DeleteAntOpenPlatformConfigRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("SpaceId")
    public String spaceId;

    public static DeleteAntOpenPlatformConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAntOpenPlatformConfigRequest self = new DeleteAntOpenPlatformConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAntOpenPlatformConfigRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteAntOpenPlatformConfigRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

}
