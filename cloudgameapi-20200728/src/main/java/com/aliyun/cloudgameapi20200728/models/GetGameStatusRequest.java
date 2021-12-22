// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class GetGameStatusRequest extends TeaModel {
    @NameInMap("GameSession")
    public String gameSession;

    public static GetGameStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGameStatusRequest self = new GetGameStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetGameStatusRequest setGameSession(String gameSession) {
        this.gameSession = gameSession;
        return this;
    }
    public String getGameSession() {
        return this.gameSession;
    }

}
