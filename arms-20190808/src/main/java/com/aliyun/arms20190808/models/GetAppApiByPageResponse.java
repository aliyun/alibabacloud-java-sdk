// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetAppApiByPageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAppApiByPageResponseBody body;

    public static GetAppApiByPageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppApiByPageResponse self = new GetAppApiByPageResponse();
        return TeaModel.build(map, self);
    }

    public GetAppApiByPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAppApiByPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAppApiByPageResponse setBody(GetAppApiByPageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAppApiByPageResponseBody getBody() {
        return this.body;
    }

}
