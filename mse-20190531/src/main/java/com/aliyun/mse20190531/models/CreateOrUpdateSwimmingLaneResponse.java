// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateOrUpdateSwimmingLaneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateOrUpdateSwimmingLaneResponseBody body;

    public static CreateOrUpdateSwimmingLaneResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateSwimmingLaneResponse self = new CreateOrUpdateSwimmingLaneResponse();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateSwimmingLaneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOrUpdateSwimmingLaneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOrUpdateSwimmingLaneResponse setBody(CreateOrUpdateSwimmingLaneResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOrUpdateSwimmingLaneResponseBody getBody() {
        return this.body;
    }

}
