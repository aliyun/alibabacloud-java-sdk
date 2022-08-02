// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class ListLatestGameArchiveRequest extends TeaModel {
    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("GameId")
    public String gameId;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("TagStatus")
    public Long tagStatus;

    public static ListLatestGameArchiveRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLatestGameArchiveRequest self = new ListLatestGameArchiveRequest();
        return TeaModel.build(map, self);
    }

    public ListLatestGameArchiveRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public ListLatestGameArchiveRequest setGameId(String gameId) {
        this.gameId = gameId;
        return this;
    }
    public String getGameId() {
        return this.gameId;
    }

    public ListLatestGameArchiveRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListLatestGameArchiveRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListLatestGameArchiveRequest setTagStatus(Long tagStatus) {
        this.tagStatus = tagStatus;
        return this;
    }
    public Long getTagStatus() {
        return this.tagStatus;
    }

}
