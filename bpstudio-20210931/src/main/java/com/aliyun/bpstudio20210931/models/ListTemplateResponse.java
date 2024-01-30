// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class ListTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTemplateResponseBody body;

    public static ListTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTemplateResponse self = new ListTemplateResponse();
        return TeaModel.build(map, self);
    }

    public ListTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTemplateResponse setBody(ListTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTemplateResponseBody getBody() {
        return this.body;
    }

}
