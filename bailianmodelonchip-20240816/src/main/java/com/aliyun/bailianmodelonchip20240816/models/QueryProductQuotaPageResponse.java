// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianmodelonchip20240816.models;

import com.aliyun.tea.*;

public class QueryProductQuotaPageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryProductQuotaPageResponseBody body;

    public static QueryProductQuotaPageResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryProductQuotaPageResponse self = new QueryProductQuotaPageResponse();
        return TeaModel.build(map, self);
    }

    public QueryProductQuotaPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryProductQuotaPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryProductQuotaPageResponse setBody(QueryProductQuotaPageResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryProductQuotaPageResponseBody getBody() {
        return this.body;
    }

}
