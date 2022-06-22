// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class GetUserApplicationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetUserApplicationsResponseBody body;

    public static GetUserApplicationsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserApplicationsResponse self = new GetUserApplicationsResponse();
        return TeaModel.build(map, self);
    }

    public GetUserApplicationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserApplicationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserApplicationsResponse setBody(GetUserApplicationsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserApplicationsResponseBody getBody() {
        return this.body;
    }

}
