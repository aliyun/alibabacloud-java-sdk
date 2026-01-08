// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class RequestWhatsappConversionApiResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RequestWhatsappConversionApiResponseBody body;

    public static RequestWhatsappConversionApiResponse build(java.util.Map<String, ?> map) throws Exception {
        RequestWhatsappConversionApiResponse self = new RequestWhatsappConversionApiResponse();
        return TeaModel.build(map, self);
    }

    public RequestWhatsappConversionApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RequestWhatsappConversionApiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RequestWhatsappConversionApiResponse setBody(RequestWhatsappConversionApiResponseBody body) {
        this.body = body;
        return this;
    }
    public RequestWhatsappConversionApiResponseBody getBody() {
        return this.body;
    }

}
