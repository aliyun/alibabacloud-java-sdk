// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class JoinResourceGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public JoinResourceGroupResponseBody body;

    public static JoinResourceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        JoinResourceGroupResponse self = new JoinResourceGroupResponse();
        return TeaModel.build(map, self);
    }

    public JoinResourceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public JoinResourceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public JoinResourceGroupResponse setBody(JoinResourceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public JoinResourceGroupResponseBody getBody() {
        return this.body;
    }

}
