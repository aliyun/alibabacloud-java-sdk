// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class CreateGameResponse extends TeaModel {
    @NameInMap("GameId")
    @Validation(required = true)
    public String gameId;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static CreateGameResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGameResponse self = new CreateGameResponse();
        return TeaModel.build(map, self);
    }

    public CreateGameResponse setGameId(String gameId) {
        this.gameId = gameId;
        return this;
    }
    public String getGameId() {
        return this.gameId;
    }

    public CreateGameResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
