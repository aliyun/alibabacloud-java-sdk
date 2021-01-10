// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitMediaInfoJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public SubmitMediaInfoJobResponse setBody(SubmitMediaInfoJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitMediaInfoJobResponseBody getBody() {
        return this.body;
    }

}
