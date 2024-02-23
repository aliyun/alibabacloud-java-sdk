// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class SingleCallByTtsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SingleCallByTtsResponseBody body;

    public static SingleCallByTtsResponse build(java.util.Map<String, ?> map) throws Exception {
        SingleCallByTtsResponse self = new SingleCallByTtsResponse();
        return TeaModel.build(map, self);
    }

    public SingleCallByTtsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SingleCallByTtsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SingleCallByTtsResponse setBody(SingleCallByTtsResponseBody body) {
        this.body = body;
        return this;
    }
    public SingleCallByTtsResponseBody getBody() {
        return this.body;
    }

}
