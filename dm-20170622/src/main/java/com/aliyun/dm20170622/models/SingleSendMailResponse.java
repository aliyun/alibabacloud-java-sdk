// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20170622.models;

import com.aliyun.tea.*;

public class SingleSendMailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SingleSendMailResponseBody body;

    public static SingleSendMailResponse build(java.util.Map<String, ?> map) throws Exception {
        SingleSendMailResponse self = new SingleSendMailResponse();
        return TeaModel.build(map, self);
    }

    public SingleSendMailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SingleSendMailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SingleSendMailResponse setBody(SingleSendMailResponseBody body) {
        this.body = body;
        return this;
    }
    public SingleSendMailResponseBody getBody() {
        return this.body;
    }

}
