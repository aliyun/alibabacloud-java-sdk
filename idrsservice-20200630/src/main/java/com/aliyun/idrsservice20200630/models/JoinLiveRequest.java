// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class JoinLiveRequest extends TeaModel {
    @NameInMap("Channel")
    public String channel;

    @NameInMap("RtcCode")
    public String rtcCode;

    @NameInMap("UserId")
    public String userId;

    public static JoinLiveRequest build(java.util.Map<String, ?> map) throws Exception {
        JoinLiveRequest self = new JoinLiveRequest();
        return TeaModel.build(map, self);
    }

    public JoinLiveRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public JoinLiveRequest setRtcCode(String rtcCode) {
        this.rtcCode = rtcCode;
        return this;
    }
    public String getRtcCode() {
        return this.rtcCode;
    }

    public JoinLiveRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
