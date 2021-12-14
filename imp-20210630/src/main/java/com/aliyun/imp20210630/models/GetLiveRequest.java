// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class GetLiveRequest extends TeaModel {
    // 直播资源的唯一标识ID
    @NameInMap("LiveId")
    public String liveId;

    @NameInMap("RegionId")
    public String regionId;

    public static GetLiveRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLiveRequest self = new GetLiveRequest();
        return TeaModel.build(map, self);
    }

    public GetLiveRequest setLiveId(String liveId) {
        this.liveId = liveId;
        return this;
    }
    public String getLiveId() {
        return this.liveId;
    }

    public GetLiveRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
