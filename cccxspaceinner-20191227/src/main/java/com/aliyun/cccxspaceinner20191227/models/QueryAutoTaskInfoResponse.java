// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class QueryAutoTaskInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAutoTaskInfoResponseBody body;

    public static QueryAutoTaskInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAutoTaskInfoResponse self = new QueryAutoTaskInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryAutoTaskInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAutoTaskInfoResponse setBody(QueryAutoTaskInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAutoTaskInfoResponseBody getBody() {
        return this.body;
    }

}
