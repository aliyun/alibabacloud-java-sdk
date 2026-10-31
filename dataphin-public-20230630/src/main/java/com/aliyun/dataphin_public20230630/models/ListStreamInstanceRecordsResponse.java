// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListStreamInstanceRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListStreamInstanceRecordsResponseBody body;

    public static ListStreamInstanceRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListStreamInstanceRecordsResponse self = new ListStreamInstanceRecordsResponse();
        return TeaModel.build(map, self);
    }

    public ListStreamInstanceRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListStreamInstanceRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListStreamInstanceRecordsResponse setBody(ListStreamInstanceRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListStreamInstanceRecordsResponseBody getBody() {
        return this.body;
    }

}
