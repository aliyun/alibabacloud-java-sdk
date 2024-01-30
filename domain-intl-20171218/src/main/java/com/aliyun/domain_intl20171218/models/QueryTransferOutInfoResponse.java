// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class QueryTransferOutInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryTransferOutInfoResponseBody body;

    public static QueryTransferOutInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTransferOutInfoResponse self = new QueryTransferOutInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryTransferOutInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTransferOutInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTransferOutInfoResponse setBody(QueryTransferOutInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTransferOutInfoResponseBody getBody() {
        return this.body;
    }

}
