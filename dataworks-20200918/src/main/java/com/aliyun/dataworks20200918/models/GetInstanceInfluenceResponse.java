// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class GetInstanceInfluenceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInstanceInfluenceResponseBody body;

    public static GetInstanceInfluenceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceInfluenceResponse self = new GetInstanceInfluenceResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceInfluenceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceInfluenceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceInfluenceResponse setBody(GetInstanceInfluenceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceInfluenceResponseBody getBody() {
        return this.body;
    }

}
