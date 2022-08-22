// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class DeleteLiveFilesByIdRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("LiveId")
    public String liveId;

    public static DeleteLiveFilesByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveFilesByIdRequest self = new DeleteLiveFilesByIdRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLiveFilesByIdRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteLiveFilesByIdRequest setLiveId(String liveId) {
        this.liveId = liveId;
        return this;
    }
    public String getLiveId() {
        return this.liveId;
    }

}
