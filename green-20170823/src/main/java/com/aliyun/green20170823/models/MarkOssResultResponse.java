// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class MarkOssResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MarkOssResultResponseBody body;

    public static MarkOssResultResponse build(java.util.Map<String, ?> map) throws Exception {
        MarkOssResultResponse self = new MarkOssResultResponse();
        return TeaModel.build(map, self);
    }

    public MarkOssResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MarkOssResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MarkOssResultResponse setBody(MarkOssResultResponseBody body) {
        this.body = body;
        return this;
    }
    public MarkOssResultResponseBody getBody() {
        return this.body;
    }

}
