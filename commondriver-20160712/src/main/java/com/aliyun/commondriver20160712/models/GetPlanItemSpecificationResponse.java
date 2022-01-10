// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.commondriver20160712.models;

import com.aliyun.tea.*;

public class GetPlanItemSpecificationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetPlanItemSpecificationResponseBody body;

    public static GetPlanItemSpecificationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPlanItemSpecificationResponse self = new GetPlanItemSpecificationResponse();
        return TeaModel.build(map, self);
    }

    public GetPlanItemSpecificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPlanItemSpecificationResponse setBody(GetPlanItemSpecificationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPlanItemSpecificationResponseBody getBody() {
        return this.body;
    }

}
