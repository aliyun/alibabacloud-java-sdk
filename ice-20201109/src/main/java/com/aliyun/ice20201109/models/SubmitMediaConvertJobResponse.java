// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitMediaConvertJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitMediaConvertJobResponseBody body;

    public static SubmitMediaConvertJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitMediaConvertJobResponse self = new SubmitMediaConvertJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitMediaConvertJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitMediaConvertJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitMediaConvertJobResponse setBody(SubmitMediaConvertJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitMediaConvertJobResponseBody getBody() {
        return this.body;
    }

}
