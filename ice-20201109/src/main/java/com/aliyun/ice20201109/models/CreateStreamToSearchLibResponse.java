// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateStreamToSearchLibResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateStreamToSearchLibResponseBody body;

    public static CreateStreamToSearchLibResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateStreamToSearchLibResponse self = new CreateStreamToSearchLibResponse();
        return TeaModel.build(map, self);
    }

    public CreateStreamToSearchLibResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateStreamToSearchLibResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateStreamToSearchLibResponse setBody(CreateStreamToSearchLibResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateStreamToSearchLibResponseBody getBody() {
        return this.body;
    }

}
