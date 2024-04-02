// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DeleteBizTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteBizTypeResponseBody body;

    public static DeleteBizTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBizTypeResponse self = new DeleteBizTypeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBizTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBizTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteBizTypeResponse setBody(DeleteBizTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBizTypeResponseBody getBody() {
        return this.body;
    }

}
