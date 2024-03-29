// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class GetLiveRoomStatisticsRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("LiveId")
    public String liveId;

    public static GetLiveRoomStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLiveRoomStatisticsRequest self = new GetLiveRoomStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public GetLiveRoomStatisticsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetLiveRoomStatisticsRequest setLiveId(String liveId) {
        this.liveId = liveId;
        return this;
    }
    public String getLiveId() {
        return this.liveId;
    }

}
