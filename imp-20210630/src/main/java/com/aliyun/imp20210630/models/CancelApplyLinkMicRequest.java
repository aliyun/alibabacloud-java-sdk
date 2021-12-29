// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class CancelApplyLinkMicRequest extends TeaModel {
    // 会议唯一标识
    @NameInMap("ConferenceId")
    public String conferenceId;

    // 申请连麦用户
    @NameInMap("UserId")
    public String userId;

    public static CancelApplyLinkMicRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelApplyLinkMicRequest self = new CancelApplyLinkMicRequest();
        return TeaModel.build(map, self);
    }

    public CancelApplyLinkMicRequest setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }
    public String getConferenceId() {
        return this.conferenceId;
    }

    public CancelApplyLinkMicRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
