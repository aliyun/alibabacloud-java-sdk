// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ListAiccsRobotResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAiccsRobotResponseBody body;

    public static ListAiccsRobotResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAiccsRobotResponse self = new ListAiccsRobotResponse();
        return TeaModel.build(map, self);
    }

    public ListAiccsRobotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAiccsRobotResponse setBody(ListAiccsRobotResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAiccsRobotResponseBody getBody() {
        return this.body;
    }

}
