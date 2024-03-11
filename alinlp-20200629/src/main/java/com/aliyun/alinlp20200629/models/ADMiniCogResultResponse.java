// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class ADMiniCogResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ADMiniCogResultResponseBody body;

    public static ADMiniCogResultResponse build(java.util.Map<String, ?> map) throws Exception {
        ADMiniCogResultResponse self = new ADMiniCogResultResponse();
        return TeaModel.build(map, self);
    }

    public ADMiniCogResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ADMiniCogResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ADMiniCogResultResponse setBody(ADMiniCogResultResponseBody body) {
        this.body = body;
        return this;
    }
    public ADMiniCogResultResponseBody getBody() {
        return this.body;
    }

}
