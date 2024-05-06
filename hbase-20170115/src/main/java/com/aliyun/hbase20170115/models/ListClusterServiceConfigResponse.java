// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class ListClusterServiceConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListClusterServiceConfigResponseBody body;

    public static ListClusterServiceConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClusterServiceConfigResponse self = new ListClusterServiceConfigResponse();
        return TeaModel.build(map, self);
    }

    public ListClusterServiceConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClusterServiceConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListClusterServiceConfigResponse setBody(ListClusterServiceConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClusterServiceConfigResponseBody getBody() {
        return this.body;
    }

}
