// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class UpdateLiveRequest extends TeaModel {
    // 直播资源的唯一标识ID
    @NameInMap("LiveId")
    public String liveId;

    // 直播标题，支持中英文，最大长度256位
    @NameInMap("Title")
    public String title;

    // 直播简介，支持中英文，最大长度2048位
    @NameInMap("Introduction")
    public String introduction;

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

    public UpdateLiveRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public UpdateLiveRequest setIntroduction(String introduction) {
        this.introduction = introduction;
        return this;
    }
    public String getIntroduction() {
        return this.introduction;
    }

}
