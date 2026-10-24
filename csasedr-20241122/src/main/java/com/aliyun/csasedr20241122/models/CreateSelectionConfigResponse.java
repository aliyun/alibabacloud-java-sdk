// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csasedr20241122.models;

import com.aliyun.tea.*;

public class CreateSelectionConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSelectionConfigResponseBody body;

    public static CreateSelectionConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSelectionConfigResponse self = new CreateSelectionConfigResponse();
        return TeaModel.build(map, self);
    }

    public CreateSelectionConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSelectionConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSelectionConfigResponse setBody(CreateSelectionConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSelectionConfigResponseBody getBody() {
        return this.body;
    }

}
