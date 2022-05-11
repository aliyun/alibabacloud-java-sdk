// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListSipTracesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListSipTracesResponseBody body;

    public static ListSipTracesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSipTracesResponse self = new ListSipTracesResponse();
        return TeaModel.build(map, self);
    }

    public ListSipTracesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSipTracesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSipTracesResponse setBody(ListSipTracesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSipTracesResponseBody getBody() {
        return this.body;
    }

}
