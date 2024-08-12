// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListCallSummariesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCallSummariesResponseBody body;

    public static ListCallSummariesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCallSummariesResponse self = new ListCallSummariesResponse();
        return TeaModel.build(map, self);
    }

    public ListCallSummariesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCallSummariesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCallSummariesResponse setBody(ListCallSummariesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCallSummariesResponseBody getBody() {
        return this.body;
    }

}
