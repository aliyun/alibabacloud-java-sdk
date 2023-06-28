// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ListFunctionVersionsRequest extends TeaModel {
    @NameInMap("direction")
    public String direction;

    @NameInMap("limit")
    public Integer limit;

    @NameInMap("nextToken")
    public String nextToken;

    public static ListFunctionVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFunctionVersionsRequest self = new ListFunctionVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListFunctionVersionsRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public ListFunctionVersionsRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListFunctionVersionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
