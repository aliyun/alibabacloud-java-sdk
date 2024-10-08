// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateRecordResponseBody body;

    public static UpdateRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRecordResponse self = new UpdateRecordResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRecordResponse setBody(UpdateRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRecordResponseBody getBody() {
        return this.body;
    }

}
