// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListPptTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPptTemplatesResponseBody body;

    public static ListPptTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPptTemplatesResponse self = new ListPptTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListPptTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPptTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPptTemplatesResponse setBody(ListPptTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPptTemplatesResponseBody getBody() {
        return this.body;
    }

}
