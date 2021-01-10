// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryMediaListByURLResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMediaListByURLResponseBody body;

    public static QueryMediaListByURLResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMediaListByURLResponse self = new QueryMediaListByURLResponse();
        return TeaModel.build(map, self);
    }

    public QueryMediaListByURLResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMediaListByURLResponse setBody(QueryMediaListByURLResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMediaListByURLResponseBody getBody() {
        return this.body;
    }

}
