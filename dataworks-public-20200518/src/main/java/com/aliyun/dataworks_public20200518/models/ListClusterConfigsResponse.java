// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListClusterConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListClusterConfigsResponseBody body;

    public static ListClusterConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClusterConfigsResponse self = new ListClusterConfigsResponse();
        return TeaModel.build(map, self);
    }

    public ListClusterConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClusterConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListClusterConfigsResponse setBody(ListClusterConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClusterConfigsResponseBody getBody() {
        return this.body;
    }

}
