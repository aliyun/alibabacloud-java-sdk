// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class EnableDBResourceGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableDBResourceGroupResponseBody body;

    public static EnableDBResourceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableDBResourceGroupResponse self = new EnableDBResourceGroupResponse();
        return TeaModel.build(map, self);
    }

    public EnableDBResourceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableDBResourceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableDBResourceGroupResponse setBody(EnableDBResourceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableDBResourceGroupResponseBody getBody() {
        return this.body;
    }

}
