// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712.models;

import com.aliyun.tea.*;

public class QueryHotelsRequest extends TeaModel {
    @NameInMap("body")
    public AgentBaseQuery body;

    public static QueryHotelsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryHotelsRequest self = new QueryHotelsRequest();
        return TeaModel.build(map, self);
    }

    public QueryHotelsRequest setBody(AgentBaseQuery body) {
        this.body = body;
        return this;
    }
    public AgentBaseQuery getBody() {
        return this.body;
    }

}
