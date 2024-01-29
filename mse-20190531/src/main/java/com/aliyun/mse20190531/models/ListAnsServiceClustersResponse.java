// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListAnsServiceClustersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAnsServiceClustersResponseBody body;

    public static ListAnsServiceClustersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAnsServiceClustersResponse self = new ListAnsServiceClustersResponse();
        return TeaModel.build(map, self);
    }

    public ListAnsServiceClustersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAnsServiceClustersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAnsServiceClustersResponse setBody(ListAnsServiceClustersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAnsServiceClustersResponseBody getBody() {
        return this.body;
    }

}
