// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class QueryMMLActiveResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryMMLActiveResponseBody body;

    public static QueryMMLActiveResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMMLActiveResponse self = new QueryMMLActiveResponse();
        return TeaModel.build(map, self);
    }

    public QueryMMLActiveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMMLActiveResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMMLActiveResponse setBody(QueryMMLActiveResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMMLActiveResponseBody getBody() {
        return this.body;
    }

}
