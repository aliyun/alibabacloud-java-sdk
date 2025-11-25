// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateComputeResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateComputeResourceResponseBody body;

    public static CreateComputeResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateComputeResourceResponse self = new CreateComputeResourceResponse();
        return TeaModel.build(map, self);
    }

    public CreateComputeResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateComputeResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateComputeResourceResponse setBody(CreateComputeResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateComputeResourceResponseBody getBody() {
        return this.body;
    }

}
