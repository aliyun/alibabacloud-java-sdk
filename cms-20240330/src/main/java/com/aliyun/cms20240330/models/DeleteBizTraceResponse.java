// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteBizTraceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteBizTraceResponseBody body;

    public static DeleteBizTraceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBizTraceResponse self = new DeleteBizTraceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBizTraceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBizTraceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteBizTraceResponse setBody(DeleteBizTraceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBizTraceResponseBody getBody() {
        return this.body;
    }

}
