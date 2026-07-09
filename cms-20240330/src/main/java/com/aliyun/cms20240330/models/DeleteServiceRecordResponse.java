// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteServiceRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteServiceRecordResponseBody body;

    public static DeleteServiceRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceRecordResponse self = new DeleteServiceRecordResponse();
        return TeaModel.build(map, self);
    }

    public DeleteServiceRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteServiceRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteServiceRecordResponse setBody(DeleteServiceRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteServiceRecordResponseBody getBody() {
        return this.body;
    }

}
