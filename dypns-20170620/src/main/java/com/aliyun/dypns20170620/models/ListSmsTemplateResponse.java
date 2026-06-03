// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class ListSmsTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSmsTemplateResponseBody body;

    public static ListSmsTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSmsTemplateResponse self = new ListSmsTemplateResponse();
        return TeaModel.build(map, self);
    }

    public ListSmsTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSmsTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSmsTemplateResponse setBody(ListSmsTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSmsTemplateResponseBody getBody() {
        return this.body;
    }

}
