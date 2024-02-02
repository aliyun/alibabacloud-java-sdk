// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ReadyForServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReadyForServiceResponseBody body;

    public static ReadyForServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        ReadyForServiceResponse self = new ReadyForServiceResponse();
        return TeaModel.build(map, self);
    }

    public ReadyForServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReadyForServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReadyForServiceResponse setBody(ReadyForServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public ReadyForServiceResponseBody getBody() {
        return this.body;
    }

}
