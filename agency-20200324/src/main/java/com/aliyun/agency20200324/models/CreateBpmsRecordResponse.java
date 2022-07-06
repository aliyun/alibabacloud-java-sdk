// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20200324.models;

import com.aliyun.tea.*;

public class CreateBpmsRecordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateBpmsRecordResponseBody body;

    public static CreateBpmsRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBpmsRecordResponse self = new CreateBpmsRecordResponse();
        return TeaModel.build(map, self);
    }

    public CreateBpmsRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBpmsRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateBpmsRecordResponse setBody(CreateBpmsRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBpmsRecordResponseBody getBody() {
        return this.body;
    }

}
