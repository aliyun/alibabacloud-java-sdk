// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class CreateGameResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 游戏ID
    @NameInMap("GameId")
    public String gameId;

    public static CreateGameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateGameResponseBody self = new CreateGameResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateGameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateGameResponseBody setGameId(String gameId) {
        this.gameId = gameId;
        return this;
    }
    public String getGameId() {
        return this.gameId;
    }

}
