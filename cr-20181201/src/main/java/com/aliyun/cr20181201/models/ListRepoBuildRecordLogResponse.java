// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListRepoBuildRecordLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRepoBuildRecordLogResponseBody body;

    public static ListRepoBuildRecordLogResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRepoBuildRecordLogResponse self = new ListRepoBuildRecordLogResponse();
        return TeaModel.build(map, self);
    }

    public ListRepoBuildRecordLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRepoBuildRecordLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRepoBuildRecordLogResponse setBody(ListRepoBuildRecordLogResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRepoBuildRecordLogResponseBody getBody() {
        return this.body;
    }

}
