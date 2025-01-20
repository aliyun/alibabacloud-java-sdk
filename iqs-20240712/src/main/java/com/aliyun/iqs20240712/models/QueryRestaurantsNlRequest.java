// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712.models;

import com.aliyun.tea.*;

public class QueryRestaurantsNlRequest extends TeaModel {
    @NameInMap("body")
    public AgentBaseQuery body;

    public static QueryRestaurantsNlRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRestaurantsNlRequest self = new QueryRestaurantsNlRequest();
        return TeaModel.build(map, self);
    }

    public QueryRestaurantsNlRequest setBody(AgentBaseQuery body) {
        this.body = body;
        return this;
    }
    public AgentBaseQuery getBody() {
        return this.body;
    }

}
