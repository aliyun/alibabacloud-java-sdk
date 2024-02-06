// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class AddDirectionalGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddDirectionalGroupResponseBody body;

    public static AddDirectionalGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDirectionalGroupResponse self = new AddDirectionalGroupResponse();
        return TeaModel.build(map, self);
    }

    public AddDirectionalGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddDirectionalGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddDirectionalGroupResponse setBody(AddDirectionalGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public AddDirectionalGroupResponseBody getBody() {
        return this.body;
    }

}
