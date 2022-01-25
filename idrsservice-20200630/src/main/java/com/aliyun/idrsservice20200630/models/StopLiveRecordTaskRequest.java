// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class StopLiveRecordTaskRequest extends TeaModel {
    @NameInMap("LiveId")
    public String liveId;

    @NameInMap("UserId")
    public String userId;

    public static StopLiveRecordTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        StopLiveRecordTaskRequest self = new StopLiveRecordTaskRequest();
        return TeaModel.build(map, self);
    }

    public StopLiveRecordTaskRequest setLiveId(String liveId) {
        this.liveId = liveId;
        return this;
    }
    public String getLiveId() {
        return this.liveId;
    }

    public StopLiveRecordTaskRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
