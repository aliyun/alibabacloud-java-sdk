// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class UpdateResourceContentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateResourceContentResponseBody body;

    public static UpdateResourceContentResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceContentResponse self = new UpdateResourceContentResponse();
        return TeaModel.build(map, self);
    }

    public UpdateResourceContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateResourceContentResponse setBody(UpdateResourceContentResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateResourceContentResponseBody getBody() {
        return this.body;
    }

}
