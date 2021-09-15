// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class UpdatePageModelContentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdatePageModelContentResponseBody body;

    public static UpdatePageModelContentResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePageModelContentResponse self = new UpdatePageModelContentResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePageModelContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePageModelContentResponse setBody(UpdatePageModelContentResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePageModelContentResponseBody getBody() {
        return this.body;
    }

}
