// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetInstanceStateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInstanceStateResponseBody body;

    public static GetInstanceStateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceStateResponse self = new GetInstanceStateResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceStateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceStateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceStateResponse setBody(GetInstanceStateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceStateResponseBody getBody() {
        return this.body;
    }

}
