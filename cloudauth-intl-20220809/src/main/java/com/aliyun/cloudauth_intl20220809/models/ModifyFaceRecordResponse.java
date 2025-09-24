// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class ModifyFaceRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyFaceRecordResponseBody body;

    public static ModifyFaceRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyFaceRecordResponse self = new ModifyFaceRecordResponse();
        return TeaModel.build(map, self);
    }

    public ModifyFaceRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyFaceRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyFaceRecordResponse setBody(ModifyFaceRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyFaceRecordResponseBody getBody() {
        return this.body;
    }

}
