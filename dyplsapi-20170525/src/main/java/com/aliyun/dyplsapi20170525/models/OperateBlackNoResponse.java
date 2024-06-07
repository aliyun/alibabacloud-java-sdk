// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class OperateBlackNoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OperateBlackNoResponseBody body;

    public static OperateBlackNoResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateBlackNoResponse self = new OperateBlackNoResponse();
        return TeaModel.build(map, self);
    }

    public OperateBlackNoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperateBlackNoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OperateBlackNoResponse setBody(OperateBlackNoResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateBlackNoResponseBody getBody() {
        return this.body;
    }

}
