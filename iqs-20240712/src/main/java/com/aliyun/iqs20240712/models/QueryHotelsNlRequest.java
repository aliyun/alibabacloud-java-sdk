// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712.models;

import com.aliyun.tea.*;

public class QueryHotelsNlRequest extends TeaModel {
    @NameInMap("body")
    public AgentBaseQuery body;

    public static QueryHotelsNlRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryHotelsNlRequest self = new QueryHotelsNlRequest();
        return TeaModel.build(map, self);
    }

    public QueryHotelsNlRequest setBody(AgentBaseQuery body) {
        this.body = body;
        return this;
    }
    public AgentBaseQuery getBody() {
        return this.body;
    }

}
