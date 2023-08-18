// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class GetRawPlanJsonResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetRawPlanJsonResponseBody body;

    public static GetRawPlanJsonResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRawPlanJsonResponse self = new GetRawPlanJsonResponse();
        return TeaModel.build(map, self);
    }

    public GetRawPlanJsonResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRawPlanJsonResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRawPlanJsonResponse setBody(GetRawPlanJsonResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRawPlanJsonResponseBody getBody() {
        return this.body;
    }

}
