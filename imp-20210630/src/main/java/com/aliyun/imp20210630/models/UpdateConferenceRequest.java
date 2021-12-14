// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class UpdateConferenceRequest extends TeaModel {
    // 会议唯一标识
    @NameInMap("ConferenceId")
    public String conferenceId;

    // 地域
    @NameInMap("RegionId")
    public String regionId;

    // 会议标题
    @NameInMap("Title")
    public String title;

    public static UpdateConferenceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateConferenceRequest self = new UpdateConferenceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateConferenceRequest setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }
    public String getConferenceId() {
        return this.conferenceId;
    }

    public UpdateConferenceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateConferenceRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
