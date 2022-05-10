// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetBimStandardPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetBimStandardPlanResponseBody body;

    public static GetBimStandardPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBimStandardPlanResponse self = new GetBimStandardPlanResponse();
        return TeaModel.build(map, self);
    }

    public GetBimStandardPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBimStandardPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBimStandardPlanResponse setBody(GetBimStandardPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBimStandardPlanResponseBody getBody() {
        return this.body;
    }

}
