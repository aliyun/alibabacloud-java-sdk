// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListAggregateResourcesByAdvancedSearchRequest extends TeaModel {
    @NameInMap("AggregatorId")
    public String aggregatorId;

    @NameInMap("Sql")
    public String sql;

    public static ListAggregateResourcesByAdvancedSearchRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAggregateResourcesByAdvancedSearchRequest self = new ListAggregateResourcesByAdvancedSearchRequest();
        return TeaModel.build(map, self);
    }

    public ListAggregateResourcesByAdvancedSearchRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    public ListAggregateResourcesByAdvancedSearchRequest setSql(String sql) {
        this.sql = sql;
        return this;
    }
    public String getSql() {
        return this.sql;
    }

}
