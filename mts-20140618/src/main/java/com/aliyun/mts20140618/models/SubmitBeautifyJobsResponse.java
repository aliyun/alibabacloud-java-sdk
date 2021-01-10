// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitBeautifyJobsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitBeautifyJobsResponseBody body;

    public static SubmitBeautifyJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitBeautifyJobsResponse self = new SubmitBeautifyJobsResponse();
        return TeaModel.build(map, self);
    }

    public SubmitBeautifyJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitBeautifyJobsResponse setBody(SubmitBeautifyJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitBeautifyJobsResponseBody getBody() {
        return this.body;
    }

}
