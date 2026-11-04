// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class LaunchShortMessageAppraiseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public LaunchShortMessageAppraiseResponseBody body;

    public static LaunchShortMessageAppraiseResponse build(java.util.Map<String, ?> map) throws Exception {
        LaunchShortMessageAppraiseResponse self = new LaunchShortMessageAppraiseResponse();
        return TeaModel.build(map, self);
    }

    public LaunchShortMessageAppraiseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LaunchShortMessageAppraiseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public LaunchShortMessageAppraiseResponse setBody(LaunchShortMessageAppraiseResponseBody body) {
        this.body = body;
        return this;
    }
    public LaunchShortMessageAppraiseResponseBody getBody() {
        return this.body;
    }

}
