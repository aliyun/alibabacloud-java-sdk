// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class OperateAxgGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public OperateAxgGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OperateAxgGroupResponse setBody(OperateAxgGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateAxgGroupResponseBody getBody() {
        return this.body;
    }

}
