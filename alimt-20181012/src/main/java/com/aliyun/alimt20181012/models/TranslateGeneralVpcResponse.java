// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class TranslateGeneralVpcResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public TranslateGeneralVpcResponseBody body;

    public static TranslateGeneralVpcResponse build(java.util.Map<String, ?> map) throws Exception {
        TranslateGeneralVpcResponse self = new TranslateGeneralVpcResponse();
        return TeaModel.build(map, self);
    }

    public TranslateGeneralVpcResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TranslateGeneralVpcResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TranslateGeneralVpcResponse setBody(TranslateGeneralVpcResponseBody body) {
        this.body = body;
        return this;
    }
    public TranslateGeneralVpcResponseBody getBody() {
        return this.body;
    }

}
