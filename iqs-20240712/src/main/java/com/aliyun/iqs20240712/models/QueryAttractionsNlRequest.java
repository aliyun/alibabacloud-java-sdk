// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712.models;

import com.aliyun.tea.*;

public class QueryAttractionsNlRequest extends TeaModel {
    @NameInMap("body")
    public AgentBaseQuery body;

    public static QueryAttractionsNlRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAttractionsNlRequest self = new QueryAttractionsNlRequest();
        return TeaModel.build(map, self);
    }

    public QueryAttractionsNlRequest setBody(AgentBaseQuery body) {
        this.body = body;
        return this;
    }
    public AgentBaseQuery getBody() {
        return this.body;
    }

}
