// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class EnableCheckResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableCheckResourceResponseBody body;

    public static EnableCheckResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableCheckResourceResponse self = new EnableCheckResourceResponse();
        return TeaModel.build(map, self);
    }

    public EnableCheckResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableCheckResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableCheckResourceResponse setBody(EnableCheckResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableCheckResourceResponseBody getBody() {
        return this.body;
    }

}
