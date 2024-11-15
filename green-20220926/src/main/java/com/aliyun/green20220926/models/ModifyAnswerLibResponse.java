// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ModifyAnswerLibResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAnswerLibResponseBody body;

    public static ModifyAnswerLibResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAnswerLibResponse self = new ModifyAnswerLibResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAnswerLibResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAnswerLibResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAnswerLibResponse setBody(ModifyAnswerLibResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAnswerLibResponseBody getBody() {
        return this.body;
    }

}
