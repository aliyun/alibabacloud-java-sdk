// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateVirtualResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateVirtualResourceResponseBody body;

    public static CreateVirtualResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVirtualResourceResponse self = new CreateVirtualResourceResponse();
        return TeaModel.build(map, self);
    }

    public CreateVirtualResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVirtualResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVirtualResourceResponse setBody(CreateVirtualResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVirtualResourceResponseBody getBody() {
        return this.body;
    }

}
