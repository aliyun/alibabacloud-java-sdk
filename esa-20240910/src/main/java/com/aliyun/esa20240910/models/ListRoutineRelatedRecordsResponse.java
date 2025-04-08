// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListRoutineRelatedRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRoutineRelatedRecordsResponseBody body;

    public static ListRoutineRelatedRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRoutineRelatedRecordsResponse self = new ListRoutineRelatedRecordsResponse();
        return TeaModel.build(map, self);
    }

    public ListRoutineRelatedRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRoutineRelatedRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRoutineRelatedRecordsResponse setBody(ListRoutineRelatedRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRoutineRelatedRecordsResponseBody getBody() {
        return this.body;
    }

}
