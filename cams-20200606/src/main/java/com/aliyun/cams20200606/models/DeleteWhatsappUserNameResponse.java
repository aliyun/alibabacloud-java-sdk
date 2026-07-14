// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class DeleteWhatsappUserNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteWhatsappUserNameResponseBody body;

    public static DeleteWhatsappUserNameResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWhatsappUserNameResponse self = new DeleteWhatsappUserNameResponse();
        return TeaModel.build(map, self);
    }

    public DeleteWhatsappUserNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteWhatsappUserNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteWhatsappUserNameResponse setBody(DeleteWhatsappUserNameResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWhatsappUserNameResponseBody getBody() {
        return this.body;
    }

}
