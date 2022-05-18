// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class DescribeMeterImpWatchLiveTimeByLiveIdRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("LiveId")
    public String liveId;

    public static DescribeMeterImpWatchLiveTimeByLiveIdRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterImpWatchLiveTimeByLiveIdRequest self = new DescribeMeterImpWatchLiveTimeByLiveIdRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMeterImpWatchLiveTimeByLiveIdRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeMeterImpWatchLiveTimeByLiveIdRequest setLiveId(String liveId) {
        this.liveId = liveId;
        return this;
    }
    public String getLiveId() {
        return this.liveId;
    }

}
