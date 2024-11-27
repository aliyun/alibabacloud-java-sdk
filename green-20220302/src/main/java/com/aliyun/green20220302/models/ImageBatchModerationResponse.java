// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class ImageBatchModerationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImageBatchModerationResponseBody body;

    public static ImageBatchModerationResponse build(java.util.Map<String, ?> map) throws Exception {
        ImageBatchModerationResponse self = new ImageBatchModerationResponse();
        return TeaModel.build(map, self);
    }

    public ImageBatchModerationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImageBatchModerationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImageBatchModerationResponse setBody(ImageBatchModerationResponseBody body) {
        this.body = body;
        return this;
    }
    public ImageBatchModerationResponseBody getBody() {
        return this.body;
    }

}
