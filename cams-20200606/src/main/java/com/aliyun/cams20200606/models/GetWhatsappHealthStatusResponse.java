// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetWhatsappHealthStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWhatsappHealthStatusResponseBody body;

    public static GetWhatsappHealthStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWhatsappHealthStatusResponse self = new GetWhatsappHealthStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetWhatsappHealthStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWhatsappHealthStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWhatsappHealthStatusResponse setBody(GetWhatsappHealthStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWhatsappHealthStatusResponseBody getBody() {
        return this.body;
    }

}
