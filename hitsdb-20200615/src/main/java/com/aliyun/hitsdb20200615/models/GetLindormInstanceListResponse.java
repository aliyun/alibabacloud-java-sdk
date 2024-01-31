// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class GetLindormInstanceListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLindormInstanceListResponseBody body;

    public static GetLindormInstanceListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLindormInstanceListResponse self = new GetLindormInstanceListResponse();
        return TeaModel.build(map, self);
    }

    public GetLindormInstanceListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLindormInstanceListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLindormInstanceListResponse setBody(GetLindormInstanceListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLindormInstanceListResponseBody getBody() {
        return this.body;
    }

}
