// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class RenameDetectProcessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RenameDetectProcessResponseBody body;

    public static RenameDetectProcessResponse build(java.util.Map<String, ?> map) throws Exception {
        RenameDetectProcessResponse self = new RenameDetectProcessResponse();
        return TeaModel.build(map, self);
    }

    public RenameDetectProcessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenameDetectProcessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RenameDetectProcessResponse setBody(RenameDetectProcessResponseBody body) {
        this.body = body;
        return this;
    }
    public RenameDetectProcessResponseBody getBody() {
        return this.body;
    }

}
