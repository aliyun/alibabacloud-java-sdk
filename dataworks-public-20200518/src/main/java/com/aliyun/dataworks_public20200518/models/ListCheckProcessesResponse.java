// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListCheckProcessesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCheckProcessesResponseBody body;

    public static ListCheckProcessesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCheckProcessesResponse self = new ListCheckProcessesResponse();
        return TeaModel.build(map, self);
    }

    public ListCheckProcessesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCheckProcessesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCheckProcessesResponse setBody(ListCheckProcessesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCheckProcessesResponseBody getBody() {
        return this.body;
    }

}
