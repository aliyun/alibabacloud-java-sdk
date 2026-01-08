// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class CreateWhatsappConversionApiResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateWhatsappConversionApiResponseBody body;

    public static CreateWhatsappConversionApiResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWhatsappConversionApiResponse self = new CreateWhatsappConversionApiResponse();
        return TeaModel.build(map, self);
    }

    public CreateWhatsappConversionApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWhatsappConversionApiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateWhatsappConversionApiResponse setBody(CreateWhatsappConversionApiResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWhatsappConversionApiResponseBody getBody() {
        return this.body;
    }

}
