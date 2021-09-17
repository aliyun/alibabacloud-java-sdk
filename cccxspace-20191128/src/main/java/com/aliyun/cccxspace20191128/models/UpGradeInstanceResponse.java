// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class UpGradeInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpGradeInstanceResponseBody body;

    public static UpGradeInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpGradeInstanceResponse self = new UpGradeInstanceResponse();
        return TeaModel.build(map, self);
    }

    public UpGradeInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpGradeInstanceResponse setBody(UpGradeInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpGradeInstanceResponseBody getBody() {
        return this.body;
    }

}
