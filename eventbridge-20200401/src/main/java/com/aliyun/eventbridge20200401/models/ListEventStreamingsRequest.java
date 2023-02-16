// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListEventStreamingsRequest extends TeaModel {
    @NameInMap("Limit")
    public Long limit;

    @NameInMap("NamePrefix")
    public String namePrefix;

    @NameInMap("NextToken")
    public String nextToken;

    public static ListEventStreamingsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEventStreamingsRequest self = new ListEventStreamingsRequest();
        return TeaModel.build(map, self);
    }

    public ListEventStreamingsRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public ListEventStreamingsRequest setNamePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
        return this;
    }
    public String getNamePrefix() {
        return this.namePrefix;
    }

    public ListEventStreamingsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
