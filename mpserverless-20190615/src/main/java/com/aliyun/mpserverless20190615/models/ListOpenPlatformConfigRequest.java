// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class ListOpenPlatformConfigRequest extends TeaModel {
    @NameInMap("Platform")
    public String platform;

    @NameInMap("SpaceId")
    public String spaceId;

    public static ListOpenPlatformConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOpenPlatformConfigRequest self = new ListOpenPlatformConfigRequest();
        return TeaModel.build(map, self);
    }

    public ListOpenPlatformConfigRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public ListOpenPlatformConfigRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

}
