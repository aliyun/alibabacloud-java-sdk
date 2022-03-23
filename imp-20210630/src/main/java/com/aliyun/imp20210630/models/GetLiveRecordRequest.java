// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class GetLiveRecordRequest extends TeaModel {
    // 应用唯一标识，由6位小写字母、数字组成。
    @NameInMap("AppId")
    public String appId;

    // 直播唯一标识，由调用CreateLiveRoom返回。
    @NameInMap("LiveId")
    public String liveId;

    // 操作人用户ID。
    @NameInMap("UserId")
    public String userId;

    public static GetLiveRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLiveRecordRequest self = new GetLiveRecordRequest();
        return TeaModel.build(map, self);
    }

    public GetLiveRecordRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetLiveRecordRequest setLiveId(String liveId) {
        this.liveId = liveId;
        return this;
    }
    public String getLiveId() {
        return this.liveId;
    }

    public GetLiveRecordRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
