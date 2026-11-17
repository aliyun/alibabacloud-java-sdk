// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ListApplicationTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListApplicationTemplateResponseBody body;

    public static ListApplicationTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationTemplateResponse self = new ListApplicationTemplateResponse();
        return TeaModel.build(map, self);
    }

    public ListApplicationTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApplicationTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListApplicationTemplateResponse setBody(ListApplicationTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApplicationTemplateResponseBody getBody() {
        return this.body;
    }

}
