// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetStockOssCheckTasksListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetStockOssCheckTasksListResponseBody body;

    public static GetStockOssCheckTasksListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStockOssCheckTasksListResponse self = new GetStockOssCheckTasksListResponse();
        return TeaModel.build(map, self);
    }

    public GetStockOssCheckTasksListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetStockOssCheckTasksListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetStockOssCheckTasksListResponse setBody(GetStockOssCheckTasksListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStockOssCheckTasksListResponseBody getBody() {
        return this.body;
    }

}
