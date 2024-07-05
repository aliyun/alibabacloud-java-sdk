// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class UpdateMediaPublishStateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public UpdateMediaPublishStateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMediaPublishStateResponse setBody(UpdateMediaPublishStateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMediaPublishStateResponseBody getBody() {
        return this.body;
    }

}
