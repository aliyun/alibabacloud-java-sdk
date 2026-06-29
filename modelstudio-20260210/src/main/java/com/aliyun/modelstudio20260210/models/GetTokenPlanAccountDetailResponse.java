// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class GetTokenPlanAccountDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTokenPlanAccountDetailResponseBody body;

    public static GetTokenPlanAccountDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTokenPlanAccountDetailResponse self = new GetTokenPlanAccountDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetTokenPlanAccountDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTokenPlanAccountDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTokenPlanAccountDetailResponse setBody(GetTokenPlanAccountDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTokenPlanAccountDetailResponseBody getBody() {
        return this.body;
    }

}
