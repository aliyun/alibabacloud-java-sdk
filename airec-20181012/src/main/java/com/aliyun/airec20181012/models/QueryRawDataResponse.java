// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class QueryRawDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRawDataResponseBody body;

    public static QueryRawDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRawDataResponse self = new QueryRawDataResponse();
        return TeaModel.build(map, self);
    }

    public QueryRawDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRawDataResponse setBody(QueryRawDataResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRawDataResponseBody getBody() {
        return this.body;
    }

}
