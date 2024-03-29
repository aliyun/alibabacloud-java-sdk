// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class UpdateLiveRequest extends TeaModel {
    @NameInMap("Introduction")
    public String introduction;

    @NameInMap("LiveId")
    public String liveId;

    @NameInMap("Title")
    public String title;

    public static UpdateLiveRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveRequest self = new UpdateLiveRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLiveRequest setIntroduction(String introduction) {
        this.introduction = introduction;
        return this;
    }
    public String getIntroduction() {
        return this.introduction;
    }

    public UpdateLiveRequest setLiveId(String liveId) {
        this.liveId = liveId;
        return this;
    }
    public String getLiveId() {
        return this.liveId;
    }

    public UpdateLiveRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
