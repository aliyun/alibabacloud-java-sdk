// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class ListGamesResponseBody extends TeaModel {
    // 总记录数
    @NameInMap("Count")
    public Long count;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 本次请求所返回的最大记录条数
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 数据列表
    @NameInMap("DataList")
    public java.util.List<ListGamesResponseBodyDataList> dataList;

    // 表示当前调用返回读取到的位置，空代表数据已经读取完毕
    @NameInMap("NextToken")
    public String nextToken;

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

    public ListGamesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGamesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListGamesResponseBody setDataList(java.util.List<ListGamesResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<ListGamesResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public ListGamesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public static class ListGamesResponseBodyDataList extends TeaModel {
        // 平台类型
        @NameInMap("PlatformType")
        public Long platformType;

        // 游戏名称
        @NameInMap("GameName")
        public String gameName;

        // 游戏ID
        @NameInMap("GameId")
        public String gameId;

        public static ListGamesResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListGamesResponseBodyDataList self = new ListGamesResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListGamesResponseBodyDataList setPlatformType(Long platformType) {
            this.platformType = platformType;
            return this;
        }
        public Long getPlatformType() {
            return this.platformType;
        }

        public ListGamesResponseBodyDataList setGameName(String gameName) {
            this.gameName = gameName;
            return this;
        }
        public String getGameName() {
            return this.gameName;
        }

        public ListGamesResponseBodyDataList setGameId(String gameId) {
            this.gameId = gameId;
            return this;
        }
        public String getGameId() {
            return this.gameId;
        }

    }

}
