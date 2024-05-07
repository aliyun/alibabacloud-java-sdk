// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class CreateLoginProfileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateLoginProfileResponseBody body;

    public static CreateLoginProfileResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLoginProfileResponse self = new CreateLoginProfileResponse();
        return TeaModel.build(map, self);
    }

    public CreateLoginProfileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLoginProfileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLoginProfileResponse setBody(CreateLoginProfileResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLoginProfileResponseBody getBody() {
        return this.body;
    }

}
