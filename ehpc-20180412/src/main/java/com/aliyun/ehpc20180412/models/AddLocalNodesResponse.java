// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class AddLocalNodesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddLocalNodesResponseBody body;

    public static AddLocalNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLocalNodesResponse self = new AddLocalNodesResponse();
        return TeaModel.build(map, self);
    }

    public AddLocalNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLocalNodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddLocalNodesResponse setBody(AddLocalNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLocalNodesResponseBody getBody() {
        return this.body;
    }

}
