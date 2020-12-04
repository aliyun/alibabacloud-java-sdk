// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class ListBoughtGamesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("Items")
    @Validation(required = true)
    public java.util.List<ListBoughtGamesResponseItems> items;

    public static ListBoughtGamesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBoughtGamesResponse self = new ListBoughtGamesResponse();
        return TeaModel.build(map, self);
    }

    public ListBoughtGamesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBoughtGamesResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListBoughtGamesResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListBoughtGamesResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListBoughtGamesResponse setItems(java.util.List<ListBoughtGamesResponseItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListBoughtGamesResponseItems> getItems() {
        return this.items;
    }

    public static class ListBoughtGamesResponseItems extends TeaModel {
        @NameInMap("GameId")
        @Validation(required = true)
        public String gameId;

        @NameInMap("GameName")
        @Validation(required = true)
        public String gameName;

        @NameInMap("StartTime")
        @Validation(required = true)
        public Long startTime;

        @NameInMap("EndTime")
        @Validation(required = true)
        public Long endTime;

        public static ListBoughtGamesResponseItems build(java.util.Map<String, ?> map) throws Exception {
            ListBoughtGamesResponseItems self = new ListBoughtGamesResponseItems();
            return TeaModel.build(map, self);
        }

        public ListBoughtGamesResponseItems setGameId(String gameId) {
            this.gameId = gameId;
            return this;
        }
        public String getGameId() {
            return this.gameId;
        }

        public ListBoughtGamesResponseItems setGameName(String gameName) {
            this.gameName = gameName;
            return this;
        }
        public String getGameName() {
            return this.gameName;
        }

        public ListBoughtGamesResponseItems setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListBoughtGamesResponseItems setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

    }

}
