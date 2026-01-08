// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetWhatsappConversionApiResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWhatsappConversionApiResponseBody body;

    public static GetWhatsappConversionApiResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWhatsappConversionApiResponse self = new GetWhatsappConversionApiResponse();
        return TeaModel.build(map, self);
    }

    public GetWhatsappConversionApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWhatsappConversionApiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWhatsappConversionApiResponse setBody(GetWhatsappConversionApiResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWhatsappConversionApiResponseBody getBody() {
        return this.body;
    }

}
