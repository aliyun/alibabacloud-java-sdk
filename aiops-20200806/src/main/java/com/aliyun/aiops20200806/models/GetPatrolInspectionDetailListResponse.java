// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetPatrolInspectionDetailListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPatrolInspectionDetailListResponseBody body;

    public static GetPatrolInspectionDetailListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPatrolInspectionDetailListResponse self = new GetPatrolInspectionDetailListResponse();
        return TeaModel.build(map, self);
    }

    public GetPatrolInspectionDetailListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPatrolInspectionDetailListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPatrolInspectionDetailListResponse setBody(GetPatrolInspectionDetailListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPatrolInspectionDetailListResponseBody getBody() {
        return this.body;
    }

}
