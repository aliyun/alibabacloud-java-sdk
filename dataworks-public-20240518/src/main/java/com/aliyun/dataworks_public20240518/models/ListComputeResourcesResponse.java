// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListComputeResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListComputeResourcesResponseBody body;

    public static ListComputeResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListComputeResourcesResponse self = new ListComputeResourcesResponse();
        return TeaModel.build(map, self);
    }

    public ListComputeResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListComputeResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListComputeResourcesResponse setBody(ListComputeResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListComputeResourcesResponseBody getBody() {
        return this.body;
    }

}
