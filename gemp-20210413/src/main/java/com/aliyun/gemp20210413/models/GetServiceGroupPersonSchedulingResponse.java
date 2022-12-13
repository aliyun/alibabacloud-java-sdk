// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetServiceGroupPersonSchedulingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetServiceGroupPersonSchedulingResponseBody body;

    public static GetServiceGroupPersonSchedulingResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceGroupPersonSchedulingResponse self = new GetServiceGroupPersonSchedulingResponse();
        return TeaModel.build(map, self);
    }

    public GetServiceGroupPersonSchedulingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetServiceGroupPersonSchedulingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetServiceGroupPersonSchedulingResponse setBody(GetServiceGroupPersonSchedulingResponseBody body) {
        this.body = body;
        return this;
    }
    public GetServiceGroupPersonSchedulingResponseBody getBody() {
        return this.body;
    }

}
