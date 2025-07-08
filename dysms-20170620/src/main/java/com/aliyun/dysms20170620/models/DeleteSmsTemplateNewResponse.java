// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class DeleteSmsTemplateNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSmsTemplateNewResponseBody body;

    public static DeleteSmsTemplateNewResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSmsTemplateNewResponse self = new DeleteSmsTemplateNewResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSmsTemplateNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSmsTemplateNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSmsTemplateNewResponse setBody(DeleteSmsTemplateNewResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSmsTemplateNewResponseBody getBody() {
        return this.body;
    }

}
