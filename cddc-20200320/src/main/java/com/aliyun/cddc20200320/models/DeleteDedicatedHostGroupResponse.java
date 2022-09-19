// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class DeleteDedicatedHostGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDedicatedHostGroupResponseBody body;

    public static DeleteDedicatedHostGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDedicatedHostGroupResponse self = new DeleteDedicatedHostGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDedicatedHostGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDedicatedHostGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDedicatedHostGroupResponse setBody(DeleteDedicatedHostGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDedicatedHostGroupResponseBody getBody() {
        return this.body;
    }

}
