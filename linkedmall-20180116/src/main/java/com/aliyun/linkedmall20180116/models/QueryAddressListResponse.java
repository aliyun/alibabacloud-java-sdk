// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryAddressListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAddressListResponseBody body;

    public static QueryAddressListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAddressListResponse self = new QueryAddressListResponse();
        return TeaModel.build(map, self);
    }

    public QueryAddressListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAddressListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAddressListResponse setBody(QueryAddressListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAddressListResponseBody getBody() {
        return this.body;
    }

}
