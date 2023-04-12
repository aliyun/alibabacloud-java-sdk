// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DeleteAggregatorsRequest extends TeaModel {
    /**
     * <p>The ID of the account group. Separate multiple IDs with commas (,).</p>
     */
    @NameInMap("AggregatorIds")
    public String aggregatorIds;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. ClientToken can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     */
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
