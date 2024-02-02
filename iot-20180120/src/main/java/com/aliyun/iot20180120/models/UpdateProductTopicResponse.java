// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateProductTopicResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateProductTopicResponseBody body;

    public static UpdateProductTopicResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateProductTopicResponse self = new UpdateProductTopicResponse();
        return TeaModel.build(map, self);
    }

    public UpdateProductTopicResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateProductTopicResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateProductTopicResponse setBody(UpdateProductTopicResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateProductTopicResponseBody getBody() {
        return this.body;
    }

}
