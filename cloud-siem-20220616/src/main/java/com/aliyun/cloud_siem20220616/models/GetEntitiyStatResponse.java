// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class GetEntitiyStatResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEntitiyStatResponseBody body;

    public static GetEntitiyStatResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEntitiyStatResponse self = new GetEntitiyStatResponse();
        return TeaModel.build(map, self);
    }

    public GetEntitiyStatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEntitiyStatResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEntitiyStatResponse setBody(GetEntitiyStatResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEntitiyStatResponseBody getBody() {
        return this.body;
    }

}
