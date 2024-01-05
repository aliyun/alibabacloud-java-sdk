// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.igraph20210621.models;

import com.aliyun.tea.*;

public class GetInstanceDigestResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetInstanceDigestResponseBody body;

    public static GetInstanceDigestResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceDigestResponse self = new GetInstanceDigestResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceDigestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceDigestResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceDigestResponse setBody(GetInstanceDigestResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceDigestResponseBody getBody() {
        return this.body;
    }

}
