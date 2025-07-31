// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListComputeSourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListComputeSourcesResponseBody body;

    public static ListComputeSourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListComputeSourcesResponse self = new ListComputeSourcesResponse();
        return TeaModel.build(map, self);
    }

    public ListComputeSourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListComputeSourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListComputeSourcesResponse setBody(ListComputeSourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListComputeSourcesResponseBody getBody() {
        return this.body;
    }

}
