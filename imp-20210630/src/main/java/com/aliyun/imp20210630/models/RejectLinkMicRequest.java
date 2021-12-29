// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class RejectLinkMicRequest extends TeaModel {
    // 会议唯一标识
    @NameInMap("ConferenceId")
    public String conferenceId;

    // 同意者用户ID
    @NameInMap("FromUserId")
    public String fromUserId;

    // 被同意用户ID
    @NameInMap("ToUserId")
    public String toUserId;

    public static RejectLinkMicRequest build(java.util.Map<String, ?> map) throws Exception {
        RejectLinkMicRequest self = new RejectLinkMicRequest();
        return TeaModel.build(map, self);
    }

    public RejectLinkMicRequest setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }
    public String getConferenceId() {
        return this.conferenceId;
    }

    public RejectLinkMicRequest setFromUserId(String fromUserId) {
        this.fromUserId = fromUserId;
        return this;
    }
    public String getFromUserId() {
        return this.fromUserId;
    }

    public RejectLinkMicRequest setToUserId(String toUserId) {
        this.toUserId = toUserId;
        return this;
    }
    public String getToUserId() {
        return this.toUserId;
    }

}
