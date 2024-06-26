// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreateCloudServiceSessionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCloudServiceSessionResponseBody body;

    public static CreateCloudServiceSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudServiceSessionResponse self = new CreateCloudServiceSessionResponse();
        return TeaModel.build(map, self);
    }

    public CreateCloudServiceSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCloudServiceSessionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCloudServiceSessionResponse setBody(CreateCloudServiceSessionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCloudServiceSessionResponseBody getBody() {
        return this.body;
    }

}
