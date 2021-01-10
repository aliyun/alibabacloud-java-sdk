// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class UpdateMediaPublishStateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateMediaPublishStateResponseBody body;

    public static UpdateMediaPublishStateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMediaPublishStateResponse self = new UpdateMediaPublishStateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMediaPublishStateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMediaPublishStateResponse setBody(UpdateMediaPublishStateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMediaPublishStateResponseBody getBody() {
        return this.body;
    }

}
