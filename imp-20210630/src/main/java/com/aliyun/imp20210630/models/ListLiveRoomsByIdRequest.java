// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class ListLiveRoomsByIdRequest extends TeaModel {
    // 应用唯一标识，由6位小写字母、数字组成。
    @NameInMap("AppId")
    public String appId;

    // 直播ID列表。
    @NameInMap("LiveIdList")
    public java.util.List<String> liveIdList;

    public static ListLiveRoomsByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLiveRoomsByIdRequest self = new ListLiveRoomsByIdRequest();
        return TeaModel.build(map, self);
    }

    public ListLiveRoomsByIdRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListLiveRoomsByIdRequest setLiveIdList(java.util.List<String> liveIdList) {
        this.liveIdList = liveIdList;
        return this;
    }
    public java.util.List<String> getLiveIdList() {
        return this.liveIdList;
    }

}
