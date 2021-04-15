// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryBusinessLocationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryBusinessLocationsResponseBody body;

    public static QueryBusinessLocationsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBusinessLocationsResponse self = new QueryBusinessLocationsResponse();
        return TeaModel.build(map, self);
    }

    public QueryBusinessLocationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryBusinessLocationsResponse setBody(QueryBusinessLocationsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryBusinessLocationsResponseBody getBody() {
        return this.body;
    }

}
