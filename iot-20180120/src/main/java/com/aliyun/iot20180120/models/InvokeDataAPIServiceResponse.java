// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class InvokeDataAPIServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InvokeDataAPIServiceResponseBody body;

    public static InvokeDataAPIServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        InvokeDataAPIServiceResponse self = new InvokeDataAPIServiceResponse();
        return TeaModel.build(map, self);
    }

    public InvokeDataAPIServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InvokeDataAPIServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InvokeDataAPIServiceResponse setBody(InvokeDataAPIServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public InvokeDataAPIServiceResponseBody getBody() {
        return this.body;
    }

}
