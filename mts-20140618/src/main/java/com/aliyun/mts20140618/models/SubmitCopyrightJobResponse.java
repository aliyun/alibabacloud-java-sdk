// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitCopyrightJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitCopyrightJobResponseBody body;

    public static SubmitCopyrightJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitCopyrightJobResponse self = new SubmitCopyrightJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitCopyrightJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitCopyrightJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitCopyrightJobResponse setBody(SubmitCopyrightJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitCopyrightJobResponseBody getBody() {
        return this.body;
    }

}
