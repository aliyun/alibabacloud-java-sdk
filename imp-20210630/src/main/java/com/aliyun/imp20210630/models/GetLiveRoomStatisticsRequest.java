// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class GetLiveRoomStatisticsRequest extends TeaModel {
    // 应用唯一标识，由6位小写字母、数字组成。
    @NameInMap("AppId")
    public String appId;

    // 直播ID。
    @NameInMap("LiveId")
    public String liveId;

    @NameInMap("RegionId")
    public String regionId;

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

    public GetLiveRoomStatisticsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
