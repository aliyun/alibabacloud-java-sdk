// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitFpFileDeleteJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitFpFileDeleteJobResponseBody body;

    public static SubmitFpFileDeleteJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitFpFileDeleteJobResponse self = new SubmitFpFileDeleteJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitFpFileDeleteJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitFpFileDeleteJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitFpFileDeleteJobResponse setBody(SubmitFpFileDeleteJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitFpFileDeleteJobResponseBody getBody() {
        return this.body;
    }

}
