// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20210728.models;

import com.aliyun.tea.*;

public class SubmitCopyrightJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public SubmitCopyrightJobResponse setBody(SubmitCopyrightJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitCopyrightJobResponseBody getBody() {
        return this.body;
    }

}
