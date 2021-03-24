// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class ResultUserMuteSettingsValue extends TeaModel {
    @NameInMap("Mute")
    public Boolean mute;

    @NameInMap("ExpireTime")
    public Long expireTime;

    public static ResultUserMuteSettingsValue build(java.util.Map<String, ?> map) throws Exception {
        ResultUserMuteSettingsValue self = new ResultUserMuteSettingsValue();
        return TeaModel.build(map, self);
    }

    public ResultUserMuteSettingsValue setMute(Boolean mute) {
        this.mute = mute;
        return this;
    }
    public Boolean getMute() {
        return this.mute;
    }

    public ResultUserMuteSettingsValue setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Long getExpireTime() {
        return this.expireTime;
    }

}
