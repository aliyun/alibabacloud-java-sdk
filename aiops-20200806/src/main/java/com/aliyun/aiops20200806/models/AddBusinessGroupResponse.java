// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class AddBusinessGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddBusinessGroupResponseBody body;

    public static AddBusinessGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        AddBusinessGroupResponse self = new AddBusinessGroupResponse();
        return TeaModel.build(map, self);
    }

    public AddBusinessGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddBusinessGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddBusinessGroupResponse setBody(AddBusinessGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public AddBusinessGroupResponseBody getBody() {
        return this.body;
    }

}
