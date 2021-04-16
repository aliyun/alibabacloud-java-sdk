// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitDelogoJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitDelogoJobResponseBody body;

    public static SubmitDelogoJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitDelogoJobResponse self = new SubmitDelogoJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitDelogoJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitDelogoJobResponse setBody(SubmitDelogoJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitDelogoJobResponseBody getBody() {
        return this.body;
    }

}
