// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivpd20190625.models;

import com.aliyun.tea.*;

public class ChangeImageSizeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ChangeImageSizeResponseBody body;

    public static ChangeImageSizeResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeImageSizeResponse self = new ChangeImageSizeResponse();
        return TeaModel.build(map, self);
    }

    public ChangeImageSizeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeImageSizeResponse setBody(ChangeImageSizeResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeImageSizeResponseBody getBody() {
        return this.body;
    }

}
