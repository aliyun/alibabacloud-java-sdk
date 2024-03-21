// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class UploadRoutineCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UploadRoutineCodeResponseBody body;

    public static UploadRoutineCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadRoutineCodeResponse self = new UploadRoutineCodeResponse();
        return TeaModel.build(map, self);
    }

    public UploadRoutineCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadRoutineCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadRoutineCodeResponse setBody(UploadRoutineCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadRoutineCodeResponseBody getBody() {
        return this.body;
    }

}
