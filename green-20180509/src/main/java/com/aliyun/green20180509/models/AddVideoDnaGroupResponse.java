// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class AddVideoDnaGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddVideoDnaGroupResponseBody body;

    public static AddVideoDnaGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        AddVideoDnaGroupResponse self = new AddVideoDnaGroupResponse();
        return TeaModel.build(map, self);
    }

    public AddVideoDnaGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddVideoDnaGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddVideoDnaGroupResponse setBody(AddVideoDnaGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public AddVideoDnaGroupResponseBody getBody() {
        return this.body;
    }

}
