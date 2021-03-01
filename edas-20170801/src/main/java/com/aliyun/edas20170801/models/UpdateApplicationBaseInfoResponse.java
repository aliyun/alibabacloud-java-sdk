// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateApplicationBaseInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateApplicationBaseInfoResponseBody body;

    public static UpdateApplicationBaseInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationBaseInfoResponse self = new UpdateApplicationBaseInfoResponse();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationBaseInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateApplicationBaseInfoResponse setBody(UpdateApplicationBaseInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateApplicationBaseInfoResponseBody getBody() {
        return this.body;
    }

}
