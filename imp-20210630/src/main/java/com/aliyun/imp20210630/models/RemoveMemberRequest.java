// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class RemoveMemberRequest extends TeaModel {
    @NameInMap("ConferenceId")
    public String conferenceId;

    @NameInMap("FromUserId")
    public String fromUserId;

    @NameInMap("ToUserId")
    public String toUserId;

    public static RemoveMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveMemberRequest self = new RemoveMemberRequest();
        return TeaModel.build(map, self);
    }

    public RemoveMemberRequest setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }
    public String getConferenceId() {
        return this.conferenceId;
    }

    public RemoveMemberRequest setFromUserId(String fromUserId) {
        this.fromUserId = fromUserId;
        return this;
    }
    public String getFromUserId() {
        return this.fromUserId;
    }

    public RemoveMemberRequest setToUserId(String toUserId) {
        this.toUserId = toUserId;
        return this;
    }
    public String getToUserId() {
        return this.toUserId;
    }

}
