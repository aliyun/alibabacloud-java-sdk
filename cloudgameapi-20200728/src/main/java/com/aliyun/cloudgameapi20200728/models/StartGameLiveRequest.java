// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class StartGameLiveRequest extends TeaModel {
    @NameInMap("Extension")
    public String extension;

    @NameInMap("GameSession")
    @Validation(required = true)
    public String gameSession;

    @NameInMap("VideoPushAddress")
    @Validation(required = true)
    public String videoPushAddress;

    public static StartGameLiveRequest build(java.util.Map<String, ?> map) throws Exception {
        StartGameLiveRequest self = new StartGameLiveRequest();
        return TeaModel.build(map, self);
    }

    public StartGameLiveRequest setExtension(String extension) {
        this.extension = extension;
        return this;
    }
    public String getExtension() {
        return this.extension;
    }

    public StartGameLiveRequest setGameSession(String gameSession) {
        this.gameSession = gameSession;
        return this;
    }
    public String getGameSession() {
        return this.gameSession;
    }

    public StartGameLiveRequest setVideoPushAddress(String videoPushAddress) {
        this.videoPushAddress = videoPushAddress;
        return this;
    }
    public String getVideoPushAddress() {
        return this.videoPushAddress;
    }

}
