// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateTableAddColumnResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateTableAddColumnResponseBody body;

    public static UpdateTableAddColumnResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTableAddColumnResponse self = new UpdateTableAddColumnResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTableAddColumnResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTableAddColumnResponse setBody(UpdateTableAddColumnResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTableAddColumnResponseBody getBody() {
        return this.body;
    }

}
