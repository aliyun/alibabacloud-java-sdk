// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListReservedCapacitiesRequest extends TeaModel {
    // The maximum number of resources to return. Valid values: \[1, 100].
    @NameInMap("limit")
    public String limit;

    // The token that is required for pagination.
    @NameInMap("nextToken")
    public String nextToken;

    public static ListReservedCapacitiesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListReservedCapacitiesRequest self = new ListReservedCapacitiesRequest();
        return TeaModel.build(map, self);
    }

    public ListReservedCapacitiesRequest setLimit(String limit) {
        this.limit = limit;
        return this;
    }
    public String getLimit() {
        return this.limit;
    }

    public ListReservedCapacitiesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
