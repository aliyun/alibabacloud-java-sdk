// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ListRobotCallDialogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListRobotCallDialogResponse setBody(ListRobotCallDialogResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRobotCallDialogResponseBody getBody() {
        return this.body;
    }

}
