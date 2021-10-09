// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class UpdateCurrentItemResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateCurrentItemResponseBody body;

    public static UpdateCurrentItemResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCurrentItemResponse self = new UpdateCurrentItemResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCurrentItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCurrentItemResponse setBody(UpdateCurrentItemResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCurrentItemResponseBody getBody() {
        return this.body;
    }

}
