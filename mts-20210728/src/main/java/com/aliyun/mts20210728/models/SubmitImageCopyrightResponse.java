// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20210728.models;

import com.aliyun.tea.*;

public class SubmitImageCopyrightResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitImageCopyrightResponseBody body;

    public static SubmitImageCopyrightResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitImageCopyrightResponse self = new SubmitImageCopyrightResponse();
        return TeaModel.build(map, self);
    }

    public SubmitImageCopyrightResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitImageCopyrightResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitImageCopyrightResponse setBody(SubmitImageCopyrightResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitImageCopyrightResponseBody getBody() {
        return this.body;
    }

}
