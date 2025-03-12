// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20250301.models;

import com.aliyun.tea.*;

public class CreateTextLabelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTextLabelResponseBody body;

    public static CreateTextLabelResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTextLabelResponse self = new CreateTextLabelResponse();
        return TeaModel.build(map, self);
    }

    public CreateTextLabelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTextLabelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTextLabelResponse setBody(CreateTextLabelResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTextLabelResponseBody getBody() {
        return this.body;
    }

}
