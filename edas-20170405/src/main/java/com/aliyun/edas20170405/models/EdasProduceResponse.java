// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170405.models;

import com.aliyun.tea.*;

public class EdasProduceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EdasProduceResponseBody body;

    public static EdasProduceResponse build(java.util.Map<String, ?> map) throws Exception {
        EdasProduceResponse self = new EdasProduceResponse();
        return TeaModel.build(map, self);
    }

    public EdasProduceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EdasProduceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EdasProduceResponse setBody(EdasProduceResponseBody body) {
        this.body = body;
        return this;
    }
    public EdasProduceResponseBody getBody() {
        return this.body;
    }

}
