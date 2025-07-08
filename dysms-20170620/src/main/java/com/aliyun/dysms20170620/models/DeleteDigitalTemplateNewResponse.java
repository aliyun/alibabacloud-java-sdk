// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class DeleteDigitalTemplateNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDigitalTemplateNewResponseBody body;

    public static DeleteDigitalTemplateNewResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDigitalTemplateNewResponse self = new DeleteDigitalTemplateNewResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDigitalTemplateNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDigitalTemplateNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDigitalTemplateNewResponse setBody(DeleteDigitalTemplateNewResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDigitalTemplateNewResponseBody getBody() {
        return this.body;
    }

}
