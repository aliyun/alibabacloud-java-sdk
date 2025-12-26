// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class AddFaceRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddFaceRecordResponseBody body;

    public static AddFaceRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        AddFaceRecordResponse self = new AddFaceRecordResponse();
        return TeaModel.build(map, self);
    }

    public AddFaceRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddFaceRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddFaceRecordResponse setBody(AddFaceRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public AddFaceRecordResponseBody getBody() {
        return this.body;
    }

}
