// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateBuildRecordByRecordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateBuildRecordByRecordResponseBody body;

    public static CreateBuildRecordByRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBuildRecordByRecordResponse self = new CreateBuildRecordByRecordResponse();
        return TeaModel.build(map, self);
    }

    public CreateBuildRecordByRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBuildRecordByRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateBuildRecordByRecordResponse setBody(CreateBuildRecordByRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBuildRecordByRecordResponseBody getBody() {
        return this.body;
    }

}
