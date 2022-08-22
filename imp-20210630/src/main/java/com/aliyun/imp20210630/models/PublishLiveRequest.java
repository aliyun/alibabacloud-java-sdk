// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class PublishLiveRequest extends TeaModel {
    @NameInMap("LiveId")
    public String liveId;

    @NameInMap("UserId")
    public String userId;

    public static PublishLiveRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishLiveRequest self = new PublishLiveRequest();
        return TeaModel.build(map, self);
    }

    public PublishLiveRequest setLiveId(String liveId) {
        this.liveId = liveId;
        return this;
    }
    public String getLiveId() {
        return this.liveId;
    }

    public PublishLiveRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
