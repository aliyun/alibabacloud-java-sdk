// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListServiceVersionsRequest extends TeaModel {
    // 排序方向
    @NameInMap("direction")
    public String direction;

    // 最多返回个数
    @NameInMap("limit")
    public Integer limit;

    // 下次查询token
    @NameInMap("nextToken")
    public String nextToken;

    // 起始key
    @NameInMap("startKey")
    public String startKey;

    public static ListServiceVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServiceVersionsRequest self = new ListServiceVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListServiceVersionsRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public ListServiceVersionsRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListServiceVersionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServiceVersionsRequest setStartKey(String startKey) {
        this.startKey = startKey;
        return this;
    }
    public String getStartKey() {
        return this.startKey;
    }

}
