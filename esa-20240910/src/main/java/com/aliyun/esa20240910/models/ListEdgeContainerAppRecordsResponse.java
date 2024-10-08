// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListEdgeContainerAppRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEdgeContainerAppRecordsResponseBody body;

    public static ListEdgeContainerAppRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEdgeContainerAppRecordsResponse self = new ListEdgeContainerAppRecordsResponse();
        return TeaModel.build(map, self);
    }

    public ListEdgeContainerAppRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEdgeContainerAppRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEdgeContainerAppRecordsResponse setBody(ListEdgeContainerAppRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEdgeContainerAppRecordsResponseBody getBody() {
        return this.body;
    }

}
