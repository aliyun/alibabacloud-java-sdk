// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class GetGameStockRequest extends TeaModel {
    @NameInMap("GameId")
    @Validation(required = true)
    public String gameId;

    @NameInMap("AccessKey")
    @Validation(required = true)
    public String accessKey;

    @NameInMap("UserLevel")
    public Long userLevel;

    public static GetGameStockRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGameStockRequest self = new GetGameStockRequest();
        return TeaModel.build(map, self);
    }

    public GetGameStockRequest setGameId(String gameId) {
        this.gameId = gameId;
        return this;
    }
    public String getGameId() {
        return this.gameId;
    }

    public GetGameStockRequest setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    public String getAccessKey() {
        return this.accessKey;
    }

    public GetGameStockRequest setUserLevel(Long userLevel) {
        this.userLevel = userLevel;
        return this;
    }
    public Long getUserLevel() {
        return this.userLevel;
    }

}
