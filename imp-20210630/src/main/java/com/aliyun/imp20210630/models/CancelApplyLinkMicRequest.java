// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class CancelApplyLinkMicRequest extends TeaModel {
    // 会议唯一标识
    @NameInMap("ConferenceId")
    public String conferenceId;

    // 地域
    @NameInMap("RegionId")
    public String regionId;

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

    public CancelApplyLinkMicRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CancelApplyLinkMicRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
