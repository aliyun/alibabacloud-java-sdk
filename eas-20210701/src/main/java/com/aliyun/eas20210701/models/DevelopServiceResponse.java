// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DevelopServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DevelopServiceResponseBody body;

    public static DevelopServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        DevelopServiceResponse self = new DevelopServiceResponse();
        return TeaModel.build(map, self);
    }

    public DevelopServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DevelopServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DevelopServiceResponse setBody(DevelopServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public DevelopServiceResponseBody getBody() {
        return this.body;
    }

}
