// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CreateTagGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTagGroupResponseBody body;

    public static CreateTagGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTagGroupResponse self = new CreateTagGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateTagGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTagGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTagGroupResponse setBody(CreateTagGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTagGroupResponseBody getBody() {
        return this.body;
    }

}
