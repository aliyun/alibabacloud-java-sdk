// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateRecursionRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateRecursionRecordResponseBody body;

    public static UpdateRecursionRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRecursionRecordResponse self = new UpdateRecursionRecordResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRecursionRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRecursionRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRecursionRecordResponse setBody(UpdateRecursionRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRecursionRecordResponseBody getBody() {
        return this.body;
    }

}
