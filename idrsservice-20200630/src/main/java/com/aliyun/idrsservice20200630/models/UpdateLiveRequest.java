// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class UpdateLiveRequest extends TeaModel {
    @NameInMap("LiveId")
    @Validation(required = true)
    public String liveId;

    @NameInMap("Status")
    @Validation(required = true)
    public String status;

    @NameInMap("UserId")
    @Validation(required = true)
    public String userId;

    public static UpdateLiveRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveRequest self = new UpdateLiveRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLiveRequest setLiveId(String liveId) {
        this.liveId = liveId;
        return this;
    }
    public String getLiveId() {
        return this.liveId;
    }

    public UpdateLiveRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateLiveRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
