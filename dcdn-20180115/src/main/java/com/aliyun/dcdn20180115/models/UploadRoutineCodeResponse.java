// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class UploadRoutineCodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public UploadRoutineCodeResponse setBody(UploadRoutineCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadRoutineCodeResponseBody getBody() {
        return this.body;
    }

}
