// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class OpenAlimtServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OpenAlimtServiceResponseBody body;

    public static OpenAlimtServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenAlimtServiceResponse self = new OpenAlimtServiceResponse();
        return TeaModel.build(map, self);
    }

    public OpenAlimtServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenAlimtServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenAlimtServiceResponse setBody(OpenAlimtServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenAlimtServiceResponseBody getBody() {
        return this.body;
    }

}
