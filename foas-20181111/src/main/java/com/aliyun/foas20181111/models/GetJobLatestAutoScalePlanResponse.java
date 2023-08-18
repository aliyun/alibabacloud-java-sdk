// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class GetJobLatestAutoScalePlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetJobLatestAutoScalePlanResponseBody body;

    public static GetJobLatestAutoScalePlanResponse build(java.util.Map<String, ?> map) throws Exception {
        GetJobLatestAutoScalePlanResponse self = new GetJobLatestAutoScalePlanResponse();
        return TeaModel.build(map, self);
    }

    public GetJobLatestAutoScalePlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetJobLatestAutoScalePlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetJobLatestAutoScalePlanResponse setBody(GetJobLatestAutoScalePlanResponseBody body) {
        this.body = body;
        return this;
    }
    public GetJobLatestAutoScalePlanResponseBody getBody() {
        return this.body;
    }

}
