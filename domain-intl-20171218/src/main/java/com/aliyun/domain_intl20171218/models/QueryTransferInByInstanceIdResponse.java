// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class QueryTransferInByInstanceIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryTransferInByInstanceIdResponseBody body;

    public static QueryTransferInByInstanceIdResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTransferInByInstanceIdResponse self = new QueryTransferInByInstanceIdResponse();
        return TeaModel.build(map, self);
    }

    public QueryTransferInByInstanceIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTransferInByInstanceIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTransferInByInstanceIdResponse setBody(QueryTransferInByInstanceIdResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTransferInByInstanceIdResponseBody getBody() {
        return this.body;
    }

}
