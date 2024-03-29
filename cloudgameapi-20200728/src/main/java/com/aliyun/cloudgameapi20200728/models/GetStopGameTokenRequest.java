// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class GetStopGameTokenRequest extends TeaModel {
    @NameInMap("AccessKey")
    @Validation(required = true)
    public String accessKey;

    @NameInMap("GameId")
    @Validation(required = true)
    public String gameId;

    public static GetStopGameTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStopGameTokenRequest self = new GetStopGameTokenRequest();
        return TeaModel.build(map, self);
    }

    public GetStopGameTokenRequest setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    public String getAccessKey() {
        return this.accessKey;
    }

    public GetStopGameTokenRequest setGameId(String gameId) {
        this.gameId = gameId;
        return this;
    }
    public String getGameId() {
        return this.gameId;
    }

}
