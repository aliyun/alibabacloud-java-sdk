// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.image_detect20211221.models;

import com.aliyun.tea.*;

public class DeleteOssConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteOssConfigResponseBody body;

    public static DeleteOssConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteOssConfigResponse self = new DeleteOssConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteOssConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteOssConfigResponse setBody(DeleteOssConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteOssConfigResponseBody getBody() {
        return this.body;
    }

}
