// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class JoinMessageGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public JoinMessageGroupResponseBody body;

    public static JoinMessageGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        JoinMessageGroupResponse self = new JoinMessageGroupResponse();
        return TeaModel.build(map, self);
    }

    public JoinMessageGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public JoinMessageGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public JoinMessageGroupResponse setBody(JoinMessageGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public JoinMessageGroupResponseBody getBody() {
        return this.body;
    }

}
