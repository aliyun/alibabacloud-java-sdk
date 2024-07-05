// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitFpShotJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitFpShotJobResponseBody body;

    public static SubmitFpShotJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitFpShotJobResponse self = new SubmitFpShotJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitFpShotJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitFpShotJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitFpShotJobResponse setBody(SubmitFpShotJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitFpShotJobResponseBody getBody() {
        return this.body;
    }

}
