// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CreateDetectConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDetectConfigResponseBody body;

    public static CreateDetectConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDetectConfigResponse self = new CreateDetectConfigResponse();
        return TeaModel.build(map, self);
    }

    public CreateDetectConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDetectConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDetectConfigResponse setBody(CreateDetectConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDetectConfigResponseBody getBody() {
        return this.body;
    }

}
