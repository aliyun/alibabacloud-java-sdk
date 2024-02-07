// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class EnableServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableServiceResponseBody body;

    public static EnableServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableServiceResponse self = new EnableServiceResponse();
        return TeaModel.build(map, self);
    }

    public EnableServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableServiceResponse setBody(EnableServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableServiceResponseBody getBody() {
        return this.body;
    }

}
