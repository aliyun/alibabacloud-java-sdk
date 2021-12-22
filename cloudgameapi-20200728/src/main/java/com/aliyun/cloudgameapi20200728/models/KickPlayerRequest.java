// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class KickPlayerRequest extends TeaModel {
    @NameInMap("GameSession")
    public String gameSession;

    @NameInMap("KickedAccountId")
    public String kickedAccountId;

    public static KickPlayerRequest build(java.util.Map<String, ?> map) throws Exception {
        KickPlayerRequest self = new KickPlayerRequest();
        return TeaModel.build(map, self);
    }

    public KickPlayerRequest setGameSession(String gameSession) {
        this.gameSession = gameSession;
        return this;
    }
    public String getGameSession() {
        return this.gameSession;
    }

    public KickPlayerRequest setKickedAccountId(String kickedAccountId) {
        this.kickedAccountId = kickedAccountId;
        return this;
    }
    public String getKickedAccountId() {
        return this.kickedAccountId;
    }

}
