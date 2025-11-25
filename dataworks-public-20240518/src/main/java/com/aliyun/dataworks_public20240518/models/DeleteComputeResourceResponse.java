// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteComputeResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteComputeResourceResponseBody body;

    public static DeleteComputeResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteComputeResourceResponse self = new DeleteComputeResourceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteComputeResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteComputeResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteComputeResourceResponse setBody(DeleteComputeResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteComputeResourceResponseBody getBody() {
        return this.body;
    }

}
