// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240118.models;

import com.aliyun.tea.*;

public class GetRemainResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRemainResourceResponseBody body;

    public static GetRemainResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRemainResourceResponse self = new GetRemainResourceResponse();
        return TeaModel.build(map, self);
    }

    public GetRemainResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRemainResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRemainResourceResponse setBody(GetRemainResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRemainResourceResponseBody getBody() {
        return this.body;
    }

}
