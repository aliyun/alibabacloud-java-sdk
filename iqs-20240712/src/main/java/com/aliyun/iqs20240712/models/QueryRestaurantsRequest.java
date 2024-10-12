// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712.models;

import com.aliyun.tea.*;

public class QueryRestaurantsRequest extends TeaModel {
    @NameInMap("body")
    public AgentBaseQuery body;

    public static QueryRestaurantsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRestaurantsRequest self = new QueryRestaurantsRequest();
        return TeaModel.build(map, self);
    }

    public QueryRestaurantsRequest setBody(AgentBaseQuery body) {
        this.body = body;
        return this;
    }
    public AgentBaseQuery getBody() {
        return this.body;
    }

}
