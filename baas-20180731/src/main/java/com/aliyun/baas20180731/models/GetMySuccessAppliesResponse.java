// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class GetMySuccessAppliesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMySuccessAppliesResponseBody body;

    public static GetMySuccessAppliesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMySuccessAppliesResponse self = new GetMySuccessAppliesResponse();
        return TeaModel.build(map, self);
    }

    public GetMySuccessAppliesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMySuccessAppliesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMySuccessAppliesResponse setBody(GetMySuccessAppliesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMySuccessAppliesResponseBody getBody() {
        return this.body;
    }

}
