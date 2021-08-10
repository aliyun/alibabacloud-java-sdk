// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class ApplyLinkMicRequest extends TeaModel {
    // 会议唯一标识
    @NameInMap("ConferenceId")
    public String conferenceId;

    // 申请连麦用户
    @NameInMap("UserId")
    public String userId;

    public static ApplyLinkMicRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyLinkMicRequest self = new ApplyLinkMicRequest();
        return TeaModel.build(map, self);
    }

    public ApplyLinkMicRequest setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }
    public String getConferenceId() {
        return this.conferenceId;
    }

    public ApplyLinkMicRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
