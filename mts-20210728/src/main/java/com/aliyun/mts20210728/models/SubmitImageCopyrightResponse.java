// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20210728.models;

import com.aliyun.tea.*;

public class SubmitImageCopyrightResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitImageCopyrightResponseBody body;

    public static SubmitImageCopyrightResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitImageCopyrightResponse self = new SubmitImageCopyrightResponse();
        return TeaModel.build(map, self);
    }

    public SubmitImageCopyrightResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitImageCopyrightResponse setBody(SubmitImageCopyrightResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitImageCopyrightResponseBody getBody() {
        return this.body;
    }

}
