// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListComputeClustersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListComputeClustersResponseBody body;

    public static ListComputeClustersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListComputeClustersResponse self = new ListComputeClustersResponse();
        return TeaModel.build(map, self);
    }

    public ListComputeClustersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListComputeClustersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListComputeClustersResponse setBody(ListComputeClustersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListComputeClustersResponseBody getBody() {
        return this.body;
    }

}
