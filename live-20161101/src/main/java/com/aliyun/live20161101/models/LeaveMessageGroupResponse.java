// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class LeaveMessageGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public LeaveMessageGroupResponseBody body;

    public static LeaveMessageGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        LeaveMessageGroupResponse self = new LeaveMessageGroupResponse();
        return TeaModel.build(map, self);
    }

    public LeaveMessageGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LeaveMessageGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public LeaveMessageGroupResponse setBody(LeaveMessageGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public LeaveMessageGroupResponseBody getBody() {
        return this.body;
    }

}
