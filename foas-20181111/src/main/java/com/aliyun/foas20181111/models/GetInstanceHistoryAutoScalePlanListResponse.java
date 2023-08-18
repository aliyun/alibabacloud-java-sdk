// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class GetInstanceHistoryAutoScalePlanListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetInstanceHistoryAutoScalePlanListResponseBody body;

    public static GetInstanceHistoryAutoScalePlanListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceHistoryAutoScalePlanListResponse self = new GetInstanceHistoryAutoScalePlanListResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceHistoryAutoScalePlanListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceHistoryAutoScalePlanListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceHistoryAutoScalePlanListResponse setBody(GetInstanceHistoryAutoScalePlanListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceHistoryAutoScalePlanListResponseBody getBody() {
        return this.body;
    }

}
