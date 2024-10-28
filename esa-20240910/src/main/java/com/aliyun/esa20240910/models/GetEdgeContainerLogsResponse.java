// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetEdgeContainerLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEdgeContainerLogsResponseBody body;

    public static GetEdgeContainerLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEdgeContainerLogsResponse self = new GetEdgeContainerLogsResponse();
        return TeaModel.build(map, self);
    }

    public GetEdgeContainerLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEdgeContainerLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEdgeContainerLogsResponse setBody(GetEdgeContainerLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEdgeContainerLogsResponseBody getBody() {
        return this.body;
    }

}
