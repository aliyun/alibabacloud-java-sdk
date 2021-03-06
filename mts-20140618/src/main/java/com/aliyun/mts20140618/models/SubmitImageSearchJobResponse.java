// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitImageSearchJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitImageSearchJobResponseBody body;

    public static SubmitImageSearchJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitImageSearchJobResponse self = new SubmitImageSearchJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitImageSearchJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitImageSearchJobResponse setBody(SubmitImageSearchJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitImageSearchJobResponseBody getBody() {
        return this.body;
    }

}
