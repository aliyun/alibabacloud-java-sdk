// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class AddExistedNodesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddExistedNodesResponseBody body;

    public static AddExistedNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        AddExistedNodesResponse self = new AddExistedNodesResponse();
        return TeaModel.build(map, self);
    }

    public AddExistedNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddExistedNodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddExistedNodesResponse setBody(AddExistedNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public AddExistedNodesResponseBody getBody() {
        return this.body;
    }

}
