// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryAddressDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAddressDetailResponseBody body;

    public static QueryAddressDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAddressDetailResponse self = new QueryAddressDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryAddressDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAddressDetailResponse setBody(QueryAddressDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAddressDetailResponseBody getBody() {
        return this.body;
    }

}
