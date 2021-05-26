// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class QueryAgentGroupByBuIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAgentGroupByBuIdResponseBody body;

    public static QueryAgentGroupByBuIdResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAgentGroupByBuIdResponse self = new QueryAgentGroupByBuIdResponse();
        return TeaModel.build(map, self);
    }

    public QueryAgentGroupByBuIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAgentGroupByBuIdResponse setBody(QueryAgentGroupByBuIdResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAgentGroupByBuIdResponseBody getBody() {
        return this.body;
    }

}
