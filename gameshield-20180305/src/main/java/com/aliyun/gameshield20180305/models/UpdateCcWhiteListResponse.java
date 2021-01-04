// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class UpdateCcWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateCcWhiteListResponseBody body;

    public static UpdateCcWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCcWhiteListResponse self = new UpdateCcWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCcWhiteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCcWhiteListResponse setBody(UpdateCcWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCcWhiteListResponseBody getBody() {
        return this.body;
    }

}
