// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class ImageQueueModerationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImageQueueModerationResponseBody body;

    public static ImageQueueModerationResponse build(java.util.Map<String, ?> map) throws Exception {
        ImageQueueModerationResponse self = new ImageQueueModerationResponse();
        return TeaModel.build(map, self);
    }

    public ImageQueueModerationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImageQueueModerationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImageQueueModerationResponse setBody(ImageQueueModerationResponseBody body) {
        this.body = body;
        return this;
    }
    public ImageQueueModerationResponseBody getBody() {
        return this.body;
    }

}
