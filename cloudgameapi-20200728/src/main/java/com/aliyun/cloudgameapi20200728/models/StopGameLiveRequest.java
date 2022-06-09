// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class StopGameLiveRequest extends TeaModel {
    @NameInMap("GameSession")
    public String gameSession;

    public static StopGameLiveRequest build(java.util.Map<String, ?> map) throws Exception {
        StopGameLiveRequest self = new StopGameLiveRequest();
        return TeaModel.build(map, self);
    }

    public StopGameLiveRequest setGameSession(String gameSession) {
        this.gameSession = gameSession;
        return this;
    }
    public String getGameSession() {
        return this.gameSession;
    }

}
