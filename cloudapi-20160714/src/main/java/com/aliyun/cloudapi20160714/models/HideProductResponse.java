// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class HideProductResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public HideProductResponseBody body;

    public static HideProductResponse build(java.util.Map<String, ?> map) throws Exception {
        HideProductResponse self = new HideProductResponse();
        return TeaModel.build(map, self);
    }

    public HideProductResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HideProductResponse setBody(HideProductResponseBody body) {
        this.body = body;
        return this;
    }
    public HideProductResponseBody getBody() {
        return this.body;
    }

}
