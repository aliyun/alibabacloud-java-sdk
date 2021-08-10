// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class GetPatentPlanListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetPatentPlanListResponseBody body;

    public static GetPatentPlanListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPatentPlanListResponse self = new GetPatentPlanListResponse();
        return TeaModel.build(map, self);
    }

    public GetPatentPlanListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPatentPlanListResponse setBody(GetPatentPlanListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPatentPlanListResponseBody getBody() {
        return this.body;
    }

}
