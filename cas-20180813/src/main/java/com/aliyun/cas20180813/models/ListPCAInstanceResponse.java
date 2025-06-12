// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20180813.models;

import com.aliyun.tea.*;

public class ListPCAInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPCAInstanceResponseBody body;

    public static ListPCAInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPCAInstanceResponse self = new ListPCAInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ListPCAInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPCAInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPCAInstanceResponse setBody(ListPCAInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPCAInstanceResponseBody getBody() {
        return this.body;
    }

}
