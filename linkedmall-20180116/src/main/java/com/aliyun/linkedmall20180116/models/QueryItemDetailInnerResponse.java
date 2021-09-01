// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryItemDetailInnerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryItemDetailInnerResponseBody body;

    public static QueryItemDetailInnerResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryItemDetailInnerResponse self = new QueryItemDetailInnerResponse();
        return TeaModel.build(map, self);
    }

    public QueryItemDetailInnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryItemDetailInnerResponse setBody(QueryItemDetailInnerResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryItemDetailInnerResponseBody getBody() {
        return this.body;
    }

}
