// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitFpDBDeleteJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitFpDBDeleteJobResponseBody body;

    public static SubmitFpDBDeleteJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitFpDBDeleteJobResponse self = new SubmitFpDBDeleteJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitFpDBDeleteJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitFpDBDeleteJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitFpDBDeleteJobResponse setBody(SubmitFpDBDeleteJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitFpDBDeleteJobResponseBody getBody() {
        return this.body;
    }

}
