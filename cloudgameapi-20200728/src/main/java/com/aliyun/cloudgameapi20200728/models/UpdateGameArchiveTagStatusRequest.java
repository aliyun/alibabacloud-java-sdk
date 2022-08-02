// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class UpdateGameArchiveTagStatusRequest extends TeaModel {
    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("ArchiveId")
    public String archiveId;

    @NameInMap("GameId")
    public String gameId;

    @NameInMap("TagStatus")
    public Integer tagStatus;

    public static UpdateGameArchiveTagStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGameArchiveTagStatusRequest self = new UpdateGameArchiveTagStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGameArchiveTagStatusRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public UpdateGameArchiveTagStatusRequest setArchiveId(String archiveId) {
        this.archiveId = archiveId;
        return this;
    }
    public String getArchiveId() {
        return this.archiveId;
    }

    public UpdateGameArchiveTagStatusRequest setGameId(String gameId) {
        this.gameId = gameId;
        return this;
    }
    public String getGameId() {
        return this.gameId;
    }

    public UpdateGameArchiveTagStatusRequest setTagStatus(Integer tagStatus) {
        this.tagStatus = tagStatus;
        return this;
    }
    public Integer getTagStatus() {
        return this.tagStatus;
    }

}
