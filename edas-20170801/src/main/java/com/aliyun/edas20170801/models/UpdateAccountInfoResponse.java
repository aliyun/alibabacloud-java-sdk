// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateAccountInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAccountInfoResponseBody body;

    public static UpdateAccountInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAccountInfoResponse self = new UpdateAccountInfoResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAccountInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAccountInfoResponse setBody(UpdateAccountInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAccountInfoResponseBody getBody() {
        return this.body;
    }

}
