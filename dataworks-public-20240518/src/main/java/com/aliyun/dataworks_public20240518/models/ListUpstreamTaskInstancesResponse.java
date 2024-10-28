// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListUpstreamTaskInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUpstreamTaskInstancesResponseBody body;

    public static ListUpstreamTaskInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUpstreamTaskInstancesResponse self = new ListUpstreamTaskInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListUpstreamTaskInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUpstreamTaskInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUpstreamTaskInstancesResponse setBody(ListUpstreamTaskInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUpstreamTaskInstancesResponseBody getBody() {
        return this.body;
    }

}
