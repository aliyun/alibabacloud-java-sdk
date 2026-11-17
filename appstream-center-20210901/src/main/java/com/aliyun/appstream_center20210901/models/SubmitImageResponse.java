// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class SubmitImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitImageResponseBody body;

    public static SubmitImageResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitImageResponse self = new SubmitImageResponse();
        return TeaModel.build(map, self);
    }

    public SubmitImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitImageResponse setBody(SubmitImageResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitImageResponseBody getBody() {
        return this.body;
    }

}
