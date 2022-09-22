// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class CreateVolumesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateVolumesResponseBody body;

    public static CreateVolumesResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVolumesResponse self = new CreateVolumesResponse();
        return TeaModel.build(map, self);
    }

    public CreateVolumesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVolumesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVolumesResponse setBody(CreateVolumesResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVolumesResponseBody getBody() {
        return this.body;
    }

}
