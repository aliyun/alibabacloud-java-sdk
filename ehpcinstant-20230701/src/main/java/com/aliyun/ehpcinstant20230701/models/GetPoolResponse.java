// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class GetPoolResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPoolResponseBody body;

    public static GetPoolResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPoolResponse self = new GetPoolResponse();
        return TeaModel.build(map, self);
    }

    public GetPoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPoolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPoolResponse setBody(GetPoolResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPoolResponseBody getBody() {
        return this.body;
    }

}
