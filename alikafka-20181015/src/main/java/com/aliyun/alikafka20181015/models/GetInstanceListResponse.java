// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20181015.models;

import com.aliyun.tea.*;

public class GetInstanceListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInstanceListResponseBody body;

    public static GetInstanceListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceListResponse self = new GetInstanceListResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceListResponse setBody(GetInstanceListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceListResponseBody getBody() {
        return this.body;
    }

}
