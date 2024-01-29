// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class UpdateFaqResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateFaqResponseBody body;

    public static UpdateFaqResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFaqResponse self = new UpdateFaqResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFaqResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFaqResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateFaqResponse setBody(UpdateFaqResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFaqResponseBody getBody() {
        return this.body;
    }

}
