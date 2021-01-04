// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class UpdateCcBlackListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateCcBlackListResponseBody body;

    public static UpdateCcBlackListResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCcBlackListResponse self = new UpdateCcBlackListResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCcBlackListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCcBlackListResponse setBody(UpdateCcBlackListResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCcBlackListResponseBody getBody() {
        return this.body;
    }

}
