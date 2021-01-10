// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitComplexJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitComplexJobResponseBody body;

    public static SubmitComplexJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitComplexJobResponse self = new SubmitComplexJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitComplexJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitComplexJobResponse setBody(SubmitComplexJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitComplexJobResponseBody getBody() {
        return this.body;
    }

}
