// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lx20150701.models;

import com.aliyun.tea.*;

public class FillAgAccountActionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public FillAgAccountActionResponseBody body;

    public static FillAgAccountActionResponse build(java.util.Map<String, ?> map) throws Exception {
        FillAgAccountActionResponse self = new FillAgAccountActionResponse();
        return TeaModel.build(map, self);
    }

    public FillAgAccountActionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FillAgAccountActionResponse setBody(FillAgAccountActionResponseBody body) {
        this.body = body;
        return this;
    }
    public FillAgAccountActionResponseBody getBody() {
        return this.body;
    }

}
