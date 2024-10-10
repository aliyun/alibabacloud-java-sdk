// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListEdgeRoutinePlansResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEdgeRoutinePlansResponseBody body;

    public static ListEdgeRoutinePlansResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEdgeRoutinePlansResponse self = new ListEdgeRoutinePlansResponse();
        return TeaModel.build(map, self);
    }

    public ListEdgeRoutinePlansResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEdgeRoutinePlansResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEdgeRoutinePlansResponse setBody(ListEdgeRoutinePlansResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEdgeRoutinePlansResponseBody getBody() {
        return this.body;
    }

}
