// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryCustomerAddressListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryCustomerAddressListResponseBody body;

    public static QueryCustomerAddressListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCustomerAddressListResponse self = new QueryCustomerAddressListResponse();
        return TeaModel.build(map, self);
    }

    public QueryCustomerAddressListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCustomerAddressListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCustomerAddressListResponse setBody(QueryCustomerAddressListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCustomerAddressListResponseBody getBody() {
        return this.body;
    }

}
