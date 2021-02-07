// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class OperateAxgGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OperateAxgGroupResponseBody body;

    public static OperateAxgGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateAxgGroupResponse self = new OperateAxgGroupResponse();
        return TeaModel.build(map, self);
    }

    public OperateAxgGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperateAxgGroupResponse setBody(OperateAxgGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateAxgGroupResponseBody getBody() {
        return this.body;
    }

}
