// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20210728.models;

import com.aliyun.tea.*;

public class QueryImageCopyrightResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryImageCopyrightResponseBody body;

    public static QueryImageCopyrightResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryImageCopyrightResponse self = new QueryImageCopyrightResponse();
        return TeaModel.build(map, self);
    }

    public QueryImageCopyrightResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryImageCopyrightResponse setBody(QueryImageCopyrightResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryImageCopyrightResponseBody getBody() {
        return this.body;
    }

}
