// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class ListBoughtGamesResponseBody extends TeaModel {
    @NameInMap("Items")
    public java.util.List<ListBoughtGamesResponseBodyItems> items;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListBoughtGamesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBoughtGamesResponseBody self = new ListBoughtGamesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBoughtGamesResponseBody setItems(java.util.List<ListBoughtGamesResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListBoughtGamesResponseBodyItems> getItems() {
        return this.items;
    }

    public ListBoughtGamesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListBoughtGamesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListBoughtGamesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBoughtGamesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListBoughtGamesResponseBodyItems extends TeaModel {
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("GameId")
        public String gameId;

        @NameInMap("GameName")
        public String gameName;

        @NameInMap("StartTime")
        public Long startTime;

        public static ListBoughtGamesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListBoughtGamesResponseBodyItems self = new ListBoughtGamesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListBoughtGamesResponseBodyItems setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListBoughtGamesResponseBodyItems setGameId(String gameId) {
            this.gameId = gameId;
            return this;
        }
        public String getGameId() {
            return this.gameId;
        }

        public ListBoughtGamesResponseBodyItems setGameName(String gameName) {
            this.gameName = gameName;
            return this;
        }
        public String getGameName() {
            return this.gameName;
        }

        public ListBoughtGamesResponseBodyItems setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

}
