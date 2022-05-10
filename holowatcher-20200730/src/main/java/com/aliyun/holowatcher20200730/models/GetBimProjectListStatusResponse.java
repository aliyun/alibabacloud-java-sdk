// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetBimProjectListStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetBimProjectListStatusResponseBody body;

    public static GetBimProjectListStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBimProjectListStatusResponse self = new GetBimProjectListStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetBimProjectListStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBimProjectListStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBimProjectListStatusResponse setBody(GetBimProjectListStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBimProjectListStatusResponseBody getBody() {
        return this.body;
    }

}
