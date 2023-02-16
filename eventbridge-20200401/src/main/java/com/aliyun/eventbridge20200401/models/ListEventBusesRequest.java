// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListEventBusesRequest extends TeaModel {
    @NameInMap("Limit")
    public Integer limit;

    @NameInMap("NamePrefix")
    public String namePrefix;

    @NameInMap("NextToken")
    public String nextToken;

    public static ListEventBusesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEventBusesRequest self = new ListEventBusesRequest();
        return TeaModel.build(map, self);
    }

    public ListEventBusesRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListEventBusesRequest setNamePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
        return this;
    }
    public String getNamePrefix() {
        return this.namePrefix;
    }

    public ListEventBusesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
