// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class RestoreGameArchiveRequest extends TeaModel {
    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("ArchiveId")
    public String archiveId;

    @NameInMap("GameId")
    public String gameId;

    public static RestoreGameArchiveRequest build(java.util.Map<String, ?> map) throws Exception {
        RestoreGameArchiveRequest self = new RestoreGameArchiveRequest();
        return TeaModel.build(map, self);
    }

    public RestoreGameArchiveRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public RestoreGameArchiveRequest setArchiveId(String archiveId) {
        this.archiveId = archiveId;
        return this;
    }
    public String getArchiveId() {
        return this.archiveId;
    }

    public RestoreGameArchiveRequest setGameId(String gameId) {
        this.gameId = gameId;
        return this;
    }
    public String getGameId() {
        return this.gameId;
    }

}
