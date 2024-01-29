// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitMediaInfoJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitMediaInfoJobResponseBody body;

    public static SubmitMediaInfoJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitMediaInfoJobResponse self = new SubmitMediaInfoJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitMediaInfoJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitMediaInfoJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitMediaInfoJobResponse setBody(SubmitMediaInfoJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitMediaInfoJobResponseBody getBody() {
        return this.body;
    }

}
