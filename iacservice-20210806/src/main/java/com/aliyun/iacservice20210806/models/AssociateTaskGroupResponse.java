// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class AssociateTaskGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AssociateTaskGroupResponseBody body;

    public static AssociateTaskGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        AssociateTaskGroupResponse self = new AssociateTaskGroupResponse();
        return TeaModel.build(map, self);
    }

    public AssociateTaskGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssociateTaskGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssociateTaskGroupResponse setBody(AssociateTaskGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public AssociateTaskGroupResponseBody getBody() {
        return this.body;
    }

}
