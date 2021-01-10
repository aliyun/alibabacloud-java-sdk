// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitMediaDetailJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitMediaDetailJobResponseBody body;

    public static SubmitMediaDetailJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitMediaDetailJobResponse self = new SubmitMediaDetailJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitMediaDetailJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitMediaDetailJobResponse setBody(SubmitMediaDetailJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitMediaDetailJobResponseBody getBody() {
        return this.body;
    }

}
