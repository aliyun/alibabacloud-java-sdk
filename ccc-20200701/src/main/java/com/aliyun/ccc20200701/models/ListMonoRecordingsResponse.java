// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListMonoRecordingsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMonoRecordingsResponseBody body;

    public static ListMonoRecordingsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMonoRecordingsResponse self = new ListMonoRecordingsResponse();
        return TeaModel.build(map, self);
    }

    public ListMonoRecordingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMonoRecordingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMonoRecordingsResponse setBody(ListMonoRecordingsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMonoRecordingsResponseBody getBody() {
        return this.body;
    }

}
