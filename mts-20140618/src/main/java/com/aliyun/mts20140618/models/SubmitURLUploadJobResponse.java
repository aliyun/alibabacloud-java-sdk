// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitURLUploadJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitURLUploadJobResponseBody body;

    public static SubmitURLUploadJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitURLUploadJobResponse self = new SubmitURLUploadJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitURLUploadJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitURLUploadJobResponse setBody(SubmitURLUploadJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitURLUploadJobResponseBody getBody() {
        return this.body;
    }

}
