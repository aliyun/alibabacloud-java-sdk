// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class QueryGameHangRequest extends TeaModel {
    @NameInMap("AccessKey")
    public String accessKey;

    @NameInMap("GameSession")
    public String gameSession;

    public static QueryGameHangRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryGameHangRequest self = new QueryGameHangRequest();
        return TeaModel.build(map, self);
    }

    public QueryGameHangRequest setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    public String getAccessKey() {
        return this.accessKey;
    }

    public QueryGameHangRequest setGameSession(String gameSession) {
        this.gameSession = gameSession;
        return this;
    }
    public String getGameSession() {
        return this.gameSession;
    }

}
