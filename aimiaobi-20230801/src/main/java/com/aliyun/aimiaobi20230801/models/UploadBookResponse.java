// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class UploadBookResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UploadBookResponseBody body;

    public static UploadBookResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadBookResponse self = new UploadBookResponse();
        return TeaModel.build(map, self);
    }

    public UploadBookResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadBookResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadBookResponse setBody(UploadBookResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadBookResponseBody getBody() {
        return this.body;
    }

}
