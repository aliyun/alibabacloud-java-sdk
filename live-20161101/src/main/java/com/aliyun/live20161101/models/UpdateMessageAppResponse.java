// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateMessageAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateMessageAppResponseBody body;

    public static UpdateMessageAppResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMessageAppResponse self = new UpdateMessageAppResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMessageAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMessageAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMessageAppResponse setBody(UpdateMessageAppResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMessageAppResponseBody getBody() {
        return this.body;
    }

}
