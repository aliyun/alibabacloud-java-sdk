// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class DeleteApplyNumberRecordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteApplyNumberRecordResponseBody body;

    public static DeleteApplyNumberRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteApplyNumberRecordResponse self = new DeleteApplyNumberRecordResponse();
        return TeaModel.build(map, self);
    }

    public DeleteApplyNumberRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteApplyNumberRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteApplyNumberRecordResponse setBody(DeleteApplyNumberRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteApplyNumberRecordResponseBody getBody() {
        return this.body;
    }

}
