// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class DeleteLiveRoomRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("LiveId")
    public String liveId;

    @NameInMap("UserId")
    public String userId;

    public static DeleteLiveRoomRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveRoomRequest self = new DeleteLiveRoomRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLiveRoomRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteLiveRoomRequest setLiveId(String liveId) {
        this.liveId = liveId;
        return this;
    }
    public String getLiveId() {
        return this.liveId;
    }

    public DeleteLiveRoomRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
