// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class ListGamesResponse extends TeaModel {
    @NameInMap("Count")
    @Validation(required = true)
    public Long count;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("MaxResults")
    @Validation(required = true)
    public Integer maxResults;

    @NameInMap("NextToken")
    @Validation(required = true)
    public String nextToken;

    @NameInMap("DataList")
    @Validation(required = true)
    public java.util.List<ListGamesResponseDataList> dataList;

    public static ListGamesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGamesResponse self = new ListGamesResponse();
        return TeaModel.build(map, self);
    }

    public ListGamesResponse setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public ListGamesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGamesResponse setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListGamesResponse setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListGamesResponse setDataList(java.util.List<ListGamesResponseDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<ListGamesResponseDataList> getDataList() {
        return this.dataList;
    }

    public static class ListGamesResponseDataList extends TeaModel {
        @NameInMap("PlatformType")
        @Validation(required = true)
        public Long platformType;

        @NameInMap("GameName")
        @Validation(required = true)
        public String gameName;

        @NameInMap("GameId")
        @Validation(required = true)
        public String gameId;

        public static ListGamesResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            ListGamesResponseDataList self = new ListGamesResponseDataList();
            return TeaModel.build(map, self);
        }

        public ListGamesResponseDataList setPlatformType(Long platformType) {
            this.platformType = platformType;
            return this;
        }
        public Long getPlatformType() {
            return this.platformType;
        }

        public ListGamesResponseDataList setGameName(String gameName) {
            this.gameName = gameName;
            return this;
        }
        public String getGameName() {
            return this.gameName;
        }

        public ListGamesResponseDataList setGameId(String gameId) {
            this.gameId = gameId;
            return this;
        }
        public String getGameId() {
            return this.gameId;
        }

    }

}
