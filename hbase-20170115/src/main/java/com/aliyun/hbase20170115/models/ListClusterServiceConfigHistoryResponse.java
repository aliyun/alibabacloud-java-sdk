// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class ListClusterServiceConfigHistoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListClusterServiceConfigHistoryResponseBody body;

    public static ListClusterServiceConfigHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClusterServiceConfigHistoryResponse self = new ListClusterServiceConfigHistoryResponse();
        return TeaModel.build(map, self);
    }

    public ListClusterServiceConfigHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClusterServiceConfigHistoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListClusterServiceConfigHistoryResponse setBody(ListClusterServiceConfigHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClusterServiceConfigHistoryResponseBody getBody() {
        return this.body;
    }

}
