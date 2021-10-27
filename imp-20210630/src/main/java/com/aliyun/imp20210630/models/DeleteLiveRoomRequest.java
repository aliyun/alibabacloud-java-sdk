// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class DeleteLiveRoomRequest extends TeaModel {
    // 应用唯一标识，由6位小写字母、数字组成。
    @NameInMap("AppId")
    public String appId;

    // 直播ID。
    @NameInMap("LiveId")
    public String liveId;

    // 操作人ID。
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
