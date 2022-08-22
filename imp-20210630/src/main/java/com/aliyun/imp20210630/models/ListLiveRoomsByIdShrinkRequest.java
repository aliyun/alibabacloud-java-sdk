// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class ListLiveRoomsByIdShrinkRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("LiveIdList")
    public String liveIdListShrink;

    public static ListLiveRoomsByIdShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLiveRoomsByIdShrinkRequest self = new ListLiveRoomsByIdShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListLiveRoomsByIdShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListLiveRoomsByIdShrinkRequest setLiveIdListShrink(String liveIdListShrink) {
        this.liveIdListShrink = liveIdListShrink;
        return this;
    }
    public String getLiveIdListShrink() {
        return this.liveIdListShrink;
    }

}
