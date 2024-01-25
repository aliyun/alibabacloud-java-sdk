// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class ChangeResourceGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChangeResourceGroupResponseBody body;

    public static ChangeResourceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeResourceGroupResponse self = new ChangeResourceGroupResponse();
        return TeaModel.build(map, self);
    }

    public ChangeResourceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeResourceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChangeResourceGroupResponse setBody(ChangeResourceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeResourceGroupResponseBody getBody() {
        return this.body;
    }

}
