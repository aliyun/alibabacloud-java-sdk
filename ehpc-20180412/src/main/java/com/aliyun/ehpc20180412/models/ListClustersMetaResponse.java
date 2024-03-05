// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListClustersMetaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListClustersMetaResponseBody body;

    public static ListClustersMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClustersMetaResponse self = new ListClustersMetaResponse();
        return TeaModel.build(map, self);
    }

    public ListClustersMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClustersMetaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListClustersMetaResponse setBody(ListClustersMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClustersMetaResponseBody getBody() {
        return this.body;
    }

}
