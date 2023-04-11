// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class TranslateGeneralResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public TranslateGeneralResponseBody body;

    public static TranslateGeneralResponse build(java.util.Map<String, ?> map) throws Exception {
        TranslateGeneralResponse self = new TranslateGeneralResponse();
        return TeaModel.build(map, self);
    }

    public TranslateGeneralResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TranslateGeneralResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TranslateGeneralResponse setBody(TranslateGeneralResponseBody body) {
        this.body = body;
        return this;
    }
    public TranslateGeneralResponseBody getBody() {
        return this.body;
    }

}
