// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class GetApmDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetApmDataResponseBody body;

    public static GetApmDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetApmDataResponse self = new GetApmDataResponse();
        return TeaModel.build(map, self);
    }

    public GetApmDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetApmDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetApmDataResponse setBody(GetApmDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetApmDataResponseBody getBody() {
        return this.body;
    }

}
