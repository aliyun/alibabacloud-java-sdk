// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class GetGameStockRequest extends TeaModel {
    @NameInMap("AccessKey")
    public String accessKey;

    @NameInMap("GameId")
    public String gameId;

    public static GetGameStockRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGameStockRequest self = new GetGameStockRequest();
        return TeaModel.build(map, self);
    }

    public GetGameStockRequest setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    public String getAccessKey() {
        return this.accessKey;
    }

    public GetGameStockRequest setGameId(String gameId) {
        this.gameId = gameId;
        return this;
    }
    public String getGameId() {
        return this.gameId;
    }

}
