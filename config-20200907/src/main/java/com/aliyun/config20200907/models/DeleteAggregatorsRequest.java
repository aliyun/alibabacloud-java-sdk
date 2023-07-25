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
     * <p>The client token that you want to use to ensure the idempotency of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
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
