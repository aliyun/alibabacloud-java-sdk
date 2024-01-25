// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetBusinessGroupOverviewListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBusinessGroupOverviewListResponseBody body;

    public static GetBusinessGroupOverviewListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBusinessGroupOverviewListResponse self = new GetBusinessGroupOverviewListResponse();
        return TeaModel.build(map, self);
    }

    public GetBusinessGroupOverviewListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBusinessGroupOverviewListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBusinessGroupOverviewListResponse setBody(GetBusinessGroupOverviewListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBusinessGroupOverviewListResponseBody getBody() {
        return this.body;
    }

}
