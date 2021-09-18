// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20180501.models;

import com.aliyun.tea.*;

public class ConversionDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ConversionDataResponseBody body;

    public static ConversionDataResponse build(java.util.Map<String, ?> map) throws Exception {
        ConversionDataResponse self = new ConversionDataResponse();
        return TeaModel.build(map, self);
    }

    public ConversionDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConversionDataResponse setBody(ConversionDataResponseBody body) {
        this.body = body;
        return this;
    }
    public ConversionDataResponseBody getBody() {
        return this.body;
    }

}
