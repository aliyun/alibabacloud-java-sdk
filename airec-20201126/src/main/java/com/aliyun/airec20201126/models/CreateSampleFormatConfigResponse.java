// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class CreateSampleFormatConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSampleFormatConfigResponseBody body;

    public static CreateSampleFormatConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSampleFormatConfigResponse self = new CreateSampleFormatConfigResponse();
        return TeaModel.build(map, self);
    }

    public CreateSampleFormatConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSampleFormatConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSampleFormatConfigResponse setBody(CreateSampleFormatConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSampleFormatConfigResponseBody getBody() {
        return this.body;
    }

}
