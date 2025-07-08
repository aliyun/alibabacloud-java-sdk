// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class UploadCardResResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UploadCardResResponseBody body;

    public static UploadCardResResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadCardResResponse self = new UploadCardResResponse();
        return TeaModel.build(map, self);
    }

    public UploadCardResResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadCardResResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadCardResResponse setBody(UploadCardResResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadCardResResponseBody getBody() {
        return this.body;
    }

}
