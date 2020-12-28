// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class AddLocalNodesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public AddLocalNodesResponse setBody(AddLocalNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLocalNodesResponseBody getBody() {
        return this.body;
    }

}
