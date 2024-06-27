// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DisableDBResourceGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableDBResourceGroupResponseBody body;

    public static DisableDBResourceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableDBResourceGroupResponse self = new DisableDBResourceGroupResponse();
        return TeaModel.build(map, self);
    }

    public DisableDBResourceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableDBResourceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableDBResourceGroupResponse setBody(DisableDBResourceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableDBResourceGroupResponseBody getBody() {
        return this.body;
    }

}
