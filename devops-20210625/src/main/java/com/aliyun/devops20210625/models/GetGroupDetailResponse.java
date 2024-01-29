// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetGroupDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetGroupDetailResponseBody body;

    public static GetGroupDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGroupDetailResponse self = new GetGroupDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetGroupDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGroupDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGroupDetailResponse setBody(GetGroupDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGroupDetailResponseBody getBody() {
        return this.body;
    }

}
