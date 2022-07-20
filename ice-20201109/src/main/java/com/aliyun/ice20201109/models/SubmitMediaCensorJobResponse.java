// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitMediaCensorJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitMediaCensorJobResponseBody body;

    public static SubmitMediaCensorJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitMediaCensorJobResponse self = new SubmitMediaCensorJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitMediaCensorJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitMediaCensorJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitMediaCensorJobResponse setBody(SubmitMediaCensorJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitMediaCensorJobResponseBody getBody() {
        return this.body;
    }

}
