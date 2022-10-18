// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class SetGameHangRequest extends TeaModel {
    @NameInMap("AccessKey")
    @Validation(required = true)
    public String accessKey;

    @NameInMap("Duration")
    @Validation(required = true)
    public Long duration;

    @NameInMap("GameSession")
    @Validation(required = true)
    public String gameSession;

    public static SetGameHangRequest build(java.util.Map<String, ?> map) throws Exception {
        SetGameHangRequest self = new SetGameHangRequest();
        return TeaModel.build(map, self);
    }

    public SetGameHangRequest setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    public String getAccessKey() {
        return this.accessKey;
    }

    public SetGameHangRequest setDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    public Long getDuration() {
        return this.duration;
    }

    public SetGameHangRequest setGameSession(String gameSession) {
        this.gameSession = gameSession;
        return this;
    }
    public String getGameSession() {
        return this.gameSession;
    }

}
