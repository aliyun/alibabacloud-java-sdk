// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryCardSendExportInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryCardSendExportInfoResponseBody body;

    public static QueryCardSendExportInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCardSendExportInfoResponse self = new QueryCardSendExportInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryCardSendExportInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCardSendExportInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCardSendExportInfoResponse setBody(QueryCardSendExportInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCardSendExportInfoResponseBody getBody() {
        return this.body;
    }

}
