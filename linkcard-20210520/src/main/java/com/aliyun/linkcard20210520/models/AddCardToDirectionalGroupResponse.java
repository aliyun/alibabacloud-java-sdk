// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class AddCardToDirectionalGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddCardToDirectionalGroupResponseBody body;

    public static AddCardToDirectionalGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        AddCardToDirectionalGroupResponse self = new AddCardToDirectionalGroupResponse();
        return TeaModel.build(map, self);
    }

    public AddCardToDirectionalGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddCardToDirectionalGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddCardToDirectionalGroupResponse setBody(AddCardToDirectionalGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public AddCardToDirectionalGroupResponseBody getBody() {
        return this.body;
    }

}
