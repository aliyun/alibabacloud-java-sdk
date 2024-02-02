// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateTopicConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTopicConfigResponseBody body;

    public static CreateTopicConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTopicConfigResponse self = new CreateTopicConfigResponse();
        return TeaModel.build(map, self);
    }

    public CreateTopicConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTopicConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTopicConfigResponse setBody(CreateTopicConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTopicConfigResponseBody getBody() {
        return this.body;
    }

}
