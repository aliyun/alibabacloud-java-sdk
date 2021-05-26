// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class QueryAgentGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAgentGroupResponseBody body;

    public static QueryAgentGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAgentGroupResponse self = new QueryAgentGroupResponse();
        return TeaModel.build(map, self);
    }

    public QueryAgentGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAgentGroupResponse setBody(QueryAgentGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAgentGroupResponseBody getBody() {
        return this.body;
    }

}
