// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class ListGameVersionsRequest extends TeaModel {
    // 标记当前开始读取的位置，置空表示从头开始
    @NameInMap("NextToken")
    public String nextToken;

    // 本次读取的最大数据记录数量
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 游戏ID
    @NameInMap("GameId")
    public String gameId;

    public static ListGameVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGameVersionsRequest self = new ListGameVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListGameVersionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListGameVersionsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListGameVersionsRequest setGameId(String gameId) {
        this.gameId = gameId;
        return this;
    }
    public String getGameId() {
        return this.gameId;
    }

}
