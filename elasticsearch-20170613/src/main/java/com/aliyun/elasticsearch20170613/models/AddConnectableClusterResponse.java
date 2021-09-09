// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class AddConnectableClusterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddConnectableClusterResponseBody body;

    public static AddConnectableClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        AddConnectableClusterResponse self = new AddConnectableClusterResponse();
        return TeaModel.build(map, self);
    }

    public AddConnectableClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddConnectableClusterResponse setBody(AddConnectableClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public AddConnectableClusterResponseBody getBody() {
        return this.body;
    }

}
