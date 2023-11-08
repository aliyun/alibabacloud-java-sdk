// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class GetEnterpriseDataChunkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetEnterpriseDataChunkResponseBody body;

    public static GetEnterpriseDataChunkResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEnterpriseDataChunkResponse self = new GetEnterpriseDataChunkResponse();
        return TeaModel.build(map, self);
    }

    public GetEnterpriseDataChunkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEnterpriseDataChunkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEnterpriseDataChunkResponse setBody(GetEnterpriseDataChunkResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEnterpriseDataChunkResponseBody getBody() {
        return this.body;
    }

}
