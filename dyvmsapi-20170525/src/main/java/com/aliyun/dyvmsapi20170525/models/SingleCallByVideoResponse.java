// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class SingleCallByVideoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SingleCallByVideoResponseBody body;

    public static SingleCallByVideoResponse build(java.util.Map<String, ?> map) throws Exception {
        SingleCallByVideoResponse self = new SingleCallByVideoResponse();
        return TeaModel.build(map, self);
    }

    public SingleCallByVideoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SingleCallByVideoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SingleCallByVideoResponse setBody(SingleCallByVideoResponseBody body) {
        this.body = body;
        return this;
    }
    public SingleCallByVideoResponseBody getBody() {
        return this.body;
    }

}
