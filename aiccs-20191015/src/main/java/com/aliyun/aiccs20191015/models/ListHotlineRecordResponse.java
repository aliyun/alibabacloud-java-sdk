// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ListHotlineRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListHotlineRecordResponseBody body;

    public static ListHotlineRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHotlineRecordResponse self = new ListHotlineRecordResponse();
        return TeaModel.build(map, self);
    }

    public ListHotlineRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHotlineRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHotlineRecordResponse setBody(ListHotlineRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHotlineRecordResponseBody getBody() {
        return this.body;
    }

}
