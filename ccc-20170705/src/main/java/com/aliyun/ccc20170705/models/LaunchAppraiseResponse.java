// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class LaunchAppraiseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public LaunchAppraiseResponseBody body;

    public static LaunchAppraiseResponse build(java.util.Map<String, ?> map) throws Exception {
        LaunchAppraiseResponse self = new LaunchAppraiseResponse();
        return TeaModel.build(map, self);
    }

    public LaunchAppraiseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LaunchAppraiseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public LaunchAppraiseResponse setBody(LaunchAppraiseResponseBody body) {
        this.body = body;
        return this;
    }
    public LaunchAppraiseResponseBody getBody() {
        return this.body;
    }

}
