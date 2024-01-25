// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryTransferInListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryTransferInListResponseBody body;

    public static QueryTransferInListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTransferInListResponse self = new QueryTransferInListResponse();
        return TeaModel.build(map, self);
    }

    public QueryTransferInListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTransferInListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTransferInListResponse setBody(QueryTransferInListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTransferInListResponseBody getBody() {
        return this.body;
    }

}
