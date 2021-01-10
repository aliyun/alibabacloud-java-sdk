// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class ExitLiveRequest extends TeaModel {
    @NameInMap("Channel")
    public String channel;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("RtcCode")
    public String rtcCode;

    public static ExitLiveRequest build(java.util.Map<String, ?> map) throws Exception {
        ExitLiveRequest self = new ExitLiveRequest();
        return TeaModel.build(map, self);
    }

    public ExitLiveRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public ExitLiveRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public ExitLiveRequest setRtcCode(String rtcCode) {
        this.rtcCode = rtcCode;
        return this;
    }
    public String getRtcCode() {
        return this.rtcCode;
    }

}
