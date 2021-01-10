// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryPictureSearchAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryPictureSearchAppResponseBody body;

    public static QueryPictureSearchAppResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPictureSearchAppResponse self = new QueryPictureSearchAppResponse();
        return TeaModel.build(map, self);
    }

    public QueryPictureSearchAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPictureSearchAppResponse setBody(QueryPictureSearchAppResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPictureSearchAppResponseBody getBody() {
        return this.body;
    }

}
