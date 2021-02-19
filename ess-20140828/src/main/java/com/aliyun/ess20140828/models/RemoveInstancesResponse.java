// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class RemoveInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveInstancesResponseBody body;

    public static RemoveInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveInstancesResponse self = new RemoveInstancesResponse();
        return TeaModel.build(map, self);
    }

    public RemoveInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveInstancesResponse setBody(RemoveInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveInstancesResponseBody getBody() {
        return this.body;
    }

}
