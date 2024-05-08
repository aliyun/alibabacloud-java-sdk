// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class ListRecordResultsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRecordResultsResponseBody body;

    public static ListRecordResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRecordResultsResponse self = new ListRecordResultsResponse();
        return TeaModel.build(map, self);
    }

    public ListRecordResultsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRecordResultsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRecordResultsResponse setBody(ListRecordResultsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRecordResultsResponseBody getBody() {
        return this.body;
    }

}
