// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySendDetailsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySendDetailsResponseBody body;

    public static QuerySendDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySendDetailsResponse self = new QuerySendDetailsResponse();
        return TeaModel.build(map, self);
    }

    public QuerySendDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySendDetailsResponse setBody(QuerySendDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySendDetailsResponseBody getBody() {
        return this.body;
    }

}
