// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class GetAppliesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAppliesResponseBody body;

    public static GetAppliesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppliesResponse self = new GetAppliesResponse();
        return TeaModel.build(map, self);
    }

    public GetAppliesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAppliesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAppliesResponse setBody(GetAppliesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAppliesResponseBody getBody() {
        return this.body;
    }

}
