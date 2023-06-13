// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetServiceListPageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetServiceListPageResponseBody body;

    public static GetServiceListPageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceListPageResponse self = new GetServiceListPageResponse();
        return TeaModel.build(map, self);
    }

    public GetServiceListPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetServiceListPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetServiceListPageResponse setBody(GetServiceListPageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetServiceListPageResponseBody getBody() {
        return this.body;
    }

}
