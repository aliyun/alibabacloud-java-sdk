// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListRepoBuildRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRepoBuildRecordResponseBody body;

    public static ListRepoBuildRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRepoBuildRecordResponse self = new ListRepoBuildRecordResponse();
        return TeaModel.build(map, self);
    }

    public ListRepoBuildRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRepoBuildRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRepoBuildRecordResponse setBody(ListRepoBuildRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRepoBuildRecordResponseBody getBody() {
        return this.body;
    }

}
