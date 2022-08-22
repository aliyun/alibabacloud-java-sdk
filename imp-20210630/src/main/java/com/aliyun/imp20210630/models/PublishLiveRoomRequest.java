// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class PublishLiveRoomRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("LiveId")
    public String liveId;

    @NameInMap("UserId")
    public String userId;

    public static PublishLiveRoomRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishLiveRoomRequest self = new PublishLiveRoomRequest();
        return TeaModel.build(map, self);
    }

    public PublishLiveRoomRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public PublishLiveRoomRequest setLiveId(String liveId) {
        this.liveId = liveId;
        return this;
    }
    public String getLiveId() {
        return this.liveId;
    }

    public PublishLiveRoomRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
