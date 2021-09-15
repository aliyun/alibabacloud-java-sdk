// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class UpdateModelInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateModelInfoResponseBody body;

    public static UpdateModelInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateModelInfoResponse self = new UpdateModelInfoResponse();
        return TeaModel.build(map, self);
    }

    public UpdateModelInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateModelInfoResponse setBody(UpdateModelInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateModelInfoResponseBody getBody() {
        return this.body;
    }

}
