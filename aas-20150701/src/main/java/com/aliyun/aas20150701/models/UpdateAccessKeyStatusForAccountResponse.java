// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aas20150701.models;

import com.aliyun.tea.*;

public class UpdateAccessKeyStatusForAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAccessKeyStatusForAccountResponseBody body;

    public static UpdateAccessKeyStatusForAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAccessKeyStatusForAccountResponse self = new UpdateAccessKeyStatusForAccountResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAccessKeyStatusForAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAccessKeyStatusForAccountResponse setBody(UpdateAccessKeyStatusForAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAccessKeyStatusForAccountResponseBody getBody() {
        return this.body;
    }

}
