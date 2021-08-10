// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class GetPatentPlanInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetPatentPlanInfoResponseBody body;

    public static GetPatentPlanInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPatentPlanInfoResponse self = new GetPatentPlanInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetPatentPlanInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPatentPlanInfoResponse setBody(GetPatentPlanInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPatentPlanInfoResponseBody getBody() {
        return this.body;
    }

}
