// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DeleteAggregatorsRequest extends TeaModel {
    @NameInMap("AggregatorIds")
    public String aggregatorIds;

    @NameInMap("ClientToken")
    public String clientToken;

    public static DeleteAggregatorsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAggregatorsRequest self = new DeleteAggregatorsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAggregatorsRequest setAggregatorIds(String aggregatorIds) {
        this.aggregatorIds = aggregatorIds;
        return this;
    }
    public String getAggregatorIds() {
        return this.aggregatorIds;
    }

    public DeleteAggregatorsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
