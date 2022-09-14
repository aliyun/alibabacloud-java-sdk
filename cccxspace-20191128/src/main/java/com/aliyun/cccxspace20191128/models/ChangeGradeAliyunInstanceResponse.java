// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class ChangeGradeAliyunInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ChangeGradeAliyunInstanceResponseBody body;

    public static ChangeGradeAliyunInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeGradeAliyunInstanceResponse self = new ChangeGradeAliyunInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ChangeGradeAliyunInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeGradeAliyunInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChangeGradeAliyunInstanceResponse setBody(ChangeGradeAliyunInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeGradeAliyunInstanceResponseBody getBody() {
        return this.body;
    }

}
