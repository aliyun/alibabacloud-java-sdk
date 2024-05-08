// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class ListDetectProcessesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDetectProcessesResponseBody body;

    public static ListDetectProcessesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDetectProcessesResponse self = new ListDetectProcessesResponse();
        return TeaModel.build(map, self);
    }

    public ListDetectProcessesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDetectProcessesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDetectProcessesResponse setBody(ListDetectProcessesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDetectProcessesResponseBody getBody() {
        return this.body;
    }

}
