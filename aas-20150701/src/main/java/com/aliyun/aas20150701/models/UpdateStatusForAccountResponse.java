// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aas20150701.models;

import com.aliyun.tea.*;

public class UpdateStatusForAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateStatusForAccountResponseBody body;

    public static UpdateStatusForAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateStatusForAccountResponse self = new UpdateStatusForAccountResponse();
        return TeaModel.build(map, self);
    }

    public UpdateStatusForAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateStatusForAccountResponse setBody(UpdateStatusForAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateStatusForAccountResponseBody getBody() {
        return this.body;
    }

}
