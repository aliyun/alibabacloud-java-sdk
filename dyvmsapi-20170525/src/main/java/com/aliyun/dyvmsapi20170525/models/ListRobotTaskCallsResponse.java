// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ListRobotTaskCallsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListRobotTaskCallsResponseBody body;

    public static ListRobotTaskCallsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRobotTaskCallsResponse self = new ListRobotTaskCallsResponse();
        return TeaModel.build(map, self);
    }

    public ListRobotTaskCallsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRobotTaskCallsResponse setBody(ListRobotTaskCallsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRobotTaskCallsResponseBody getBody() {
        return this.body;
    }

}
