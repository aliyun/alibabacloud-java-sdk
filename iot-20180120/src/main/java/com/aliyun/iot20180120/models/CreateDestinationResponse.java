// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateDestinationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDestinationResponseBody body;

    public static CreateDestinationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDestinationResponse self = new CreateDestinationResponse();
        return TeaModel.build(map, self);
    }

    public CreateDestinationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDestinationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDestinationResponse setBody(CreateDestinationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDestinationResponseBody getBody() {
        return this.body;
    }

}
