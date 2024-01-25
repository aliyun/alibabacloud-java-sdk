// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetPatrolInspectionItemsListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPatrolInspectionItemsListResponseBody body;

    public static GetPatrolInspectionItemsListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPatrolInspectionItemsListResponse self = new GetPatrolInspectionItemsListResponse();
        return TeaModel.build(map, self);
    }

    public GetPatrolInspectionItemsListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPatrolInspectionItemsListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPatrolInspectionItemsListResponse setBody(GetPatrolInspectionItemsListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPatrolInspectionItemsListResponseBody getBody() {
        return this.body;
    }

}
