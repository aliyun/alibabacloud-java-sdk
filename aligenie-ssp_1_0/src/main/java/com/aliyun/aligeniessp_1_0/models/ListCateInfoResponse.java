// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListCateInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListCateInfoResponseBody body;

    public static ListCateInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCateInfoResponse self = new ListCateInfoResponse();
        return TeaModel.build(map, self);
    }

    public ListCateInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCateInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCateInfoResponse setBody(ListCateInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCateInfoResponseBody getBody() {
        return this.body;
    }

}
