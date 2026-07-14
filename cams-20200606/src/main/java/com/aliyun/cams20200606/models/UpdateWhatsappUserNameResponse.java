// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class UpdateWhatsappUserNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateWhatsappUserNameResponseBody body;

    public static UpdateWhatsappUserNameResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWhatsappUserNameResponse self = new UpdateWhatsappUserNameResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWhatsappUserNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateWhatsappUserNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateWhatsappUserNameResponse setBody(UpdateWhatsappUserNameResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateWhatsappUserNameResponseBody getBody() {
        return this.body;
    }

}
