// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class ListGamesResponseBody extends TeaModel {
    @NameInMap("Count")
    public Long count;

    @NameInMap("DataList")
    public java.util.List<ListGamesResponseBodyDataList> dataList;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    public static ListGamesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGamesResponseBody self = new ListGamesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGamesResponseBody setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public ListGamesResponseBody setDataList(java.util.List<ListGamesResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<ListGamesResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public ListGamesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListGamesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListGamesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListGamesResponseBodyDataList extends TeaModel {
        @NameInMap("GameId")
        public String gameId;

        @NameInMap("GameName")
        public String gameName;

        @NameInMap("PlatformType")
        public Long platformType;

        public static ListGamesResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListGamesResponseBodyDataList self = new ListGamesResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListGamesResponseBodyDataList setGameId(String gameId) {
            this.gameId = gameId;
            return this;
        }
        public String getGameId() {
            return this.gameId;
        }

        public ListGamesResponseBodyDataList setGameName(String gameName) {
            this.gameName = gameName;
            return this;
        }
        public String getGameName() {
            return this.gameName;
        }

        public ListGamesResponseBodyDataList setPlatformType(Long platformType) {
            this.platformType = platformType;
            return this;
        }
        public Long getPlatformType() {
            return this.platformType;
        }

    }

}
