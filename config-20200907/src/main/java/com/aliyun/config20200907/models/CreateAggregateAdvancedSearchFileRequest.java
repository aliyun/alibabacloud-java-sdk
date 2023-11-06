// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CreateAggregateAdvancedSearchFileRequest extends TeaModel {
    /**
     * <p>The ID of the account group.</p>
     * <br>
     * <p>For more information about how to obtain the ID of an account group, see [ListAggregators](~~255797~~).</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

    /**
     * <p>The SQL statement used to query resources.</p>
     */
    @NameInMap("Sql")
    public String sql;

    public static CreateAggregateAdvancedSearchFileRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAggregateAdvancedSearchFileRequest self = new CreateAggregateAdvancedSearchFileRequest();
        return TeaModel.build(map, self);
    }

    public CreateAggregateAdvancedSearchFileRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    public CreateAggregateAdvancedSearchFileRequest setSql(String sql) {
        this.sql = sql;
        return this;
    }
    public String getSql() {
        return this.sql;
    }

}
