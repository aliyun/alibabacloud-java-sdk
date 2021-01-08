// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class UpdateFileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateFileResponseBody body;

    public static UpdateFileResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFileResponse self = new UpdateFileResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFileResponse setBody(UpdateFileResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFileResponseBody getBody() {
        return this.body;
    }

}
