// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class SubmitIndexJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitIndexJobResponseBody body;

    public static SubmitIndexJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitIndexJobResponse self = new SubmitIndexJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitIndexJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitIndexJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitIndexJobResponse setBody(SubmitIndexJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitIndexJobResponseBody getBody() {
        return this.body;
    }

}
