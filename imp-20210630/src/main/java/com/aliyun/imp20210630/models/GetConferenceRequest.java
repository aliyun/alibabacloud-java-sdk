// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class GetConferenceRequest extends TeaModel {
    // 会议资源唯一标识。
    @NameInMap("ConferenceId")
    public String conferenceId;

    public static GetConferenceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetConferenceRequest self = new GetConferenceRequest();
        return TeaModel.build(map, self);
    }

    public GetConferenceRequest setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }
    public String getConferenceId() {
        return this.conferenceId;
    }

}
