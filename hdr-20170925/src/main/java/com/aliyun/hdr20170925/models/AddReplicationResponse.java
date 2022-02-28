// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class AddReplicationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddReplicationResponseBody body;

    public static AddReplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        AddReplicationResponse self = new AddReplicationResponse();
        return TeaModel.build(map, self);
    }

    public AddReplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddReplicationResponse setBody(AddReplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public AddReplicationResponseBody getBody() {
        return this.body;
    }

}
