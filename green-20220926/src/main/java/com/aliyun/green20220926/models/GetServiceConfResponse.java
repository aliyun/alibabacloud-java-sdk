// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetServiceConfResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetServiceConfResponseBody body;

    public static GetServiceConfResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceConfResponse self = new GetServiceConfResponse();
        return TeaModel.build(map, self);
    }

    public GetServiceConfResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetServiceConfResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetServiceConfResponse setBody(GetServiceConfResponseBody body) {
        this.body = body;
        return this;
    }
    public GetServiceConfResponseBody getBody() {
        return this.body;
    }

}
