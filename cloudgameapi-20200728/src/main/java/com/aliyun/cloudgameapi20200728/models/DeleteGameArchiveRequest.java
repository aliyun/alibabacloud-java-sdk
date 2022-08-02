// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class DeleteGameArchiveRequest extends TeaModel {
    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("ArchiveId")
    public String archiveId;

    @NameInMap("GameId")
    public String gameId;

    public static DeleteGameArchiveRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteGameArchiveRequest self = new DeleteGameArchiveRequest();
        return TeaModel.build(map, self);
    }

    public DeleteGameArchiveRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public DeleteGameArchiveRequest setArchiveId(String archiveId) {
        this.archiveId = archiveId;
        return this;
    }
    public String getArchiveId() {
        return this.archiveId;
    }

    public DeleteGameArchiveRequest setGameId(String gameId) {
        this.gameId = gameId;
        return this;
    }
    public String getGameId() {
        return this.gameId;
    }

}
