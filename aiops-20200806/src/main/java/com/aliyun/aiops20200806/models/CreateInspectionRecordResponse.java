// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class CreateInspectionRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateInspectionRecordResponseBody body;

    public static CreateInspectionRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateInspectionRecordResponse self = new CreateInspectionRecordResponse();
        return TeaModel.build(map, self);
    }

    public CreateInspectionRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateInspectionRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateInspectionRecordResponse setBody(CreateInspectionRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateInspectionRecordResponseBody getBody() {
        return this.body;
    }

}
