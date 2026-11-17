// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateModelApiResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateModelApiResponseBody body;

    public static UpdateModelApiResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateModelApiResponse self = new UpdateModelApiResponse();
        return TeaModel.build(map, self);
    }

    public UpdateModelApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateModelApiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateModelApiResponse setBody(UpdateModelApiResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateModelApiResponseBody getBody() {
        return this.body;
    }

}
