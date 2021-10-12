// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class DeleteGameRequest extends TeaModel {
    @NameInMap("GameId")
    @Validation(required = true)
    public String gameId;

    public static DeleteGameRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteGameRequest self = new DeleteGameRequest();
        return TeaModel.build(map, self);
    }

    public DeleteGameRequest setGameId(String gameId) {
        this.gameId = gameId;
        return this;
    }
    public String getGameId() {
        return this.gameId;
    }

}
