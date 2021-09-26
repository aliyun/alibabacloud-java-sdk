// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class GetLiveRoomRequest extends TeaModel {
    // 应用唯一标识，由6位小写字母、数字组成。
    @NameInMap("AppId")
    public String appId;

    // 直播ID。
    @NameInMap("LiveId")
    public String liveId;

    public static GetLiveRoomRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLiveRoomRequest self = new GetLiveRoomRequest();
        return TeaModel.build(map, self);
    }

    public GetLiveRoomRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetLiveRoomRequest setLiveId(String liveId) {
        this.liveId = liveId;
        return this;
    }
    public String getLiveId() {
        return this.liveId;
    }

}
