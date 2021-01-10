// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryAuthConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAuthConfigResponseBody body;

    public static QueryAuthConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAuthConfigResponse self = new QueryAuthConfigResponse();
        return TeaModel.build(map, self);
    }

    public QueryAuthConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAuthConfigResponse setBody(QueryAuthConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAuthConfigResponseBody getBody() {
        return this.body;
    }

}
