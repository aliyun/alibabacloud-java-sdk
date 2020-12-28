// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class AddNodesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddNodesResponseBody body;

    public static AddNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        AddNodesResponse self = new AddNodesResponse();
        return TeaModel.build(map, self);
    }

    public AddNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddNodesResponse setBody(AddNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public AddNodesResponseBody getBody() {
        return this.body;
    }

}
