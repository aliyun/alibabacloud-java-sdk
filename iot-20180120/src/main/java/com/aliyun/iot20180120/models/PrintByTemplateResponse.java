// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class PrintByTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PrintByTemplateResponseBody body;

    public static PrintByTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        PrintByTemplateResponse self = new PrintByTemplateResponse();
        return TeaModel.build(map, self);
    }

    public PrintByTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PrintByTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PrintByTemplateResponse setBody(PrintByTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public PrintByTemplateResponseBody getBody() {
        return this.body;
    }

}
