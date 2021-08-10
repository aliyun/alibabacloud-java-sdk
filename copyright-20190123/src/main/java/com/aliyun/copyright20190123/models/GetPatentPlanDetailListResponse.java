// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class GetPatentPlanDetailListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetPatentPlanDetailListResponseBody body;

    public static GetPatentPlanDetailListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPatentPlanDetailListResponse self = new GetPatentPlanDetailListResponse();
        return TeaModel.build(map, self);
    }

    public GetPatentPlanDetailListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPatentPlanDetailListResponse setBody(GetPatentPlanDetailListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPatentPlanDetailListResponseBody getBody() {
        return this.body;
    }

}
