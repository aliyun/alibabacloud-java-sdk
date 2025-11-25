// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetComputeResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetComputeResourceResponseBody body;

    public static GetComputeResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetComputeResourceResponse self = new GetComputeResourceResponse();
        return TeaModel.build(map, self);
    }

    public GetComputeResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetComputeResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetComputeResourceResponse setBody(GetComputeResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetComputeResourceResponseBody getBody() {
        return this.body;
    }

}
