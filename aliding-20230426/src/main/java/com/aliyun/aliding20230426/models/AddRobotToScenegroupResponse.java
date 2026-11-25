// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class AddRobotToScenegroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddRobotToScenegroupResponseBody body;

    public static AddRobotToScenegroupResponse build(java.util.Map<String, ?> map) throws Exception {
        AddRobotToScenegroupResponse self = new AddRobotToScenegroupResponse();
        return TeaModel.build(map, self);
    }

    public AddRobotToScenegroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddRobotToScenegroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddRobotToScenegroupResponse setBody(AddRobotToScenegroupResponseBody body) {
        this.body = body;
        return this;
    }
    public AddRobotToScenegroupResponseBody getBody() {
        return this.body;
    }

}
