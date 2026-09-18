// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteAlertRobotsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAlertRobotsResponseBody body;

    public static DeleteAlertRobotsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlertRobotsResponse self = new DeleteAlertRobotsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAlertRobotsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAlertRobotsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAlertRobotsResponse setBody(DeleteAlertRobotsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAlertRobotsResponseBody getBody() {
        return this.body;
    }

}
