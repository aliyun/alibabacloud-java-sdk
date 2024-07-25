// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class EnableHttp2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableHttp2ResponseBody body;

    public static EnableHttp2Response build(java.util.Map<String, ?> map) throws Exception {
        EnableHttp2Response self = new EnableHttp2Response();
        return TeaModel.build(map, self);
    }

    public EnableHttp2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableHttp2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableHttp2Response setBody(EnableHttp2ResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableHttp2ResponseBody getBody() {
        return this.body;
    }

}
