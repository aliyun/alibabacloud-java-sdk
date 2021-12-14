// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class PublishLiveRequest extends TeaModel {
    // 直播资源的唯一标识ID
    @NameInMap("LiveId")
    public String liveId;

    @NameInMap("RegionId")
    public String regionId;

    // 当前用户Id
    @NameInMap("UserId")
    public String userId;

    public static PublishLiveRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishLiveRequest self = new PublishLiveRequest();
        return TeaModel.build(map, self);
    }

    public PublishLiveRequest setLiveId(String liveId) {
        this.liveId = liveId;
        return this;
    }
    public String getLiveId() {
        return this.liveId;
    }

    public PublishLiveRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public PublishLiveRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
