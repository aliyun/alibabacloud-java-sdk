// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class BindAxb700Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BindAxb700ResponseBody body;

    public static BindAxb700Response build(java.util.Map<String, ?> map) throws Exception {
        BindAxb700Response self = new BindAxb700Response();
        return TeaModel.build(map, self);
    }

    public BindAxb700Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindAxb700Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindAxb700Response setBody(BindAxb700ResponseBody body) {
        this.body = body;
        return this;
    }
    public BindAxb700ResponseBody getBody() {
        return this.body;
    }

}
