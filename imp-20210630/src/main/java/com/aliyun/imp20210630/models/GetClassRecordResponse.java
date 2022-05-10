// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class GetClassRecordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetClassRecordResponseBody body;

    public static GetClassRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        GetClassRecordResponse self = new GetClassRecordResponse();
        return TeaModel.build(map, self);
    }

    public GetClassRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetClassRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetClassRecordResponse setBody(GetClassRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public GetClassRecordResponseBody getBody() {
        return this.body;
    }

}
