// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712.models;

import com.aliyun.tea.*;

public class QueryAttractionsRequest extends TeaModel {
    @NameInMap("body")
    public AgentBaseQuery body;

    public static QueryAttractionsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAttractionsRequest self = new QueryAttractionsRequest();
        return TeaModel.build(map, self);
    }

    public QueryAttractionsRequest setBody(AgentBaseQuery body) {
        this.body = body;
        return this;
    }
    public AgentBaseQuery getBody() {
        return this.body;
    }

}
