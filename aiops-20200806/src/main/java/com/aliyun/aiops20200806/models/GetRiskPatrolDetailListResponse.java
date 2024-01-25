// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetRiskPatrolDetailListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRiskPatrolDetailListResponseBody body;

    public static GetRiskPatrolDetailListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRiskPatrolDetailListResponse self = new GetRiskPatrolDetailListResponse();
        return TeaModel.build(map, self);
    }

    public GetRiskPatrolDetailListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRiskPatrolDetailListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRiskPatrolDetailListResponse setBody(GetRiskPatrolDetailListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRiskPatrolDetailListResponseBody getBody() {
        return this.body;
    }

}
