// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class JoinEniQosGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public JoinEniQosGroupResponseBody body;

    public static JoinEniQosGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        JoinEniQosGroupResponse self = new JoinEniQosGroupResponse();
        return TeaModel.build(map, self);
    }

    public JoinEniQosGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public JoinEniQosGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public JoinEniQosGroupResponse setBody(JoinEniQosGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public JoinEniQosGroupResponseBody getBody() {
        return this.body;
    }

}
