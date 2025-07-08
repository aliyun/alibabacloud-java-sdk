// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySendToGlobeStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySendToGlobeStatusResponseBody body;

    public static QuerySendToGlobeStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySendToGlobeStatusResponse self = new QuerySendToGlobeStatusResponse();
        return TeaModel.build(map, self);
    }

    public QuerySendToGlobeStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySendToGlobeStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySendToGlobeStatusResponse setBody(QuerySendToGlobeStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySendToGlobeStatusResponseBody getBody() {
        return this.body;
    }

}
