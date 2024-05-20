// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class CreateTextTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TextTaskResult body;

    public static CreateTextTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTextTaskResponse self = new CreateTextTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateTextTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTextTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTextTaskResponse setBody(TextTaskResult body) {
        this.body = body;
        return this;
    }
    public TextTaskResult getBody() {
        return this.body;
    }

}
