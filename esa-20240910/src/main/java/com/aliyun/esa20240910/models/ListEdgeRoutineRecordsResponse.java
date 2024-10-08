// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListEdgeRoutineRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEdgeRoutineRecordsResponseBody body;

    public static ListEdgeRoutineRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEdgeRoutineRecordsResponse self = new ListEdgeRoutineRecordsResponse();
        return TeaModel.build(map, self);
    }

    public ListEdgeRoutineRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEdgeRoutineRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEdgeRoutineRecordsResponse setBody(ListEdgeRoutineRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEdgeRoutineRecordsResponseBody getBody() {
        return this.body;
    }

}
