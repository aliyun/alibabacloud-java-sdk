// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class RenewAppInstanceGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RenewAppInstanceGroupResponseBody body;

    public static RenewAppInstanceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        RenewAppInstanceGroupResponse self = new RenewAppInstanceGroupResponse();
        return TeaModel.build(map, self);
    }

    public RenewAppInstanceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenewAppInstanceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RenewAppInstanceGroupResponse setBody(RenewAppInstanceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public RenewAppInstanceGroupResponseBody getBody() {
        return this.body;
    }

}
