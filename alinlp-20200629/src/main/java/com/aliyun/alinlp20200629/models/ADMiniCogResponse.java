// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class ADMiniCogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ADMiniCogResponseBody body;

    public static ADMiniCogResponse build(java.util.Map<String, ?> map) throws Exception {
        ADMiniCogResponse self = new ADMiniCogResponse();
        return TeaModel.build(map, self);
    }

    public ADMiniCogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ADMiniCogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ADMiniCogResponse setBody(ADMiniCogResponseBody body) {
        this.body = body;
        return this;
    }
    public ADMiniCogResponseBody getBody() {
        return this.body;
    }

}
