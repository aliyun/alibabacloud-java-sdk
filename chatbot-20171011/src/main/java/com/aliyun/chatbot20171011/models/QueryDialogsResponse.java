// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class QueryDialogsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDialogsResponseBody body;

    public static QueryDialogsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDialogsResponse self = new QueryDialogsResponse();
        return TeaModel.build(map, self);
    }

    public QueryDialogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDialogsResponse setBody(QueryDialogsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDialogsResponseBody getBody() {
        return this.body;
    }

}
