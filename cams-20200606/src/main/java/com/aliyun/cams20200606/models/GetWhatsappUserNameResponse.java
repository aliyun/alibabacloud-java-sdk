// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetWhatsappUserNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWhatsappUserNameResponseBody body;

    public static GetWhatsappUserNameResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWhatsappUserNameResponse self = new GetWhatsappUserNameResponse();
        return TeaModel.build(map, self);
    }

    public GetWhatsappUserNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWhatsappUserNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWhatsappUserNameResponse setBody(GetWhatsappUserNameResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWhatsappUserNameResponseBody getBody() {
        return this.body;
    }

}
