// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListRecordingsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRecordingsResponseBody body;

    public static ListRecordingsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRecordingsResponse self = new ListRecordingsResponse();
        return TeaModel.build(map, self);
    }

    public ListRecordingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRecordingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRecordingsResponse setBody(ListRecordingsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRecordingsResponseBody getBody() {
        return this.body;
    }

}
