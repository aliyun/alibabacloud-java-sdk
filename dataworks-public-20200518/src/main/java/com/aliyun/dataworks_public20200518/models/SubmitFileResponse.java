// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class SubmitFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitFileResponseBody body;

    public static SubmitFileResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitFileResponse self = new SubmitFileResponse();
        return TeaModel.build(map, self);
    }

    public SubmitFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitFileResponse setBody(SubmitFileResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitFileResponseBody getBody() {
        return this.body;
    }

}
