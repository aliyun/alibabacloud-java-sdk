// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class BindGxb700Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BindGxb700ResponseBody body;

    public static BindGxb700Response build(java.util.Map<String, ?> map) throws Exception {
        BindGxb700Response self = new BindGxb700Response();
        return TeaModel.build(map, self);
    }

    public BindGxb700Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindGxb700Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindGxb700Response setBody(BindGxb700ResponseBody body) {
        this.body = body;
        return this;
    }
    public BindGxb700ResponseBody getBody() {
        return this.body;
    }

}
