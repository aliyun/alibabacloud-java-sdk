// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryMobilesCardSupportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMobilesCardSupportResponseBody body;

    public static QueryMobilesCardSupportResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMobilesCardSupportResponse self = new QueryMobilesCardSupportResponse();
        return TeaModel.build(map, self);
    }

    public QueryMobilesCardSupportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMobilesCardSupportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMobilesCardSupportResponse setBody(QueryMobilesCardSupportResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMobilesCardSupportResponseBody getBody() {
        return this.body;
    }

}
