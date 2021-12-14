// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class DeleteLiveRequest extends TeaModel {
    // 直播资源的唯一标识ID
    @NameInMap("LiveId")
    public String liveId;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteLiveRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveRequest self = new DeleteLiveRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLiveRequest setLiveId(String liveId) {
        this.liveId = liveId;
        return this;
    }
    public String getLiveId() {
        return this.liveId;
    }

    public DeleteLiveRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
