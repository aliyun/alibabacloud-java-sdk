// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class CreateReservedNodePoolResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateReservedNodePoolResponseBody body;

    public static CreateReservedNodePoolResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateReservedNodePoolResponse self = new CreateReservedNodePoolResponse();
        return TeaModel.build(map, self);
    }

    public CreateReservedNodePoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateReservedNodePoolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateReservedNodePoolResponse setBody(CreateReservedNodePoolResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateReservedNodePoolResponseBody getBody() {
        return this.body;
    }

}
