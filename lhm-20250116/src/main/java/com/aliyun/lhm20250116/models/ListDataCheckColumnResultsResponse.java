// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class ListDataCheckColumnResultsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataCheckColumnResultsResponseBody body;

    public static ListDataCheckColumnResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataCheckColumnResultsResponse self = new ListDataCheckColumnResultsResponse();
        return TeaModel.build(map, self);
    }

    public ListDataCheckColumnResultsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataCheckColumnResultsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataCheckColumnResultsResponse setBody(ListDataCheckColumnResultsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataCheckColumnResultsResponseBody getBody() {
        return this.body;
    }

}
