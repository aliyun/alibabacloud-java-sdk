// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetBimProjectListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetBimProjectListResponseBody body;

    public static GetBimProjectListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBimProjectListResponse self = new GetBimProjectListResponse();
        return TeaModel.build(map, self);
    }

    public GetBimProjectListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBimProjectListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBimProjectListResponse setBody(GetBimProjectListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBimProjectListResponseBody getBody() {
        return this.body;
    }

}
