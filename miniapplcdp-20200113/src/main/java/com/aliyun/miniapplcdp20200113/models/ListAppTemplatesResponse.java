// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListAppTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAppTemplatesResponseBody body;

    public static ListAppTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppTemplatesResponse self = new ListAppTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListAppTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAppTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAppTemplatesResponse setBody(ListAppTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAppTemplatesResponseBody getBody() {
        return this.body;
    }

}
