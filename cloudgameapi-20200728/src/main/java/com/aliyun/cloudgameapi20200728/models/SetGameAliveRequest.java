// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class SetGameAliveRequest extends TeaModel {
    @NameInMap("AccessKey")
    public String accessKey;

    @NameInMap("GameSession")
    public String gameSession;

    @NameInMap("KeepAlive")
    public Long keepAlive;

    public static SetGameAliveRequest build(java.util.Map<String, ?> map) throws Exception {
        SetGameAliveRequest self = new SetGameAliveRequest();
        return TeaModel.build(map, self);
    }

    public SetGameAliveRequest setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    public String getAccessKey() {
        return this.accessKey;
    }

    public SetGameAliveRequest setGameSession(String gameSession) {
        this.gameSession = gameSession;
        return this;
    }
    public String getGameSession() {
        return this.gameSession;
    }

    public SetGameAliveRequest setKeepAlive(Long keepAlive) {
        this.keepAlive = keepAlive;
        return this;
    }
    public Long getKeepAlive() {
        return this.keepAlive;
    }

}
