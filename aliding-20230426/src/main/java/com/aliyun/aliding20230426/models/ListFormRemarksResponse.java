// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListFormRemarksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFormRemarksResponseBody body;

    public static ListFormRemarksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFormRemarksResponse self = new ListFormRemarksResponse();
        return TeaModel.build(map, self);
    }

    public ListFormRemarksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFormRemarksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFormRemarksResponse setBody(ListFormRemarksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFormRemarksResponseBody getBody() {
        return this.body;
    }

}
