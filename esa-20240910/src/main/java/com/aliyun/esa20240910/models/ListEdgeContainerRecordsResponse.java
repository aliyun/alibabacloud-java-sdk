// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListEdgeContainerRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEdgeContainerRecordsResponseBody body;

    public static ListEdgeContainerRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEdgeContainerRecordsResponse self = new ListEdgeContainerRecordsResponse();
        return TeaModel.build(map, self);
    }

    public ListEdgeContainerRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEdgeContainerRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEdgeContainerRecordsResponse setBody(ListEdgeContainerRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEdgeContainerRecordsResponseBody getBody() {
        return this.body;
    }

}
