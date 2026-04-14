// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListWhatAppTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListWhatAppTemplateResponseBody body;

    public static ListWhatAppTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWhatAppTemplateResponse self = new ListWhatAppTemplateResponse();
        return TeaModel.build(map, self);
    }

    public ListWhatAppTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWhatAppTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWhatAppTemplateResponse setBody(ListWhatAppTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWhatAppTemplateResponseBody getBody() {
        return this.body;
    }

}
