// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class QueryManagedAgentGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryManagedAgentGroupResponseBody body;

    public static QueryManagedAgentGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryManagedAgentGroupResponse self = new QueryManagedAgentGroupResponse();
        return TeaModel.build(map, self);
    }

    public QueryManagedAgentGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryManagedAgentGroupResponse setBody(QueryManagedAgentGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryManagedAgentGroupResponseBody getBody() {
        return this.body;
    }

}
