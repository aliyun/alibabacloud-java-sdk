// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListTaggedResourcesRequest extends TeaModel {
    @NameInMap("limit")
    public Integer limit;

    @NameInMap("nextToken")
    public String nextToken;

    public static ListTaggedResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTaggedResourcesRequest self = new ListTaggedResourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListTaggedResourcesRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListTaggedResourcesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
