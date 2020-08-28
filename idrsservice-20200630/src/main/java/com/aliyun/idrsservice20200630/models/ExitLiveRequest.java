// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class ExitLiveRequest extends TeaModel {
    @NameInMap("Channel")
    @Validation(required = true)
    public String channel;

    @NameInMap("UserId")
    @Validation(required = true)
    public String userId;

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

}
