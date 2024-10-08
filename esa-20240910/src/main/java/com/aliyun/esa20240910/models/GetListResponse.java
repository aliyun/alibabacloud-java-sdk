// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetListResponseBody body;

    public static GetListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetListResponse self = new GetListResponse();
        return TeaModel.build(map, self);
    }

    public GetListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetListResponse setBody(GetListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetListResponseBody getBody() {
        return this.body;
    }

}
