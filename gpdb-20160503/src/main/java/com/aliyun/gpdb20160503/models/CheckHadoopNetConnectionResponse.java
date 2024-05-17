// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CheckHadoopNetConnectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckHadoopNetConnectionResponseBody body;

    public static CheckHadoopNetConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckHadoopNetConnectionResponse self = new CheckHadoopNetConnectionResponse();
        return TeaModel.build(map, self);
    }

    public CheckHadoopNetConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckHadoopNetConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckHadoopNetConnectionResponse setBody(CheckHadoopNetConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckHadoopNetConnectionResponseBody getBody() {
        return this.body;
    }

}
