// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class QueryAccountAddressInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAccountAddressInfoResponseBody body;

    public static QueryAccountAddressInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAccountAddressInfoResponse self = new QueryAccountAddressInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryAccountAddressInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAccountAddressInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAccountAddressInfoResponse setBody(QueryAccountAddressInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAccountAddressInfoResponseBody getBody() {
        return this.body;
    }

}
