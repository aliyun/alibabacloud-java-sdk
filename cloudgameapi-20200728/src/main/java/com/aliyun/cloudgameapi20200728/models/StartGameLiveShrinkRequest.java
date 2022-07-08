// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class StartGameLiveShrinkRequest extends TeaModel {
    @NameInMap("Extension")
    public String extensionShrink;

    @NameInMap("GameSession")
    public String gameSession;

    @NameInMap("VideoPushAddress")
    public String videoPushAddress;

    public static StartGameLiveShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        StartGameLiveShrinkRequest self = new StartGameLiveShrinkRequest();
        return TeaModel.build(map, self);
    }

    public StartGameLiveShrinkRequest setExtensionShrink(String extensionShrink) {
        this.extensionShrink = extensionShrink;
        return this;
    }
    public String getExtensionShrink() {
        return this.extensionShrink;
    }

    public StartGameLiveShrinkRequest setGameSession(String gameSession) {
        this.gameSession = gameSession;
        return this;
    }
    public String getGameSession() {
        return this.gameSession;
    }

    public StartGameLiveShrinkRequest setVideoPushAddress(String videoPushAddress) {
        this.videoPushAddress = videoPushAddress;
        return this;
    }
    public String getVideoPushAddress() {
        return this.videoPushAddress;
    }

}
