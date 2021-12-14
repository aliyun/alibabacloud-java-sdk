// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class AgreeLinkMicRequest extends TeaModel {
    // 会议唯一标识
    @NameInMap("ConferenceId")
    public String conferenceId;

    // 同意者用户ID
    @NameInMap("FromUserId")
    public String fromUserId;

    // 地域
    @NameInMap("RegionId")
    public String regionId;

    // 被同意用户ID
    @NameInMap("ToUserId")
    public String toUserId;

    public static AgreeLinkMicRequest build(java.util.Map<String, ?> map) throws Exception {
        AgreeLinkMicRequest self = new AgreeLinkMicRequest();
        return TeaModel.build(map, self);
    }

    public AgreeLinkMicRequest setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }
    public String getConferenceId() {
        return this.conferenceId;
    }

    public AgreeLinkMicRequest setFromUserId(String fromUserId) {
        this.fromUserId = fromUserId;
        return this;
    }
    public String getFromUserId() {
        return this.fromUserId;
    }

    public AgreeLinkMicRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AgreeLinkMicRequest setToUserId(String toUserId) {
        this.toUserId = toUserId;
        return this;
    }
    public String getToUserId() {
        return this.toUserId;
    }

}
