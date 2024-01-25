// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetPatrolInspectionListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPatrolInspectionListResponseBody body;

    public static GetPatrolInspectionListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPatrolInspectionListResponse self = new GetPatrolInspectionListResponse();
        return TeaModel.build(map, self);
    }

    public GetPatrolInspectionListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPatrolInspectionListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPatrolInspectionListResponse setBody(GetPatrolInspectionListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPatrolInspectionListResponseBody getBody() {
        return this.body;
    }

}
