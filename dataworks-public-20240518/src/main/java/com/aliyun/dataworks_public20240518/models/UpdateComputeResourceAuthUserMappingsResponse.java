// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateComputeResourceAuthUserMappingsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateComputeResourceAuthUserMappingsResponseBody body;

    public static UpdateComputeResourceAuthUserMappingsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateComputeResourceAuthUserMappingsResponse self = new UpdateComputeResourceAuthUserMappingsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateComputeResourceAuthUserMappingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateComputeResourceAuthUserMappingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateComputeResourceAuthUserMappingsResponse setBody(UpdateComputeResourceAuthUserMappingsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateComputeResourceAuthUserMappingsResponseBody getBody() {
        return this.body;
    }

}
