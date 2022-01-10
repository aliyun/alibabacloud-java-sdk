// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.commondriver20160712.models;

import com.aliyun.tea.*;

public class GetPlanSpecificationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetPlanSpecificationResponseBody body;

    public static GetPlanSpecificationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPlanSpecificationResponse self = new GetPlanSpecificationResponse();
        return TeaModel.build(map, self);
    }

    public GetPlanSpecificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPlanSpecificationResponse setBody(GetPlanSpecificationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPlanSpecificationResponseBody getBody() {
        return this.body;
    }

}
