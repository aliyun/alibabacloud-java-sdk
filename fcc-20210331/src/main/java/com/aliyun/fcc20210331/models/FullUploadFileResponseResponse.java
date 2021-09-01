// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class FullUploadFileResponseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public FullUploadFileResponseResponseBody body;

    public static FullUploadFileResponseResponse build(java.util.Map<String, ?> map) throws Exception {
        FullUploadFileResponseResponse self = new FullUploadFileResponseResponse();
        return TeaModel.build(map, self);
    }

    public FullUploadFileResponseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FullUploadFileResponseResponse setBody(FullUploadFileResponseResponseBody body) {
        this.body = body;
        return this;
    }
    public FullUploadFileResponseResponseBody getBody() {
        return this.body;
    }

}
