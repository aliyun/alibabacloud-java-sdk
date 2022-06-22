// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryStatusTopOfResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryStatusTopOfResourceResponseBody body;

    public static QueryStatusTopOfResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryStatusTopOfResourceResponse self = new QueryStatusTopOfResourceResponse();
        return TeaModel.build(map, self);
    }

    public QueryStatusTopOfResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryStatusTopOfResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryStatusTopOfResourceResponse setBody(QueryStatusTopOfResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryStatusTopOfResourceResponseBody getBody() {
        return this.body;
    }

}
