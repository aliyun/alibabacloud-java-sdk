// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyiotapi20171111.models;

import com.aliyun.tea.*;

public class QueryCardFlowInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryCardFlowInfoResponseBody body;

    public static QueryCardFlowInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCardFlowInfoResponse self = new QueryCardFlowInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryCardFlowInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCardFlowInfoResponse setBody(QueryCardFlowInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCardFlowInfoResponseBody getBody() {
        return this.body;
    }

}
