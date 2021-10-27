// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class AddMemberRequest extends TeaModel {
    // 会议唯一标识
    @NameInMap("ConferenceId")
    public String conferenceId;

    // 邀请者用户ID
    @NameInMap("FromUserId")
    public String fromUserId;

    // 被邀请用户ID
    @NameInMap("ToUserId")
    public String toUserId;

    public static AddMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        AddMemberRequest self = new AddMemberRequest();
        return TeaModel.build(map, self);
    }

    public AddMemberRequest setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }
    public String getConferenceId() {
        return this.conferenceId;
    }

    public AddMemberRequest setFromUserId(String fromUserId) {
        this.fromUserId = fromUserId;
        return this;
    }
    public String getFromUserId() {
        return this.fromUserId;
    }

    public AddMemberRequest setToUserId(String toUserId) {
        this.toUserId = toUserId;
        return this;
    }
    public String getToUserId() {
        return this.toUserId;
    }

}
