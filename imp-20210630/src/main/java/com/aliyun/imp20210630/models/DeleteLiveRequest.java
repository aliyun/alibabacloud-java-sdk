// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class DeleteLiveRequest extends TeaModel {
    @NameInMap("LiveId")
    public String liveId;

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

}
