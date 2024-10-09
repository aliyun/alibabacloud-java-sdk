// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class CloseBdrcServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloseBdrcServiceResponseBody body;

    public static CloseBdrcServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        CloseBdrcServiceResponse self = new CloseBdrcServiceResponse();
        return TeaModel.build(map, self);
    }

    public CloseBdrcServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloseBdrcServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloseBdrcServiceResponse setBody(CloseBdrcServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public CloseBdrcServiceResponseBody getBody() {
        return this.body;
    }

}
