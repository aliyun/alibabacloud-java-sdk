// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryRealTbAccountSupportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRealTbAccountSupportResponseBody body;

    public static QueryRealTbAccountSupportResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRealTbAccountSupportResponse self = new QueryRealTbAccountSupportResponse();
        return TeaModel.build(map, self);
    }

    public QueryRealTbAccountSupportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRealTbAccountSupportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryRealTbAccountSupportResponse setBody(QueryRealTbAccountSupportResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRealTbAccountSupportResponseBody getBody() {
        return this.body;
    }

}
