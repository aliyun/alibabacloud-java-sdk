// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class QueryModifyInstancePriceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryModifyInstancePriceResponseBody body;

    public static QueryModifyInstancePriceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryModifyInstancePriceResponse self = new QueryModifyInstancePriceResponse();
        return TeaModel.build(map, self);
    }

    public QueryModifyInstancePriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryModifyInstancePriceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryModifyInstancePriceResponse setBody(QueryModifyInstancePriceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryModifyInstancePriceResponseBody getBody() {
        return this.body;
    }

}
