// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class QueryAccountSiteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAccountSiteResponseBody body;

    public static QueryAccountSiteResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAccountSiteResponse self = new QueryAccountSiteResponse();
        return TeaModel.build(map, self);
    }

    public QueryAccountSiteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAccountSiteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAccountSiteResponse setBody(QueryAccountSiteResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAccountSiteResponseBody getBody() {
        return this.body;
    }

}
