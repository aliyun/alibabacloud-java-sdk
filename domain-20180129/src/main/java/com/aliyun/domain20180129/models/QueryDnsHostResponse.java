// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryDnsHostResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDnsHostResponseBody body;

    public static QueryDnsHostResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDnsHostResponse self = new QueryDnsHostResponse();
        return TeaModel.build(map, self);
    }

    public QueryDnsHostResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDnsHostResponse setBody(QueryDnsHostResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDnsHostResponseBody getBody() {
        return this.body;
    }

}
