// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ListRobotParamsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListRobotParamsResponseBody body;

    public static ListRobotParamsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRobotParamsResponse self = new ListRobotParamsResponse();
        return TeaModel.build(map, self);
    }

    public ListRobotParamsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRobotParamsResponse setBody(ListRobotParamsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRobotParamsResponseBody getBody() {
        return this.body;
    }

}
