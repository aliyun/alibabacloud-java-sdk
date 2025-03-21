// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ListRobotCallDialogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRobotCallDialogResponseBody body;

    public static ListRobotCallDialogResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRobotCallDialogResponse self = new ListRobotCallDialogResponse();
        return TeaModel.build(map, self);
    }

    public ListRobotCallDialogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRobotCallDialogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRobotCallDialogResponse setBody(ListRobotCallDialogResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRobotCallDialogResponseBody getBody() {
        return this.body;
    }

}
